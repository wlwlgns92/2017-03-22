package Day03;

import java.util.Scanner;

public class Day03_7 {
	
	//p.127 : 
		// 1. 무한루프로 입력을 계속 받기
			//1. while(true)
			//2. while(boolean)
		// 2. 변수를 제어
	public static void main(String[] args) {
		
		// 무한루프[조건이 false일때까지 (break,return) 나오기전까지 계속 실행됨]
		boolean run = true;
		int keycode=0;
		int speed=0;
		while(run) { //조건이 true 실행 false 실행x
			Scanner scanner =new Scanner(System.in);
			System.out.println("1.증속 2.감속 3.중지");
			System.out.println("선택 : ");
			keycode = scanner.nextInt();
				//1 1번 입력시 스피드 증가
			if(keycode ==1) {speed++; System.out.println("현재속도는 : "+ speed);			}
				//2 2번 입력시	스피드 감소
			if(keycode ==2) {speed--; System.out.println("현재속도는 :ㅣ "+ speed);}
					if(keycode == 3) { // 3 입력시 종료
						run=false; System.out.println("프로그램 중지");
					}
		}
	}
}
