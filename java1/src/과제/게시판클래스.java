package ����;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class �Խ���Ŭ���� {
	// �Խ��� Ŭ�������� 2���ñ� 
	public static void main(String[] args) {
		Board[] boards = new Board[100];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("\t\t �Խ��� ");
			System.out.printf("%2s \t %10s \t %8s \t %4s \n", "����" , "����", "�ۼ���", "��¥");
			for(int i = 0; i < boards.length; i++ ) {
				if(boards[i] != null ) {
					System.out.printf("%2s \t %10s \t %8s \t %5s \n", i, boards[i].title, boards[i].writer , boards[i].date);
				}
			}
			System.out.print("1.�۾��� | 2.�� �������� | ���� :"); int ch = scanner.nextInt();
			if(ch == 1) {
				scanner.nextLine();
				System.out.print("������ �Է��� �ּ��� : "); String ���� = scanner.nextLine();
				System.out.print("������ �Է��� �ּ��� : "); String ���� = scanner.nextLine();
				System.out.print("�ۼ����� �Է��� �ּ��� : "); String �ۼ��� = scanner.nextLine();
				
				Date now = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
				String date = dateFormat.format(now);
				
				for(int i = 0; i < boards.length; i++) {
					if(boards[i] == null ) {
						Board board = new Board();
						board.title = ����;
						board.content = ����;
						board.writer = �ۼ���;
						board.date = date;
						board.count = 1; 
						boards[i] = board;
						break;
					}
				}
			}
			else if ( ch == 2 ) {
				System.out.print(" �Խù� ��ȣ�� �Է��� �ּ���"); int ch2= scanner.nextInt();
				boards[ch2].count++;
				System.out.println("-------------------------------------------------------------");
				System.out.println("���� : " + boards[ch2].title);
				System.out.println("�ۼ��� : " +  boards[ch2].writer + "��¥ : " + boards[ch2].writer + "��ȸ�� : " + boards[ch2].count);
				System.out.println("���� : " + boards[ch2].content); 
				System.out.println("-------------------------------------------------------------");
			}
		}
	}
} // ce
