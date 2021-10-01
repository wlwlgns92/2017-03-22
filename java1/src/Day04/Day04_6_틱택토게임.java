package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_6_틱택토게임 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 배열을 이용한 틱택토게임 프로그램
			//1. 게임칸 생성 [ 9칸 생성 ]
				// String 객체 9개를 저장하는 배열 선언
		String[] 게임판 = { "[ ]", "[ ]", "[ ]",
				"[ ]","[ ]","[ ]",
				"[ ]","[ ]","[ ]",};

		String winner = ""; // 승리 알을 담을 변수
		int count = 0; // 현재 알 수 
		while(true) {
			
			//2. 게임판 출력
			for( int i = 0; i<게임판.length; i++) {
				// 출력후 3칸씩 줄바꿈
				System.out.print(게임판[i]);
				if(i%3==2) System.out.println();
			}
			//6. 승리자가 나왔을때
			if (winner.equals("[O]")) {
				System.out.println("플레이어 승리");
			break;
			}else if (winner.equals("[x]")) { 
				System.out.println(">>컴퓨터 승리<<<");
			}
			
			while(true) {
				// 3. 플레이어 위치를 선택하여 알 두기
				System.out.println(">>>>>> 플레이어 순서 위치 선택 : "); int index = scanner.nextInt();
				// 선택한 위치에 이미 알이 있을 경우에 다시 입력받기
				if( 게임판[index].equals("[ ]")) {
					게임판[index] = "[O]";
					count++; //현재 알의 개수 1 증가
					break; // 정상적인 알을 두었으면 반복문 종료
				}else { 
					System.out.println(" [이미 둔 자리입니다. 다시 선택해주세요");
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
			System.out.println(">>>>컴퓨터 선택중<<<<<");
			while(true) {
				Random random = new Random();
				int index = random.nextInt(9); //0부터 8 사이의 난수 생성
				if( 게임판[index].equals("[ ]")) {
					count++;
					게임판[index] = "[x]";break;
				}
			}	
			// 5. 승리자 판단
				//1. 0 1 2 // 3 4 5 // 6 7 8 모양이 같을 경우 해당 모양이 승리
			for(int i = 0; i<=6; i+=3) { 
				if(게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2])) {
					if(!게임판[i].equals("[ ])")) {
						// ! : 부정[true -> false
						winner = 게임판[i];
					}
					
				}
			}
				//2. 0 3 6 // 1 4 7 // 2 5 8
			for(int i = 0; i<=2; i++) {
				if(게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals(게임판[i+6])) {
					if(!게임판[i].equals("[ ])")) {
						// ! : 부정[true -> false
						winner = 게임판[i];
					}
				}
			}
				//3. 0 4 8 // 2 4 6 // 
			if (게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8])  ) {
				if(!게임판[0].equals("[ ])")) {
					// ! : 부정[true -> false
					winner = 게임판[0];
				}	
				if (게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6]) ) {
					if(!게임판[2].equals("[ ])")) {
						// ! : 부정[true -> false
						winner = 게임판[0];
			}		
				}	
			}
				
		} //w e
	}// m e

}// c s
