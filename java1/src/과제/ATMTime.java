package ����;

import java.util.Scanner;

public class ATMTime {
	
	/*
	 * 3���ñ�
	 * 	System.out.println("----------ATM----------");
	 * "1.��� | 2.���� | 3.�ܰ� | 4.����"
	 * ���ݰ� ����� �Է¹޾� �ܰ���
	 */
	
	
	public static void main(String[] args) {
		int ���ݾ� = 0; 
		boolean ���� =true; 
		Scanner scanner = new Scanner(System.in);
		
		while(����) { 
		
			System.out.println("----------ATM----------");
			System.out.println( "1.��� | 2.���� | 3.�ܰ� | 4.����");
			System.out.print("���� : "); int ch = scanner.nextInt();
			
			if ( ch == 1) {
				System.out.println("����Ͻ� �ݾ��� �Է��� �ּ��� : "); int ��ݾ� = scanner.nextInt();
				if(���ݾ� < ��ݾ� ) {
					System.out.println("�ܾ��� �����մϴ�.");
				}else { 
					���ݾ�-=��ݾ�;
					System.out.println("����� �Ϸ�Ǿ����ϴ�. �ܾ��� : "+ ���ݾ�);
				}	
			}else if ( ch == 2 ) {
					System.out.println("�����Ͻ� �ݾ��� �Է��� �ּ��� : " ); ���ݾ� += scanner.nextInt();
					System.out.println("������ �Ϸ�Ǿ����ϴ�. �ܾ��� : "+ ���ݾ�);
			}else if (ch==3) {
					System.out.println("�ܾ��� : "+���ݾ�);
			}else if (ch==4) {
					System.out.println("�̿����ּż� �����մϴ�.");
					����=false;
			}else {
					System.out.println("�߸��� �Է��Դϴ�.");
			}
		} // we
	} // me 

} // ce	