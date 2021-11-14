package 정리함;

import java.util.Scanner;

public class 엘레베이터 {
	
	
	public static void main(String[] args) {
		int 엘레베이터 = 0;
		int 정원 = 0;
		int 엘레베이터층수 = 0;
		int 호출층수;
		int 선택층수 = 0;
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.println("몇층에서 호출하시겠습니까?");
			System.out.print("선택 : "); int call = scanner.nextInt();
			호출층수 = call;
			엘레베이터 = call;
			//만약에 호출 층수와 엘레베이터가 같다면
			// 문이열립니다.
		}
	
		
	}
}
