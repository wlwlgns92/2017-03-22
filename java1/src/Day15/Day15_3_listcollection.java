package Day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_3_listcollection {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 0. ����Ʈ ��ü��interger ��ü���� ����
		ArrayList<Integer> guest = new ArrayList<Integer>();
		
		while(true) {
			System.out.println(" ��� ��Ȳ ");
			for(int i = 0; i < guest.size(); i++) {
				System.out.println("����ȣ : "+(i+1)+ " �� "+ "�ο� : "+guest.get(i));
			}
			
			System.out.println("------------����߰�------------");
			System.out.println("1.����߰� | 2.������ | 3.������");
			System.out.print("���� >>>"); int ch = scanner.nextInt();
			
			if(ch==1) { 
				System.out.print("�ο����� �Է����ּ��� : "); int ch2 = scanner.nextInt();

			// ����Ʈ�� ��ü ����
			guest.add(ch2); 
			System.out.println("��� ����� �Ϸ�Ǿ����ϴ�. ����ȣ�� : " + guest.size() + " �Դϴ�." );
			
			}
			if(ch==2) { 
				System.out.println("����ȣ�� �Է����ּ��� : "); int ch3 = scanner.nextInt();
				//2. ����Ʈ�� ��ü ����
				guest.remove(ch3-1);// -1�� �ϴ� ���� [ ����ȣ�� 1���� // �ε����� 0���� ]
			}
			if(ch==3) { 
				if(guest.isEmpty()) {
					System.out.println("������� ���� �����ϴ�.");
				}	
				else {
					System.out.println(" ����ȣ 1�� ����");
					guest.remove(0); // ����ȣ 1�� ����
				}
				
			}
		}//w e
		
		
	}
}
