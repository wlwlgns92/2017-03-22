package Test;

import java.util.Scanner;

/* -----------------------------ȸ���� ������ ���α׷�---------------------------------
 * 1. ��ü���� [ȸ�� Ŭ����, ���� Ŭ���� ]
 * -���� : �ʵ�, ������, �޼ҵ�
 * 2. ��ü�� �迭�� ����
 * - ȸ��Ŭ���� �迭 ����
 * - �������� �迭
 * 3. ȸ���� ���α׷� �̿�
 * -�ߺ� üũ
 * 3.1 ȸ����� �α����� : 1.�α���|2.ȸ������|3.���̵�|4.��й�ȣ
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
public class BookApplication {
	
	public static Member[] members = new Member[100];
	public static Book[] books = new Book[100];
	public static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
		while(true) {
			System.out.println("\t\t���������α׷�");
			System.out.println("1.�α���|2.ȸ������|3.���̵�ã��|4.��й�ȣã��");
			System.out.print("���� : "); int ch = scanner.nextInt();
			
			if(ch==1) {Member.login(); }
			if(ch==2) {Member.signup(); }
			if(ch==3) {Member.findid(); }
			if(ch==4) {Member.findpw(); }
			
			
		}
	
	}
	public static void member_menu(String loginid) {
		Book book = new Book();
		while(true) {
			System.out.println(" ---------- Menu ----------");
			System.out.println(" 1.������� | 2.�뿩 | 3.�ݳ� | 4.�α׾ƿ� ");
			System.out.print("���� : ");	int ch = scanner.nextInt();
			if(ch==1) {book.book_list(); }
			if(ch==2) {book.book_rental(loginid); }
			if(ch==3) {book.book_return(loginid); }
			if(ch==4) {System.out.println("�α׾ƿ��Ǿ����ϴ�."); return; }
		}
	}
	public static void admin_menu() {
		
		while(true) {
			System.out.println(" ---------- Admin Menu ----------");
			System.out.println(" 1.������� | 2.������� | 3.�α׾ƿ� ");
			System.out.print("���� : ");	int ch = scanner.nextInt();
			
			if(ch==1) { }
			if(ch==2) { }
			if(ch==3) {System.out.println("�α׾ƿ��Ǿ����ϴ�."); return;  }
			
		}
			
	}
}
