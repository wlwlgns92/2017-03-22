package Day01;

import java.util.Scanner; //import : �ٸ� ��Ű������ Ŭ������ �����ö� ���[System Ŭ������ �����������]

public class Day01_5 {

	public static void main(String[] args) {
		// 1. �Է°�ü �����
		Scanner scan = new Scanner(System.in);
		// 2. �Է¹��� ���� ����/��ü ����[�ű��]
		System.out.print(" ���̵� : ");		String ���̵� = scan.next();
		System.out.print(" ��й�ȣ : "); 		String ��й�ȣ = scan.next();
		System.out.print(" ���� : ");		String ���� = scan.next();
		System.out.print(" �̸��� : ");		String �̸��� = scan.next();
		
		// 3. ���
		System.out.println(">>>>>> �ֿ����� �Ϸ� �Ʒ� ������ Ȯ�����ּ��� >>>>>>");
		System.out.println("���̵�\t��й�ȣ\t����\t�̸���");
		System.out.println( ���̵�+"\t"+��й�ȣ+"\t"+����+"\t"+�̸���);
	}
}
