package ����;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
	
		// �Խ��� �迭���� 3���ñ� 
public class �Խ��ǹ迭 {

	public static void main(String[] args) {
		String[][] �Խ��� = new String[100][5];
		String ����;
		String ����;
		String �ۼ���;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("\t\t �Խ���");
			System.out.printf("%2s \t %10s \t %8s \t %4s \n" ,"����" , "����" , "�ۼ���", "��¥");
			for(int i = 0; i < �Խ���.length; i++) {
				if(�Խ���[i][0] != null) {
					System.out.printf("%2s \t %10s \t %8s \t %4s \n" , i , �Խ���[i][0], �Խ���[i][2], �Խ���[i][3] );	
				}
			}
			System.out.println("1.�۾��� | 2.�� �� ������ | ���� : "); int ch = scanner.nextInt();
			
			if( ch == 1) {
				scanner.nextLine();
				System.out.print("������ �Է��� �ּ��� :"); ���� = scanner.nextLine();
				System.out.print("������ �Է��� �ּ��� :"); ���� = scanner.nextLine();
				System.out.print("�ۼ����� �Է��� �ּ��� :"); �ۼ��� = scanner.nextLine();
				
				Date now = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
				String date = dateFormat.format(now);
				
				String count = "1";
				
				for(int i = 0; i < �Խ���.length; i++) {
					if(�Խ���[i][0] == null) {
						�Խ���[i][0] = ����;
						�Խ���[i][1] = ����;
						�Խ���[i][2] = �ۼ���;
						�Խ���[i][3] = date;
						�Խ���[i][4] = count;
						break;	
					}
				}
			}
			else if ( ch == 2) { 
				System.out.print("�Խù� ��ȣ�� �Է��� �ּ��� : "); int ch2 = scanner.nextInt();
				int count = Integer.parseInt(�Խ���[ch2][4]);
				�Խ���[ch2][4] = Integer.toString(++count);
				
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("���� : " + �Խ���[ch2][0]);
				System.out.println("�ۼ��� : " + �Խ���[ch2][2] + "��¥ : " + �Խ���[ch2][3] + "��ȸ�� : " +�Խ���[ch2][4]);
				System.out.println("���� : " + �Խ���[ch2][1]);
				System.out.println("------------------------------------------------------------------------------");
			}
		}
	}
}