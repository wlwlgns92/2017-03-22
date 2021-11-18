package 과제;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보Time {

	// 3차시
	
	// 가위바위보
	// 1. 사용자로부터 가위[0]바위[1]보[2] 중 하나를 입력 받기
	// 2. 컴퓨터는 랜덤으로 가위바위보[0~2] 중 하나 선택
	// 3. 승리한 플레이어 호출
		// + : 만약에 종료[3]를 입력하면 게임종료
		// + : 게임종료시 게임수 와 최종승리[ 가장 많이 이긴 플레이어 호출 ]
// 필요 변수 개수  -> 키보드로 입력 -> 난수 생성 -> 제어[승리자 판단]// 최종 승리자 
// 이긴 횟수를 새야한다.
// 이기면 1씩 증가
// 게임 종료시 이긴 횟수를 비교한다
// 최종 승리자 출력
	
	public static void main(String[] args) {
		
		int 플레이어;
		int 컴퓨터;
		int 플레이어승리=0;
		int 컴퓨터승리=0;
		int 무승부 =0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("가위[0]바위[1]보[2]");
			System.out.print("선택 : "); 플레이어 = scanner.nextInt();
			
			if(플레이어 < 0 || 플레이어 > 3) {
				System.out.println("0~2 숫자만 입력가능합니다.");
				continue;
			}
			if( 플레이어 == 3)  {
				if(컴퓨터승리 < 플레이어승리 ) {
					System.out.println("최종결과는 플레이어승리입니다. 승리횟수 : " +플레이어승리);
					break;
				}else if (플레이어승리 < 컴퓨터승리 ) {
					System.out.println("최종결과는 컴퓨터승리입니다. 승리횟수 : " + 컴퓨터승리);
					break;
				}else {
					System.out.println("최종결과는 무승부입니다. 무승부횟수 : " + 무승부);
					break;
				}
			}
			
			Random random = new Random();
			컴퓨터 = random.nextInt(3);
			System.out.println("컴퓨터가 낸수는 : " + 컴퓨터);
			if(플레이어 == 0 && 컴퓨터 == 2 || 플레이어 == 1 && 컴퓨터 == 0 || 플레이어 == 2 && 컴퓨터 == 1) {
				플레이어승리++;
				System.out.println("플레이어 승리입니다. 승리횟수 : " +플레이어승리);
			}else if (플레이어 == 0 && 컴퓨터 == 0 || 플레이어 == 1 && 컴퓨터 == 1 || 플레이어 == 2 && 컴퓨터 == 2) {
				무승부++;
				System.out.println("무승부 입니다. 무승부 횟수 : " + 무승부);
			}else {
				컴퓨터승리++;
				System.out.println("컴퓨터 승리입니다. 승리횟수는 : " +컴퓨터승리);
			}
		}
		
	}
}
