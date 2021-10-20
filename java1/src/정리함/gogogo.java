package 정리함;

import java.util.Scanner;

public class gogogo {

	public static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) {
			
			boolean sw = true;  // 현재 재생여부를 확인하는 변수
			boolean sw2 = true;
			while (true) { 
			System.out.println("---메인메뉴---");
			System.out.println("1.음악재생 | 2.영화재생");
			System.out.print("선택 : "); int ch = scanner.nextInt();
				
			if( ch == 1) {
				음악재생 음악재생 = new 음악재생();
				
				if(sw) {
				음악재생.musicstop(sw);
				음악재생.start();
				sw=false;
				}else {
					음악재생.musicstop(sw);
					sw = true;
				}
			}
			else if( ch == 2 ) { 
				// 스레드 구현 객체 생성
				if(sw) {
					
					영화재생 영화재생 = new 영화재생();
					영화재생.moviestop(sw2);
					영화재생.start();
					sw2=false;
					}else {
						영화재생.moviestop(sw2);
						sw2 = true;
					}
			}
			
			}
			
			
		}
}
