package Day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_5_게시판_클래스 {
	
	// 1. 서로 다른 자료형을 하나로 묶기
	public static void main(String[] args) {
		
		//2. 작성한 클래스로 배열 선언
		Board[] boards = new Board[100];
		Scanner scanner = new Scanner(System.in);
	
		//1. 무한루프
		while(true) {
			System.out.println("\t\t게시판");
			System.out.println("------------------------------------------------");
			System.out.printf(" %2s \t %10s \t %5s \t %3s \n" ,"순번", "제목", "작성자", "작성일", "조회수");
			//배열내 모든 인덱스 출력
			for(int i=0; i < boards.length; i ++) {
				if(boards[i] != null ) {
					System.out.printf(" %2s \t %10s \t %5s \t %3s \n" ,
							i, boards[i].title, boards[i].writer, boards[i].date, boards[i].count);
				}
			}
			System.out.println("----------------------------------------------------");
			System.out.println("1. 글쓰기|2. 글상세페이지| 선택 : "); int ch = scanner.nextInt();
			
			if(ch==1) {
				System.out.println("게시물 쓰기");
					scanner.nextLine();//Line 오류 해결
				System.out.print("제목을 작성해주세요 : "); String 제목 = scanner.nextLine();
				System.out.print("작성자를 작성해주세요 : "); String 작성자 = scanner.nextLine();
				System.out.print("내용을 작성해 주세요 : ");  String 내용 = scanner.nextLine();
				//현재 날짜
				Date now = new Date();
				//날짜 형식 클래스
				SimpleDateFormat dateformat = new SimpleDateFormat("MM-dd");
				String date = dateformat.format(now);
				// 조회수 
				// 모든 변수를 빈공간 배열에 저장
				
				for(int i=0; i<boards.length; i++ ) {
					if (boards[i]==null) {
						Board board = new Board();
						board.title = 제목;
						board.contents= 내용;
						board.writer=작성자;
						board.date=date;
						board.count=1; 
						boards[i] = board; break;
					}
				}
			}if (ch==2) {
				System.out.println("게시물 번호 선택 : "); int ch2= scanner.nextInt();
					//해당 게시물의 조회수 1증가
//					int count = Integer.parseInt(board[ch2][4]); //[조회수(String) -> int 변환
//					게시물[ch2][4] = Integer.toString(++count); // 조회수 증가후 -> String 변환
				boards[ch2].count++;
				System.out.println("-----------게시물 상세페이지-----------");
				System.out.println(">>> 제목 : " + boards[ch2].title);
				System.out.println(">>> 작성자 : " + boards[ch2].writer + "\t작성일 : " + boards[ch2].date +
						"\t조회수" + boards[ch2].count);
				System.out.println(">>> 내용 : " + boards[ch2].contents);
				System.out.println("--------------------------------------");
			}
		
		}//we
	}
}
