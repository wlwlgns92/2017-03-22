package Day14_p666;

public class Course<T> {
	
	//필드
	private String name;
	private T[] student;
	
	
	//생성자
	public Course(String name, int capacity) {
		this.name = name;
		student = (T[]) (new Object[capacity]);
				//제네릭 자체적으로 new 연산자 불가
				// 최상위 부모인 Object로 배열 선언후 제네릭으로 형변환
	}


	public String getName() {
		return name;
	}
	public T[] getStudent() {
		return student;
	}
	public void add(T t) {
		for(int i=0; i<student.length; i++) {
			if(student[i]==null) {
				student[i]=t;
				break;
			}
		}
	}
	
	
}
