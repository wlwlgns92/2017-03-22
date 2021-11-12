package application;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ServerController implements Initializable{
	
	// 0. ������ Ŭ���̾�Ʈ�� �����ϱ� ���� ����Ʈ
	public static Vector<Client> clients = new Vector<>();
				// Arraylist : ����ȭ x // Vector : ����ȭ o
				// ����ȭ : ������ �޼ҵ忡 ������ �����尡 ȣ�� �� �� ȣ�� ���� �ű��
	// �����带 �������ִ� ������Ǯ [ ExecutorService : ������Ǯ ���� �������̽� ]
	public static ExecutorService threadpool;
	// 1. ��������
	ServerSocket serverSocket;
	
	// 2. ���� ���� �޼ҵ�
	public void serverstart() {
		
		try {
			// �������Ͽ� �޸� �Ҵ�
			serverSocket = new ServerSocket();
			// �������Ͽ� ���ε�
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 1234));
		}
		catch (Exception e) {}
		
		// �ǽð� Ŭ���̾�Ʈ ��û��⸦ ���Ͽ� runnable ���
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
						Socket socket = serverSocket.accept(); // ��û���� -> ������ ���� ��üȭ
						clients.add(new Client(socket)); 	   // ������ �������� Ŭ���̾�Ʈ ��ü ���� �ؼ� ����Ʈ�� ����
	//					Platform.runLater(() -> txtserver.appendText(socket.getLocalAddress()+"\n"));
					}
				}catch (Exception e) {}
			}
		};
		threadpool = Executors.newCachedThreadPool();
		threadpool.submit(runnable);
	}
	// 3. �������� �޼ҵ�
	public void serverstop() {
		try {
			// ������ ���ӵ� ȸ������ ���� ��� �ݱ�
			for(Client client : clients) {
				client.socket.close(); // �ݺ����� ����ؼ� ���ӵ� ȸ������ ���� �ݱ�
			}
			serverSocket.close();// �������� �ݱ�
			threadpool.shutdown();
		}
		catch (Exception e) {}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtserver.setEditable(false); // ��������
		lblserver.setText("���� ������");
	}
	
	@FXML
	private TextArea txtserver;
	
	@FXML
	private Label lblserver;
	@FXML
	private Button btnserver;
	
	@FXML
	void start(ActionEvent event) {
		if(btnserver.getText().equals("���� ����")) {
			// 1. ��������
			serverstart();
			// 2. �̽���â�� ���� ����
				// Platform.runLater( () -> { } );
				// �ָ������带 �̿��� �ǽð� �÷��� ���� ����
			Platform.runLater( () -> {txtserver.appendText("server start\n"); });
			// 3. ��ư�̸� ����
			lblserver.setText("���� ������");
			btnserver.setText("���� ����");
		}else {
			serverstop();
			Platform.runLater( () -> {txtserver.appendText("server stop\n"); });
			btnserver.setText("���� ����");
			lblserver.setText("���� ������");
		}
	}
}
