package Test1022;

import java.util.Scanner;

public class Appplication {
	//석차는 도저히 모르겠습니다.
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true) {
			try {
				System.out.println("===========================================");
				System.out.println("\t\t성    적   표 ");
				System.out.println("1.성적입력 | 2.성적출력");
				System.out.print("선택 : "); int ch = scanner.nextInt();
				
				if(ch == 1) { Student.mainmenu();}
				if(ch == 2) { Student.print();}
				else {
					System.out.println("잘못된 입력입니다.");
				}
				
				
				
			} catch (Exception e) {
				
				System.out.println("오류 다시 입력해 주세요");
				scanner.nextInt();
			}
			
		}
		
	}
}
