package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_7_�ζ��Ǻ��� {
		// 1. ����ڷκ��� 6�� ���� �Է¹޾� �迭�� ����
		public static void main(String[] args) {
			
			// �Է°�ü
			Scanner scanner = new Scanner(System.in);
			//�迭 [ �迭���� : �ڷ���[] �迭�� = new �ڷ���[����]  ]
			int[] number = new int[6]; // int �� 6�� ������ ������ �� �ִ� �迭
			int[] random = new int[6];
			for(int i=0; i<6; i++) {
				System.out.println(i+ "��° ��ȣ ��ȣ[1~45] ����"); 
				int num = scanner.nextInt();// �Է¹��� ���� �ش� �ε��� �迭�� ����
				
				
				// �ٸ����� �־�����
				if (num <1 || num > 45 ) {// 0~45 ���̰� �ƴҰ��
					System.out.println("�˸� : 0 ~ 45 ���̸� �Է� �����մϴ�. : �ٽ� �Է�");
					i--; // �������� �Է��� �ƴϱ� ������ i ����
					continue;
				}
				boolean check = true; // �ߺ��� �������� true �ߺ��� �������� false
				//�ߺ�üũ : ���࿡ �Է��� ���� �迭�� ������ ���� �����ϸ� �ٽ� �Է�
			for ( int j = 0; j<6; j++) {
				if( num == number[j]) { //�ߺ�ã�� ����
				System.out.println("[[ �˸�]] : ������ ���� �̹� �����մϴ�. : �ٽ� �Է�");
				i--;
				check = false; // �ߺ��� �������
				break;
				}
			}
			if(check) number[i] = num;
			// 1~45 ������ �� �̸鼭 �ߺ����� �ƴϸ� i��° �迭�� ����
			number[i] = num;
			}
			//2. ���
			System.out.println(" ����ڰ� ������ �� : ");
			for(int i=0; i<6; i++) {
				System.out.print(number[i] + " ");
			}
			System.out.println();
			
			
			for(int i=0; i < 6; i++) {
				Random random2 = new Random();
				int num = random2.nextInt(45)+1; // ���� ��ü���� 1~ 45 ������ ������ �������� 45�� �Է��ϸ� 0~44 ���� �����⿡ +1	
				boolean check = true; // �ߺ����� Ȯ�� üũ
				for(int j = 0; j<6; j++) { // �ݺ��ϸ鼭 �迭�� �ߺ��� ã��
					if(num == random[j]) { // ���࿡ ������ ���� �迭�� ���� �����ϸ� 
						i--;
						break;
					}
				}
				if(check) random[i]= num; //�ߺ����� ������� i��°�� ���� �ֱ�
			}
			System.out.println(" �̹��� �ζ��� ��÷��ȣ : ");
			for(int i=0; i<6; i++) {
				System.out.print(random[i] + " ");
			}
			System.out.println();	
			
			// 5. �� �迭�� ������ �� üũ
			int count = 0;
			for(int i=0; i<6; i++) {// i�� number �迭�� �ε���
				for(int j=0; j<6; j++) {// j �� random �迭�� �ε��� -> 36�� �� [ i�� j��,�� 6���� ��]
					if(number[i] == random[j]) {
						count++; // ���� �� ������ 1����
					}
				}
			}
			System.out.println(" ��÷ ��� : "+ count);
		}
		
	} 

