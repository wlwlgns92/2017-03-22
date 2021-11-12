package application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	// 1. ����
	Socket socket;
	
	// 2. ������
	public Client(Socket socket) {
		this.socket = socket; // �ܺη� ���� ����dmfh Ŭ���̾�Ʈ ����
		receive();			// ���Ӱ� ���ÿ� �ޱ� ����
	}
	
	// 3. ������ �޽��� �޴� �޼ҵ�
	public void receive() {
		
		// ��Ƽ������
		Runnable runnable = new Runnable() {
			
			@Override
	public void run() {
			try {
				while(true) {
					InputStream inputStream = socket.getInputStream();
					byte[] bytes = new byte[10000];
					inputStream.read(bytes);
					String msg= new String(bytes);
					
					// ���� �޽����� ������ ���ӵ� ��� �����ڿ��� �޽��� ����
					for(Client client : ServerController.clients) {
						client.send(msg);
					}
				}
			} catch (IOException e) {} // �͸�Ʈ��
				
	}
	};
		// ������Ǯ�� ������ �߰�
		ServerController.threadpool.submit(runnable);
	}
	// 4. ������ �޽����� ������ �޼ҵ�
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
		// ������Ǯ�� ������ �߰�
		ServerController.threadpool.submit(runnable);
	}
	
}
