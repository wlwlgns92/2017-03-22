package Day06;

public class Day06_4 {
	
	// p.235
	public static void main(String[] args) {
		//1. 객체 만들기[외부캘래스에서 사용시에는 무조건 객체를 만들라]
		
		Car5 myCar = new Car5("포르쉐");
		Car5 yourCar = new Car5("벤츠");
		
		//2.객체를 통한 메소드 호출
		myCar.run();
		yourCar.run();
		
		
	}
}
