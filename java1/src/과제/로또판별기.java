package ����;

import java.util.Random;
import java.util.Scanner;

public class �ζ��Ǻ��� {
								//------------------------  3�� ���� -----------------------//
	// 1. ����ڷκ��� �ߺ����� ���� 1 ~ 45 �� 6���� �Է¹޾� ��÷��ȣ ��ȸ 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] number = new int[6];
		int[] ��ǻ�� = new int[6];
		// ��ȣ �Է�
		for(int i = 0; i < 6; i++) {
			System.out.print("��ȣ�� �Է��� �ּ���"); int num = scanner.nextInt();
			
			if(num<1 || num>45) {
				System.out.println("1~45������ �Է� �����մϴ�.");
				i--;
				continue;
			}
			boolean check = true;
			for(int j = 0; j < 6; j++) {
				if(number[j] == num) {
					System.out.println("�̹� �Է��� ��ȣ �Դϴ�.");
					i--;
					check = false;
					break;
				}
			}
			if(check) { number[i] = num; }
		}
		// ��ȣ ���
		System.out.print("����ڰ� �Է��� ��ȣ�� : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		
		// ��÷��ȣ ���
		for(int i = 0; i < 6; i++) {
			Random random = new Random();
			int ��÷��ȣ = random.nextInt(45)+1;
			
			boolean check = true;
			for(int j = 0; j < 6; j++) {
				if(��ǻ��[j] == ��÷��ȣ) {
					i--;
					check = false;
					break;
				}
			}
			if(check) { ��ǻ��[i] = ��÷��ȣ; }
		}
		
		// ��÷��ȣ ���
		System.out.print("�̹��� ��÷��ȣ�� : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(��ǻ��[i] + " ");
		}
		System.out.println();
		
		// ��������
		int count = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(number[i] == ��ǻ��[j]) {
					count++;
				}
			}
		}
		System.out.println("���������� : " + count);
		
	}
}
