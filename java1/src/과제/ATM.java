package ����;

import java.util.Scanner;

public class ATM {
	/*
	 * "----------ATM----------"
	 * "1.��� | 2.���� | 3.�ܰ� | 4.����"
	 * ���ݰ� ����� �Է¹޾� �ܰ���
	 */
	
	public static void main(String[] args) {
		
		int ���ݾ� = 0;		// ���ݾ��� �ʱⰪ
		boolean ���� = true;	// while���� �۵���ų ����
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		
		while(����) {	// �ݺ��۵���Ű�� ���� while�� ���
			
			System.out.println("----------ATM----------"); // �ٹ̱�
			System.out.println("1.��� | 2.���� | 3.�ܰ� | 4.����");	// �޴�
			System.out.println("���� : "); int ch = scanner.nextInt();	// �޴� ������ �Է��ϱ� ���� ����
			
			if( ch == 1) {	// ���࿡ �Է��� ���ڰ� 1�̶��
				System.out.println("��ݾ��� �Է��ϼ��� : "); int ��ݾ� = scanner.nextInt(); // ��ݾ� �Է� 
				if(���ݾ� < ��ݾ�) {	// ���࿡ ���ݾ��� ��ݾ׺��� �۴ٸ�
					System.out.println("�ܰ� �����մϴ�.");	// �ܰ���� ���
				}else {	// �ƴϸ� 
					���ݾ�-=��ݾ�; //���ݾ׿��� ��ݾ� ����
					System.out.println("��� �Ϸ��Ͽ����ϴ�. �ܾ��� : " + ���ݾ�); // �ٹ̱� + ���ݾ�(�ܰ�) ���
				}
			} else if( ch == 2) {	// �ƴϸ� �Է��� ���ڰ� 2��� 
				System.out.print("�Ա��Ͻ� �ݾ��� �Է��ϼ��� "); ���ݾ� += scanner.nextInt(); // �Է¹��� ���ڸ� ���ݾ׿� ���Ѵ�.
				System.out.println("���� �����Ͽ����ϴ�. �ܾ��� : " + ���ݾ�);	// �ٹ̱� + ���ݾ�(�ܰ�)
			}else if(ch == 3) {	// �ƴϸ� �Է��� ���ڰ� 3�̶��
				System.out.println("�ܾ��� : " +���ݾ�);	// ���ݾ�(�ܰ�) ���
			}else if(ch == 4) {	// �ƴϸ� �Է��� ���ڰ� 4��� 
				System.out.println("�ý����� �����մϴ�.");	// �ٹ̱�
				���� = false;	// ������ false�� ����� while�� ���� 
			}
			else { // �Է¹��� ���� ���ڰ� �ƴ϶��
				System.out.println("���ڸ� �Է� �����մϴ�.");
			}// else end
					
		}// while end
		
	}// main end
} // class end
