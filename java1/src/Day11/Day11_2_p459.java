package Day11;

public class Day11_2_p459 {
	
	public static void main(String[] args) {
		/* API
		 * 	���̺귯�� : ������� Ŭ���� , �������̽�
		 * Object Ŭ����
		 *  equals() : ��ü ��
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println(" �� ��ü�� �����մϴ�.");
		}else {
			System.out.println( " �� ��ü�� �ٸ��ϴ�. " );
		}
		if(obj1.equals(obj3)) {
			System.out.println(" �� ��ü�� �����մϴ�.");
		}else {
			System.out.println( " �� ��ü�� �ٸ��ϴ�. " );
		}
		
		// 2. toString() : ��ü ����
			// ��ü�� �ּҰ�[ �ڷ������� �� ȣ�� ]
		System.out.println(obj1.toString());
		
		 // 3. clone() : ��ü ����
		
			// ���� ���� : �迭 ��ü�� ���� �Ұ� [�ּҰ�] �� ���� : ������ == ������ �������ټ�����
			// ���� ���� : ����Ÿ�� �迭 ��ü������
		Member2 original = new Member2("blue", "ȫ�浿", "12345", 25, true);
		
		// 3.1 ��ü ����
		Member2 cloned = original.getMember2();
		
		cloned.password ="67890";
		
		System.out.println("������ ��ü");
		cloned.toString();
		
		System.out.println("���� ��ü");
		original.toString();
		
		// ��������
		
		Member3 original2 = new Member3("ȫ�浿", 25, new int[] {90, 90}, new Car("�ҳ�Ÿ"));
		// ���� ����
		Member3 cloned2 = original2.getMember3();
		cloned2.scores[0] = 100;
		cloned2.car.model = "�׷���";
		
		System.out.println("--����--");
		original2.toString();
		System.out.println("-��������--");
		cloned2.toString();
		
		
		// finalize () : ��ü �Ҹ���
		cloned2 = null; // �ش� ��ü�� null
				System.gc(); // �ڵ�����
					//���� : ������, �ּҰ�
					// �� : ��
						//int ������ = 10;
							//���� : ������, ������ �� �ּҰ�
							// �� : �ּҸ� �������ִ� �޸� : ��
	}
}
