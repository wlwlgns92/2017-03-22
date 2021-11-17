package 과제;

import java.util.Scanner;

public class 배수찾기 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
//		System.out.print("정수를 입력하세요 : "); int num = scanner.nextInt();
//		System.out.println("입력하신 숫자는" + (num%7 == 0) +"입니다.");
		
//		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
//		System.out.print("정수를 입력하세요 : "); int num1 = scanner.nextInt();
//		System.out.println("true면 홀수 false면 짝수 :  " + (num1%2 == 0));
				
		
		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
		System.out.print("정수를 입력하세요 : "); int num = scanner.nextInt();
		System.out.println("true면 7의 배수이면서 짝수 false라면 아니다. : " + (num%7==0 && num%2 == 0));
	}
}
