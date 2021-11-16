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
		int 호출층수;		// 호출하는 층수 저장 변수
		int 엘레베이터층수;	// 현재 엘레베이터의 층수 저장 변수
		int 목적층수;		// 목적지 저장 변수
		int 현재층수=0;	// 현재 층수 저장 변수
		Scanner scanner = new Scanner(System.in); // 입력받기 위한 객체 선언
		
		while(true) {	// 반복문 선언
			System.out.println("현재 엘레베이터의 층수를 입력해주세요"); 
			System.out.print("입력 : "); 엘레베이터층수 = scanner.nextInt(); // 현재 엘레베이터의 층수 설정
			System.out.println();	
			System.out.println("몇층에서 호출하시겠습니까?");
			System.out.print("입력 : "); 호출층수 = scanner.nextInt();	// 호출층수 설정
					
				while(true) { // 반복문
					if(엘레베이터층수 < 호출층수) { // 만약에 엘레베이터층수가 호출층수보다 작다면
						System.out.println("엘레베이터가 오고있습니다. 현재 층수 : " + 엘레베이터층수);
						엘레베이터층수++; // 엘레베이터 층수 1씩 증가
					}else if (호출층수 < 엘레베이터층수) {	// 아니면 호출층수가 엘레베이터층수보다 작다면 
						System.out.println("엘레베이터가 오고있습니다. 현재 층수 : " + 엘레베이터층수);
						엘레베이터층수--; // 엘레베이터층수 1씩 감소
					}else { 	// 아니면 문이 열린다.
						System.out.println("문이 열립니다. 현재 층수 : " +엘레베이터층수);
						현재층수 = 엘레베이터층수; //	엘레베이터층수를 현재층수에 대입
						break;	//반복문 탈출
					}
				}
				System.out.println();
				System.out.println("목적층수를 입력해주세요");
				System.out.print("입력 : ");  목적층수 = scanner.nextInt();	// 목적층수 설정
				while(true) {	//반복문
					if(현재층수 < 목적층수) { 	// 만약에 현재층수가 목적층수보다 작다면
						System.out.println("엘레베이터가 이동중입니다. 현재 층수 :" + 현재층수);
						현재층수++;		// 현재층수 1씩 증가
					}else if (목적층수<현재층수) { // 아니면 목적층수가 현재층수보다 작다면
						System.out.println("엘레베이터가 이동중입니다. 현재 층수 :" + 현재층수);
						현재층수--; // 현재층수 1씩감소
					}else {	// 아니면 문이 열린다.
						System.out.println("문이열립니다. 현재 층수 : " +현재층수);
						break; // 반복문 탈출
					}
				}
						
				//
				
		}
			
			
			
	}
	
}
