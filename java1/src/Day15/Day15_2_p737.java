package Day15;

import java.util.HashSet;
import java.util.Iterator;

public class Day15_2_p737 {

	public static void main(String[] args) {
		
		//p.737 : HashSet
		
		// 1. set 객체 생성 [ set 객체에 넣을 자료형을 제네릭에 넣기 ]
		HashSet<String> set = new HashSet<>();
		
		// 2. set 객체 넣기 [중복 허용x , 순서x]
		set.add("java"); set.add("jdbc"); set.add("servlet/jsp"); set.add("ibatis"); set.add("java");
		
		// 3. set 출력 [출력순서는 없음]
		System.out.println(set);
		System.out.println(set.size());
		
		// iterator 인터페이스를 이요한 set내 객체 호출 [ 인덱스가 존재하지 않기 떄문에 ]
			// iterator : set내 객체 하나씩 순회하는 반복자
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
					// .hasNext() : 다음 객체가 존재하면 true 없으면 false
			String element = iterator.next(); // 다음 객체 가져오기
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
