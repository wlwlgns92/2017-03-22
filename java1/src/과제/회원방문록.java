package ����;

import java.util.Scanner;

public class ȸ���湮�� {
	
	public static void main(String[] args) {
		
		String[][] ȸ������ = new String[100][2];
		String[][] �Խ��� = new String[100][2];
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.println("---------�α���ȭ�� ----------");
			System.out.println("1.ȸ������ | 2. �α���"); 
			System.out.print("���� : "); int ch = scanner.nextInt();
			
			if(ch == 1) {
				
				System.out.print("����Ͻ� ���̵� �Է��� �ּ��� : "); String id = scanner.next();
				System.out.print("����Ͻ� ��й�ȣ�� �Է��� �ּ��� : "); String pw = scanner.next();
				
				boolean idcheck = true;
				for(int i = 0; i < ȸ������.length; i++) {
					if( ȸ������[i][0] !=null && ȸ������[i][0].equals(id)) {
						System.out.println("������� ���̵� �Դϴ�.");
						idcheck = false;
						break;
					}
				}
				if(idcheck) {
					for(int i = 0; i < ȸ������.length; i++) {
						if(ȸ������[i][0] == null) {
							ȸ������[i][0] = id; ȸ������[i][1] = pw;
							System.out.println("ȸ�����ԿϷ�");
							break;
						}
					}
				}
			}
			if(ch == 2) {
				System.out.print("���̵� �Է����ּ��� : "); String id2 = scanner.next();
				System.out.print("��й�ȣ�� �Է��� �ּ��� : "); String pw2 = scanner.next();
				
				for(int i =0; i < ȸ������.length; i ++) {
					if(ȸ������[i][0].equals(id2) && ȸ������[i][1].equals(pw2) && ȸ������[i][0] != null) {
						System.out.println("�α��� ����");
					}
				}
				
			}
		}
	}
}
