package Day01;

import java.util.Scanner;

public class Day01_06 {

	public static void main(String[] args) {
		// ����3 : �湮�� �Է¹޾� ����ϱ�
		/*[�Է¹ޱ�] : �̸�, �ۼ���, ����, ��¥
		 * [ ��� ] 
		 * --------------�湮��---------------
		 * | ���� |  �ۼ��� | 	���� 		| ��¥ |
		 * |  1  | ��ȣ��  | �ȳ��ϼ���  |09-28|
		 */
		
		// 1. �Է°�ü ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" �ۼ��� : "); 		String �ۼ��� = scanner.next();
			scanner.nextLine();
		System.out.print(" ���� : ");		String ���� = scanner.nextLine();
		// scanner.nextLine(); // next �������� nextLine ���� ���� �߻�
			//�ذ��� : next �� nextLine ���̿� NextLine() �߰�
	
		System.out.print(" ��¥ : ");		String ��¥ = scanner.next();
		
		System.out.println("--------------�湮��---------------");
		System.out.println("| ���� | �ۼ��� |\t����\t| ��¥ |");
		System.out.println( "| 1  |"+ �ۼ���+"  |  "+����+" |"+��¥+"|");
		System.out.println("---------------------------------");
	}

}

