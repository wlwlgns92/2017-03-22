package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_3 {

	public static void main(String[] args) {
		
		// ����  [ �ʱⰪ 1�� ������ ���� ]
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		String[] carnumbers = new String[10]; //String 10�� ����迭 
		String[] carnumbers_odd = new String[10];// Ȧ�� ������
		String[] carnumbers_even = new String[10]; //¦�� ������
		Random random = new Random();
		
		while(true) {
			
			System.out.print("1.���� ���� : ");
			int ch = scanner.nextInt();
			if( ch==1 ) { 
				
				/////������ȣ ����
				int intnum = random.nextInt(10000); // 0~ 9999
				// ���� => 4�ڸ��� ���ڿ� ��ȯ
				String strnum = String.format("%04d", intnum);
						// String.format(����, ������) ���ڿ� ���� �޼ҵ�
							// ���� : %d -> ���Ĵ���� �����Ͱ� ����
								// %4d : 4�ڸ���
								// %04d : ����ִ� �ڸ����� 0���� �Ų�
				// ������ȣ ���� [ ����ִ� �迭�� ���� ]
				
				for(int i = 0 ; i < carnumbers.length; i++) {
					if(carnumbers[i] == null) {
						carnumbers[i] = strnum; 
						//Ȧ¦ ����
							// 1. ���� -> ������ ��ȯ
							// 2. Ȧ¦ ����
							// �� % 2 - 0 �������� 0�̸� ¦�� �������� 1�̸� Ȧ��
						if(Integer.parseInt(strnum) %2==0) {
							// ������(������ȣ) % 2 == 0 �̸� ¦��
							for(int j = 0; j < carnumbers_even.length; i++) {
								if(carnumbers_even[j] == null) {
									carnumbers_even[j] = strnum; break;
								}
							}
						} else { // Ȧ��
							for(int j = 0; j < carnumbers_odd.length; i++) {
								if(carnumbers_odd[j] == null) {
									carnumbers_odd[j] = strnum; break;
								}
										
							}
						}
						break;
					}
				}
				///������ȣ ���
				System.out.println("���� �������� ����");
				for(String num : carnumbers) { // �ε��� ��ȣ�� �ʿ���� �ݺ�
				// for( �ڷ��� �ӽú��� : ������ ) : �迭�� 0�� �ε������� �������ε������� �ӽú����� ����
				if( num != null ) System.out.println( num ); 
				}
				System.out.println("���� �������� Ȧ�� ����");
				for(String num : carnumbers_odd) { // �ε��� ��ȣ�� �ʿ���� �ݺ�
					// for( �ڷ��� �ӽú��� : ������ ) : �迭�� 0�� �ε������� �������ε������� �ӽú����� ����
					if( num != null ) System.out.println( num ); 
				}
				System.out.println("���� �������� ¦�� ����");
				for(String num : carnumbers_even) { // �ε��� ��ȣ�� �ʿ���� �ݺ�
					// for( �ڷ��� �ӽú��� : ������ ) : �迭�� 0�� �ε������� �������ε������� �ӽú����� ����
					if( num != null ) System.out.println( num ); 
				}
				
				
			
				
		
			
			}
		}
	}
}
