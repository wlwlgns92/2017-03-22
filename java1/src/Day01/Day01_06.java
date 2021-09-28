package Day01;

import java.util.Scanner;

public class Day01_06 {

	public static void main(String[] args) {
		// 문제3 : 방문록 입력받아 출력하기
		/*[입력받기] : 이름, 작성자, 내용, 날짜
		 * [ 출력 ] 
		 * --------------방문록---------------
		 * | 순번 |  작성자 | 	내용 		| 날짜 |
		 * |  1  | 강호동  | 안녕하세요  |09-28|
		 */
		
		// 1. 입력객체 선언
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" 작성자 : "); 		String 작성자 = scanner.next();
			scanner.nextLine();
		System.out.print(" 내용 : ");		String 내용 = scanner.nextLine();
		// scanner.nextLine(); // next 다음으로 nextLine 사용시 문제 발생
			//해결방법 : next 와 nextLine 사이에 NextLine() 추가
	
		System.out.print(" 날짜 : ");		String 날짜 = scanner.next();
		
		System.out.println("--------------방문록---------------");
		System.out.println("| 순번 | 작성자 |\t내용\t| 날짜 |");
		System.out.println( "| 1  |"+ 작성자+"  |  "+내용+" |"+날짜+"|");
		System.out.println("---------------------------------");
	}

}

