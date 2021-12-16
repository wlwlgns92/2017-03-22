package 과제1;

import java.util.Random;
import java.util.Scanner;

public class 차량번호분배 {
	// 문제 : 차량번호 랜덤으로 0000~9999 사이의 난수 10개 생성 
		// 1. 모든 차량을 배열에 저장 
		// * 끝자리 번호로 홀수/짝수
		// 2. 차량 끝자리 번호가 홀수 배열 생성
		// 3. 차량 끝자리 번호가 짝수 배열 생성 
		// [출력] 3개의 배열 모두 출력 
			// 난수 => 정수 0~9999 사이의 랜덤 생성
			// 정수 -> 4자릿수 문자열 변환
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 입력객체
		String[] 차량 = new String[10];	// 차량을 저장할 배열
		String[] 홀수 = new String[10];	// 차번호가 홀수인 차량을 저장할 배열
		String[] 짝수 = new String[10];	// 차번호가 짝수인 차량을 저장할 배열
		Random random = new Random();	// 난수 객체
		
		while(true) { // 무한루프
			
			System.out.println("1.차량출입"); int ch = scanner.nextInt(); // 입력
			if(ch == 1) { // ch가 1이라면
				
				int carnum = random.nextInt(10000); // 0~9999까지 난수 생성후 변수에 대입
				String carstr = String.format("%04d", carnum); // int 타입의 변수를 문자열로 변환
				
				for(int i = 0; i < 차량.length; i++) { // 차량 배열의 길이만큼 반복
					if(차량[i] == null) { // 차량 i번째가 null이라면
						차량[i] = carstr; // i번째에 carstr 값 대입
						if(Integer.parseInt(carstr) %2 ==0) { // carstr을 int로 변환후 2로 나누었을때 나머지가 0이라면
							for(int j=0; j < 짝수.length; j++) { // 짝수 길이만큼 반복
								if(짝수[i] == null) { // 만약에 짝수배열 i번째가 null이라면
									짝수[i] = carstr; break; // i번째에 carstr 값 대입후 반복문 종료
								}
							}
						}else { // 아니면
							for(int j = 0; j < 홀수.length; j++) { // 홀수 배열 길이만큼 반복
								if(홀수[j] == null) { // 만약에 홀수 j번째가 null이라면
									홀수[j] = carstr; break; // j번째에 carstr 값 대입 후 반복문 종료
								}
							}
						}
						break; // 반복문 종료
					}
				}
				
				System.out.println("-----------주차중인 차량--------");
				for(String 주차 : 차량) { // 차량의 모든 인덱스를 주차라는 임시변수에 저장
					if(주차 != null) System.out.println(주차); // 만약에 임시변수가 null 이 아니면 출력
				}
				
				System.out.println("-----------주차중인 홀수차량--------");
				for(String 주차1 : 홀수) { // 홀수차량의 모든 인덱스를 주차라는 임시변수에 저장
					if(주차1 != null) System.out.println(주차1);// 만약에 임시변수가 null 이 아니면 출력
				}
				
				System.out.println("-----------주차중인 짝수차량--------");
				for(String 주차2 : 짝수) { // 짝수 차량의 모든 인덱스를 주차라는 임시변수에 저장
					if(주차2 != null) System.out.println(주차2);// 만약에 임시변수가 null 이 아니면 출력
				}
			}
		}
	}
}
