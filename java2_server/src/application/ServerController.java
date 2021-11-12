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
	
	// 0. 접속한 클라이언트를 저장하기 위한 리스트
	public static Vector<Client> clients = new Vector<>();
				// Arraylist : 동기화 x // Vector : 동기화 o
				// 동기화 : 동일한 메소드에 여러개 스레드가 호출 할 때 호출 순서 매기기
	// 스레드를 관리해주는 스레드풀 [ ExecutorService : 스레드풀 구현 인터페이스 ]
	public static ExecutorService threadpool;
	// 1. 서버소켓
	ServerSocket serverSocket;
	
	// 2. 서버 실행 메소드
	public void serverstart() {
		
		try {
			// 서버소켓에 메모리 할당
			serverSocket = new ServerSocket();
			// 서버소켓에 바인딩
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 1234));
		}
		catch (Exception e) {}
		
		// 실시간 클라이언트 요청대기를 위하여 runnable 사용
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
						Socket socket = serverSocket.accept(); // 요청수락 -> 수락된 소켓 객체화
						clients.add(new Client(socket)); 	   // 수락된 소켓으로 클라이언트 객체 생성 해서 리스트에 저장
	//					Platform.runLater(() -> txtserver.appendText(socket.getLocalAddress()+"\n"));
					}
				}catch (Exception e) {}
			}
		};
		threadpool = Executors.newCachedThreadPool();
		threadpool.submit(runnable);
	}
	// 3. 서버중지 메소드
	public void serverstop() {
		try {
			// 서버에 접속된 회원들의 소켓 모두 닫기
			for(Client client : clients) {
				client.socket.close(); // 반복문을 사용해서 접속된 회원들의 소켓 닫기
			}
			serverSocket.close();// 서버소켓 닫기
			threadpool.shutdown();
		}
		catch (Exception e) {}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtserver.setEditable(false); // 수정금지
		lblserver.setText("서버 중지중");
	}
	
	@FXML
	private TextArea txtserver;
	
	@FXML
	private Label lblserver;
	@FXML
	private Button btnserver;
	
	@FXML
	void start(ActionEvent event) {
		if(btnserver.getText().equals("서버 실행")) {
			// 1. 서버실행
			serverstart();
			// 2. 미시지창에 내용 띄우기
				// Platform.runLater( () -> { } );
				// 멀리스레드를 이용한 실시간 플랫폼 내용 전달
			Platform.runLater( () -> {txtserver.appendText("server start\n"); });
			// 3. 버튼이름 변경
			lblserver.setText("서버 실행중");
			btnserver.setText("서버 중지");
		}else {
			serverstop();
			Platform.runLater( () -> {txtserver.appendText("server stop\n"); });
			btnserver.setText("서버 실행");
			lblserver.setText("서버 중지중");
		}
	}
}
