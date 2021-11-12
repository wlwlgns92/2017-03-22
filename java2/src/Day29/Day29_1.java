package Day29;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.mail.internet.InternetAddress;

public class Day29_1 {

	
	// ��Ʈ��ũ : 2�� �̻��� ��ǻ�͵��� �����ϰ� ����� �� �ִ°�
		// ��Ÿ� : ���ڽ�ȣ�� ���� ����ϴ� ��� ��Ⱑ ���� ����ϱ� ���� �ϳ��� ��
			// LAN, MAN, WAN 
		// ���ͳ� : TCP/IP��� ��� ���������� �̿��� ��ǻ�� ��Ʈ��ũ
		
	// TCP/IP : ��Ʈ��ũ�� �����ϴ� �ڼ��� ��Ģ
		// TCP : Transmission control protocol [ ������� ]
		// IP : Internet protocol address [ ��� �ν� ��ȣ ]
			// ���ּ� [ �� 1�� -> 1�� �ּ� ] : ��ǻ���ּ� [ ��ǻ�� 1�� -> 1�� IP ]
			// �ù� [ ���� -> �� ] : ��� [ pc�� -> �п� ]
			// ���̹����� [ �п� ip ----> ���̹� ip ]
				// * ip : ���� 0~ 255 , 4�ڸ� , .������ ����
				// * ip -> ���� : �������ּ� [ DNS ]
		// SERVER PC : ���� �ڷḦ �����ص� pc
	
	// ���� IP Ȯ�� ���
		// CMD -> ipconfig
		// �ڹ� -> InerAddress Ŭ���� ���
	public static void main(String[] args) throws Exception {
		// 1. ���� pc�� ȣ��Ʈ ��������
		InetAddress inetAddress = InetAddress.getLocalHost(); //������ ���� �߻�
		System.out.println("���� pc�� ������ü : "+ inetAddress);
		System.out.println("���� pc�� �̸� : "+ inetAddress.getHostName());
		System.out.println("���� pc�� �ּ� : "+ inetAddress.getHostAddress());
		
		InetAddress inetAddress2 = InetAddress.getByName("www.naver.com");
		System.out.println(" ���̹� pc�� ������ü : "+ inetAddress2);
		System.out.println(" ���̹� pc �̸� : "+ inetAddress2.getHostName());
		System.out.println(" ���̹� pc �ּ� : "+ inetAddress2.getHostAddress());
		
		InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
		for(InetAddress address : inetAddresses) {
			System.out.println("���̹� �迭�� pc�� �̸� : "+ address.getHostName());
			System.out.println("���̹� �迭�� pc�� �ּ� : "+ address.getHostAddress());
			
		
		}
	}
}
