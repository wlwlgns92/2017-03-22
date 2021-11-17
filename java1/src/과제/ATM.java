package 과제;

import java.util.Scanner;

public class ATM {
	/*
	 * "----------ATM----------"
	 * "1.출금 | 2.예금 | 3.잔고 | 4.종료"
	 * 예금과 출금을 입력받아 잔고구현
	 */
	
	public static void main(String[] args) {
		
		int 예금액 = 0;		// 예금액의 초기값
		boolean 실행 = true;	// while문을 작동시킬 변수
		Scanner scanner = new Scanner(System.in); // 입력객체
		
		while(실행) {	// 반복작동시키기 위해 while문 사용
			
			System.out.println("----------ATM----------"); // 꾸미기
			System.out.println("1.출금 | 2.예금 | 3.잔고 | 4.종료");	// 메뉴
			System.out.println("선택 : "); int ch = scanner.nextInt();	// 메뉴 선택을 입력하기 위한 선언
			
			if( ch == 1) {	// 만약에 입력한 숫자가 1이라면
				System.out.println("출금액을 입력하세요 : "); int 출금액 = scanner.nextInt(); // 출금액 입력 
				if(예금액 < 출금액) {	// 만약에 예금액이 출금액보다 작다면
					System.out.println("잔고가 부족합니다.");	// 잔고부족 출력
				}else {	// 아니면 
					예금액-=출금액; //예금액에서 출금액 차감
					System.out.println("출금 완료하였습니다. 잔액은 : " + 예금액); // 꾸미기 + 예금액(잔고) 출력
				}
			} else if( ch == 2) {	// 아니면 입력한 숫자가 2라면 
				System.out.print("입금하실 금액을 입력하세요 "); 예금액 += scanner.nextInt(); // 입력받은 숫자를 예금액에 더한다.
				System.out.println("예금 성공하였습니다. 잔액은 : " + 예금액);	// 꾸미기 + 예금액(잔고)
			}else if(ch == 3) {	// 아니면 입력한 숫자가 3이라면
				System.out.println("잔액은 : " +예금액);	// 예금액(잔고) 출력
			}else if(ch == 4) {	// 아니면 입력한 숫자가 4라면 
				System.out.println("시스템을 종료합니다.");	// 꾸미기
				실행 = false;	// 실행을 false로 만들어 while문 종료 
			}
			else { // 입력받은 값이 숫자가 아니라면
				System.out.println("숫자만 입력 가능합니다.");
			}// else end
					
		}// while end
		
	}// main end
} // class end
