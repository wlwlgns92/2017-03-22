package Day11;

import java.util.Arrays;

public class Member3 implements Cloneable {

	//�ʵ�
	public String name; 
	public int age;
	public int[] scores;
	public Car car;
	
	
	//������
	public Member3(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	
	//�޼ҵ�
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//1. �������縦 ���� name �� age ����
		
		Member3 cloned = (Member3)super.clone();
		//2. ��������
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
					// Arrays.copyof(�������, ����������)
		//3. rlvdmsqhrwp
		cloned.car = new Car(this.car.model);
		
		return cloned;
	}
	public Member3 getMember3() { 
		Member3 cloned =null; // �� ���� ����
			try {
				cloned = (Member3)clone(); // �Ϲݿ��� �߻�
					//�ش�޼ҵ带 ȣ���� ��ü�� ����
					// clone(); ���� Cloneable �������̽� ����!
			} catch (CloneNotSupportedException e) {}
			return cloned;
		}
	@Override
	public String toString() {
		System.out.println("name : "+ this.name);
		System.out.println("password : "+ this.age);
		System.out.println("age : "+ this.scores);
		System.out.println("adult : "+ this.car.model);
		return "";
	}
	
}
