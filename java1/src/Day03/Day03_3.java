package Day03;

import java.util.Scanner;

public class Day03_3 {
	
  // if(논리제어) switch(데이터제어)
  // sswitch문은 if문처럼 조건식이 true일 경우에 블록 내부의 실행문을 싱행하는 것이 아니다. 변수가 어떤 값을 갖느냐에 따라 실행문이 선택된다.
	// 경우의수가 정해져 있는 경우 -> switch(속도 빠름)
	// 경우의수가 정해져 있지 않는 경우 -> if(논리)
		/* 형태 : switch( key:검사대상) { 
				case 검사 : 실행문;
				case 검사 : 실행문;
				case 검사 : 실행문;
				default : 실행문; */
	// break; : switch 혹은 반복문을 탈출시 사용되는 키워드 { 가장 가까운 중괄호 탈출}
	public static void main(String[] args) {
		/*/ 예1)
		int a1 = 80;
		switch(a1) { // 점수는 검사!!!
			//점수가 90이면
		case 90 : System.out.println(" A 등급 입니다."); break;
		case 80 : System.out.println(" B 등급 입니다."); break;
		case 70 : System.out.println(" C 등급 입니다."); break;
		//그외
		default : System.out.println(" 탈락 입니다."); 
			}*/
		
		/*/예2
		int a1 =3 ;
		switch(a1) {
		case 1 : System.out.println(" 1층으로 이동 "); break;
		case 2 : System.out.println(" 2층으로 이동 "); break;
		case 3 : System.out.println(" 3층으로 이동 "); break;
		default : System.out.println(" 정지 ");
		} */
		
		/*/ p.118 char switch 문
		char a1 = 'B';
		switch(a1) {
		case 'A' :
		case 'a' : 
			System.out.println("우수회원 입니다."); break;
		case 'B' :
		case 'b' : 
			System.out.println("일반회원 입니다."); break;
			default : System.out.println("손님 입니다.");
		} */
		/*/ p.119 String switch 문
		
		String a1 = "과장";
		
		switch(a1) {
		case "부장" :
			System.out.println("700만원"); break;
		case "과장" :
			System.out.println("500만원"); break;
			default : System.out.println("300만원");	} */
		
		// 문제1 : 국,영.수 점수를 입력받아 평균이 90점 이상이면 A등급, 80점 이상이면 B등급 나머지는 탈락
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 점수 입력 : "); int a1 = scanner.nextInt();
		System.out.print("영어 점수 입력 : "); int a2 = scanner.nextInt();
		System.out.print("수어 점수 입력 : "); int a3 = scanner.nextInt();
		int a4 = (a1+a2+a3)/3;
		
		switch(a4/10) {
			//1의 자리를 생략한다.
		case 10 :
		case 9 : System.out.println("A등급"); break;
		case 8 : System.out.println("B등급"); break;
		default : System.out.println("탈락입니다.");
		}
		
	}
	
}
