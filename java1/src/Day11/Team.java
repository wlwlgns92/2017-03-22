package Day11;

import java.io.IOException;

public class Team {
//	���� �˻� ���α׷�
//	1.���� : ������� �迭 ���� 
//		[ 4���� ������ �迭�� ��� ]
//		1. �ȴ�! ���̹� ��α�&����Ʈ
//		2. ������ ��Ʈ ���� Ȱ�� ������
//		3. Tucker�� Go ��� ���α׷���
//		4. ȥ�� �����ϴ� C ���
//
//	2. Scanner -> System.in.read()
//
//	3.�˻���� : �˻��� �Է¹޾� �˻��� �ܾ ���Ե� ������ ��� ���
//	4.������� : ������ ������ �Է¹޾� ������ ��ü�� �ܾ�� ���ο� �ܾ� �Է¹޾� ��ü
//	
//	String[] ������� = {	
//			"�ȴ�! ���̹� ��α�&����Ʈ",
//			"������ ��Ʈ ���� Ȱ�� ������",
//			"Tucker�� Go ��� ���α׷���",
//			"ȥ�� �����ϴ� C ���"
//	};
	public static void main(String[] args) throws IOException {
		
		//0. �غ�
		String[] ������� = {"�ȴ�! ���̹� ��α�&����Ʈ", "������ ��Ʈ ���� Ȱ�� ������", "Tucker�� Go ��� ���α׷���", "ȥ�� �����ϴ� C ���"};
		
		//1. �Է¹ޱ�
		while(true) {
			System.out.println("1.�˻� 2.����");
			System.out.println("���� : ");
			//����Ʈ�迭���� [ Ű����κ��� �Է¹��� ����Ʈ�� ������ �迭 ����]
			byte[] bs = new byte[100];
			// �Է�[Ű���� = ����Ʈ] �ޱ� ---> ����Ʈ�迭�� ����
			int count = System.in.read(bs);
				// count : ����Ʈ�� �о�� ���� ���� ����
				// ���ڼ� +2 [\n, \r]
			// ����Ʈ --> ���ڿ� ��ȯ
			String ch= new String(bs, 0, count-2); // 100����Ʈ ��� ���ڿ� ��ȯ
			//���ڿ� --- > ���ڿ� ��ȯ
			
			//��1
			if(ch.equals("1")) {System.out.println("�˻�â");}
			if(ch.equals("2")) {System.out.println("����â");}
			
			//��2 ���ڿ��� �ٽ� ���ڿ��� �ٲ㼭 �ҋ� 
			int ch2 = Integer.parseInt(ch);
			if(ch2==1) {System.out.println("�˻�â");}
			if(ch2==2) {System.out.println("����â");}
			
		}
	}
}
