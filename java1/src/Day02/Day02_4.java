package Day02;

import java.util.Scanner;

public class Day02_4 {
	
		
	public static void main(String[] args) {
		// ����1 : �޿� ���� 
				/*
				 * [����] �Է¹ޱ� : �⺻�� , ���� 
				 * [���] �Ǽ��ɾ� = �⺻�� + ���� - ����[ �⺻��10% ]
				 * 
				 */
		// 1. �Է°�ü ���� = Scanner Ŭ������ �̿��� ��ü ����		
		Scanner scanner = new Scanner(System.in);
		/* 2. �Է°�ü�� ����� ���� ������ �ű��
		System.out.println("�⺻�� : "); int a = scanner.nextInt();
		System.out.println("���� : "); int b = scanner.nextInt(); 
		// 3. ���
		int c = (int)(a * 0.1); // ���� ��� int * double
		System.out.println("�Ǽ��ɾ� : " + (a+b-c));
		
		// ����2 : ���� ���� ���� 
				/*
				 * [����] : �ʸ��� ������ �ݾ��� ����޾ 
				 * [���] : �Է¹��� �ݾ��� ����� ���� 
				 * [��� �� ] : 356789  
				 * 		�ʸ��� : 3�� 
				 *		���� : 5�� 
				 * 		õ�� : 6�� 
				 * 		��� : 7��
				 */
		/* 1. ���� �Է¹ޱ�
		System.out.println(" �ݾ� : ");int d = scanner.nextInt();
			// �ʸ��� ��
		System.out.println("�ʸ��� : " + (d/100000)+"��");
		 //d = d - (d/100000) * 100000;
		 d -= (d/100000) * 100000; // �ʸ��� ���� ����
		 	// ���� ��
		 System.out.println("���� : " + (d/10000)+"��");
		 d -= (d/10000) * 10000; //���� ���� ����
		 System.out.println("õ�� : " + (d/1000)+"��");
		 d -= (d/1000) * 1000; //õ�� ���� ����
		 System.out.println("��� : " + (d/100)+"��");
		 
		//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� ���[ true , false ]
		 /* ���ã��
		  * �� % �� == 0 �������� 0�̸� ���� �� ���� ���
		  */
		/* System.out.println(" ���� ���� : ");	int e = scanner.nextInt();
		 System.out.println(" 7�� ������� : " + ( e%7 == 0)); */
		 
		/*//����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� [ true , false ]
		 //Ȧ��ã�� 
		 // �� % 2 == 1 ������ 2�� ������ �������� 0�̸� ¦�� 1�̸� Ȧ��
		 
		 System.out.println(" Ȧ�� ���� : "+ (e%2==1));*/
		 
		/*//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� [ true , false ]
		 System.out.println("f ���� �Է� : " ); int f = scanner.nextInt();
		 System.out.println(" 7�� ��� �̸鼭 ¦������ : " + (f%7==0 && f%2==0)); */
		 
		 
		/*//����6 : �ΰ��� ������ �Է¹޾� �� ū�� ���  [ true , false ]
		 System.out.println("ù��° ���� : ");	int g =scanner.nextInt();
		 System.out.println("�ι�° ���� : "); int h = scanner.nextInt();
		 System.out.println(" ����1 > ����2 ũ�� : " + (g>h)); */
		
		/*//����7 : �������� �Է¹޾� �� ���� ����ϱ� 
		// �� ���� ���� => ������ * ������ * ������[3.14]
		System.out.println("����7 ������ �Է� : "); double i = scanner.nextDouble();
		System.out.println("�� ���̴� : " + (i*i*3.14)); */
		
		
		/*//����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
		// ��) 54.5   84.3 �̸�    64.285714%
		System.out.println("����8 �Ǽ�1 �Է� : "); double j1 = scanner.nextDouble();
		System.out.println("����8 �Ǽ�2 �Է� : "); double j2 = scanner.nextDouble();
		double j3 = (j1/j2) * 100; // * 100 ���� �ϸ� 0.64 �̷��� �Ҽ������� ���´�.
		System.out.println("�Ǽ�1�� �Ǽ�2�� ����� : " + j3 + "%"); //��� : �Ǽ�1�� �Ǽ�2�� ����� : 64.65005931198102%
		// �Ҽ��� ������ ���� ����
		System.out.printf("�Ǽ�1�� �Ǽ�2�� ����� : %.2f%%", j3); // %f%% ���� %% �ΰ��� �ִ� ������ �ϳ��� ������ ���� ���ڷ� �ν� %.2f ���� .2�� �ִ� ���� �Ҽ��� ���ڸ����� �ڸ����� �ִ°Ŵ�.
				// printf�� ����Ѵ�				//���Ĺ��� : %f[�Ǽ�] ���Ĺ��ڴ� +�� �ƴ� , �� ����Ѵ�.
												// %.����f [���� : �Ҽ��� �ڸ���] */
								
		/*//����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�]
				//��ٸ��� ���� = > (���� * �غ�) * ���� / 2
		System.out.println(" ������ ���� : "); int a1 = scanner.nextInt();
		System.out.println(" �غ��� ���� : "); int a2 = scanner.nextInt();
		System.out.println(" ������ ���� : "); int a3 = scanner.nextInt();
		System.out.println("��ٸ����� ���̴� : " + (a1*a2)*a3/2); */
		
		/* //����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
				//ǥ��ü�� ���� = > (Ű - 100) * 0.9
		System.out.println(" Ű(����) : "); int a1 = scanner.nextInt();
		System.out.println("ǥ�� ü���� : " + (a1-100)*0.9); */
		
		/* //����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
				//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))
		System.out.println(" Ű : "); double a1 = scanner.nextDouble();
		System.out.println(" ������ : "); double a2 = scanner.nextDouble();
		System.out.printf("BMI �� : %.1f \n" + (a2/( (a1 / 100) * (a1 / 100) ) ) ); */
	
		/* //����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ� [1 inch -> 2.54
		System.out.println(" inch : "); double a1 = scanner.nextDouble();
		System.out.println("cm ���̴� " + (a1*2.54)); */
		
		/* //����13:  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
				//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
				//�߰���� �ݿ����� => 30 %
				//�⸻��� �ݿ����� => 30 %
				//������ �ݿ����� => 40 %
		
		System.out.println("�߰���� �Է� : "); double a1 = scanner.nextDouble();
		System.out.println("�⸻��� �Է� : "); double a2 = scanner.nextDouble();
		System.out.println("������ �Է� : "); double a3 = scanner.nextDouble();
		a1 *= 0.3; a2 *= 0.3; a3 *=0.4;
		System.out.printf("�ݿ������� ���� : %.2f \n" , (a1+a2+a3)); */
		
		//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
	 	//int x = 10;
		//int y = x-- + 5 + --x;
		//printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
			// 1. x-- + 5 => 10 + 5 // ���� ������ ���������� ���ϱ⸦ �ϰ� �����Ѵ�. 
			// 2. x-- => 10 -> 9
			// 3. --x -> 9 -> 8
			// 4. 15 + 8 => 23

		int a1 =5; int a2 =10; int a3=7;
		double a4 = ((double) a1+a2)/2 * a3;
		System.out.println(a4);
				
		

	}

}
