package Test;

import java.util.Scanner;

import 과제.Movie;

public class 문제2 {
	
	  // 1.음악재생 | 2. 영화재생
	  // 1 입력시 음악 재생
	  // 음악 재생중에 1을 입력하면 음악이 꺼짐 
	  // 2 입력시 영화 재생
	  //영화 재생중에 2를 입력하면 영화 꺼짐
	    
	  //2차 도전
	public static void main(String[] args) {
		boolean sw = true;
		boolean sw2 = true;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.음악재생 | 2. 영화재생"); int ch = scanner.nextInt();
			
			if(ch == 1) {
				Thread thread = new Music();
				if(sw) {
					Music.musicstop(sw);
					thread.start();
					sw = false;
				}else {
					Music.musicstop(sw);
					sw = true;
				}	
			}else if ( ch == 2 ) {
				Thread thread = new Test.Movie();
				if(sw2) {
					Test.Movie.moviestop(sw2);
					thread.start();
					sw2 = false;
				}else {
					Test.Movie.moviestop(sw2);
					sw = true;
				}
			}
		}
	}

}
