package Day04;

import java.util.Scanner;

public class Day04_3 {
	// console�� Ű����ũ [ ���Ǳ�]
				// 1. �޴��� : 1. �ݶ�[300��] 2. ȯŸ[200��] 3.���̴�[100] 4. ����
					// �޴��� �Ʒ��� ������ ��ǰ ���[ ��ǰ���� / �� ���� ���� �ݾ�]
				// 2. �ʱ� ��� [ 10����] �ȷ����� ��� ���� // ��� ������ [ǰ��]
				// 3. �����ݾ��� �Է¹޾Ƽ� ������ ��ŭ ������ �ܵ� ���

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// ��� ����[ �������� : ����� ��ȣ �ȿ����� ��� ����, ���ѷ��� �ȿ� ����ϸ� ��� �������� ����]
		int �ݶ���� =10; int ȯŸ��� = 10; int ���̴���� = 10;
		// ��ٱ��� ����
		int �ݶ󱸸ż�=0; int ȯŸ���ż�=0; int ���̴ٱ��ż�=0;
		//1. ���ѷ���
		while(true) {
			if(�ݶ���� == 0) { System.out.println("----------------�޴���---------------");
			System.out.println("|1.�ݶ� ǰ��|2.ȯŸ 200��|3.���̴� 100��|");}
			else { System.out.println("----------------�޴���---------------");
				System.out.println("|1.�ݶ� 300��|2.ȯŸ 200��|3.���̴� 100��|");}
			System.out.print("��ǰ�� ������ �ּ��� : "); int ch = scanner.nextInt();
			if(ch == 1) { // ǰ���� ���� �Ұ�
				if(�ݶ���� == 0) {System.out.println( "�ݶ� ǰ���Ǿ����ϴ�."); }
				else {
					
				}
				System.out.println("[[ �ݶ� 1�� ��ҽ��ϴ�]]"); 
				�ݶ󱸸ż�++;
				�ݶ����--;}
			if(ch == 2) { // ǰ���� ���� �Ұ�
				if(ȯŸ��� == 0) {System.out.println( "ȯŸ�� ǰ���Ǿ����ϴ�."); }
				else {
					
				}
				System.out.println("[[ ȯŸ 1�� ��ҽ��ϴ�]]"); 
				ȯŸ���ż�++;
				ȯŸ���--;}
			
			if(ch == 3) { // ǰ���� ���� �Ұ�
				if(���̴���� == 0) {System.out.println( "���̴ٰ� ǰ���Ǿ����ϴ�."); }
				else {
					
				}
				System.out.println("[[ ���̴� 1�� ��ҽ��ϴ�]]"); 
				���̴ٱ��ż�++;
				���̴����--;}

			//��ٱ��� ���
			System.out.println("-----------------��ٱ���-----------------");
			System.out.println("��ǰ��\t��ǰ����\t������");
			if(�ݶ󱸸ż�>0) { System.out.println("�ݶ�\t"+ �ݶ󱸸ż�+"\t"+�ݶ󱸸ż�*300);}
			if(ȯŸ���ż�>0) { System.out.println("ȯŸ\t"+ ȯŸ���ż�+"\t"+ȯŸ���ż�*200);}
			if(���̴ٱ��ż�>0) { System.out.println("���̴�\t"+ ���̴ٱ��ż�+"\t"+���̴ٱ��ż�*100);}
			System.out.println();
			System.out.println(">>>> �� ������ : "+ ((�ݶ󱸸ż�*300) + (ȯŸ���ż�*200) + (���̴ٱ��ż�*100))+ "��");
			System.out.println();
			
			
			if(ch==4) {
				if(�ݶ󱸸ż� ==0 && ȯŸ���ż�==0 &&���̴ٱ��ż�==0 ) {System.out.println("������ ��ǰ�� �����ϴ�.");}
				else {
					while(true) {
				System.out.println(">>>>�����Ͻðڽ��ϱ�?<<<<");
				System.out.println(">>>>[Y] [N]<<<<"); String ch2 = scanner.next();
				if(ch2.equals("y")) {
					
					while(true) {
						System.out.println(">>>>�ݾ� ����<<<<"); int money = scanner.nextInt();
						int totalpay = (�ݶ󱸸ż�*300) + (ȯŸ���ż�*200) + (���̴ٱ��ż�*100);
						if(money < totalpay) { 
							System.out.println("[�˸�] �ݾ��� �����մϴ�");
							
							
						}else System.out.println("[�����Ϸ�] �� �ܵ� : "+ (money - totalpay));
				
						//�ʱ�ȭ�� �̵�
						�ݶ󱸸ż� = 0; ȯŸ���ż�=0; ���̴ٱ��ż�=0;
						break;
					}
					break;
				}else if (ch2.equals("n")) {
					�ݶ󱸸ż� = 0; ȯŸ���ż�=0; ���̴ٱ��ż�=0;
					break;
				}else { System.out.println("[�˸�] : �˼����� �ൿ�Դϴ�.");
				}
					}
				}
			}
		}//w e 
			
			
		
		
		
		
		
		
		
		/*int �ݶ�=300; int ȯŸ=200; int ���̴�100; int ��� = 10;
		System.out.println("----------------�޴���---------------");
		System.out.println("|1.�ݶ� 300��|2.ȯŸ 200��|3.���̴� 100��|");
		System.out.print("��ǰ�� ������ �ּ��� : "); int a = scanner.nextInt();
		
		if(a == 1) {
			System.out.println("���õ� ��ǰ�� �ݶ� :" + �ݶ�+ "�� �Դϴ�.");
		} */
	} // m e

}// c s
