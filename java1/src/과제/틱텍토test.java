package 과제;

import java.util.Random;
import java.util.Scanner;

public class 틱텍토test {
	
	public static void main(String[] args) {
		// 배열을 이용한 틱택토게임 프로그램 			[ 3차 도전!!! ]
					//1. 게임칸 생성 [ 9칸 생성 ]
		//0 1 2 // 3 4 5 // 6 7 8 모양이 같을 경우 해당 모양이 승리
		//2. 0 3 6 // 1 4 7 // 2 5 8
		//3. 0 4 8 // 2 4 6 // 
		//7. 9칸이 모두 알이 존재했을때 [ 무승부]	
	Scanner scanner = new Scanner(System.in); // 입력 객체
	
	String[] 게임판 = { "[ ]", "[ ]", "[ ]",
						"[ ]", "[ ]", "[ ]",
						"[ ]", "[ ]", "[ ]"}; // 게임판 : 9개의 배열
	String winner = "";    // 승리자의 알을 담을 변수
	int count = 0;	// 알을 놓은 횟수
	
	while(true) { // 반복문 
		
		//게임판 출력
		for(int i = 0; i<게임판.length; i++) { // 게임판 출력을 위한 반복문
			System.out.print(게임판[i]);	// 게임판 출력
			if(i%3==2) {	// i를 3으로 나눴을때 나머지가 2라면
				System.out.println(); // 출력
			}
		}
		// 승리자 
		if(winner.equals("[o]")) { // winner가 [o]와 같다면
			System.out.println("플레이어 승리"); // 출력
			break;	// 반복문 탈출
		}else if(winner.equals("[x]")) {  // winner가 [x]와 같다면
			System.out.println("컴퓨터 승리"); // 출력
			break;	// 반복문 탈출
		}
		//플레이어 선택
		while(true) { // 반복문
			System.out.print("플레이어 선택 : "); int index = scanner.nextInt(); // 선택 입력 받기
			if(게임판[index].equals("[ ]")) { // 플레이어가 입력한 칸이 빈칸이라면
				게임판[index] = "[o]"; // 입력한 칸을 [o]로 변경
				count++; // count 1증가
				break; // 반복문 탈출
			}else { System.out.println("이미 둔 자리입니다.");} // 아니라면 출력
		}
			
		//무승부
		if(count == 9) { // count가 9라면
			for(int i = 0; i<게임판.length; i++) { // 게임판의 길이만큼 반복문 실행 i 1씩 증가
				System.out.print(게임판[i]); // 게임판 출력
				if(i%3==2) { // i를 3으로 나누었을때 나머지가 2라면
					System.out.println(); // 출력
				}
			}
			System.out.println("무승부 입니다."); // 출력
			break; // 반복문 탈출
		}
		//컴퓨터 선택
			System.out.println("컴퓨터 선택중"); // 출력
			while(true) { // 반복문
				Random random = new Random(); // 난수 생성 객체
				int index = random.nextInt(8); // 0~8까지 난수를 생성해 변수에 저장
				if(게임판[index].equals("[ ]")) { // 선택된 난수의 칸이 빈칸이라면
					게임판[index] = "[x]"; // [x]로 변경
					count++; // count 1증가
					break; // 반복문 탈출
				}
			}
			
			//0 1 2 // 3 4 5 // 6 7 8
			
			for(int i = 0; i <= 6; i+=3) { // i가 6보다 작거나 같으면 반복문 실행 후 i는 3증가
				if(게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2])) { // 게임판[i]번쨰가 게임판[i+1]과 같고 게임판[i+1]이 게임판[i+2]와 같다면
					if(!게임판[i].equals("[ ]")) { // 게임판[i]가 빈칸이 아니라면
						winner = "[o]"; // winner 변수에 [o] 대입
					}
				}
			}
			
			//2. 0 3 6 // 1 4 7 // 2 5 8
			for(int i = 0; i <= 2; i++) { // i가 2보다 작거나 같으면 반복문 실행 후 i 1씩 증가
				if(게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals(게임판[i+6])) { // 게임판[i]번쨰가 게임판[i+3]과 같고 게임판[i+3]이 게임판[i+6]와 같다면
					if(!게임판[i].equals("[ ]")) { // 게임판[i]가 빈칸이 아니라면
						winner = "[o]"; // winner 변수에 [o] 대입
					}
				}
			}
			
			//3. 0 4 8 // 2 4 6 // 
			if(게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8])) { // 게임판[0]번쨰가 게임판[4]과 같고 게임판[4]이 게임판[8]와 같다면
				if(!게임판[0].equals("[ ]")) { // 게임판[0]이 빈칸이 아니라면
					winner = "[o]"; // winner 변수에 [o] 대입
				}
			}
			if(게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6])) { // 게임판[2]번쨰가 게임판[4]과 같고 게임판[4]이 게임판[6]와 같다면
				if(!게임판[2].equals("[ ]")) { // 게임판[2]이 빈칸이 아니라면
					winner = "[o]"; // winner 변수에 [o] 대입
				}
			}
		
	}//we
	}// m e
} // c e
