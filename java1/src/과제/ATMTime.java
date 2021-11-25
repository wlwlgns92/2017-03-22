package 과제;

import java.util.Scanner;

public class ATMTime {
	
	/*
	 * 3차시기
	 * 	System.out.println("----------ATM----------");
	 * "1.출금 | 2.예금 | 3.잔고 | 4.종료"
	 * 예금과 출금을 입력받아 잔고구현
	 */
	
	
	public static void main(String[] args) {
		int 예금액 = 0; 
		boolean 실행 =true; 
		Scanner scanner = new Scanner(System.in);
		
		while(실행) { 
		
			System.out.println("----------ATM----------");
			System.out.println( "1.출금 | 2.예금 | 3.잔고 | 4.종료");
			System.out.print("선택 : "); int ch = scanner.nextInt();
			
			if ( ch == 1) {
				System.out.println("출금하실 금액을 입력해 주세요 : "); int 출금액 = scanner.nextInt();
				if(예금액 < 출금액 ) {
					System.out.println("잔액이 부족합니다.");
				}else { 
					예금액-=출금액;
					System.out.println("출금이 완료되었습니다. 잔액은 : "+ 예금액);
				}	
			}else if ( ch == 2 ) {
					System.out.println("예금하실 금액을 입력해 주세요 : " ); 예금액 += scanner.nextInt();
					System.out.println("예금이 완료되었습니다. 잔액은 : "+ 예금액);
			}else if (ch==3) {
					System.out.println("잔액은 : "+예금액);
			}else if (ch==4) {
					System.out.println("이용해주셔서 감사합니다.");
					실행=false;
			}else {
					System.out.println("잘못된 입력입니다.");
			}
		} // we
	} // me 

} // ce	