package Day05;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_4_�Խ��� {
		
		public static void main(String[] args) {
			//����
			Scanner scanner = new Scanner(System.in);
			String[][] �Խù� = new String[100][5]; //�Խù� 100���� ������ �� �ִ� �迭 ���� [1���� ��� 5��]
			
			String ���� = "0";
			String ����; String �ۼ���; String ����;
			//1. ���ѷ���
			while(true) {
				System.out.println("\t\t�Խ���");
				System.out.println("------------------------------------------------");
				System.out.printf(" %2s \t %10s \t %5s \t %3s \n" ,"����", "����", "�ۼ���", "�ۼ���", "��ȸ��");
				//�迭�� ��� �ε��� ���
				for(int i=0; i < �Խù�.length; i ++) {
					if(�Խù�[i][0] != null ) {
						System.out.printf(" %2s \t %10s \t %5s \t %3s \n" ,
								i, �Խù�[i][0], �Խù�[i][2], �Խù�[i][3], �Խù�[i][4]);
					}
				}
				System.out.println("----------------------------------------------------");
				System.out.println("1. �۾���|2. �ۻ�������| ���� : "); int ch = scanner.nextInt();
				
				if(ch==1) {
					System.out.println("�Խù� ����");
						scanner.nextLine();//Line ���� �ذ�
					System.out.print("������ �ۼ����ּ��� : "); ���� = scanner.nextLine();
					System.out.print("�ۼ��ڸ� �ۼ����ּ��� : "); �ۼ��� = scanner.nextLine();
					System.out.print("������ �ۼ��� �ּ��� : "); ���� = scanner.nextLine();
					//���� ��¥
					Date now = new Date();
					//��¥ ���� Ŭ����
					SimpleDateFormat dateformat = new SimpleDateFormat("MM-dd");
					String date = dateformat.format(now);
					// ��ȸ�� 
					String count = "1";
					// ��� ������ ����� �迭�� ����
					
					for(int i=0; i<�Խù�.length; i++ ) {
						if (�Խù�[i][0]==null) { 
							�Խù�[i][0] = ����;
							�Խù�[i][1]= ����;
							�Խù�[i][2]=�ۼ���;
							�Խù�[i][3]=date;
							�Խù�[i][4]=count; break;
						}
						
					}
				}if (ch==2) {
					System.out.println("�Խù� ��ȣ ���� : "); int ch2= scanner.nextInt();
						//�ش� �Խù��� ��ȸ�� 1����
						int count = Integer.parseInt(�Խù�[ch2][4]); //[��ȸ��(String) -> int ��ȯ
						�Խù�[ch2][4] = Integer.toString(++count); // ��ȸ�� ������ -> String ��ȯ
						
					System.out.println("-----------�Խù� ��������-----------");
					System.out.println(">>> ���� : " + �Խù�[ch2][0]);
					System.out.println(">>> �ۼ��� : " + �Խù�[ch2][2] + "\t�ۼ��� : " + �Խù�[ch2][4] +
							"\t��ȸ��" + �Խù�[ch2][4]);
					System.out.println(">>> ���� : " + �Խù�[ch2][1]);
					System.out.println("--------------------------------------");
					
				}
			
			}//we
		}
}
