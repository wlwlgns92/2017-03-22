package ������;

import java.util.Scanner;

public class �ڵ��� {

	public static void main(String[] args) {
		
		boolean ������ = false;
		boolean �õ�����1 = false;
	
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			if(������ == false) {
				System.out.println("���� ���ðڽ��ϱ� 1.��  |  2. �ƴϿ� ");
				System.out.print("���� : "); int ch = scanner.nextInt();
				if(ch==1) {
					System.out.println("���� �������ϴ�.");
					������ = true;
				}
				if(ch==2) {
					System.out.println("���� ���� �ʽ��ϴ�.");
					
				}
			}
			
			if( ������ == true && �õ�����1 == false) {
				System.out.println("�õ��� �Žðڽ��ϱ� ? 1.�� | 2. �ƴϿ� 3.������");
				System.out.print("���� : "); int ch1 = scanner.nextInt();
				if(ch1==1) {
					System.out.println("�õ��� �ɾ����ϴ�.");
					�õ�����1 = true;	
					System.out.println("�������� �����߽��ϴ�.");
				}
				if(ch1==2) {
					System.out.println("�õ��� ���� �ʽ��ϴ�.");
					
				}if( ch1 == 3 ) {
					������ = false;
				}
		
			if( ������ == true && �õ�����1 == true ) {
				while( true) { 
					System.out.println("[ ������ ] �õ��� ���ðڽ��ϱ� ? 1.�� | 2.�ƴϿ�");
					System.out.print("���� : "); int ch2 = scanner.nextInt();
					if(ch2==1) {
						System.out.println("�õ��� ���ϴ�.");
						�õ�����1 = false;
						break;
					}
					if(ch2==2) {
						System.out.println("�õ��� ���� �ʽ��ϴ�.");
					}
				}
			}
			}
		}	//w e
	}
	
}
