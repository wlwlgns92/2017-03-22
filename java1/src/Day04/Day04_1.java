package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 무한루프 while 이용한 무한반복
				//키보드를 이용한 루프 제어
				// 무한루프 종료시키는 방법
				//	1. 조건을 false 로 바꿈
				//	2. break 사용
				/*while(true) {System.out.println("무한루프"); 
				
				int 선택 = scanner.nextInt();
				if ( 선택 ==4) break; } */
			
		// 랜덤[난수] 생성	
			// 1. 랜덤 클래스
				// Random 객체
					// .nextInt() : int형 표현할 수 있는 단위만큼 난수 생성
					// .nextInt(숫자) : 0~ 숫자 전까지 난수
					// .nextInt(10) + 초기값 
		while(true) { 
				Random random = new Random();
				System.out.println(random.nextInt(10)+3); }
				
				//System.out.println(random.nextInt());
	}// m e
	
}//c e
