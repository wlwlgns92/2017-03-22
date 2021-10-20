package Day14;

import java.util.ArrayList;
import java.util.List;

public class Day14_3_p728 {
		
	public static void main(String[] args) {
	
		// �÷��� �����ӿ�ũ
			// �÷��� : ���� [ �ڷᱸ�� : �����͸� �����ϴ� ��� ]
			// �����ӿ�ũ : �̸� ������� ���̺귯���� ����� ����
		
		// 1. List : Arraylist, Vector, LinkedList
		// 2. Set
		// 3. Map
		
		
		// p.728
		// 1. Arraylist : �迭�� ����
			// 1. �������� [ ���̰� �⺻ 10������ 10�� ������ ���̰� �ڵ����� �þ ]
			// 2. ��ü�� ���� [ ������ �ε��� �ڷ� ��ĭ�� �������. ]
				//��) 3�� �ε��� ������[ 4���ε����� = 3�� // 5���ε��� = 4�� ]
			// 3. �޼ҵ�
				// ����Ʈ��.add(��ü��) : �ش� ��ü�� ����Ʈ�� ����
				// ����Ʈ.add(�ε���, ��ü��) : �ش� �ε��� �ڸ��� ��ü ����
				// ����Ʈ��.size() : �ش� ����Ʈ�� ��ü ��
				// ����Ʈ��.get() : �ش� �ε����� ��ü ȣ��
				// ����Ʈ��.remove(�ε���) : �ش� �ε��� ����
				// ����Ʈ��.contains(��ü) : ���翩�� Ȯ�ΰ��� true/ false
				// ��Ʈ����.indexOf(��ü) : �ش� ��ü�� ����Ʈ�� �ε��� ��ȣ
				// ����Ʈ��.clear() : ����Ʈ �ʱ�ȭ
				// ����Ʈ��.isEmpty() : ����Ʈ�� ��� �ִ��� ���� Ȯ�� true / false
		
		
		// 1. ����Ʈ ����
//		List<String> list = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
			// ����ƮŬ����<���׸�> �ƹ��ų� = new ����ƮŬ����<>();
				// <���׸�> : ���׸��� ���� Ÿ������ ����Ʈ ��ü�� ������ �ִ�.
		
		// 2. ����Ʈ�� ��ü �߰�
		list.add("java");
		list.add("jdbc");
		list.add("sevlet/jsp");
		list.add(2, "Database");
		list.add("ibatis");
		
		// 3. ����Ʈ ���
		System.out.println(list);
		System.out.println();
		System.out.println("����Ʈ�� ��ü �� : " + list.size());
		System.out.println();
		// 4. ����Ʈ�� ��ü ȣ��
		
		System.out.println( "2�� �ε��� ȣ�� : "+ list.get(2));
		System.out.println();
		
		// 5. ����Ʈ�� ��� ��ü ȣ�� [ 1 : �ݺ������ ]
		for(int i= 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}	
		// 5.1 [2 �� �ݺ��� Ȱ�� ���
				// for(�ӽð�ü : ����Ʈ) : ����Ʈ�� ��� ��ü�� �ϳ��� �ӽ� ��ü�� ����
			for(String temp : list) {
				System.out.println(temp);	
		}
		// 6. ����Ʈ�� ��ü ����
			list.remove(2); // Database ���� // ������ ��ĭ�� ������
			list.remove(2);
			System.out.println("Ȯ�� : " + list);

			// 7. �˻�
		System.out.println(list.contains("java"));
		System.out.println(list.indexOf("java"));
		
		// 8. ����Ʈ �ʱ�ȭ
		list.clear();
		
		
	}
}
