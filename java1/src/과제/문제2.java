package 과제;

import java.util.Scanner;

public class 문제2 {
	/*
	 *  1.음악재생 | 2. 영화재생
	 *  1 입력시 음악 재생
	 *   음악 재생중에 1을 입력하면 음악이 꺼짐 
	 *  2 입력시 영화 재생
	 *   영화 재생중에 2를 입력하면 영화 꺼짐
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //입력객체
		boolean sw = true;	// 변수에 true 대입
		boolean sw2 = true;	// 변수에 true 대입
		
		while(true) {
			
			System.out.println("1.음악재생 | 2.영화재생");
			int ch = scanner.nextInt(); // 인트 타입 입력
			
			if( ch == 1) { // ch가 1이면
				Thread thread = new Music(); // 스레드 타입의 객체 생성
				if(sw) {
					Music.musicstop(sw); // 메소드 호출후 sw값 인수로 넣기
					thread.start(); // 스레드 시작
					sw = false; // sw값 false로 변경
				}else {
					Music.musicstop(sw); // 메소드 호출후 sw값 인수로 넣기
					sw=true; // sw값 true로 변경
				}
			}else if(ch == 2) { // ch가 2이면
				Thread thread = new Movie(); // 스레드 구현객체
				if(sw2) { // sw2가 true면
					Movie.moviestop(sw2); // 메소드 호출
					thread.start(); // 스레드 시작
					sw2=false; // sw2값 false로 변경
				}else {	// 아니면
					Movie.moviestop(sw2); // 메소드호출(영화종료)
					sw2=true; // sw2값 true로 변경 
				}
			}
		}
	}
}
