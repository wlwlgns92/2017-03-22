package Day03;

import java.util.Scanner;

public class Day03_3 {
	
  // if(������) switch(����������)
  // sswitch���� if��ó�� ���ǽ��� true�� ��쿡 ��� ������ ���๮�� �����ϴ� ���� �ƴϴ�. ������ � ���� �����Ŀ� ���� ���๮�� ���õȴ�.
	// ����Ǽ��� ������ �ִ� ��� -> switch(�ӵ� ����)
	// ����Ǽ��� ������ ���� �ʴ� ��� -> if(��)
		/* ���� : switch( key:�˻���) { 
				case �˻� : ���๮;
				case �˻� : ���๮;
				case �˻� : ���๮;
				default : ���๮; */
	// break; : switch Ȥ�� �ݺ����� Ż��� ���Ǵ� Ű���� { ���� ����� �߰�ȣ Ż��}
	public static void main(String[] args) {
		/*/ ��1)
		int a1 = 80;
		switch(a1) { // ������ �˻�!!!
			//������ 90�̸�
		case 90 : System.out.println(" A ��� �Դϴ�."); break;
		case 80 : System.out.println(" B ��� �Դϴ�."); break;
		case 70 : System.out.println(" C ��� �Դϴ�."); break;
		//�׿�
		default : System.out.println(" Ż�� �Դϴ�."); 
			}*/
		
		/*/��2
		int a1 =3 ;
		switch(a1) {
		case 1 : System.out.println(" 1������ �̵� "); break;
		case 2 : System.out.println(" 2������ �̵� "); break;
		case 3 : System.out.println(" 3������ �̵� "); break;
		default : System.out.println(" ���� ");
		} */
		
		/*/ p.118 char switch ��
		char a1 = 'B';
		switch(a1) {
		case 'A' :
		case 'a' : 
			System.out.println("���ȸ�� �Դϴ�."); break;
		case 'B' :
		case 'b' : 
			System.out.println("�Ϲ�ȸ�� �Դϴ�."); break;
			default : System.out.println("�մ� �Դϴ�.");
		} */
		/*/ p.119 String switch ��
		
		String a1 = "����";
		
		switch(a1) {
		case "����" :
			System.out.println("700����"); break;
		case "����" :
			System.out.println("500����"); break;
			default : System.out.println("300����");	} */
		
		// ����1 : ��,��.�� ������ �Է¹޾� ����� 90�� �̻��̸� A���, 80�� �̻��̸� B��� �������� Ż��
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ���� �Է� : "); int a1 = scanner.nextInt();
		System.out.print("���� ���� �Է� : "); int a2 = scanner.nextInt();
		System.out.print("���� ���� �Է� : "); int a3 = scanner.nextInt();
		int a4 = (a1+a2+a3)/3;
		
		switch(a4/10) {
			//1�� �ڸ��� �����Ѵ�.
		case 10 :
		case 9 : System.out.println("A���"); break;
		case 8 : System.out.println("B���"); break;
		default : System.out.println("Ż���Դϴ�.");
		}
		
	}
	
}
