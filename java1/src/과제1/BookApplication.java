package ����1;

import java.util.Scanner;

public class BookApplication {
	/* -----------------------------ȸ���� ������ ���α׷�---------------------------------
	 * 1. ��ü���� [ȸ�� Ŭ����, ���� Ŭ���� ]
	 * -���� : �ʵ�, ������, �޼ҵ�
	 * 2. ��ü�� �迭�� ����
	 * - ȸ��Ŭ���� �迭 ����
	 * - �������� �迭
	 * 3. ȸ���� ���α׷� �̿�
	 * -�ߺ� üũ
	 * 3.1 ȸ����� �α����� : 1.�α���|2.ȸ������|3.���̵� ã��|4.��й�ȣ ã�� 
	 * -�ߺ�üũ
	 * 3.2 �α��ν� : 1.�������|2.�뿩|3.�ݳ�|4.�α׾ƿ�
	 * - ������� ������ ��ϵ� ���� ���
	 * - �뿩 ������ ��ϵ� ���� �뿩
	 * - �ݳ� ������ �뿩�� ���� �ݳ�
	 * 
	 * 4. ������[id : admin / pw:1234] ���� ��� ����
	 * 4.1 ������ �α��ν� 1.�������|2.�������|3.�α׾ƿ�
	 * - ������ ���� �迭�� ����
	 * - �α��� ���������� �� �����ͷ� ���� ������
	 */
	// 1���ñ�
	public static Book[] books = new Book[100];
	public static Member[] members = new Member[100];
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		main_menu();
	}
	
	public static void main_menu() {
		
		while(true) {
			
			System.out.println("\t\t ȸ���� ������ ���α׷�");
			System.out.println("1.�α���|2.ȸ������|3.���̵� ã��|4.��й�ȣ ã�� | ���� : "); int ch = scanner.nextInt();
			
			if(ch == 1) {
				
				String loginid = Member.login();
				
				if(loginid == null) {
					System.out.println("��ϵ� ������ �����ϴ�.");	
				}else if ( loginid.equals("admin")) {
					admin_menu();
				}else {
					member_menu(loginid);
				}
			}else if ( ch == 2 ) {
				Member.signup();
			}else if ( ch == 3 ) {
				Member.findid();
			}else if ( ch == 4 ) {
				Member.findpw();
			}
		}
	}
	
	public static void member_menu(String loginid) {
		while(true) {
			System.out.println("---------------ȸ�� �޴�-----------------");
			System.out.println("1.�������|2.�뿩|3.�ݳ�|4.�α׾ƿ�"); int ch = scanner.nextInt();
			
			if(ch == 1) {
				Book.booklist();
			}else if ( ch == 2 ) {
				Book.rental(loginid);
			}else if ( ch == 3 ) {
				Book.bookreturn();
			}else if ( ch == 4 ) {
				System.out.println("�α׾ƿ��Ǿ����ϴ�.");
				return;
			}
		}
	}
	
	public static void admin_menu() {
		while(true) {
			System.out.println("--------------������ ������----------------");
			System.out.print("1.�������|2.�������|3.�α׾ƿ�| ���� : "); int ch = scanner.nextInt();
			
			if(ch==1) {
				Book.bookadd();
			}else if ( ch == 2) {
				Book.booklist();
			}else if ( ch == 3) {
				System.out.println("�α׾ƿ��Ǿ����ϴ�.");
				return;
			}
		}
	}
}
