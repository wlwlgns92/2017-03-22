package Day02;

public class Day02_2 {

	// ���� : �ϳ��� ���� ������ �� �ִ� �޸� ����
				// �޸�[�ֱ����ġ=RAM] : ���� �������� ���α׷��� ���
					// ���α׷� <----���μ���[������] <----��ɾ�[�ڵ�] ����
			// ���� ���� ���� ----> �뷮 ����----> �ӵ� ����
			// ���� ȿ���� -> �ڷ���
			// ���� ����
				// �ڷ��� - ������[����]
				// int age;
			// ������ ��Ģ
				//���ڷ� ����x, ��ҹ��� ����
			// ������ ���� [�����ʰ��� ���ʿ� ���� : ���Կ����� =]
				// int score; // ���� ����
				// score = 90 ; // ������ 90�� ����
			// ������ ����� ��� �������� ��� �����ϴ�.[��ȣ ������ �̵� ����, ��ȣ ������ �̵� �Ұ�]
	public static void main(String[] args) {
		
		// p.35 ��
		int value = 10; // int ���� �ڷ��� value �������� ���� ���� ����� ���ÿ� 10 ����
		int result = value + 10; // ������ ������ ����
		System.out.println("��� : "+ result);
		
		// p.38 �ڷ���
			// �ڷ��� ��� ���� : �޸� ȿ���� [������ ���]
			// ��ǻ�ʹ� ���� ��� [ 0, 1 ] ���� : bit -> 0 Ȥ�� 1
		/*
		 *  [��]
		 *  boolean	1��Ʈ		true, false
		 *  [����]
		 *  char	2byte	����
		 *  [����]
		 *  byte	1byte	(-128~127)
		 *  short	2byte	(-32,768 ~ 32767)
		 *  int		4byte	+-20������
		 *  long	8byte	+-20���̻�
		 *  [�Ǽ�]
		 *  float	4byte
		 *  double	8byte		
		 */
		
		
		//p.40 : byte [-128 ~ +127] : �ƽ�Ű�ڵ� : ���ڰ� ������ ���ڷ� �ٲ��.
		byte var1 = -128; System.out.println(var1);
		byte var2 = -30;  System.out.println(var2);
		byte var3 = 30;   System.out.println(var3);
		// byte var4 = 128; System.out.println(var4);
		
		// p.43 : char [�ѱ��ڸ� ����] : �����ڵ� ��� ���ڰ� ������ ���ڷ� �ٲ��.
		char c1 = 'a'; System.out.println(c1);
		char c2 = 65;  System.out.println(c2);
		char c3 = '\u0041'; System.out.println(c3);
		char c4 = '��'; 		System.out.println(c4);
		char c5 = 44032; 	System.out.println(c5);
		char c6 = '\uac00'; System.out.println(c6);
			// ��ǻ�ʹ� ���ڸ� ��� �ν�????
				// �ƽ�Ű�ڵ� : �̱� [���� --> ���� --> ����] 
				// �����ڵ�[java] :  ������ ��� ���� ǥ��
		
		// p.44~45 : shor[2byte], int[�⺻ ���� �ڷ���/4byte] Ÿ��
		
		short num1 = 30000; System.out.println(num1);
		//short num2 = 40000; System.out.println(num2);
		int num2 = 10; 		System.out.println(num2);
		int num3 = 012; 	System.out.println(num3); //8����
		int num4 = 0xA; 	System.out.println(num4); //16����
			//���� ���� : ��ǻ�Ͱ� ǥ���� �� �ִ� ���� �Ѱ� �ذ�
			// 2���� [ 0, 1 ] : ����
			// 8���� [ 0 ~ 7 ] : �տ� 0�� ���̸� 8����
			// 10���� [ 0 ~ 9 ] : ���
			// 16���� [ 0 ~ 9 ABCDEF ] : �پ��� ǥ�� ���� �տ� 0x�� ���̸� 16����
		
		//p.46 : Long[8����Ʈ] : 20�� �̻�
		Long num5 = 2000000000l; System.out.println(num5);
		
		// p.47~48 : float[4����Ʈ], double[*�⺻ �Ǽ� �ڷ���/ 8����Ʈ]
		double val = 3.14; System.out.println(val);
		float val2 = 3.14f; System.out.println(val2);
		double val3 = 0.1234567890123456789; System.out.println(val3);
		// double�� �Ҽ��� 18�ڸ����� ǥ��
		float val4 = 0.1234567890123456789f; System.out.println(val4);
		// float�� �Ҽ��� 8�ڸ����� ǥ��
		
		//boolean : ��Ʈ[0(false), 1(true)]
		boolean bol = true; 	System.out.println(bol);
		boolean bol2 = false; 	System.out.println(bol2);
		
		
		// p.49 : Ÿ�Ժ�ȯ
			// 1. �ڵ� Ÿ�Ժ�ȯ : ũ���[���� ���ڿ��� ū ���ڷ� �̵� ����]
				// byte - > short(char) -> int -> long -> float -> double [�ݴ�δ� �Ұ�]
							// short -> char x , char -> short x
		byte bytevalue = 10;
		int intvalue = bytevalue; // �ڵ� ����ȯ[����] byte -> int
		// byte bytevalue2 = invalue; int -> byte �Ұ�
		
		
			// 2. ���� Ÿ�Ժ�ȯ : �޸� �ս� -> �����ͼս�
			// �ڷ��� ������ = (�ڷ���)������;
			// p.54
		byte bytevalue2 = (byte)intvalue;
		
		
		// �������� 8 
			// ����� �⺻Ÿ�� : int, 
			// byte + byte = int
			// int + byte = int
			// int + float = int
			// int + double = int
				
	}

}
