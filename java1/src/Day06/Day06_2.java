package Day06;

public class Day06_2 {
	public static void main(String[] args) {
		Car3 car1 = new Car3();
		System.out.println("빈깡통");
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1 model : "+ car1.model);
		System.out.println();
		
		Car3 car2 = new Car3("자가용");
		System.out.println("2.2");
		System.out.println("car1.company : " + car2.company);
		System.out.println("car1 model : "+ car2.model);
		System.out.println("car1 model : "+ car2.color);
		System.out.println();
		
		Car3 car3 = new Car3("자가용", "빨강");
		System.out.println("2.3");
		System.out.println("car1.company : " + car3.company);
		System.out.println("car1 model : "+ car3.model);
		System.out.println("car1 model : "+ car3.color);
		System.out.println("car1 model : "+ car3.maxSpeed);
		System.out.println();
		
		Car3 car4 = new Car3("택시", "검정", 200);
		System.out.println("2.4");
		System.out.println("car1.company : " + car4.company);
		System.out.println("car1 model : "+ car4.model);
		System.out.println("car1 model : "+ car4.color);
		System.out.println("car1 model : "+ car4.maxSpeed);
	}
}
