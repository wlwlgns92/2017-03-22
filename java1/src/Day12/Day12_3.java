package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_3 {

	public static void main(String[] args) {
		
		// 설정  [ 초기값 1번 실행할 변수 ]
		Scanner scanner = new Scanner(System.in); // 입력객체
		String[] carnumbers = new String[10]; //String 10개 저장배열 
		String[] carnumbers_odd = new String[10];// 홀수 차량들
		String[] carnumbers_even = new String[10]; //짝수 차량들
		Random random = new Random();
		
		while(true) {
			
			System.out.print("1.차량 출입 : ");
			int ch = scanner.nextInt();
			if( ch==1 ) { 
				
				/////차량번호 저장
				int intnum = random.nextInt(10000); // 0~ 9999
				// 정수 => 4자릿수 문자열 변환
				String strnum = String.format("%04d", intnum);
						// String.format(형식, 데이터) 문자열 형식 메소드
							// 형식 : %d -> 형식대상의 데이터가 정수
								// %4d : 4자릿수
								// %04d : 비어있는 자리수는 0으로 매꿈
				// 차량번호 저장 [ 비어있는 배열에 저장 ]
				
				for(int i = 0 ; i < carnumbers.length; i++) {
					if(carnumbers[i] == null) {
						carnumbers[i] = strnum; 
						//홀짝 구분
							// 1. 문자 -> 정수형 변환
							// 2. 홀짝 구분
							// 값 % 2 - 0 나머지가 0이면 짝수 나머지가 1이면 홀수
						if(Integer.parseInt(strnum) %2==0) {
							// 정수형(차량번호) % 2 == 0 이면 짝수
							for(int j = 0; j < carnumbers_even.length; i++) {
								if(carnumbers_even[j] == null) {
									carnumbers_even[j] = strnum; break;
								}
							}
						} else { // 홀수
							for(int j = 0; j < carnumbers_odd.length; i++) {
								if(carnumbers_odd[j] == null) {
									carnumbers_odd[j] = strnum; break;
								}
										
							}
						}
						break;
					}
				}
				///차량번호 출력
				System.out.println("현재 주차중인 차량");
				for(String num : carnumbers) { // 인덱스 번호가 필요없는 반복
				// for( 자료형 임시변수 : 변수명 ) : 배열내 0번 인덱스부터 마지막인덱스까지 임시변수에 대입
				if( num != null ) System.out.println( num ); 
				}
				System.out.println("현재 주차중인 홀수 차량");
				for(String num : carnumbers_odd) { // 인덱스 번호가 필요없는 반복
					// for( 자료형 임시변수 : 변수명 ) : 배열내 0번 인덱스부터 마지막인덱스까지 임시변수에 대입
					if( num != null ) System.out.println( num ); 
				}
				System.out.println("현재 주차중인 짝수 차량");
				for(String num : carnumbers_even) { // 인덱스 번호가 필요없는 반복
					// for( 자료형 임시변수 : 변수명 ) : 배열내 0번 인덱스부터 마지막인덱스까지 임시변수에 대입
					if( num != null ) System.out.println( num ); 
				}
				
				
			
				
		
			
			}
		}
	}
}
