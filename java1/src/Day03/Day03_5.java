package Day03;

import java.util.Scanner;

public class Day03_5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 반복으로 별 모양 찍기
		/*/ 문제1) 입력받은 정수만큼 별출력 [ i1은 1부터 입력받은 정수까지 1씩 증가]
		System.out.println(" 별 개수 : "); int a1 = scanner.nextInt();
		for(int i1 = 1; i1<=a1; i1++) { System.out.print("*");} */
		
		/*/문제2) 입력받은 정수만큼 별출력 // 5개마다 줄바꿈
		System.out.println(" 별 개수 : "); int a1 = scanner.nextInt();
		for(int i1= 1; i1<=a1; i1++) { System.out.print("*");
		if( i1%5==0) System.out.println();} */
		
		/*/문제3) 입력받은 줄 만큼 출력
		System.out.println("줄 수 : "); int a =scanner.nextInt();
		// i 1부터 입력받은 a까지 1씩 증가하면서 내려감
			//줄바꿈
		for( int i = 1; i<=a; i++) { 
			//별찍기
		for( int s = 1; s<=i; s++) {System.out.print("*");}	
			
			System.out.println(); 
		} */
				
		/*/문제4) 입력받은 줄 만큼 출력
		System.out.println("줄 수 : "); int a =scanner.nextInt();
		// i 1부터 입력받은 a까지 1씩 증가하면서 내려감
			//줄바꿈
		for( int i = 1; i<=a; i++) { 
			//별찍기
		for( int s =1; s<=a-i+1; s++ ) {System.out.print("*");}	
		System.out.println(); } */
		
		/*/문제5) 입력받은 줄 만큼 출력
		System.out.println("줄 수 : "); int a =scanner.nextInt();
		for( int i = 1; i<=a; i++) { 
		//공백찍기
			for( int b= 1; b<=a-i; b++) { System.out.print(" ");}
			//별찍기
			for(int s= 1; s<=i; s++) { System.out.print("*");}
			System.out.println();
		}*/
		/*/문제6) 입력받은 줄 만큼 출력
		System.out.println("줄 수 : "); int a =scanner.nextInt();
		for(int i = 1; i<=a; i++) { 
			//공백
			for(int b = 1; b<=i-1; b++) { System.out.print(" ");}
			//별찍기 
			for(int s= 1; s<=a-i+1; s++) { System.out.print("*"); }
			System.out.println();
		} */
		/*/문제7) 입력받은 줄 만큼 출력
		System.out.println("줄 수 : "); int a =scanner.nextInt();
		for(int i = 1; i<=a; i++) {
			//공백
			for( int b= 1; b<=a-i; b++) { System.out.print(" ");}
			//별찍기
			for(int s = 1; s<=i*2-1; s++) { System.out.print("*");}
		System.out.println();
		}*/
		
		/*/문제8) 입력받은 줄 만큼 출력
		System.out.println("줄 수 : "); int a =scanner.nextInt();
		for(int i = 1; i<=a; i++) {
			//공백
			for( int b= 1; b<=a-i; b++) { System.out.print(" ");}
			//별찍기
			for(int s = 1; s<=i*2-1; s++) { System.out.print(i);}
		System.out.println();
		} */
		/*/문제9) 입력받은 줄 만큼 출력
		System.out.println("줄 수 : "); int a =scanner.nextInt();
		for(int i=1; i<=a; i++) {
			//공백
			for(int b = 1; b<=i-1; b++) { System.out.print(" ");}
			//별
			for(int s = 1; s<=a*2-(i*2-1); s++) { System.out.print("*");}
		System.out.println();} */
		
		//문제 11)
		System.out.println("줄 수 : "); int a =scanner.nextInt();
		for(int i=1; i<=a; i++) {
			//공백
			
			//별찍기
		}
		
		
		
	}

}
