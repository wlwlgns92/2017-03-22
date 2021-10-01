package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 가위바위보
			// 1. 사용자로부터 가위[0]바위[1]보[2] 중 하나를 입력 받기
			// 2. 컴퓨터는 랜덤으로 가위바위보[0~2] 중 하나 선택
			// 3. 승리한 플레이어 호출
				// + : 만약에 종료[3]를 입력하면 게임종료
				// + : 게임종료시 게임수 와 최종승리[ 가장 많이 이긴 플레이어 호출 ]
		// 필요 변수 개수  -> 키보드로 입력 -> 난수 생성 -> 제어[승리자 판단]
		
		// 1. 변수 생성
		int 플레이어; 
		int 컴퓨터; 
		int 게임수 = 0; // while문의 반복횟수
		int 플레이어승리 = 0; int 컴퓨터승리=0;
	// 최종 승리자 
		// 이긴 횟수를 새야한다.
			// 이기면 1씩 증가
			// 게임 종료시 이긴 횟수를 비교한다
			// 최종 승리자 출력
		
		while(true) {
			
			// 2. 입력받기
			System.out.println("---------- 가위바위보 게임 -------------");
			System.out.print(">>>가위[0] 바위[1] 보[2]<<<<<<<"); 플레이어 = scanner.nextInt();
			
			// 4. 게임종료
			if(플레이어 == 3) {
				System.out.println(" 게임 종료 게임 횟수 : " + 게임수);
				if( 플레이어승리 > 컴퓨터승리) { System.out.println("최종승리자 : 플레이어 " + 플레이어승리);
					
				}
				else if (플레이어승리 < 컴퓨터승리) {
					System.out.println("최종 승리자 : 컴퓨터 "+ 컴퓨터승리);
				}
				System.out.println(" 최종 승리자 : " );
				break; // 가장 가까운 반복문 탈출
			}
			// 4-1 0~3외 숫자 입력시
			if(플레이어 < 0 || 플레이어 >3) {
				System.out.println(" 다시 입력해주세요 ");
				continue; // 가장 가까운 반복문 다시 실행
			}
			// 3. 컴퓨터로부터 난수 생성
			System.out.println(">>>>>>>컴퓨터 선택 중<<<<<<<<");
			Random random = new Random(); // 난수 객체
			컴퓨터 = random.nextInt(3); // 0~2 사이 난수
			System.out.println(컴퓨터);
			// 4. 승리자 판단
			if((플레이어 == 0 && 컴퓨터 == 2) || (플레이어 ==1 && 컴퓨터 ==0) || (플레이어 ==2 && 컴퓨터 ==1)) {
				System.out.println("플레이어가 이겼습니다");
				플레이어승리++;
			}
			else if ((플레이어==0 &&컴퓨터 == 0) || (플레이어 == 1 && 컴퓨터 == 1) || (플레이어 == 2 && 컴퓨터 ==2) ) {
				System.out.println("무승부 입니다.");
			}

			else { 
				System.out.println("컴퓨터가 이겼습니다.");
				컴퓨터승리++;
			}
			게임수++;
		} // w e
		
	} // m e

} //c e
