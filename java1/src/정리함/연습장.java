package ������;

import java.util.Scanner;

public class ������ {
	
	public static void main(String[] args) {
		// ����5 : 4���� ������ �Է¹޾� ������������ ���
		 Scanner scanner  =new Scanner(System.in);
		 System.out.print("ù��° ������  : "); int a1 = scanner.nextInt();
		 System.out.print("�ι�° ������  : "); int a2 = scanner.nextInt();
		 System.out.print("����° ������  : "); int a3 = scanner.nextInt();
		 System.out.print("�׹�° ������  : "); int a4 = scanner.nextInt();
		 
		 int a5;
		 if(a1 < a2) {a5 =a1; a1 = a2; a2 = a5; }
		 if(a1 < a3) {a5 =a1; a1 = a3; a3 = a5; }
		 if(a1 < a4) {a5 =a1; a1 = a4; a4 = a5; }
		 
		 if(a2 < a3) {a5 =a2; a2 = a3; a3 = a5; }
		 if(a2 < a4) {a5 =a2; a2 = a4; a4 = a5; }
		 
		 if(a3 < a4) {a5 =a3; a3 = a4; a4 = a5; }
		 
		System.out.printf("���������� %d, %d, %d, %d" , a1, a2, a3, a4);
		 
	}
	
} 

