package Test;

public class Parent {
	
	public String nation;
	
	public Parent() {
		this("���ѹα�");// ���� Ŭ������ ������
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
