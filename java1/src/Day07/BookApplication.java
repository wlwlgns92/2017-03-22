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
	 * 3.2 �α��ν� : 1.�������|2.�뿩|3.�ݳ�
	 * - ������� ������ ��ϵ� ���� ���
	 * - �뿩 ������ ��ϵ� ���� �뿩
	 * - �ݳ� ������ �뿩�� ���� �ݳ�
	 * 
	 * 4. ������[id : admin / pw:1234] ���� ��� ����
	 * 4.1 ������ �α��ν� 1.�������|2.�������
	 * - ������ ���� �迭�� ����
	 * - �α��� ���������� �� �����ͷ� ���� ������
	 * 
	 */
	private static Member[] MemberArray = new Member[100];
	private static Book[] BookArray = new Book[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("-----------ȸ���� ������ ���α׷�----------");
			System.out.println("1.�α���|2.ȸ������|3.���̵�ã��|4.��й�ȣã��");
			System.out.println("--------------------------------------");
			System.out.println("���� : "); int ch = scanner.nextInt();
			
			if(ch==1) { }
			else if (ch==2) { }
		}
		
	}
}
