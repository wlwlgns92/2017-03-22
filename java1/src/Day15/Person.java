package Day15;

public class Person implements Comparable<Person> {
									// Comparable<> 정렬
	//필드
	String name;
	int age;
	
	//생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
//	//오름차순
//	@Override
//	public int compareTo(Person o) {
//	
//	if (age < o.age)return -1;
//	else if ( age == o.age) return 0;
//	else return 1;
//	}
	
	
	//내림차순
	@Override
	public int compareTo(Person o) {
	
	if (age < o.age)return 1;
	else if ( age == o.age) return 0;
	else return -1;
	}
	
}
