package Day15;

import java.util.HashSet;
import java.util.Iterator;

public class Day15_2_p737 {

	public static void main(String[] args) {
		
		//p.737 : HashSet
		
		// 1. set ��ü ���� [ set ��ü�� ���� �ڷ����� ���׸��� �ֱ� ]
		HashSet<String> set = new HashSet<>();
		
		// 2. set ��ü �ֱ� [�ߺ� ���x , ����x]
		set.add("java"); set.add("jdbc"); set.add("servlet/jsp"); set.add("ibatis"); set.add("java");
		
		// 3. set ��� [��¼����� ����]
		System.out.println(set);
		System.out.println(set.size());
		
		// iterator �������̽��� �̿��� set�� ��ü ȣ�� [ �ε����� �������� �ʱ� ������ ]
			// iterator : set�� ��ü �ϳ��� ��ȸ�ϴ� �ݺ���
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
					// .hasNext() : ���� ��ü�� �����ϸ� true ������ false
			String element = iterator.next(); // ���� ��ü ��������
			System.out.println("\t"+ element);
		}
		
		for( String temp : set) {
			System.out.println(temp);
		}
		
		set.remove("jdbc");
		set.remove("ibatis");
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
	}
}
