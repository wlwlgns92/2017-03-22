package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ���ѷ��� while �̿��� ���ѹݺ�
				//Ű���带 �̿��� ���� ����
				// ���ѷ��� �����Ű�� ���
				//	1. ������ false �� �ٲ�
				//	2. break ���
				/*while(true) {System.out.println("���ѷ���"); 
				
				int ���� = scanner.nextInt();
				if ( ���� ==4) break; } */
			
		// ����[����] ����	
			// 1. ���� Ŭ����
				// Random ��ü
					// .nextInt() : int�� ǥ���� �� �ִ� ������ŭ ���� ����
					// .nextInt(����) : 0~ ���� ������ ����
					// .nextInt(10) + �ʱⰪ 
		while(true) { 
				Random random = new Random();
				System.out.println(random.nextInt(10)+3); }
				
				//System.out.println(random.nextInt());
	}// m e
	
}//c e
