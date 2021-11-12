package controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChattingController implements Initializable {
	
	// 1. Ŭ���̾�Ʈ ���� ����
	Socket socket;
	// 2. Ŭ���̾�Ʈ ���� �޼ҵ�
	public void clientstart() {
		// ��Ƽ������ 
		Thread thread = new Thread() {
		
			public void run() {
				try {
					socket = new Socket("127.0.0.1", 1234); // ���� ���Ͽ� ���ε��� ip�� port
					send(loginid + "�� ���� �߽��ϴ�. \n");
					receive(); // ���Ӱ� ���ÿ� �ޱ� �޼ҵ� ����
				}catch (Exception e) {}
			}
		};
		thread.start();
		
	}
	// 3. Ŭ���̾�Ʈ ���� �޼ҵ�
	public void clientstop() { try {socket.close();} catch (Exception e) {} }
	// 4. �޽��� ������ �޼ҵ�
	public void send(String msg) {
		
		//��Ƽ ������
		Thread thread = new Thread() {
			@Override
			public void run() {
			try {
			OutputStream outputStream = socket.getOutputStream(); // ��½�Ʈ��
			outputStream.write(msg.getBytes());						// �μ��� ���� �޽����� ����Ʈ�� ��ȯ�ؼ� ��������
			outputStream.flush();
			}
			catch (Exception e) {}
			}
		};
		thread.start();
	}
	// 5. �޽��� �޴� �޼ҵ�
	public void receive() {
		while(true) {
			try {
			InputStream inputStream = socket.getInputStream(); // �Է½�Ʈ��
			byte[] bytes = new byte[1000];						// ����Ʈ�迭����
			inputStream.read(bytes);							// �Է½�Ʈ���� ����Ʈ�� �о����
			String msg = new String(bytes);						// ����Ʈ�迭�� ���ڿ��� ��ȯ
			Platform.runLater(()-> txtclient.appendText(msg));
			}
			catch (Exception e) {}
		}
	}
	private String loginid = MainpageController.getinstance().getloginid();
	// 6. �Է� ��ư�� ��������
	@FXML
	void msgsend(ActionEvent event) {
		// �޽��� ������
		send(loginid + "\n"+ txtcontents.getText()+"\n");
		// ������ ��
		txtcontents.setText("");
		txtcontents.requestFocus();
	}
	// 7. ���͸� ��������
	@FXML
	void send (ActionEvent event ) {
		// �޽��� ������
		send(loginid + " : " +txtcontents.getText()+"\n");
		// ������ ��
		txtcontents.setText("");
		txtcontents.requestFocus();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtclient.setEditable(false); // ä��â ��������
		txtcontents.setDisable(true);
		btninput.setDisable(true);
	}
	
	@FXML
	private TextArea txtclient;
	
	@FXML
	private TextField txtcontents;
	
	@FXML
	private Button btninput;
	
	@FXML
	private Button btnconnect;
	
	@FXML
	void connect(ActionEvent event) {
		if(btnconnect.getText().equals("�����ϱ�")) {
			// 1. Ŭ���̾�Ʈ ����
			clientstart();
			// 2. ���� �޽��� ����
			Platform.runLater( () -> txtclient.appendText("----ä�ù� ����-----\n"));
			// 3. ��Ʈ�� ���� ����
			btnconnect.setText("������");
			txtcontents.setDisable(false);
			txtcontents.requestFocus(); // ���콺 ������ �̵�
			btninput.setDisable(false);
		}else {
			// 1. Ŭ���̾�Ʈ ����
			clientstop();
			// 2. ����޽��� ����
			Platform.runLater( () -> txtclient.appendText("----ä�ù� ����-----\n"));
			// 3. ��Ʈ�� ���� ����
			btnconnect.setText("�����ϱ�");
			txtcontents.setDisable(true);
			btninput.setDisable(true);
			
		}
	}
}
