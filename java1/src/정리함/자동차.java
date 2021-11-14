package 정리함;

import java.util.Scanner;

public class 자동차 {

	public static void main(String[] args) {
		
		boolean 문상태 = false;		// 문상태를 관리하는 스위치 역할
		boolean 시동상태1 = false;		// 시동상태를 관리하는 스위치 역할
	
		Scanner scanner = new Scanner(System.in); // 입력객체 
		
		while(true) { // 반복문
			
			if(문상태 == false) {  										//문상태가 false(닫혀있을때)
				System.out.println("문을 여시겠습니까 1.예  |  2. 아니오 ");	
				System.out.print("선택 : "); int ch = scanner.nextInt();	// 예, 아니오로 선택
				if(ch==1) {												// 1번(예)을 선택했을때
					System.out.println("문을 열었습니다.");					
					문상태 = true;										// 문상태 스위치를 true로 변경
				}
				if(ch==2) {												// 2번(아니오)를 선택했을때
					System.out.println("문을 열지 않습니다.");				// 문상태 스위치를 false로 유지
					
				}
			}
			
			if( 문상태 == true && 시동상태1 == false) {								// 문상태가 true(문열기) 이면서 시동상태1이 false(안켜져)있을때 실행
				System.out.println("시동을 거시겠습니까 ? 1.예 | 2. 아니오 3.나가기");
				System.out.print("선택 : "); int ch1 = scanner.nextInt();			// 예,아니오 선택
				if(ch1==1) {													// 1번(예)을 선택했을떄
					System.out.println("시동을 걸었습니다.");							
					시동상태1 = true;												// 시동상태1 true로 변경
					System.out.println("목적지에 도착했습니다.");
				}
				if(ch1==2) {													// 시동을 걸지 않습니다( if문 반복 )
					System.out.println("시동을 걸지 않습니다.");
					
				}if( ch1 == 3 ) {												// 3번(나가기)를 선택했을때 
					문상태 = false;												// 문상태 false로 변경 다시 첫번째 if문으로 이동
				}
		
			if( 문상태 == true && 시동상태1 == true ) {									// 문상태가 true이면서 시동상태1 == true 일떄 실행
				while( true) { 														// 반복문을 사용해 반복실행
					System.out.println("[ 주행중 ] 시동을 끄시겠습니까 ? 1.예 | 2.아니오");	
					System.out.print("선택 : "); int ch2 = scanner.nextInt();			// 예, 아니오로 선택
					if(ch2==1) {													// 1번(예)을 선택했을때
						System.out.println("시동을 끕니다.");
						시동상태1 = false;												// 시동상태1 스위치를 false로 변경
						break;														// 반복문 종료
					}
					if(ch2==2) {													// 2번(아니오)을 선택했을때 
						System.out.println("시동을 끄지 않습니다.");						// 출력후 반복문 다시 실행
					}
				}
			}
			}
		}	//w e
	}
	
}
