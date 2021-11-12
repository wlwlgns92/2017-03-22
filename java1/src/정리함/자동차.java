package 정리함;

import java.util.Scanner;

public class 자동차 {

	public static void main(String[] args) {
		
		boolean 문상태 = false;
		boolean 시동상태1 = false;
	
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			if(문상태 == false) {
				System.out.println("문을 여시겠습니까 1.예  |  2. 아니오 ");
				System.out.print("선택 : "); int ch = scanner.nextInt();
				if(ch==1) {
					System.out.println("문을 열었습니다.");
					문상태 = true;
				}
				if(ch==2) {
					System.out.println("문을 열지 않습니다.");
					
				}
			}
			
			if( 문상태 == true && 시동상태1 == false) {
				System.out.println("시동을 거시겠습니까 ? 1.예 | 2. 아니오 3.나가기");
				System.out.print("선택 : "); int ch1 = scanner.nextInt();
				if(ch1==1) {
					System.out.println("시동을 걸었습니다.");
					시동상태1 = true;	
					System.out.println("목적지에 도착했습니다.");
				}
				if(ch1==2) {
					System.out.println("시동을 걸지 않습니다.");
					
				}if( ch1 == 3 ) {
					문상태 = false;
				}
		
			if( 문상태 == true && 시동상태1 == true ) {
				while( true) { 
					System.out.println("[ 주행중 ] 시동을 끄시겠습니까 ? 1.예 | 2.아니오");
					System.out.print("선택 : "); int ch2 = scanner.nextInt();
					if(ch2==1) {
						System.out.println("시동을 끕니다.");
						시동상태1 = false;
						break;
					}
					if(ch2==2) {
						System.out.println("시동을 끄지 않습니다.");
					}
				}
			}
			}
		}	//w e
	}
	
}
