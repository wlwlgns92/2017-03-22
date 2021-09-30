package Day02;

import java.util.Scanner;

public class Day02_4 {
	
		
	public static void main(String[] args) {
		// 문제1 : 급여 명세서 
				/*
				 * [조건] 입력받기 : 기본급 , 수당 
				 * [출력] 실수령액 = 기본급 + 수당 - 세금[ 기본급10% ]
				 * 
				 */
		// 1. 입력객체 선언 = Scanner 클래스를 이용한 객체 선언		
		Scanner scanner = new Scanner(System.in);
		/* 2. 입력객체에 저장된 값을 변수로 옮기기
		System.out.println("기본급 : "); int a = scanner.nextInt();
		System.out.println("수당 : "); int b = scanner.nextInt(); 
		// 3. 계산
		int c = (int)(a * 0.1); // 세금 계산 int * double
		System.out.println("실수령액 : " + (a+b-c));
		
		// 문제2 : 지폐 개수 세기 
				/*
				 * [조건] : 십만원 단위의 금액을 입뭐騁 
				 * [출력] : 입력받은 금액의 지폐수 세기 
				 * [출력 예 ] : 356789  
				 * 		십만원 : 3장 
				 *		만원 : 5장 
				 * 		천원 : 6장 
				 * 		백원 : 7개
				 */
		/* 1. 지폐 입력받기
		System.out.println(" 금액 : ");int d = scanner.nextInt();
			// 십만원 권
		System.out.println("십만원 : " + (d/100000)+"장");
		 //d = d - (d/100000) * 100000;
		 d -= (d/100000) * 100000; // 십만원 단위 제거
		 	// 만원 권
		 System.out.println("만원 : " + (d/10000)+"장");
		 d -= (d/10000) * 10000; //만원 단위 제거
		 System.out.println("천원 : " + (d/1000)+"장");
		 d -= (d/1000) * 1000; //천원 단위 제거
		 System.out.println("백원 : " + (d/100)+"개");
		 
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
		 /* 배수찾기
		  * 값 % 수 == 0 나머지가 0이면 값은 그 수의 배수
		  */
		/* System.out.println(" 정수 값은 : ");	int e = scanner.nextInt();
		 System.out.println(" 7의 배수인지 : " + ( e%7 == 0)); */
		 
		/*//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
		 //홀수찾기 
		 // 값 % 2 == 1 나누기 2를 했을때 나머지가 0이면 짝수 1이면 홀수
		 
		 System.out.println(" 홀수 인지 : "+ (e%2==1));*/
		 
		/*//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
		 System.out.println("f 정수 입력 : " ); int f = scanner.nextInt();
		 System.out.println(" 7의 배수 이면서 짝수인지 : " + (f%7==0 && f%2==0)); */
		 
		 
		/*//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
		 System.out.println("첫번째 정수 : ");	int g =scanner.nextInt();
		 System.out.println("두번째 정수 : "); int h = scanner.nextInt();
		 System.out.println(" 정수1 > 정수2 크다 : " + (g>h)); */
		
		/*//문제7 : 반지름을 입력받아 원 넓이 출력하기 
		// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
		System.out.println("문제7 반지름 입력 : "); double i = scanner.nextDouble();
		System.out.println("원 넓이는 : " + (i*i*3.14)); */
		
		
		/*//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
		// 예) 54.5   84.3 이면    64.285714%
		System.out.println("문제8 실수1 입력 : "); double j1 = scanner.nextDouble();
		System.out.println("문제8 실수2 입력 : "); double j2 = scanner.nextDouble();
		double j3 = (j1/j2) * 100; // * 100 없이 하면 0.64 이렇게 소수점으로 나온다.
		System.out.println("실수1의 실수2의 백분율 : " + j3 + "%"); //결과 : 실수1의 실수2의 백분율 : 64.65005931198102%
		// 소수점 단위를 형식 변경
		System.out.printf("실수1의 실수2의 백분율 : %.2f%%", j3); // %f%% 에서 %% 두개를 넣는 이유는 하나만 넣으면 형식 문자로 인식 %.2f 에서 .2를 넣는 경우는 소수점 두자리에서 자르려고 넣는거다.
				// printf를 사용한다				//형식문자 : %f[실수] 형식문자는 +가 아닌 , 를 사용한다.
												// %.숫저f [숫자 : 소수점 자리수] */
								
		/*//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
				//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
		System.out.println(" 윗변의 길이 : "); int a1 = scanner.nextInt();
		System.out.println(" 밑변의 길이 : "); int a2 = scanner.nextInt();
		System.out.println(" 높이의 길이 : "); int a3 = scanner.nextInt();
		System.out.println("사다리꼴의 넓이는 : " + (a1*a2)*a3/2); */
		
		/* //문제10: 키를 정수를 입력받아 표준체중 출력하기
				//표준체중 계산식 = > (키 - 100) * 0.9
		System.out.println(" 키(정수) : "); int a1 = scanner.nextInt();
		System.out.println("표준 체중은 : " + (a1-100)*0.9); */
		
		/* //문제11: 키와 몸무게를 입력받아 BMI 출력하기
				//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		System.out.println(" 키 : "); double a1 = scanner.nextDouble();
		System.out.println(" 몸무게 : "); double a2 = scanner.nextDouble();
		System.out.printf("BMI 는 : %.1f \n" + (a2/( (a1 / 100) * (a1 / 100) ) ) ); */
	
		/* //문제12: inch 를 입력받아 cm 로 변환하기 [1 inch -> 2.54
		System.out.println(" inch : "); double a1 = scanner.nextDouble();
		System.out.println("cm 길이는 " + (a1*2.54)); */
		
		/* //문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
				//소수 둘째 자리 까지 점수 출력하기
				//중간고사 반영비율 => 30 %
				//기말고사 반영비율 => 30 %
				//수행평가 반영비율 => 40 %
		
		System.out.println("중간고사 입력 : "); double a1 = scanner.nextDouble();
		System.out.println("기말고사 입력 : "); double a2 = scanner.nextDouble();
		System.out.println("수행평가 입력 : "); double a3 = scanner.nextDouble();
		a1 *= 0.3; a2 *= 0.3; a3 *=0.4;
		System.out.printf("반영비율별 점수 : %.2f \n" , (a1+a2+a3)); */
		
		//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
	 	//int x = 10;
		//int y = x-- + 5 + --x;
		//printf(" x의 값 : %d , y의값 :  %d ", x, y)
			// 1. x-- + 5 => 10 + 5 // 후위 증가가 나왔을때는 더하기를 하고 증감한다. 
			// 2. x-- => 10 -> 9
			// 3. --x -> 9 -> 8
			// 4. 15 + 8 => 23

		int a1 =5; int a2 =10; int a3=7;
		double a4 = ((double) a1+a2)/2 * a3;
		System.out.println(a4);
				
		

	}

}
