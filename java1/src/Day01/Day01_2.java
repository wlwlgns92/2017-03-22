package Day01;

public class Day01_2 { // class start
 
	public static void main(String[] args) { // main start
		
		// 1. ���
			// print (����� ����); :���
			// println(print line�� ����) : ����� �ٹٲ�[���� �ٲ�]
			// printf(print format�� ����) : (���Ĺ���, ��¹���); �� �ۼ��ϸ� ���Ĺ��� �´� ���
				//���Ĺ���
					/* %d : ����
					 * %f : �Ǽ�
					 * %s : ���ڿ�
					 * %c : ���� */
				// ����� [p.34.]
					/* \ : ��ȭ ��ȣ
					 * \n : �ٹٲ�
					 * \t : ��[�鿩���� -> 5ĭ]
					 * \r : ���� [ �Ǿ����� �̵�
					 * \\ : \ ��µȴ�.  */
		// ��1 : syso + ctrl + �����̽���
		System.out.print("asd");
		System.out.print(1235); // ��ǻ�ʹ� ��� ����ϱ� ������ ���ڿ��� ""ó���� ���ص��ȴ�.
		System.out.print("java1235"); // ���� + ���ڴ� �����̱⶧���� ""ó���� �ؾ��Ѵ�. 
		
		// System : �̸� ������� �ý����̶�� Ŭ����
		// out : ��� ��Ʈ��
		// print(�μ� : ����ϰ� ������) : ����Լ�
		// . Ŭ������ ���(�Լ�, ����) ���� ������[Ư������]
		// "" : Ű����(����Ŭ���� �̸� �ۼ��� �ܾ�), ���� �� ������ ��� ���ڿ��� ����ó��
		// ; : ������ �����ڵ� �� [��ó��]
		
		//��2
		System.out.println("java");
		System.out.println(1234);
		System.out.println("java123");
		
		//��3
		System.out.printf("%s" , "java");
		System.out.printf("%d" , 12345);
		System.out.printf("%s" , "java10");
		
		// printf ����
		System.out.printf("���̴� %d �Դϴ�" , 20);
		System.out.println("���̴� "+ 20 + "�Դϴ�"); // ���⼭ + �� ���� ������
		
		//��4 �����
		System.out.print("\njava\n");
		System.out.print("\t1235");
		System.out.print("\rjava10");
		
		//���� 1
		/* ��°��
		 *  [[ �⼮��]]
		 *  ---------------------------
		 *  �̸�		1���� 	2���� 	3���� 	���
		 *  ��ȣ��	�⼮		�Ἦ		�⼮
		 *  ���缮	�⼮		�Ἦ		�⼮
		 */
		
		System.out.println("\n\t\t[[�⼮��]]");
		System.out.println("----------------------------------------");
		System.out.println("�̸�\t 1����\t 2����\t 3����\t ���");
		System.out.println("��ȣ��\t �⼮\t �Ἦ\t �⼮");
		System.out.println("���缮\t �⼮\t �Ἦ\t �⼮");
		System.out.println("----------------------------------------");
		
		//���� 2 : �����
		System.out.println("\\   /\\");
		System.out.println(" ) ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
		//����3 : ��
		
		System.out.println("\n|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\"); // "�� ���ڷ� ����Ϸ��� \" �̷��� ����ؾ� �Ѵ�.
		System.out.println("|\"^\"     |");
		System.out.println("||_|=\\\\__|");
		
		
	} // main end
	
} // class end
