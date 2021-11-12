package application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	// 1. 소켓
	Socket socket;
	
	// 2. 생성자
	public Client(Socket socket) {
		this.socket = socket; // 외부로 들어온 소켓dmfh 클라이언트 생성
		receive();			// 접속과 동시에 받기 실행
	}
	
	// 3. 서버로 메시지 받는 메소드
	public void receive() {
		
		// 멀티스레드
		Runnable runnable = new Runnable() {
			
			@Override
	public void run() {
			try {
				while(true) {
					InputStream inputStream = socket.getInputStream();
					byte[] bytes = new byte[10000];
					inputStream.read(bytes);
					String msg= new String(bytes);
					
					// 받은 메시지를 서버내 접속된 모든 접속자에게 메시지 전달
					for(Client client : ServerController.clients) {
						client.send(msg);
					}
				}
			} catch (IOException e) {} // 익명스트림
				
	}
	};
		// 스레드풀에 스레드 추가
		ServerController.threadpool.submit(runnable);
	}
	// 4. 서버가 메시지를 보내는 메소드
	public void send(String msg) {
		Runnable runnable = new Runnable() {
	
			@Override
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream();
					outputStream.write(msg.getBytes());
					outputStream.flush();
				}
				catch (Exception e) {}
			}
		};
		// 스레드풀에 스레드 추가
		ServerController.threadpool.submit(runnable);
	}
	
}
