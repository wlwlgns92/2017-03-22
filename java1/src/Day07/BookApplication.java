package Day07;

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
	
	//���� �޼ҵ� = > ��������
	public static void main(String[] args) {
		
		main_menu();//�޼ҵ� ȣ��

	}
	//1. ���θ޴� �޼ҵ�
	public static void main_menu() {
		
		while(true) {
			System.out.println("-----------ȸ���� ������ ���α׷�----------");
			System.out.println("1.�α���|2.ȸ������|3.���̵�ã��|4.��й�ȣã��");
			System.out.println("--------------------------------------");
			System.out.print("���� : "); int ch = scanner.nextInt();
			//�ٸ� Ķ���� �޼ҵ� ȣ�� ���
				// 1. ��ü ������ ��ä�κ��� ��� ����
				// 2. �ش� �޼ҵ� static
			if(ch==1) { 
				String loginid = Member.login();
				//�α��θ޼ҵ� ����
					// login �޼ҵ��� ��ȯ���� ���� ����
					//0. �α��� ����				
						if(loginid == null) {
							System.out.println(" ��ϵ� ������ �����ϴ�.");
						}
					//1. ������
						else if(loginid.equals("admin")) {admin_menu();	}	
					//2. �Ϲ�ȸ��
						else {member_menu(loginid);}
			}
			if(ch==2) { 
				Member.signup();
				//ȸ�����Ը޼ҵ� ����
			}
			if(ch==3) { String findid= Member.findid();
			//���̵� ã�� �޼ҵ� ����
			}
			if(ch==4) { String findpw= Member.findpw();
				//��й�ȣ ã�� �޼ҵ� ����
			}

		}
	}
	//2. �α��ν� �޴� �޼ҵ�
	public static void member_menu(String loginid) {
		Book book =new Book();
		while(true) {
			System.out.println("-----------------�α��� �޴�----------------");
			System.out.println("\t1.�������|2.�뿩|3.�ݳ�|4.�α׾ƿ�\t");
			System.out.print("���� >> : "); int ch = scanner.nextInt();
			
			if(ch==1) {book.book_list(); }
			if(ch==2) {book.book_rental(loginid); }
			if(ch==3) {book.book_return(loginid); }
			if(ch==4) {System.out.println("�α׾ƿ� �Ǿ����ϴ�."); return; }
		}
	}
	//3. ������ �޴� �޼ҵ�
	public static void admin_menu() {
		// Book �ӽð�ü : �޼ҵ� ȣ���
		Book book =new Book();
		
		while(true) {
			System.out.println("-----------------������ �޴�----------------");
			System.out.println("\t1.�������|2.�������|3.�α׾ƿ�\t");
			System.out.print("���� >> : "); int ch = scanner.nextInt();
			
			if(ch==1) {book.book_add(); }
			if(ch==2) {book.book_list(); }
			if(ch==3) {System.out.println("�α׾ƿ� �Ǿ����ϴ�."); return; }
		}
	}
}
