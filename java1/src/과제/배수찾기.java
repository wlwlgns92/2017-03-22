package ����;

import java.util.Scanner;

public class ���ã�� {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� ���[ true , false ]
//		System.out.print("������ �Է��ϼ��� : "); int num = scanner.nextInt();
//		System.out.println("�Է��Ͻ� ���ڴ�" + (num%7 == 0) +"�Դϴ�.");
		
//		//����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� [ true , false ]
//		System.out.print("������ �Է��ϼ��� : "); int num1 = scanner.nextInt();
//		System.out.println("true�� Ȧ�� false�� ¦�� :  " + (num1%2 == 0));
				
		
		//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� [ true , false ]
		System.out.print("������ �Է��ϼ��� : "); int num = scanner.nextInt();
		System.out.println("true�� 7�� ����̸鼭 ¦�� false��� �ƴϴ�. : " + (num%7==0 && num%2 == 0));
	}
}
