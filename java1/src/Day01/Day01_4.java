package Day01;

import java.util.Scanner;

public class Day01_4 {// Class Start

	public static void main(String[] args) {
		
		// 1. 입력객체 [ 키보드로부터 입력값을 저장하는 객체]
		Scanner 입력객체 = new Scanner(System.in);
			// 객체선언 : 클래스명 객체명[임의] = new 생성자();
		// 2. 입력받은 값 꺼내와서 변수에 저장
			// 변수는 값을 저장할 수 있는 메모리[기억장치]
		System.out.print("첫번째 입력 : ");
		String first = 입력객체.next();
			// String : 문자열 클래스 : 문자열을 저장하는 객체 선언
		
		System.out.print("두번째 입력 : ");
		int second = 입력객체.nextInt();
			// int : 정수형 [숫자] 자료형 : 숫자를 저장하는 변수 선언
		
		// 3. 변수 출력
		System.out.println("첫번째 입력값은 : " + first);
		System.out.println("두번째 입력값은 : " + second);
		
		// 문제 1
		/*
		 * 학생 한명의 이름과 1~3교시의 출력 여부를 입력받아 입력받은 값을 아래와 같이 출력
		 * 이름		1교시 	2교시 	3교시 	비고
		 * 강호동	    출석		결석		출석
		 */
		
		//입력받기
		System.out.print(" 학생명 입력 : ");		String 이름 = 입력객체.next();
		System.out.print(" 1교시 출석"); 		String 교시_1 = 입력객체.next();
		System.out.print(" 2교시 출석");		String 교시_2 = 입력객체.next();
		System.out.print(" 3교시 출석");		String 교시_3 = 입력객체.next();
		
		// 출력하기
		System.out.println("/t/t[[출석부]]");
		System.out.println("--------------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시");
		System.out.println( 이름+"\t"+교시_1+"\t"+교시_2+"\t"+교시_3);
		System.out.println("--------------------------------------");
	}

} // Class end
