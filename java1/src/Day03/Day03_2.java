package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/* // 문제1 : 2개의 정수를 입력받아 더 큰수 출력
		System.out.print("첫번째 정수 입력 : "); int a1 = scanner.nextInt();
		System.out.print("두번째 정수 입력 : "); int a2 = scanner.nextInt();
		if(a1>a2) { System.out.println("더 큰수는 : "+ a1); }
		else if (a1<a2) { System.out.println("더 큰수는 : "+ a2);} 
		else System.out.println(" 두 수는 같다"); */
		
		/*/ 문제2 : 3개의 정수를 입력받아 가장 큰수 출력
		System.out.print("첫번째 정수 입력 : "); int a1 = scanner.nextInt();
		System.out.print("두번째 정수 입력 : "); int a2 = scanner.nextInt();
		System.out.print("세번째 정수 입력 : "); int a3 = scanner.nextInt();
		
		if(a1>a2 && a1 > a3) {System.out.println("가장 큰 수는 : " + a1); }
		else if ( a2 > a1 && a2 > a3) System.out.println("가장 큰 수는 "+ a2);
		else if ( a3 > a1 && a3 > a2) System.out.println("가장 큰 수는 " + a3);
		else System.out.println(" 세 정수는 같다"); */
		
		/*/ 문제3 : 4개의 정수를 입력받아 가장 큰수 출력
		System.out.print("첫번째 정수 입력 : "); int a1 = scanner.nextInt();
		System.out.print("두번째 정수 입력 : "); int a2 = scanner.nextInt();
		System.out.print("세번째 정수 입력 : "); int a3 = scanner.nextInt();
		System.out.print("네번째 정수 입력 : "); int a4 = scanner.nextInt();
		int a5=a1; // max 변수에 첫번째 값 넣기
		if ( a5 < a2) a5 = a2; // 만약에 a5 변수에 있는 값보다 크면 a5 값 변경
		if ( a5 < a3) a5 = a3;
		if ( a5 < a4) a5 = a4;
		System.out.println(" 가장 큰수는 : "+ a5); */
		
		
		/*/ 문제4 : 4개의 정수를 입력받아 오름차순으로 출력
		// 비어있는 변수를 만들어서 한바퀴 돌린다.
		
		System.out.print("첫번째 정수 입력 : "); int a1 = scanner.nextInt();
		System.out.print("두번째 정수 입력 : "); int a2 = scanner.nextInt();
		System.out.print("세번째 정수 입력 : "); int a3 = scanner.nextInt();
		System.out.print("네번째 정수 입력 : "); int a4 = scanner.nextInt();
		
		int a5; // 교환시 사용되는 임시 변수
		// 1. 첫번째 변수와 두번째, 세번째, 네번째 변수를 비교 = 3번
		if(a1>a2) { a5 = a1; a1=a2; a2=a5; }
		if(a1>a3) { a5 = a1; a1=a3; a3=a5; }
		if(a1>a4) { a5 = a1; a1=a4; a4=a5; }
		// 2. 두번째 변수와 세번째, 네번째 변수를 비교 = 2번
		if(a2>a3) { a5 = a2; a2=a3; a3=a5; }
		if(a2>a4) { a5 = a2; a2=a4; a4=a5; }
		// 3. 세번째 변수와 네번째 변수를 비교 = 1번
		if(a3>a4) { a5 = a3; a3=a4; a4=a5; }
		
		System.out.printf(" 오름차순 : %d %d %d %d" , a1, a2, a3, a4 ); */
		
		/*/ 문제5 : 4개의 정수를 입력받아 내림차순으로 출력
		System.out.print("첫번째 정수 입력 : "); int a1 = scanner.nextInt();
		System.out.print("두번째 정수 입력 : "); int a2 = scanner.nextInt();
		System.out.print("세번째 정수 입력 : "); int a3 = scanner.nextInt();
		System.out.print("네번째 정수 입력 : "); int a4 = scanner.nextInt();
		
		int a5; // 교환시 사용되는 임시 변수
		// 1. 첫번째 변수와 두번째, 세번째, 네번째 변수를 비교 = 3번
		if(a1<a2) { a5 = a1; a1=a2; a2=a5; }
		if(a1<a3) { a5 = a1; a1=a3; a3=a5; }
		if(a1<a4) { a5 = a1; a1=a4; a4=a5; }
		// 2. 두번째 변수와 세번째, 네번째 변수를 비교 = 2번
		if(a2<a3) { a5 = a2; a2=a3; a3=a5; }
		if(a2<a4) { a5 = a2; a2=a4; a4=a5; }
		// 3. 세번째 변수와 네번째 변수를 비교 = 1번
		if(a3<a4) { a5 = a3; a3=a4; a4=a5; }
		
		System.out.printf(" 내림차 : %d %d %d %d" , a1, a2, a3, a4 ); */
		
		/*/ 문제6 : 로그인페이지
					// [ 입력 ] : 아이디와 비밀번호를 입력박기 
					// [ 조건 ] : 회원아이디가 admin 이고 비밀번호가 1234 일 경우에는 로그인 성공 아니면 로그인 실패 출력
		System.out.println("======로그인 페이지======");
		System.out.print(" ID : "); String a1 = scanner.next();
		System.out.print(" Password : "); int a2 = scanner.nextInt();
		
		if( a1.equals("admin")) {
			// 아이디가 admin 이면
			if(a2 == 1234) {
				System.out.println( ">>>로그인 성공<<<");				
			}else {
				System.out.println("로그인 실패 패스워드가 다릅니다.");
			}
			}else {
				System.out.println("로그인 실패 존재하지 않는 아이디 입니다."); }*/
	}
}


