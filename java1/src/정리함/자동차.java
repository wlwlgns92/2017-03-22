package ������;

import java.util.Scanner;

public class �ڵ��� {

	public static void main(String[] args) {
		
		boolean ������ = false;		// �����¸� �����ϴ� ����ġ ����
		boolean �õ�����1 = false;		// �õ����¸� �����ϴ� ����ġ ����
	
		Scanner scanner = new Scanner(System.in); // �Է°�ü 
		
		while(true) { // �ݺ���
			
			if(������ == false) {  										//�����°� false(����������)
				System.out.println("���� ���ðڽ��ϱ� 1.��  |  2. �ƴϿ� ");	
				System.out.print("���� : "); int ch = scanner.nextInt();	// ��, �ƴϿ��� ����
				if(ch==1) {												// 1��(��)�� ����������
					System.out.println("���� �������ϴ�.");					
					������ = true;										// ������ ����ġ�� true�� ����
				}
				if(ch==2) {												// 2��(�ƴϿ�)�� ����������
					System.out.println("���� ���� �ʽ��ϴ�.");				// ������ ����ġ�� false�� ����
					
				}
			}
			
			if( ������ == true && �õ�����1 == false) {								// �����°� true(������) �̸鼭 �õ�����1�� false(������)������ ����
				System.out.println("�õ��� �Žðڽ��ϱ� ? 1.�� | 2. �ƴϿ� 3.������");
				System.out.print("���� : "); int ch1 = scanner.nextInt();			// ��,�ƴϿ� ����
				if(ch1==1) {													// 1��(��)�� ����������
					System.out.println("�õ��� �ɾ����ϴ�.");							
					�õ�����1 = true;												// �õ�����1 true�� ����
					System.out.println("�������� �����߽��ϴ�.");
				}
				if(ch1==2) {													// �õ��� ���� �ʽ��ϴ�( if�� �ݺ� )
					System.out.println("�õ��� ���� �ʽ��ϴ�.");
					
				}if( ch1 == 3 ) {												// 3��(������)�� ���������� 
					������ = false;												// ������ false�� ���� �ٽ� ù��° if������ �̵�
				}
		
			if( ������ == true && �õ�����1 == true ) {									// �����°� true�̸鼭 �õ�����1 == true �ϋ� ����
				while( true) { 														// �ݺ����� ����� �ݺ�����
					System.out.println("[ ������ ] �õ��� ���ðڽ��ϱ� ? 1.�� | 2.�ƴϿ�");	
					System.out.print("���� : "); int ch2 = scanner.nextInt();			// ��, �ƴϿ��� ����
					if(ch2==1) {													// 1��(��)�� ����������
						System.out.println("�õ��� ���ϴ�.");
						�õ�����1 = false;												// �õ�����1 ����ġ�� false�� ����
						break;														// �ݺ��� ����
					}
					if(ch2==2) {													// 2��(�ƴϿ�)�� ���������� 
						System.out.println("�õ��� ���� �ʽ��ϴ�.");						// ����� �ݺ��� �ٽ� ����
					}
				}
			}
			}
		}	//w e
	}
	
}
