package ����;

import java.util.Scanner;

public class Ű����ũTime {
	
	
	// 3����
	// 1. �޴��� : 1. �ݶ�[300��] 2. ȯŸ[200��] 3.���̴�[100] 4. ����
	// �޴��� �Ʒ��� ������ ��ǰ ���[ ��ǰ���� / �� ���� ���� �ݾ�]
	// 2. �ʱ� ��� [ 10����] �ȷ����� ��� ���� // ��� ������ [ǰ��]
	// 3. �����ݾ��� �Է¹޾Ƽ� ������ ��ŭ ������ �ܵ� ���
	
	public static void main(String[] args) {
		int �ݶ���� = 10; int ȯŸ��� = 10; int ���̴���� = 10;
		int �ݶ󱸸ż� = 0; int ȯŸ���ż� = 0; int ���̴ٱ��ż� = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			if(�ݶ����==0) {
				System.out.println("1. �ݶ�[ǰ��] 2. ȯŸ[200��] 3.���̴�[100] 4. ����");
			}else {
				System.out.println("1. �ݶ�[300��] 2. ȯŸ[200��] 3.���̴�[100] 4. ����");
				System.out.print("����"); int ch = scanner.nextInt();
				
				if(ch==1) {
					if(�ݶ����==0) {
						System.out.println("�ݶ� ǰ���Ǿ����ϴ�.");
					}else {
						�ݶ󱸸ż�++;
						�ݶ����--;
						System.out.println("�ݶ� �Ѱ� ��ҽ��ϴ�.");
					}
				}else if(ch==2) {
					if(ȯŸ���==0) {
						System.out.println("ȯŸ�� ǰ���Ǿ����ϴ�.");
					}else {
						ȯŸ���ż�++;
						ȯŸ���--;
						System.out.println("ȯŸ �Ѱ� ��ҽ��ϴ�.");
					}
				}else if(ch==3) {
					if(���̴����==0) {
						System.out.println("���̴ٰ� ǰ���Ǿ����ϴ�.");
					}else {
						���̴ٱ��ż�++;
						���̴����--;
						System.out.println("���̴� �Ѱ� ��ҽ��ϴ�.");
					}
				}else if ( ch == 4) {
					int total = �ݶ󱸸ż�*300+ȯŸ���ż�*200+���̴ٱ��ż�*100;
					System.out.println();
					System.out.println("---------��ٱ���----------");
					System.out.println("�ݶ�"+�ݶ󱸸ż�+"�� ȯŸ"+ȯŸ���ż�+"�� ���̴�"+ ���̴ٱ��ż� +"��");
					System.out.println("�ѱݾ��� : " + total+"��");
					System.out.println("�����Ͻðڽ��ϱ� ? 1.�� | 2.�ƴϿ�"); int ch1 = scanner.nextInt();
					if (ch1 == 1) {
						System.out.print("�ݾ��� ������ �ּ��� "); int �� = scanner.nextInt();
						if(��<total) {
							System.out.println("�ݾ��� �����մϴ�.");
						}else {
							System.out.println("������ �Ϸ�Ǿ����ϴ�. �ܾ��� : " +(��-total)+"��");
						}
					}else {
						System.out.println("�ʱ� ȭ������ ���ư��ϴ�.");
					}
				}
			}
		} //w e	
	}
}
