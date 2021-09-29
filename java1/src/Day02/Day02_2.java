package Day02;

public class Day02_2 {

	// 변수 : 하나의 값을 저장할 수 있는 메모리 공간
				// 메모리[주기억장치=RAM] : 현재 실행중인 프로그램을 기억
					// 프로그램 <----프로세스[스레드] <----명령어[코드] 집합
			// 변수 개수 증가 ----> 용량 증가----> 속도 감소
			// 변수 효율성 -> 자료형
			// 변수 선언
				// 자료형 - 변수명[임의]
				// int age;
			// 변수명 규칙
				//숫자로 시작x, 대소문자 구분
			// 변수값 저장 [오른쪽값이 왼쪽에 대입 : 대입연산자 =]
				// int score; // 변수 선언
				// score = 90 ; // 변수에 90값 대입
			// 변수는 선언된 블록 내에서만 사용 가능하다.[괄호 안으로 이동 가능, 괄호 밖으로 이동 불가]
	public static void main(String[] args) {
		
		// p.35 예
		int value = 10; // int 형의 자료의 value 변수명을 갖는 변수 선언과 동시에 10 대입
		int result = value + 10; // 변수는 연산이 가능
		System.out.println("결과 : "+ result);
		
		// p.38 자료형
			// 자료형 사용 목적 : 메모리 효율성 [적절한 사용]
			// 컴퓨터는 기계어 사용 [ 0, 1 ] 단위 : bit -> 0 혹은 1
		/*
		 *  [논리]
		 *  boolean	1비트		true, false
		 *  [문자]
		 *  char	2byte	문자
		 *  [정수]
		 *  byte	1byte	(-128~127)
		 *  short	2byte	(-32,768 ~ 32767)
		 *  int		4byte	+-20억정도
		 *  long	8byte	+-20억이상
		 *  [실수]
		 *  float	4byte
		 *  double	8byte		
		 */
		
		
		//p.40 : byte [-128 ~ +127] : 아스키코드 : 문자가 들어오면 숫자로 바뀐다.
		byte var1 = -128; System.out.println(var1);
		byte var2 = -30;  System.out.println(var2);
		byte var3 = 30;   System.out.println(var3);
		// byte var4 = 128; System.out.println(var4);
		
		// p.43 : char [한글자만 가능] : 유니코드 사용 숫자가 들어오면 문자로 바뀐다.
		char c1 = 'a'; System.out.println(c1);
		char c2 = 65;  System.out.println(c2);
		char c3 = '\u0041'; System.out.println(c3);
		char c4 = '가'; 		System.out.println(c4);
		char c5 = 44032; 	System.out.println(c5);
		char c6 = '\uac00'; System.out.println(c6);
			// 컴퓨터는 문자를 어떻게 인식????
				// 아스키코드 : 미국 [기계어 --> 영어 --> 기계어] 
				// 유니코드[java] :  전세계 모든 문자 표현
		
		// p.44~45 : shor[2byte], int[기본 정수 자료형/4byte] 타입
		
		short num1 = 30000; System.out.println(num1);
		//short num2 = 40000; System.out.println(num2);
		int num2 = 10; 		System.out.println(num2);
		int num3 = 012; 	System.out.println(num3); //8진수
		int num4 = 0xA; 	System.out.println(num4); //16진수
			//진수 목적 : 컴퓨터가 표현할 수 있는 단위 한계 해결
			// 2진수 [ 0, 1 ] : 기계어
			// 8진수 [ 0 ~ 7 ] : 앞에 0을 붙이면 8진수
			// 10진수 [ 0 ~ 9 ] : 사람
			// 16진수 [ 0 ~ 9 ABCDEF ] : 다양한 표현 단위 앞에 0x를 붙이면 16진수
		
		//p.46 : Long[8바이트] : 20억 이상
		Long num5 = 2000000000l; System.out.println(num5);
		
		// p.47~48 : float[4바이트], double[*기본 실수 자료형/ 8바이트]
		double val = 3.14; System.out.println(val);
		float val2 = 3.14f; System.out.println(val2);
		double val3 = 0.1234567890123456789; System.out.println(val3);
		// double은 소수점 18자리까지 표현
		float val4 = 0.1234567890123456789f; System.out.println(val4);
		// float는 소수점 8자리까지 표현
		
		//boolean : 비트[0(false), 1(true)]
		boolean bol = true; 	System.out.println(bol);
		boolean bol2 = false; 	System.out.println(bol2);
		
		
		// p.49 : 타입변환
			// 1. 자동 타입변환 : 크기순[작은 상자에서 큰 상자로 이동 가능]
				// byte - > short(char) -> int -> long -> float -> double [반대로는 불가]
							// short -> char x , char -> short x
		byte bytevalue = 10;
		int intvalue = bytevalue; // 자동 형변환[가능] byte -> int
		// byte bytevalue2 = invalue; int -> byte 불가
		
		
			// 2. 강제 타입변환 : 메모리 손실 -> 데이터손실
			// 자료형 변수명 = (자료형)변수명;
			// p.54
		byte bytevalue2 = (byte)intvalue;
		
		
		// 연습문제 8 
			// 연산시 기본타입 : int, 
			// byte + byte = int
			// int + byte = int
			// int + float = int
			// int + double = int
				
	}

}
