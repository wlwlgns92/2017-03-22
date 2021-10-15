package Day12;

import java.util.Arrays;
import java.util.Collections;

public class Day12_1 {
		
	public static void main(String[] args) {
		/* p.521
		 * 	1. Arrays Ŭ����
		 * 
		 * 		1. .copyOf("������ �迭", �������) : �迭����
		 * 
		 * 		char : �⺻�ڷ���
		 * 		String : Ŭ���� [���ڿ�]
		 * 
		 */
		
		char[] arr1 = { 'j', 'a', 'v', 'a'};
		
		
				// �迭���� = �迭��.length 	: �ʵ�� ȣ��
				// ���ڿ����� = ���ڿ�.length() : �޼ҵ�� ȣ��
		
		//������
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
					// ���� Ŭ�������� �ٸ� Ŭ���� �޼ҵ� ȣ���ϴ� ���
						// . : ���������ڸ� ���� �޼ҵ� ȣ��
							// ������ Ŭ���� �������� .����
						// 1. ��ü�� ���� �޼ҵ� ȣ��
								//Ŭ������ ��ü�� = new ������()
								// ��ü��.�޼ҵ��()
						// 2. static �޼ҵ� ��ü ���� ȣ��
							//Ŭ������. �޼ҵ��()
				// 2. Arrays.toString(�迭) : �ε��� ������ ���� ���
		System.out.println( Arrays.toString(arr2));
		
			// ���2 copyOfRange(�����ҹ迭, �����ε���, �� �ε���)
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); // [1] ~ [2] ����
		System.out.println( Arrays.toString(arr3));
			// System.arraycopy( �����迭, �����ε���, Ÿ�ٹ迭, Ÿ�ٽ����ε��� ���簳��)
		char[] arr4 = new char[arr1.length]; // �迭1�� ���̸�ŭ �迭4 ����
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println(Arrays.toString(arr4));
		
		//p.522 �迭 �� 
			// Arrays.equals(�迭1, �迭2) : 1���� �迭 ��
		System.out.println(Arrays.equals(arr1, arr2));
//		System.out.println(Arrays.deepEquals(arr1, arr2)); //2����
		
		// Arrays.sort (�迭��) : �ش� �迭�� ���� : sort �� �Է��ϸ� ��������
		Arrays.sort(arr1);
		System.out.println(arr1.toString()); // Ŭ������ ������ toString�� �ּҰ�
		System.out.println(Arrays.toString(arr1));
		
		// �迭�� �������� : sort(�迭��, Collections.reverseOrder());
		// ���ǻ��� : �ش� �迭�� �⺻�ڷ����� ��� ���Ұ� (Ŭ����)
//		Arrays.sort(arr1, Collections.reverseOrder()); 
		
		// p.526
			//9. Arrays.binarySearch(�迭��, ������) 
					// ���� : ��������(sort) ������ ���
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println(index);
	}	
}
