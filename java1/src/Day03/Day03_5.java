package Day03;

import java.util.Scanner;

public class Day03_5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// �ݺ����� �� ��� ���
		/*/ ����1) �Է¹��� ������ŭ ����� [ i1�� 1���� �Է¹��� �������� 1�� ����]
		System.out.println(" �� ���� : "); int a1 = scanner.nextInt();
		for(int i1 = 1; i1<=a1; i1++) { System.out.print("*");} */
		
		/*/����2) �Է¹��� ������ŭ ����� // 5������ �ٹٲ�
		System.out.println(" �� ���� : "); int a1 = scanner.nextInt();
		for(int i1= 1; i1<=a1; i1++) { System.out.print("*");
		if( i1%5==0) System.out.println();} */
		
		/*/����3) �Է¹��� �� ��ŭ ���
		System.out.println("�� �� : "); int a =scanner.nextInt();
		// i 1���� �Է¹��� a���� 1�� �����ϸ鼭 ������
			//�ٹٲ�
		for( int i = 1; i<=a; i++) { 
			//�����
		for( int s = 1; s<=i; s++) {System.out.print("*");}	
			
			System.out.println(); 
		} */
				
		/*/����4) �Է¹��� �� ��ŭ ���
		System.out.println("�� �� : "); int a =scanner.nextInt();
		// i 1���� �Է¹��� a���� 1�� �����ϸ鼭 ������
			//�ٹٲ�
		for( int i = 1; i<=a; i++) { 
			//�����
		for( int s =1; s<=a-i+1; s++ ) {System.out.print("*");}	
		System.out.println(); } */
		
		/*/����5) �Է¹��� �� ��ŭ ���
		System.out.println("�� �� : "); int a =scanner.nextInt();
		for( int i = 1; i<=a; i++) { 
		//�������
			for( int b= 1; b<=a-i; b++) { System.out.print(" ");}
			//�����
			for(int s= 1; s<=i; s++) { System.out.print("*");}
			System.out.println();
		}*/
		/*/����6) �Է¹��� �� ��ŭ ���
		System.out.println("�� �� : "); int a =scanner.nextInt();
		for(int i = 1; i<=a; i++) { 
			//����
			for(int b = 1; b<=i-1; b++) { System.out.print(" ");}
			//����� 
			for(int s= 1; s<=a-i+1; s++) { System.out.print("*"); }
			System.out.println();
		} */
		/*/����7) �Է¹��� �� ��ŭ ���
		System.out.println("�� �� : "); int a =scanner.nextInt();
		for(int i = 1; i<=a; i++) {
			//����
			for( int b= 1; b<=a-i; b++) { System.out.print(" ");}
			//�����
			for(int s = 1; s<=i*2-1; s++) { System.out.print("*");}
		System.out.println();
		}*/
		
		/*/����8) �Է¹��� �� ��ŭ ���
		System.out.println("�� �� : "); int a =scanner.nextInt();
		for(int i = 1; i<=a; i++) {
			//����
			for( int b= 1; b<=a-i; b++) { System.out.print(" ");}
			//�����
			for(int s = 1; s<=i*2-1; s++) { System.out.print(i);}
		System.out.println();
		} */
		/*/����9) �Է¹��� �� ��ŭ ���
		System.out.println("�� �� : "); int a =scanner.nextInt();
		for(int i=1; i<=a; i++) {
			//����
			for(int b = 1; b<=i-1; b++) { System.out.print(" ");}
			//��
			for(int s = 1; s<=a*2-(i*2-1); s++) { System.out.print("*");}
		System.out.println();} */
		
		//���� 11)
		System.out.println("�� �� : "); int a =scanner.nextInt();
		for(int i=1; i<=a; i++) {
			//����
			
			//�����
		}
		
		
		
	}

}
