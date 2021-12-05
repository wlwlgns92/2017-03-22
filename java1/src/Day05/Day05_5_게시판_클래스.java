package Day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_5_�Խ���_Ŭ���� {
	
	// 1. ���� �ٸ� �ڷ����� �ϳ��� ����
	public static void main(String[] args) {
		
		//2. �ۼ��� Ŭ������ �迭 ����
		Board[] boards = new Board[100];
		Scanner scanner = new Scanner(System.in);
	
		//1. ���ѷ���
		while(true) {
			System.out.println("\t\t�Խ���");
			System.out.println("------------------------------------------------");
			System.out.printf(" %2s \t %10s \t %5s \t %3s \n" ,"����", "����", "�ۼ���", "�ۼ���", "��ȸ��");
			//�迭�� ��� �ε��� ���
			for(int i=0; i < boards.length; i ++) {
				if(boards[i] != null ) {
					System.out.printf(" %2s \t %10s \t %5s \t %3s \n" ,
							i, boards[i].title, boards[i].writer, boards[i].date, boards[i].count);
				}
			}
			System.out.println("----------------------------------------------------");
			System.out.println("1. �۾���|2. �ۻ�������| ���� : "); int ch = scanner.nextInt();
			
			if(ch==1) {
				System.out.println("�Խù� ����");
					scanner.nextLine();//Line ���� �ذ�
				System.out.print("������ �ۼ����ּ��� : "); String ���� = scanner.nextLine();
				System.out.print("�ۼ��ڸ� �ۼ����ּ��� : "); String �ۼ��� = scanner.nextLine();
				System.out.print("������ �ۼ��� �ּ��� : ");  String ���� = scanner.nextLine();
				//���� ��¥
				Date now = new Date();
				//��¥ ���� Ŭ����
				SimpleDateFormat dateformat = new SimpleDateFormat("MM-dd");
				String date = dateformat.format(now);
				// ��ȸ�� 
				// ��� ������ ����� �迭�� ����
				
				for(int i=0; i<boards.length; i++ ) {
					if (boards[i]==null) {
						Board board = new Board();
						board.title = ����;
						board.contents= ����;
						board.writer=�ۼ���;
						board.date=date;
						board.count=1; 
						boards[i] = board; break;
					}
				}
			}if (ch==2) {
				System.out.println("�Խù� ��ȣ ���� : "); int ch2= scanner.nextInt();
					//�ش� �Խù��� ��ȸ�� 1����
//					int count = Integer.parseInt(board[ch2][4]); //[��ȸ��(String) -> int ��ȯ
//					�Խù�[ch2][4] = Integer.toString(++count); // ��ȸ�� ������ -> String ��ȯ
				boards[ch2].count++;
				System.out.println("-----------�Խù� ��������-----------");
				System.out.println(">>> ���� : " + boards[ch2].title);
				System.out.println(">>> �ۼ��� : " + boards[ch2].writer + "\t�ۼ��� : " + boards[ch2].date +
						"\t��ȸ��" + boards[ch2].count);
				System.out.println(">>> ���� : " + boards[ch2].contents);
				System.out.println("--------------------------------------");
			}
		
		}//we
	}
}
