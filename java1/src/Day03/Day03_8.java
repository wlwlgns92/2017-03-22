package Day03;

import java.util.Scanner;
// Ȯ�ι��� 7 : ATM ���α׷�
public class Day03_8 {
		public static void main(String[] args) {
			/*Scanner scanner = new Scanner(System.in);
			boolean run = true;
			
			int ���ݾ� = 0;
			
			while(run) { // true ���ѷ��� ���� // ���ຯ���� false�̸� ���ѷ��� ����]
				System.out.println("           �������� ATM         ");
				System.out.println("------------------------------");
				System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
				System.out.println("------------------------------");
				System.out.println("����> "); int c = scanner.nextInt();
				if(c == 1) { 
					System.out.println("���ݾ�> ");
					���ݾ� += scanner.nextInt();
					System.out.println("���� �Ϸ�");
				}
				else if(c == 2) { 
					System.out.println("��ݾ�> ");	int ��ݾ� = scanner.nextInt();
					if(���ݾ� < ��ݾ�) {System.out.println("�ܰ� �����մϴ�.");}
					else  {���ݾ�-=��ݾ�; System.out.println("��� �Ϸ�");}
				}
				else if(c == 3) {
					System.out.println("�ܰ�> "+ ���ݾ�);	
				}
				else if(c == 4){ System.out.println("ATM����");}
				
				else { run=false; System.out.println("����"); } */
			
			/*/ Ȯ�ι���3)
			int i = 0;
			for(int a = 0; a<=100; a++) { if(a%3==0) i+=a; }
			System.out.println("3�ǹ�� ���� �հ�� : " + i); */
			//Ȯ�ι���5)
			for( int x = 1; x<=10 ; x++) {
				for (int y = 1; y<=10; y++) {
					if((4*x)+ (5*y)==60) {System.out.printf("(%d , %d)\n", x, y);
				}
			}
				
			}
			
			
			/*/ Ȯ�ι���6)
			for(int i =1; i<=5 ; i++) { 
				for (int s = 1; s<=i; s++) { System.out.print("*"); }
				System.out.println(); 				
			}*/
				
			
			}
		}

