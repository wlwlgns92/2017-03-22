package Day04;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Day04_5_�������� {

		// �迭�� �̿��� �������� ���α׷�
		//1. �л����� �Է¹޾� �л�����ŭ �迭�� ���� �Ҵ�
		//2. �޴� [ 1. �л��� 2. �����Է� 3. �м�[���,���] 4.����]
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer[] �л�������� = null; // �迭������ ����ֱ�
		
		
		while(true) {
			System.out.println("1.�л��� 2.�����Է� 3.�м� 4.����");
			System.out.println("���� : "); int ch = scanner.nextInt();
			if( ch == 1) {
				System.out.println(" �л� �� �Է�[�迭����] : "); int size = scanner.nextInt();
				// �迭�� �޸𸮸� �Ҵ�
				�л�������� = new Integer[size]; // �Է¹��� �� ��ŭ �޸� �Ҵ�
				System.out.println(size + "��ŭ �л���� ����");
			}
			if( ch == 2) {
				// �л� �� ��ŭ ���� �Է�
				for( int i= 0; i<�л��������.length; i++) {
					System.out.println(i+ "��° �л��� ���� �Է� : ");
					�л��������[i] = scanner.nextInt();
				}
			}
			if( ch == 3) { 
//				//��������
//				//2-1 �ݺ����� Ȱ���� ����
//				for(int i= 0 ; i<�л��������.length; i++) {
//					for(int j = i+1; j<�л��������.length; j++) {
//					if(�л��������[i] < �л��������[j]) {
//							//����[��ü
//							int temp = �л��������[j];
//							�л��������[j] = �л��������[i];
//							�л��������[i] = temp;
//						}
//					}
//					}
				// ���� ������
				// i=0  j = 1 j = 1 2 3
				// i=1  j = 2 j = 2 3
				// i=2  j = 3 j = 3
				// i=3  j = 4 j = x
				
				//2-1. Ŭ�������̿��� ���� [ �迭 ���� Ŭ���� = arrays ]
				Arrays.sort(�л��������); // ��������/ �������� �ݴ�� ��������
				Arrays.sort(�л��������,Collections.reverseOrder());
				
				//2. ���
				int sum =0;
				for(int i =0; i<�л��������.length; i++) {
					System.out.println((i+1) + "�� ���� : "+ �л��������[i]);
					sum += �л��������[i];
				}
				System.out.println(" ��� �л����� ���� ��� : "+ sum/�л��������.length);
			}
			if( ch == 4) break;
			}
		
	} // m s

}// c s 
