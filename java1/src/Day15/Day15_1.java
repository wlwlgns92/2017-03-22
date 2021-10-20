package Day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Day15_1 {
	
	//�÷��� : �ڷᱸ�� �������� ��ü�� ȿ�������� �߰�, ����, �˻� �� �� �ֵ���[ �迭�� ������ ���� ]
		// 1. List : ����(�ε���)�� �����ϰ� ����// �迭�� ���� // �ߺ� ���� ����
			// 1.Arrarylist, 2.Vector 3. Linkedlist
				// ����Ʈ��.add(��ü��) : �ش� ��ü�� ����Ʈ�� ����
				// ����Ʈ��.contains(��ü��) : �ش� ��ü�� ����Ʈ�� ���� ���� (true / false)
				// ����Ʈ��.indexOf(��ü��) : �ش� ��ü�� �ε��� ��ȣ
				// ����Ʈ��.get(�ε���) : �ش� �ε����� ��ü ȣ��
				// ����Ʈ��.isEmpty() : ����Ʈ�� ��� �ִ��� Ȯ�� (true / false)
				// ����Ʈ��.size() : ����Ʈ�� ��ü��
				// ����Ʈ��.clear() : ����Ʈ �ʱ�ȭ [ ��� ��ü ����]
				// ����Ʈ��.remove(�ε��� or ��ü��) : �ش� �ε��� Ȥ�� ��ü ����
			// ����
				// ArrayList : ���Ͻ�����(����ȭx) , �˻� ����
				// Vector : ��Ƽ������(����ȭo)
				// Linkedlist : �߰��� ���� / ���� ����
		// 2. Set : ������ �������� �ʰ� ����// �ߺ� ���� �Ұ�
			// 1. HashSet 2. TreeSet
				// set��.add(��ü��) : �ش� ��ü�� set�� ����
				// set��.contains(��ü��) : �ش� ��ü�� ����Ʈ�� �����ϴ��� ���� Ȯ��(true /false)
				// set��.isEmpty() : ����Ʈ�� ��� �ִ��� Ȯ�� (true / false)
				// set��.iterator() : ����� ��ü�� �ϳ��� �������� �ݺ��� ���� // set�� ��������� ���� ������ �ʼ�
					// hashNext() : ���� ��ü�� �����ϸ� true ������ false 
					// next() : ��ü ��������
					// remove() : ��ü ����
				// set��.size() : set�� ��ü��
				// set��.clear() : set �ʱ�ȭ
				// set��.remove(��ü) : �ش� �ε��� ��ü ����
	
		// 3. Map : Ű-�� �ѽ����� ���� // Ű�� �ߺ� ���� �Ұ�
			// 1. HashMap 2. Hashtable 3. TreeMap 4. Properties
				// map��.put(Ű, ��); : Ű�� ������ �̷���� ��Ʈ�� �߰�
				// map��.containsKey(Ű) : Ű ���� ���� Ȯ��
				// map��.containsvalue(��) : �� ���� ���� Ȯ��
				// map��.entryset() : �ش� ��Ʈ�� set�� ����
				// map��.get(Ű) : �ش� Ű�� ���� ȣ��
				// map��.isEmpty() : map�� ����ִ��� Ȯ��
				// map��.Keyset() : �ش� Ű�� set�� ����
				// map��.size() : map�� Ű�� ��
				
			//����
				// HashMap : ���Ͻ�����[����ȭx]
				// Hashtable : ��Ƽ������[����ȭ]
	
	public static void main(String[] args) {
			
			// p.729 Vector
				// ArraryList : ����ȭ x -- > ���Ͻ�����
				// Vector : ����ȭ o --> ��Ƽ������ ( ä�� �� ��Ƽ�̵�� ���α׷��ֿ� ��� )
				
		
				// ����Ʈ ����
				Vector<Board> boards = new Vector<>();
					// <���׸�?  : ����Ʈ �ȿ� �� �ڷ���
				
				//2. ����Ʈ ��ü �ֱ�
					// 2.1
				boards.add(new Board("����1", "����1", "�۾���1"));
					// 2.2
				Board board = new Board("����1", "����1", "�۾���1");
				boards.add(board);
				
				
				boards.add(new Board("����3", "����3", "�۾���3"));
				boards.add(new Board("����4", "����4", "�۾���4"));
				boards.add(new Board("����5", "����5", "�۾���5"));
				
				System.out.println(boards);
				boards.remove(2);
				boards.remove(3);
				//���
				for(Board temp : boards ) { // boards ���� Board �� ����ֱ⋚���� �����Ϸ��� Board Ÿ���� ������ �־���Ѵ�. ���ڱ� int�� �������� ����.
					//����Ʈ�� ��ü �ϳ��� ���ʿ� ����
					System.out.print(temp.subject);
					System.out.print(temp.content);
					System.out.print(temp.writer);
				}
				
			// p.729
					//ArrayList : �߰�, �˻����� [�ε����� ����ؼ� �˻��� ����]
					// Linkedlist : ����, ���� ����
				ArrayList<String> list1 = new ArrayList<>();
				LinkedList<String> list2 = new LinkedList<>();
				
				long startTime;
				long endTime;
				
				startTime = System.nanoTime();
				for(int i= 0; i < 10000; i++) {
					list1.add(0, String.valueOf(i));
				}
				endTime = System.nanoTime();
				System.out.println( "ArrayList�� 10000�� ���� �ð� : " + (endTime - startTime) + "ns");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
				startTime = System.nanoTime();
				//2. Linkedlist�� i�� 0�� �ε����� 10000�� ����
				for(int i= 0; i < 10000; i++) {
					list2.add(0, String.valueOf(i));
				}
				endTime = System.nanoTime();
				System.out.println( "Linkedlist�� 10000�� ���� �ð� : " + (endTime - startTime) + "ns");

	}

}
