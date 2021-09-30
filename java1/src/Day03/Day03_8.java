package Day03;

import java.util.Scanner;
// 확인문제 7 : ATM 프로그램
public class Day03_8 {
		public static void main(String[] args) {
			/*Scanner scanner = new Scanner(System.in);
			boolean run = true;
			
			int 예금액 = 0;
			
			while(run) { // true 무한루프 실행 // 실행변수가 false이면 무한루프 종료]
				System.out.println("           신한은행 ATM         ");
				System.out.println("------------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("------------------------------");
				System.out.println("선택> "); int c = scanner.nextInt();
				if(c == 1) { 
					System.out.println("예금액> ");
					예금액 += scanner.nextInt();
					System.out.println("예금 완료");
				}
				else if(c == 2) { 
					System.out.println("출금액> ");	int 출금액 = scanner.nextInt();
					if(예금액 < 출금액) {System.out.println("잔고가 부족합니다.");}
					else  {예금액-=출금액; System.out.println("출금 완료");}
				}
				else if(c == 3) {
					System.out.println("잔고> "+ 예금액);	
				}
				else if(c == 4){ System.out.println("ATM종료");}
				
				else { run=false; System.out.println("오류"); } */
			
			/*/ 확인문제3)
			int i = 0;
			for(int a = 0; a<=100; a++) { if(a%3==0) i+=a; }
			System.out.println("3의배수 누적 합계는 : " + i); */
			//확인문제5)
			for( int x = 1; x<=10 ; x++) {
				for (int y = 1; y<=10; y++) {
					if((4*x)+ (5*y)==60) {System.out.printf("(%d , %d)\n", x, y);
				}
			}
				
			}
			
			
			/*/ 확인문제6)
			for(int i =1; i<=5 ; i++) { 
				for (int s = 1; s<=i; s++) { System.out.print("*"); }
				System.out.println(); 				
			}*/
				
			
			}
		}

