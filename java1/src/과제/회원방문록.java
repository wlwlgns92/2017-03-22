package ����;

import java.util.Scanner;

public class ȸ���湮�� {
	// ȸ���� �Խ��� 
	// 1. ���̵�� ��й�ȣ�� �Է¹޾� ȸ������
	// 2. ȸ�����Խ� �Է��� ���̵�� ��й�ȣ�� 
	// 3. �α����ϸ� �Խ��� ��� Ȱ��ȭ
	// 4. 1.�湮�Ͼ��� | 2.�湮��Ȯ�� | 3.�α׾ƿ�
	
	public static void main(String[] args) {
		String[][] ȸ������ = new String[100][2];
		String[][] �Խ��� = new String[100][2];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			//
			System.out.println("ȸ���� �Խ���");
			System.out.print("1.ȸ������ | 2.�α��� | ���� : "); int ch = scanner.nextInt();
			
			switch (ch) {
			case 1:
				
				System.out.print("����Ͻ� ���̵� �Է��� �ּ��� : "); String id = scanner.next();
				System.out.print("����Ͻ� ��й�ȣ�� �Է��� �ּ��� : "); String pw = scanner.next();
				
				boolean idcheck = true;
				for(int i = 0; i < ȸ������.length; i++) {
					if(ȸ������[i][0] != null && ȸ������[i][0].equals(id)) {
						System.out.println("�̹� ������� ���̵� �Դϴ�.");
						idcheck = false;
						break;
					}
				}
				if(idcheck) { 
					for(int i = 0; i < ȸ������.length; i++) {
						if(ȸ������[i][0] == null) {
							ȸ������[i][0] = id; ȸ������[i][1] = pw; 
							break;
						}
					}
				}
				break;

			case 2:
				
				System.out.print("���̵� �Է��� �ּ��� : "); String id2 = scanner.next();
				System.out.print("��й�ȣ�� �Է��� �ּ��� : "); String pw2 = scanner.next();
				
				boolean check = true;
				for(int i = 0; i < ȸ������.length; i++) {
					if(ȸ������[i][0] != null && ȸ������[i][0].equals(id2) && ȸ������[i][1].equals(pw2)) {
						System.out.println("�α��� ���� ");
						System.out.println();
						while(true) {
							
							System.out.println("�Խ��� �޴�");
							System.out.print("1.�湮�Ͼ��� | 2.�湮��Ȯ�� | 3.�α׾ƿ� | ���� : "); int ch2 = scanner.nextInt();
							
							if( ch2 == 1 ) {
								scanner.nextLine();
								System.out.print("�湮�� ������ �Է��� �ּ��� : "); String ���� = scanner.nextLine();
								for(int j = 0; j < �Խ���.length; j++) {
									if(�Խ���[j][0] == null ) {
										�Խ���[j][0] = id2; �Խ���[j][1] = ����;
										System.out.println(" �湮���� ��ϵǾ����ϴ�.");
										break;
									}
								}
							}
							else if ( ch2 == 2 ) {
								System.out.println("�湮�� Ȯ�� ");
								System.out.printf("%10s \t %s \n", "�ۼ���" , "����");
								for(int j = 0; j < �Խ���.length; j++) {
									if(�Խ���[j][0] == null) { break; }
									System.out.printf("%10s \t %s \n", �Խ���[j][0] , �Խ���[j][1]);
								}
							}
							else if( ch2 == 3 ) {
								System.out.println("�α׾ƿ��Ǿ����ϴ�.");
								break;
							}
							else { System.out.println("�߸��� �Է��Դϴ�."); }
						}
						check = false;
						break;
					}
					if(check) { System.out.println("�������� �ʴ� �����Դϴ�."); } 
					break;
				}
			} 

		}
	} // me 
}// ce
