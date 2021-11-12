package Day29;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.mail.internet.InternetAddress;

public class Day29_1 {

	
	// 네트워크 : 2개 이상의 컴퓨터들을 연결하고 통신할 수 있는것
		// 통신망 : 전자신호를 통해 통신하는 모든 기기가 서로 통신하기 위한 하나의 망
			// LAN, MAN, WAN 
		// 인터넷 : TCP/IP라는 통신 프로토콜을 이용한 컴퓨터 네트워크
		
	// TCP/IP : 네트워크를 연결하는 자세한 규칙
		// TCP : Transmission control protocol [ 통신제어 ]
		// IP : Internet protocol address [ 통신 인식 번호 ]
			// 집주소 [ 집 1개 -> 1개 주소 ] : 컴퓨터주소 [ 컴퓨터 1개 -> 1개 IP ]
			// 택배 [ 쿠팡 -> 집 ] : 통신 [ pc방 -> 학원 ]
			// 네이버접속 [ 학원 ip ----> 네이버 ip ]
				// * ip : 숫자 0~ 255 , 4자리 , .ㅇ으로 구분
				// * ip -> 문자 : 도메인주소 [ DNS ]
		// SERVER PC : 많은 자료를 저장해둔 pc
	
	// 현재 IP 확인 방법
		// CMD -> ipconfig
		// 자바 -> InerAddress 클래스 사용
	public static void main(String[] args) throws Exception {
		// 1. 현재 pc의 호스트 가져오기
		InetAddress inetAddress = InetAddress.getLocalHost(); //무조건 예외 발생
		System.out.println("현재 pc의 정보객체 : "+ inetAddress);
		System.out.println("현재 pc의 이름 : "+ inetAddress.getHostName());
		System.out.println("현재 pc의 주소 : "+ inetAddress.getHostAddress());
		
		InetAddress inetAddress2 = InetAddress.getByName("www.naver.com");
		System.out.println(" 네이버 pc의 정보객체 : "+ inetAddress2);
		System.out.println(" 네이버 pc 이름 : "+ inetAddress2.getHostName());
		System.out.println(" 네이버 pc 주소 : "+ inetAddress2.getHostAddress());
		
		InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
		for(InetAddress address : inetAddresses) {
			System.out.println("네이버 배열내 pc의 이름 : "+ address.getHostName());
			System.out.println("네이버 배열내 pc의 주소 : "+ address.getHostAddress());
			
		
		}
	}
}
