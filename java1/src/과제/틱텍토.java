package 과제;

import java.util.Random;
import java.util.Scanner;

public class 틱텍토 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 배열을 이용한 틱택토게임 프로그램
			
		String[] 게임판 = { "[ ]", "[ ]", "[ ]",
				"[ ]","[ ]","[ ]",
				"[ ]","[ ]","[ ]",};		// 게임판 만들기 , String 타입 9개를 담을 수 있는 배열 생성

		String winner = ""; // 승리 알을 담을 변수
		int count = 0; // 현재 알 수 
		while(true) {
			
			//2. 게임판 출력
			for( int i = 0; i<게임판.length; i++) {	// i가 0일때 i가 게임판의 길이보다 작다면 i는 1씩증가
				// 출력후 3칸씩 줄바꿈
				System.out.print(게임판[i]);	// 게임판 출력 
				if(i%3==2) System.out.println();	// 만약에 i를 3으로 나누었을때 나머지가 2라면 출력으로 한칸 띄우기
			}
			//6. 승리자가 나왔을때
			if (winner.equals("[O]")) {	
				System.out.println("플레이어 승리");
			break;
			}else if (winner.equals("[x]")) { 
				System.out.println(">>컴퓨터 승리<<<");
			}
			
			while(true) { // 반복문
				// 3. 플레이어 위치를 선택하여 알 두기
				System.out.println(">>>>>> 플레이어 순서 위치 선택 : "); int index = scanner.nextInt(); // 플레이어 선택 입력받기
				// 선택한 위치에 이미 알이 있을 경우에 다시 입력받기
				if( 게임판[index].equals("[ ]")) {	// 만약에 게임판에 플레이어가 선택한 곳이 빈칸이라면 
					게임판[index] = "[O]";	// 선택한곳을 [o]로 바꾸기
					count++; //현재 알의 개수 1 증가 // 알의 개수 1증가
					break;  // 성공후 반복문 종료
				}else { 	// 아니면
					System.out.println(" [이미 둔 자리입니다. 다시 선택해주세요"); //프린트 출력
				}
			}	
			//7. 9칸이 모두 알이 존재했을때 [ 무승부]
			if ( count == 9) {
				for( int i = 0; i<게임판.length; i++) {
					// 출력후 3칸씩 줄바꿈
					System.out.print(게임판[i]);
					if(i%3==2) System.out.println();
				System.out.println("무승부");
				break;
			}
			}
			//4. 컴퓨터 [0~9 사이 난수를 생성해서 알[x]두기
			System.out.println(">>>>컴퓨터 선택중<<<<<");	// 컴퓨터 선택
			while(true) {	// 반복문
				Random random = new Random(); // 난수 생성 객체
				int index = random.nextInt(9); // 0~8 까지중 난수를 생성해 변수 index에 저장
				if( 게임판[index].equals("[ ]")) { // 만약에 컴퓨터가 선택한 곳이 빈곳이라면
					count++;	// 알의개수 1증가
					게임판[index] = "[x]";break; // 선택한곳을 [x]로 바꾸며 반복문 탈출
				}
			}	
			// 5. 승리자 판단
				//1. 0 1 2 // 3 4 5 // 6 7 8 모양이 같을 경우 해당 모양이 승리
			for(int i = 0; i<=6; i+=3) { // i가 0일떄 i가 6보다 작거나 같다면 +3
				if(게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2])) { // 만약에 게임판[i]이 게임판[i+1]과 같고 게임판[i+1]이 게임판[i+2]와 같다면
					if(!게임판[i].equals("[ ])")) { // 만약에 게임판[i]이 [ ]이 아니라면
						// ! : 부정[true -> false
						winner = 게임판[i];  // winner 변수에 게임판[i]째 대입
					}
					
				}
			}
				//2. 0 3 6 // 1 4 7 // 2 5 8
			for(int i = 0; i<=2; i++) { // i가 0일때 i가 2보다 작거나 같다면 i 1씩증가
				if(게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals(게임판[i+6])) { //게임판[i]이 게임판[i+3]과 같고 게임판[i+3]이 게임판[i+6]과 같다면
					if(!게임판[i].equals("[ ])")) { //만약에 게임판[i]이 [ ]이 아니라면
						// ! : 부정[true -> false
						winner = 게임판[i]; // winner 변수에 게임판[i] 대입
					}
				}
			}
				//3. 0 4 8 // 2 4 6 // 
			if (게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8])) { //만약에 게임판[0]이 게임판[4]와 같고 게임판[4]가 게임판[8]과 같다면
				if(!게임판[0].equals("[ ])")) { // 만약에 게임판[0]이 [ ]이 아니라면
					// ! : 부정[true -> false
					winner = 게임판[0]; // winner 변수에 게임판[0] 대입
				}	
				if (게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6]) ) { // 만약에 게임판[2]가 게임판[4]와 같고 게임판[4]가 게임판[6]과 같다면
					if(!게임판[2].equals("[ ])")) { // 만약에 게임판[2]가 [ ]이 아니라면 
						// ! : 부정[true -> false
						winner = 게임판[0]; // winner 변수에 게임판[0] 대입.
			}		
				}	
			}
				
		} //w e
	}
}
