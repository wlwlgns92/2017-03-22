package Test1022;

import java.util.Scanner;

public class Appplication {
	//������ ������ �𸣰ڽ��ϴ�.
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true) {
			try {
				System.out.println("===========================================");
				System.out.println("\t\t��    ��   ǥ ");
				System.out.println("1.�����Է� | 2.�������");
				System.out.print("���� : "); int ch = scanner.nextInt();
				
				if(ch == 1) { Student.mainmenu();}
				if(ch == 2) { Student.print();}
				else {
					System.out.println("�߸��� �Է��Դϴ�.");
				}
				
				
				
			} catch (Exception e) {
				
				System.out.println("���� �ٽ� �Է��� �ּ���");
				scanner.nextInt();
			}
			
		}
		
	}
}
