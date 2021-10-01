package 정리함;

import java.util.Scanner;

public class 연습장 {
	
	public static void main(String[] args) {
		// 문제5 : 4개의 정수를 입력받아 내림차순으로 출력
		 Scanner scanner  =new Scanner(System.in);
		 System.out.print("첫번째 정수는  : "); int a1 = scanner.nextInt();
		 System.out.print("두번째 정수는  : "); int a2 = scanner.nextInt();
		 System.out.print("세번째 정수는  : "); int a3 = scanner.nextInt();
		 System.out.print("네번째 정수는  : "); int a4 = scanner.nextInt();
		 
		 int a5;
		 if(a1 < a2) {a5 =a1; a1 = a2; a2 = a5; }
		 if(a1 < a3) {a5 =a1; a1 = a3; a3 = a5; }
		 if(a1 < a4) {a5 =a1; a1 = a4; a4 = a5; }
		 
		 if(a2 < a3) {a5 =a2; a2 = a3; a3 = a5; }
		 if(a2 < a4) {a5 =a2; a2 = a4; a4 = a5; }
		 
		 if(a3 < a4) {a5 =a3; a3 = a4; a4 = a5; }
		 
		System.out.printf("내림차순은 %d, %d, %d, %d" , a1, a2, a3, a4);
		 
	}
	
} 

