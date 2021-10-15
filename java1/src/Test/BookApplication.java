package Test;

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
	
	public static Member[] members = new Member[100];
	public static Book[] books = new Book[100];
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("�����뿩 ���α׷�");
			System.out.println("1.�α���|2.ȸ������|3.���̵�ã��|4.��й�ȣã��");
			System.out.print("���� : "); int ch = scanner.nextInt();
			
			if(ch==1) { String loginid = Member.login();
			if (loginid == null) {
				System.out.println("��ϵ� ������ �����ϴ�.");
			}else if (loginid.equals("admin")) {admin_menu();}
			else {member_menu(loginid);}
			}
			if(ch==2) {Member.signup(); }
			if(ch==3) {Member.findid(); }
			if(ch==4) {Member.findpw(); }
			
		}
		
	}
	public static void member_menu (String loginid) {
		Book book = new Book();
		while(true) {
			System.out.println("-----------------�α��� �޴�----------------");
			System.out.println("\t1.�������|2.�뿩|3.�ݳ�|4.�α׾ƿ�\t");
			System.out.print("���� >> : "); int ch = scanner.nextInt();
			
			if(ch==1) {book.b_list();  }
			if(ch==2) {book.b_rental(loginid); }
			if(ch==3) {book.b_return(loginid);  }
			if(ch==4) {System.out.println("�α׾ƿ� �Ǿ����ϴ�."); return;  }
		}
	}
	public static void admin_menu () {
		Book book = new Book();
		
		while (true) {
			System.out.println("-----------------������ �޴�----------------");
			System.out.println("\t1.�������|2.�������|3.�α׾ƿ�\t");
			System.out.print("���� >> : "); int ch = scanner.nextInt();
			
			if(ch==1) {book.b_add(); }
			if(ch==2) {book.b_list(); } 
			if(ch==3) {System.out.println("�α׾ƿ��Ǿ����ϴ�."); return;} 
			
		}
	}
}
