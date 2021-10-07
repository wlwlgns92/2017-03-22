package Day06;

public class Car3 {
		
	//1. 필드
	String company ="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//2. 생성자 : 서로 다른 인수를 갖는 생성자 여러개 선언 가능
	
	//2.1 :빈생성자 : 필드를 받지 않음
	public Car3() {
		}
	//2.2
	public Car3(String model) {
		this.model =model;
	}
	
	//2.3 메소드
	public Car3(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
