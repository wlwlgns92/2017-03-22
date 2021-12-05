package 과제;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class 게시판클래스 {
	// 게시판 클래스버전 2차시기 
	public static void main(String[] args) {
		Board[] boards = new Board[100];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("\t\t 게시판 ");
			System.out.printf("%2s \t %10s \t %8s \t %4s \n", "순번" , "제목", "작성자", "날짜");
			for(int i = 0; i < boards.length; i++ ) {
				if(boards[i] != null ) {
					System.out.printf("%2s \t %10s \t %8s \t %5s \n", i, boards[i].title, boards[i].writer , boards[i].date);
				}
			}
			System.out.print("1.글쓰기 | 2.글 상세페이지 | 선택 :"); int ch = scanner.nextInt();
			if(ch == 1) {
				scanner.nextLine();
				System.out.print("제목을 입력해 주세요 : "); String 제목 = scanner.nextLine();
				System.out.print("내용을 입력해 주세요 : "); String 내용 = scanner.nextLine();
				System.out.print("작성자을 입력해 주세요 : "); String 작성자 = scanner.nextLine();
				
				Date now = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
				String date = dateFormat.format(now);
				
				for(int i = 0; i < boards.length; i++) {
					if(boards[i] == null ) {
						Board board = new Board();
						board.title = 제목;
						board.content = 내용;
						board.writer = 작성자;
						board.date = date;
						board.count = 1; 
						boards[i] = board;
						break;
					}
				}
			}
			else if ( ch == 2 ) {
				System.out.print(" 게시물 번호를 입력해 주세요"); int ch2= scanner.nextInt();
				boards[ch2].count++;
				System.out.println("-------------------------------------------------------------");
				System.out.println("제목 : " + boards[ch2].title);
				System.out.println("작성자 : " +  boards[ch2].writer + "날짜 : " + boards[ch2].writer + "조회수 : " + boards[ch2].count);
				System.out.println("내용 : " + boards[ch2].content); 
				System.out.println("-------------------------------------------------------------");
			}
		}
	}
} // ce
