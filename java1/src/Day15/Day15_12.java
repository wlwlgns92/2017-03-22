package Day15;

import java.util.Iterator;
import java.util.TreeSet;

public class Day15_12 {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("홍길돌", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		//3. 나이기준으로 오름차순
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
					// hasNext() : 다음 객체가 있는지 확인
			Person person = iterator.next();
										// next();
			System.out.println(person.name + "\t" + person.age);
			
		}
		for( Person person : treeSet) {
			System.out.println( person.name + " \t "+ person.age);
		}
	}
	
	
	
}
