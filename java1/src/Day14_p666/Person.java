package Day14_p666;

public class Person {
	
	//필드
	private String name;
	private int age;
	
	//생성자
	public Person(String name) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
	
		return this.name;
	}

	
	//메소드
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
