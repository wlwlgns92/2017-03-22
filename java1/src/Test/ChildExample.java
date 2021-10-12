package Test;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
	}
}
// 부모로 부터 상속받은 자식 객체 생성식 == 부모 클래스 생성자 먼저 실행
//1. 부모 생성자 실행 --> 부모 생성자(String nation) --> 자식()-> 자식(String name) 