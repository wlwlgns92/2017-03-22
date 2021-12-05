package 과제;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
	
		// 게시판 배열버전 3차시기 
public class 게시판배열 {

	public static void main(String[] args) {
		String[][] 게시판 = new String[100][5];
		String 제목;
		String 내용;
		String 작성자;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("\t\t 게시판");
			System.out.printf("%2s \t %10s \t %8s \t %4s \n" ,"순번" , "제목" , "작성자", "날짜");
			for(int i = 0; i < 게시판.length; i++) {
				if(게시판[i][0] != null) {
					System.out.printf("%2s \t %10s \t %8s \t %4s \n" , i , 게시판[i][0], 게시판[i][2], 게시판[i][3] );	
				}
			}
			System.out.println("1.글쓰기 | 2.글 상세 페이지 | 선택 : "); int ch = scanner.nextInt();
			
			if( ch == 1) {
				scanner.nextLine();
				System.out.print("제목을 입력해 주세요 :"); 제목 = scanner.nextLine();
				System.out.print("내용을 입력해 주세요 :"); 내용 = scanner.nextLine();
				System.out.print("작성자을 입력해 주세요 :"); 작성자 = scanner.nextLine();
				
				Date now = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
				String date = dateFormat.format(now);
				
				String count = "1";
				
				for(int i = 0; i < 게시판.length; i++) {
					if(게시판[i][0] == null) {
						게시판[i][0] = 제목;
						게시판[i][1] = 내용;
						게시판[i][2] = 작성자;
						게시판[i][3] = date;
						게시판[i][4] = count;
						break;	
					}
				}
			}
			else if ( ch == 2) { 
				System.out.print("게시물 번호를 입력해 주세요 : "); int ch2 = scanner.nextInt();
				int count = Integer.parseInt(게시판[ch2][4]);
				게시판[ch2][4] = Integer.toString(++count);
				
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("제목 : " + 게시판[ch2][0]);
				System.out.println("작성자 : " + 게시판[ch2][2] + "날짜 : " + 게시판[ch2][3] + "조회수 : " +게시판[ch2][4]);
				System.out.println("내용 : " + 게시판[ch2][1]);
				System.out.println("------------------------------------------------------------------------------");
			}
		}
	}
}