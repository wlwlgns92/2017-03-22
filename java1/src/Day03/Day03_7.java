package Day03;

import java.util.Scanner;

public class Day03_7 {
	
	//p.127 : 
		// 1. ���ѷ����� �Է��� ��� �ޱ�
			//1. while(true)
			//2. while(boolean)
		// 2. ������ ����
	public static void main(String[] args) {
		
		// ���ѷ���[������ false�϶����� (break,return) ������������ ��� �����]
		boolean run = true;
		int keycode=0;
		int speed=0;
		while(run) { //������ true ���� false ����x
			Scanner scanner =new Scanner(System.in);
			System.out.println("1.���� 2.���� 3.����");
			System.out.println("���� : ");
			keycode = scanner.nextInt();
				//1 1�� �Է½� ���ǵ� ����
			if(keycode ==1) {speed++; System.out.println("����ӵ��� : "+ speed);			}
				//2 2�� �Է½�	���ǵ� ����
			if(keycode ==2) {speed--; System.out.println("����ӵ��� :�� "+ speed);}
					if(keycode == 3) { // 3 �Է½� ����
						run=false; System.out.println("���α׷� ����");
					}
		}
	}
}
