package Day15;

import java.util.Iterator;
import java.util.TreeSet;

public class Day15_12 {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("ȫ�浹", 45));
		treeSet.add(new Person("���ڹ�", 25));
		treeSet.add(new Person("������", 31));
		
		//3. ���̱������� ��������
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
					// hasNext() : ���� ��ü�� �ִ��� Ȯ��
			Person person = iterator.next();
										// next();
			System.out.println(person.name + "\t" + person.age);
			
		}
		for( Person person : treeSet) {
			System.out.println( person.name + " \t "+ person.age);
		}
	}
	
	
	
}
