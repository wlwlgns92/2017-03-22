package ������;

import java.util.Scanner;

public class gogogo {

	public static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) {
			
			boolean sw = true;  // ���� ������θ� Ȯ���ϴ� ����
			boolean sw2 = true;
			while (true) { 
			System.out.println("---���θ޴�---");
			System.out.println("1.������� | 2.��ȭ���");
			System.out.print("���� : "); int ch = scanner.nextInt();
				
			if( ch == 1) {
				������� ������� = new �������();
				
				if(sw) {
				�������.musicstop(sw);
				�������.start();
				sw=false;
				}else {
					�������.musicstop(sw);
					sw = true;
				}
			}
			else if( ch == 2 ) { 
				// ������ ���� ��ü ����
				if(sw) {
					
					��ȭ��� ��ȭ��� = new ��ȭ���();
					��ȭ���.moviestop(sw2);
					��ȭ���.start();
					sw2=false;
					}else {
						��ȭ���.moviestop(sw2);
						sw2 = true;
					}
			}
			
			}
			
			
		}
}
