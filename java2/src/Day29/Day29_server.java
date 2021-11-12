package Day29;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Day29_server {

	// ��ſ� ���� �����
		// 1. �������� ����� [ ServerSoket Ŭ���� ]
			// ���� : pc���� ��� ������ [ server������ ����Ͽ� client�� ���� ]
		// 2. �������� ���ε� �ϱ�
			// ������ ip �ּҿ� port�� ����
			// * port : ip�� 6���� ���� ������ ��ȣ [ ip�� ���μ��� ���� ��ȣ ]
	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket(); // 1. �������� �����
			serverSocket.bind(new InetSocketAddress("127.168.102.50", 5000));
			
			while(true) {
				System.out.println( "�������� ���� �����");
				Socket socket =	serverSocket.accept();// .accept() : Ŭ���̾�Ʈ ��û�� ����
				// 4. ������ Ŭ���̾�Ʈ ���� Ȯ��
				InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("Ŭ���̾�Ʈ�� ������ �Ǿ����ϴ�. Ŭ���̾�Ʈ ���� : " + socketAddress.getHostName());
				
				// ������ �����ϱ� [ �ޱ� ] : ��Ʈ���� �̿��� �ܺ� ��Ʈ��ũ ���
				InputStream inputStream = socket.getInputStream(); // ���� �Է� ��Ʈ��
				byte[] bytes = new byte[1000];
				inputStream.read(bytes);
				System.out.println("Ŭ���̾�Ʈ�� �޽��� : "+ new String(bytes));
				//������ �۽��ϱ� [ ������ ]
				OutputStream outputStream = socket.getOutputStream();
				Scanner scanner = new Scanner(System.in);
				System.out.println("Ŭ���̾�Ʈ���� ���� �޽��� : ");
				String msg = scanner.nextLine();
				outputStream.write(msg.getBytes());
			}
		} catch (IOException e) {}
	}
	 
}
