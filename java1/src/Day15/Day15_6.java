package Day15;

import java.util.Hashtable;
import java.util.Scanner;

public class Day15_6 {
		public static void main(String[] args) {
			
			// Hashtable // ȸ������ / �α���
			// ����
			Scanner scanner = new Scanner(System.in);
			// map�÷��� ����
			Hashtable<String, String> hashtable = new Hashtable<>();
			
			//�޴�
			while(true) {
				System.out.println("1.ȸ������ 2.�α���");
				System.out.print("���� : "); int ch = scanner.nextInt();
				
				if(ch==1) {
					System.out.print(" ���̵� �Է��� �ּ��� : "); String id = scanner.next();
					System.out.print(" ��й�ȣ�� �Է��� �ּ��� : "); String pw = scanner.next();
					
					// �ߺ�üũ �� ��ü �ֱ�
					if(hashtable.containsKey(id)) { // Ű�� �����ϸ� true �ƴϸ� false
						System.out.println(" �̹� ������� ���̵� �Դϴ�.");
					}else {
					// 1. map�� ��ü �ֱ�
					hashtable.put(id, pw);
					System.out.println("���Լ���");
					}
				}
				if(ch==2) {
					System.out.print(" ���̵� �Է��� �ּ��� : "); String id = scanner.next();
					System.out.print(" ��й�ȣ�� �Է��� �ּ��� : "); String pw = scanner.next();
					if(hashtable.containsKey(id)) { // Ű�� �����ϸ� true �ƴϸ� false
						if(hashtable.get(id).equals(pw)) {
							System.out.println("�α��� ����");
						}else {
							System.out.println("��ġ�ϴ� ������ �����ϴ�.");
						}
					}else { System.out.println(" ��ġ�ϴ� ������ �����ϴ�..");
					 }
					}
				   
			}//we
	
		}// me
}//ce
