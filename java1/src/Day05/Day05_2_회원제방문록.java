package Day05;

import java.util.Scanner;

public class Day05_2_ȸ�����湮�� {
	
	public static void main(String[] args) {
		// ������ �ϱ����� �Է°�ü ����
		Scanner scanner = new Scanner(System.in);
		// 1. ȸ�� 100�� �����ϴ� ���
		String[][] ȸ����� = new String[100][2]; // 100 * 2 = 200ĭ
		String[][]�湮�� = new String[100][2]; // �湮�� 100�� [contents, writer] �����ϴ� ��� ����
		
		// 2. �޴� => �޴��� ��� �ݺ����� = ���ѷ��� [while]
		
		while(true) {
			System.out.println("\t- ȸ���� �湮�� - ");
			System.out.println("----------------------------------");
			System.out.print("\t1. ȸ������ 2. �α��� : "); int ch = scanner.nextInt();
			
			// 3. �Է¿� ���� �� ����
			switch(ch) {
			case 1 :
				System.out.println(" -ȸ������ ������"); 
				System.out.println(" id : "); String id = scanner.next();
				System.out.println(" Password : "); String pw = scanner.next();
				
				//id �ߺ�üũ [ ��� �迭�� �ε����� �����ؼ� ������ ���̵� �ִ��� üũ]
				boolean idcheck=true;
				for(int i = 0; i < ȸ�����.length; i++) {
					// ȸ�����.length : �迭�� ���α��� = 100
					if (ȸ�����[i][0] != null && ȸ�����[i][0].equals(id)) { // i���� id�� �����ϸ�
						System.out.println(" �ߺ��� ���̵� �����մϴ�.");
						idcheck = false;
						break; // �ߺ�ã�� for�� ����
					}
				}
				
				
				// �ߺ�üũ ������ true ��� �迭�� �� ������ ����
				if(idcheck) {
					for(int i = 0; i <ȸ�����.length; i++) {
						if(ȸ�����[i][0] == null) { //i������ �����̸�
							ȸ�����[i][0] = id; ȸ�����[i][1]= pw;
							System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
							break;
						}
					}
						
				}
				break;
			case 2 :
				System.out.println(" -�α��� ������");
				// �Է� -> ���� -> �迭��[]���� �� (for, if)
				System.out.println(" id : "); String id1 = scanner.next();
				System.out.println(" Password : "); String pw1 = scanner.next();
				// �迭�� ����� ���̵�� �н����尡 �����ϴ��� -> �����ϸ� �α��� ����
					//for���� �̿��� ��� �ε����� �����ؼ� �ϳ��� ��
				
				boolean check = true;
				for(int i = 0; i < ȸ�����.length; i++) {
					if(ȸ�����[i][0] != null && 
							ȸ�����[i][0].equals(id1) &&
							ȸ�����[i][1].equals(pw1)) {
						System.out.println("�α��ο� �����ϼ̽��ϴ�.");
						//////�α��� ������ �޴�/////////
						while(true) { //ȸ���޴� ���ѷ���
							System.out.println();
							System.out.println("1. �湮�� �ۼ� 2. �湮�� Ȯ�� 3. �α׾ƿ� \n����: ");
							int ch2 = scanner.nextInt();
							
							if(ch2 == 1) {
								scanner.nextLine(); // nextLine�� ���� �ذ�
								System.out.println(("�湮�� ���� : ")); String ���� = scanner.nextLine();
								//�湮�� �迭�� ������� ã�Ƽ� ����� �α��ε� ���̵� ����
								for(int j =0; j < �湮��.length; j++) {
									if(�湮��[j][0] == null) { // j��° �ε����� ���� ����[null]�̸�
										�湮��[j][0] = ����; �湮��[j][1] = id1;
										System.out.println(" >>> �湮�� ���");
										break;
									}
								}
								
								
							}
							else if (ch2 == 2) {
								System.out.println("-------�湮�� ���.");
								System.out.printf("%10s \t %s \n", "�ۼ���", "����");
								// ������ ������ ��� ���� ���
								for (int j= 0; j<�湮��.length; j++) {
									if( �湮��[j][0] == null) {break;}
									
									System.out.printf("%10s \t %s \n", �湮��[j][1], �湮��[j][0]);
								}
							
							}
							else if (ch2 == 3) {
								System.out.println("-------�α׾ƿ� �Ǿ����ϴ�.");
								break;
							}
							else System.out.println("�� �� ���� �ൿ�Դϴ�.");
						}
						
						check = false;
						break;
					}
				}
				//�α��� ���н�
				if(check) { System.out.println(" ������ ȸ�������� �����ϴ�.");}
				 break;
			
			}//se
			
		}//we
	}//me
}//ce
