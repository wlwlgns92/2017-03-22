package Day01;

import java.util.Scanner;

public class Day01_4 {// Class Start

	public static void main(String[] args) {
		
		// 1. �Է°�ü [ Ű����κ��� �Է°��� �����ϴ� ��ü]
		Scanner �Է°�ü = new Scanner(System.in);
			// ��ü���� : Ŭ������ ��ü��[����] = new ������();
		// 2. �Է¹��� �� �����ͼ� ������ ����
			// ������ ���� ������ �� �ִ� �޸�[�����ġ]
		System.out.print("ù��° �Է� : ");
		String first = �Է°�ü.next();
			// String : ���ڿ� Ŭ���� : ���ڿ��� �����ϴ� ��ü ����
		
		System.out.print("�ι�° �Է� : ");
		int second = �Է°�ü.nextInt();
			// int : ������ [����] �ڷ��� : ���ڸ� �����ϴ� ���� ����
		
		// 3. ���� ���
		System.out.println("ù��° �Է°��� : " + first);
		System.out.println("�ι�° �Է°��� : " + second);
		
		// ���� 1
		/*
		 * �л� �Ѹ��� �̸��� 1~3������ ��� ���θ� �Է¹޾� �Է¹��� ���� �Ʒ��� ���� ���
		 * �̸�		1���� 	2���� 	3���� 	���
		 * ��ȣ��	    �⼮		�Ἦ		�⼮
		 */
		
		//�Է¹ޱ�
		System.out.print(" �л��� �Է� : ");		String �̸� = �Է°�ü.next();
		System.out.print(" 1���� �⼮"); 		String ����_1 = �Է°�ü.next();
		System.out.print(" 2���� �⼮");		String ����_2 = �Է°�ü.next();
		System.out.print(" 3���� �⼮");		String ����_3 = �Է°�ü.next();
		
		// ����ϱ�
		System.out.println("/t/t[[�⼮��]]");
		System.out.println("--------------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����");
		System.out.println( �̸�+"\t"+����_1+"\t"+����_2+"\t"+����_3);
		System.out.println("--------------------------------------");
	}

} // Class end
