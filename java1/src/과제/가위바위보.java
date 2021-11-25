package 과제;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {
	
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
		int 플레이어;		// 플레이어가 낸 가위,바위,보를 저장할 변수
		int 컴퓨터;		// 컴퓨터가 낸 가위,바위,보를 저장할 변수
		int 플레이어승리=0;	// 플레이어의 승리횟수를 저장할 변수
		int 컴퓨터승리=0;	// 컴퓨터의 승리횟수를 저장할 변수
		int 무승부 = 0;	// 무승부 횟수를 저장할 변수
		Scanner scanner = new Scanner(System.in);	// 입력받기 위한 객체
		while(true) {
			
			System.out.println("가위[0]바위[1]보[2]");
			System.out.println("선택 : "); 플레이어 = scanner.nextInt();
			
			if(플레이어 == 3) {	// 플레이어가 3을 입력하면 게임 종료
				if(컴퓨터승리 < 플레이어승리) {	// 만약에 컴퓨터승리가 플레이어승리보다 작으면
				System.out.println("게임 종료 최종 승리자는 플레이어입니다. 승리횟수는" + 플레이어승리); //메시지 출력후 플레이어승리 횟수 출력
				break;	// 반복문 탈출
				}
				else if (플레이어승리 < 컴퓨터승리) { // 아니면 플레이어 승리가 컴퓨터 승리보다 작으면
					System.out.println("게임 종료 최종 승리자는 컴퓨터입니다. 승리횟수는" + 컴퓨터승리); // 컴퓨터승리 메시지 출력후 승리횟수 출력
					break; //반복문 탈출
				}
				else { // 아니면 
					System.out.println("최종 결과는 무승부입니다. 무승부 횟수는 "+ 무승부 ); // 무승부 메시지 출력후 무승부횟수 출력
					break;	// 반복문 탈출
				}
			}
			
			if(플레이어< 0 || 플레이어 >3) { // 만약에 플레이어가 입력한 숫자가 0보다 작고 3보다 크면
				System.out.println("0~2 사이의 수만 입력 가능합니다."); // 메시지 출력
				continue;	// 반복문 다시진행
			}
			
			Random random = new Random(); // 난수 생성 객체
			컴퓨터 = random.nextInt(3);	// 0~2의 난수를 컴퓨터에 대입
			System.out.println("컴퓨터 선택 : " + 컴퓨터); // 컴퓨터가 낸수 메시지 출력
			// 만약에 플레이어가 0 그리고 컴퓨터가 2라면 또는 플레이어가 1 그리고 컴퓨터가 0이라면 또는 플레이어가 2 그리고 컴퓨터가 1이라면
			if(플레이어==0 && 컴퓨터==2 || 플레이어==1 && 컴퓨터==0 || 플레이어 == 2 && 컴퓨터==1) { 
				플레이어승리++;	//플레이어 승리횟수 1증가
				System.out.println("플레이어가 승리하였습니다. 플레이어 승리횟수 :" + 플레이어승리); // 플레이어 승리 메시지와 승리횟수 출력
				//아니면 플레이어 0 그리고 컴퓨터가 0 또는 플레이어 1 그리고 컴퓨터 1 또는 플레이어 2 그리고 컴퓨터 2 라면 
			}else if (플레이어==0 && 컴퓨터==0 || 플레이어==1 && 컴퓨터==1 || 플레이어 == 2 && 컴퓨터==2) {
				무승부++; //무승부 1 증가
				System.out.println("무승부 입니다. 무승부 횟수는 :" + 무승부); // 무승부 메시지와 무승부 횟수 출력
			}else { // 아니면 
				컴퓨터승리++; // 컴퓨터승리 1증가
				System.out.println("컴퓨터 승리 컴퓨터 승리횟수 :" + 컴퓨터승리); //컴퓨터 승리메시지와 승리횟수 출력
			}
			
		}
	}
}
