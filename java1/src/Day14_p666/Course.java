package Day14_p666;

public class Course<T> {
	
	//�ʵ�
	private String name;
	private T[] student;
	
	
	//������
	public Course(String name, int capacity) {
		this.name = name;
		student = (T[]) (new Object[capacity]);
				//���׸� ��ü������ new ������ �Ұ�
				// �ֻ��� �θ��� Object�� �迭 ������ ���׸����� ����ȯ
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
