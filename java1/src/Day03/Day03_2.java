package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/* // ����1 : 2���� ������ �Է¹޾� �� ū�� ���
		System.out.print("ù��° ���� �Է� : "); int a1 = scanner.nextInt();
		System.out.print("�ι�° ���� �Է� : "); int a2 = scanner.nextInt();
		if(a1>a2) { System.out.println("�� ū���� : "+ a1); }
		else if (a1<a2) { System.out.println("�� ū���� : "+ a2);} 
		else System.out.println(" �� ���� ����"); */
		
		/*/ ����2 : 3���� ������ �Է¹޾� ���� ū�� ���
		System.out.print("ù��° ���� �Է� : "); int a1 = scanner.nextInt();
		System.out.print("�ι�° ���� �Է� : "); int a2 = scanner.nextInt();
		System.out.print("����° ���� �Է� : "); int a3 = scanner.nextInt();
		
		if(a1>a2 && a1 > a3) {System.out.println("���� ū ���� : " + a1); }
		else if ( a2 > a1 && a2 > a3) System.out.println("���� ū ���� "+ a2);
		else if ( a3 > a1 && a3 > a2) System.out.println("���� ū ���� " + a3);
		else System.out.println(" �� ������ ����"); */
		
		/*/ ����3 : 4���� ������ �Է¹޾� ���� ū�� ���
		System.out.print("ù��° ���� �Է� : "); int a1 = scanner.nextInt();
		System.out.print("�ι�° ���� �Է� : "); int a2 = scanner.nextInt();
		System.out.print("����° ���� �Է� : "); int a3 = scanner.nextInt();
		System.out.print("�׹�° ���� �Է� : "); int a4 = scanner.nextInt();
		int a5=a1; // max ������ ù��° �� �ֱ�
		if ( a5 < a2) a5 = a2; // ���࿡ a5 ������ �ִ� ������ ũ�� a5 �� ����
		if ( a5 < a3) a5 = a3;
		if ( a5 < a4) a5 = a4;
		System.out.println(" ���� ū���� : "+ a5); */
		
		
		/*/ ����4 : 4���� ������ �Է¹޾� ������������ ���
		// ����ִ� ������ ���� �ѹ��� ������.
		
		System.out.print("ù��° ���� �Է� : "); int a1 = scanner.nextInt();
		System.out.print("�ι�° ���� �Է� : "); int a2 = scanner.nextInt();
		System.out.print("����° ���� �Է� : "); int a3 = scanner.nextInt();
		System.out.print("�׹�° ���� �Է� : "); int a4 = scanner.nextInt();
		
		int a5; // ��ȯ�� ���Ǵ� �ӽ� ����
		// 1. ù��° ������ �ι�°, ����°, �׹�° ������ �� = 3��
		if(a1>a2) { a5 = a1; a1=a2; a2=a5; }
		if(a1>a3) { a5 = a1; a1=a3; a3=a5; }
		if(a1>a4) { a5 = a1; a1=a4; a4=a5; }
		// 2. �ι�° ������ ����°, �׹�° ������ �� = 2��
		if(a2>a3) { a5 = a2; a2=a3; a3=a5; }
		if(a2>a4) { a5 = a2; a2=a4; a4=a5; }
		// 3. ����° ������ �׹�° ������ �� = 1��
		if(a3>a4) { a5 = a3; a3=a4; a4=a5; }
		
		System.out.printf(" �������� : %d %d %d %d" , a1, a2, a3, a4 ); */
		
		/*/ ����5 : 4���� ������ �Է¹޾� ������������ ���
		System.out.print("ù��° ���� �Է� : "); int a1 = scanner.nextInt();
		System.out.print("�ι�° ���� �Է� : "); int a2 = scanner.nextInt();
		System.out.print("����° ���� �Է� : "); int a3 = scanner.nextInt();
		System.out.print("�׹�° ���� �Է� : "); int a4 = scanner.nextInt();
		
		int a5; // ��ȯ�� ���Ǵ� �ӽ� ����
		// 1. ù��° ������ �ι�°, ����°, �׹�° ������ �� = 3��
		if(a1<a2) { a5 = a1; a1=a2; a2=a5; }
		if(a1<a3) { a5 = a1; a1=a3; a3=a5; }
		if(a1<a4) { a5 = a1; a1=a4; a4=a5; }
		// 2. �ι�° ������ ����°, �׹�° ������ �� = 2��
		if(a2<a3) { a5 = a2; a2=a3; a3=a5; }
		if(a2<a4) { a5 = a2; a2=a4; a4=a5; }
		// 3. ����° ������ �׹�° ������ �� = 1��
		if(a3<a4) { a5 = a3; a3=a4; a4=a5; }
		
		System.out.printf(" ������ : %d %d %d %d" , a1, a2, a3, a4 ); */
		
		/*/ ����6 : �α���������
					// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ڱ� 
					// [ ���� ] : ȸ�����̵� admin �̰� ��й�ȣ�� 1234 �� ��쿡�� �α��� ���� �ƴϸ� �α��� ���� ���
		System.out.println("======�α��� ������======");
		System.out.print(" ID : "); String a1 = scanner.next();
		System.out.print(" Password : "); int a2 = scanner.nextInt();
		
		if( a1.equals("admin")) {
			// ���̵� admin �̸�
			if(a2 == 1234) {
				System.out.println( ">>>�α��� ����<<<");				
			}else {
				System.out.println("�α��� ���� �н����尡 �ٸ��ϴ�.");
			}
			}else {
				System.out.println("�α��� ���� �������� �ʴ� ���̵� �Դϴ�."); }*/
	}
}


