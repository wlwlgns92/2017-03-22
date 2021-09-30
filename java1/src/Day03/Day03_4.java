package Day03;

public class Day03_4 {

		// 반복문 : for , while
			// 1. for : 어디서부터 어디까지 어떻게 증가하면서 반복실행
				// for(초기값; 조건문; 증감식) {실행문; }
				// for(어디서부터, 어디까지, 어떻게 증가) {실행문;}
				public static void main(String[] args) {
					
					/*/ p.121 예1)
					// 1부터 10까지 1씩 증가하면서 반복출력
					for(int i = 1; i<=10; i++) {
						// 1.초기값 : 반복변수의 시작값 i는 1부터
						// 2.조건문 : 반복변수의 논리 제어(true 실행 아니면 실행x)
						// 3.증감식 : 반복변수의 증감단위
						System.out.print(i + " ");
						// i = 1일때 i<=10 true 반복실행o
						// 증감식 i = 2 일때 i<=10 true
						// 증감식 i = 3 일때 i<=10 true
						//~~~~~~~~~
						//// 증감식 i = 11 일때 i<=10 fales */
						
					/*/ 예2) 1~50까지 출력 [i는 1부터 50ㅏ지 1씩 증가하면서 반복실행]
						for(int i =1; i<=50; i++) {System.out.print(i+ " "); */
					
					/*/예3) 1~50까지 3씩 증가 출력
					for(int i= 1; i<=50; i+=3) { System.out.println(i + " "); } */
					
					/*/p.122 예4) // 1부터 100까지 합을 출력
				int a1 = 0; // 공백이랑 0은 다르다.
				for(int i =1; i<=100; i++) { a1 += i; } System.out.print("1~100 합은 : "+ a1); */
					
					/*/예5 : 1부터 100까지 7배수의 누적합계 [i는 1부터 100까지 7씩 증가하면서 누적합계
					int a1= 0;
					for(int i =0; i<=100; i+=7) {a1 +=i;} System.out.println("1~100까지 7배수의 누적합계 : " +a1); */
					
					/*/ 예5_2
					int a1=0; 
					for( int i=0; i<=100; i++) { if(i%7==0) a1+=i;}
					System.out.println("1~100까지 7배수의 누적합계 : " +a1); */		
					
					
					/*/ 예6 : 2단 구구단 
						// 단수 : 2[상수] 곱 : 1~9 [변수]
					for(int i= 1 ; i<=9; i++) { System.out.printf("%d * %d = \n", 2 , i ,2*1); } */
					
					
					// p.124 예7) 2단부터 15 구구단
						// 단수 : 2~15[변수] 곱 : 1~9[변수]
					int 실행횟수 = 0;
					for(int 단1 = 2; 단1<=15; 단1++) {
					System.out.println("===="+단1+"단=======");
					for(int 곱=1; 곱<=9; 곱++) {
						System.out.printf("%d x %d = %d \n" , 단1, 곱, 단1*곱);
						실행횟수++;
					}
					
					}
				System.out.println("총 실행횟수 : " + 실행횟수);
				}
}
