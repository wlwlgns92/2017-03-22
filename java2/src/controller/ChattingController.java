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
	
	// 1. 클라이언트 소켓 선언
	Socket socket;
	// 2. 클라이언트 시작 메소드
	public void clientstart() {
		// 멀티스레드 
		Thread thread = new Thread() {
		
			public void run() {
				try {
					socket = new Socket("127.0.0.1", 1234); // 서버 소켓에 바인딩된 ip와 port
					send(loginid + "님 입장 했습니다. \n");
					receive(); // 접속과 동시에 받기 메소드 실행
				}catch (Exception e) {}
			}
		};
		thread.start();
		
	}
	// 3. 클라이언트 종료 메소드
	public void clientstop() { try {socket.close();} catch (Exception e) {} }
	// 4. 메시지 보내기 메소드
	public void send(String msg) {
		
		//멀티 스레드
		Thread thread = new Thread() {
			@Override
			public void run() {
			try {
			OutputStream outputStream = socket.getOutputStream(); // 출력스트림
			outputStream.write(msg.getBytes());						// 인수로 받은 메시지를 바이트형 변환해서 내보내기
			outputStream.flush();
			}
			catch (Exception e) {}
			}
		};
		thread.start();
	}
	// 5. 메시지 받는 메소드
	public void receive() {
		while(true) {
			try {
			InputStream inputStream = socket.getInputStream(); // 입력스트림
			byte[] bytes = new byte[1000];						// 바이트배열선언
			inputStream.read(bytes);							// 입력스트림내 바이트를 읽어오기
			String msg = new String(bytes);						// 바이트배열을 문자열로 변환
			Platform.runLater(()-> txtclient.appendText(msg));
			}
			catch (Exception e) {}
		}
	}
	private String loginid = MainpageController.getinstance().getloginid();
	// 6. 입력 버튼을 눌렀을때
	@FXML
	void msgsend(ActionEvent event) {
		// 메시지 보내기
		send(loginid + "\n"+ txtcontents.getText()+"\n");
		// 보내기 후
		txtcontents.setText("");
		txtcontents.requestFocus();
	}
	// 7. 엔터를 눌렀을때
	@FXML
	void send (ActionEvent event ) {
		// 메시지 보내기
		send(loginid + " : " +txtcontents.getText()+"\n");
		// 보내기 후
		txtcontents.setText("");
		txtcontents.requestFocus();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtclient.setEditable(false); // 채팅창 수정금지
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
		if(btnconnect.getText().equals("접속하기")) {
			// 1. 클라이언트 실행
			clientstart();
			// 2. 접속 메시지 전달
			Platform.runLater( () -> txtclient.appendText("----채팅방 접속-----\n"));
			// 3. 컨트롤 내용 변경
			btnconnect.setText("나가기");
			txtcontents.setDisable(false);
			txtcontents.requestFocus(); // 마우스 포인터 이동
			btninput.setDisable(false);
		}else {
			// 1. 클라이언트 종료
			clientstop();
			// 2. 퇴장메시지 전달
			Platform.runLater( () -> txtclient.appendText("----채팅방 퇴장-----\n"));
			// 3. 컨트롤 내용 변경
			btnconnect.setText("접속하기");
			txtcontents.setDisable(true);
			btninput.setDisable(true);
			
		}
	}
}
