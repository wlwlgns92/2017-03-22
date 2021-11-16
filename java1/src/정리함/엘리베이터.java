package 정리함;

import java.util.Scanner;

public class 엘리베이터 {
	
	/* 호출층수를 입력받는다.
	 * 엘레베이터층수가 호출층수보다 작다면 엘레베이터층수 ++
	 * 엘레베이터층수가 호출층수보다 높다면 엘레베이터층수 --
	 * 만약에 호출층수와 엘레베이터 층수가 같다면
	 * 문이 열린다.
	 */
	
	/* 목적 층수 입력
	 * 현재층수가 목적층수보다 작다면 엘레베이터층수 ++
	 * 현재층수가 목적층수보다 높다면 엘레베이터층수 --
	 * 현재층수와 목적층수가 같다면
	 * 문이열립니다.
	 */
	
	

	public static void main(String[] args) {
		int 호출층수;
		int 엘레베이터층수;
		int 목적층수;
		int 현재층수=0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("현재 엘레베이터의 층수를 입력해주세요");
			System.out.print("입력 : "); 엘레베이터층수 = scanner.nextInt();
			System.out.println();
			System.out.println("몇층에서 호출하시겠습니까?");
			System.out.print("입력 : "); 호출층수 = scanner.nextInt();
					
				while(true) {
					if(엘레베이터층수 < 호출층수) {
						System.out.println("엘레베이터가 오고있습니다. 현재 층수 : " + 엘레베이터층수);
						엘레베이터층수++;
					}else if (호출층수 < 엘레베이터층수) {
						System.out.println("엘레베이터가 오고있습니다. 현재 층수 : " + 엘레베이터층수);
						엘레베이터층수--;
					}else {
						System.out.println("문이 열립니다. 현재 층수 : " +엘레베이터층수);
						현재층수 = 엘레베이터층수;
						break;
					}
				}
				System.out.println();
				System.out.println("목적층수를 입력해주세요");
				System.out.print("입력 : ");  목적층수 = scanner.nextInt();
				while(true) {
					if(현재층수 < 목적층수) {
						System.out.println("엘레베이터가 이동중입니다. 현재 층수 :" + 현재층수);
						현재층수++;
					}else if (목적층수<현재층수) { 
						System.out.println("엘레베이터가 이동중입니다. 현재 층수 :" + 현재층수);
						현재층수--;
					}else {
						System.out.println("문이열립니다. 현재 층수 : " +현재층수);
						break;
					}
				}
						
				//
				
		}
			
			
			
	}
	
}
