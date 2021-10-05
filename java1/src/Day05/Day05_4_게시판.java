package Day05;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_4_게시판 {
		
		public static void main(String[] args) {
			//설정
			Scanner scanner = new Scanner(System.in);
			String[][] 게시물 = new String[100][5]; //게시물 100개를 저장할 수 있는 배열 선언 [1개의 행당 5열]
			
			String 순번 = "0";
			String 제목; String 작성자; String 내용;
			//1. 무한루프
			while(true) {
				System.out.println("\t\t게시판");
				System.out.println("------------------------------------------------");
				System.out.printf(" %2s \t %10s \t %5s \t %3s \n" ,"순번", "제목", "작성자", "작성일", "조회수");
				//배열내 모든 인덱스 출력
				for(int i=0; i < 게시물.length; i ++) {
					if(게시물[i][0] != null ) {
						System.out.printf(" %2s \t %10s \t %5s \t %3s \n" ,
								i, 게시물[i][0], 게시물[i][2], 게시물[i][3], 게시물[i][4]);
					}
				}
				System.out.println("----------------------------------------------------");
				System.out.println("1. 글쓰기|2. 글상세페이지| 선택 : "); int ch = scanner.nextInt();
				
				if(ch==1) {
					System.out.println("게시물 쓰기");
						scanner.nextLine();//Line 오류 해결
					System.out.print("제목을 작성해주세요 : "); 제목 = scanner.nextLine();
					System.out.print("작성자를 작성해주세요 : "); 작성자 = scanner.nextLine();
					System.out.print("내용을 작성해 주세요 : "); 내용 = scanner.nextLine();
					//현재 날짜
					Date now = new Date();
					//날짜 형식 클래스
					SimpleDateFormat dateformat = new SimpleDateFormat("MM-dd");
					String date = dateformat.format(now);
					// 조회수 
					String count = "1";
					// 모든 변수를 빈공간 배열에 저장
					
					for(int i=0; i<게시물.length; i++ ) {
						if (게시물[i][0]==null) { 
							게시물[i][0] = 제목;
							게시물[i][1]= 내용;
							게시물[i][2]=작성자;
							게시물[i][3]=date;
							게시물[i][4]=count; break;
						}
						
					}
				}if (ch==2) {
					System.out.println("게시물 번호 선택 : "); int ch2= scanner.nextInt();
						//해당 게시물의 조회수 1증가
						int count = Integer.parseInt(게시물[ch2][4]); //[조회수(String) -> int 변환
						게시물[ch2][4] = Integer.toString(++count); // 조회수 증가후 -> String 변환
						
					System.out.println("-----------게시물 상세페이지-----------");
					System.out.println(">>> 제목 : " + 게시물[ch2][0]);
					System.out.println(">>> 작성자 : " + 게시물[ch2][2] + "\t작성일 : " + 게시물[ch2][4] +
							"\t조회수" + 게시물[ch2][4]);
					System.out.println(">>> 내용 : " + 게시물[ch2][1]);
					System.out.println("--------------------------------------");
					
				}
			
			}//we
		}
}
