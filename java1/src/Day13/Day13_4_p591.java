package Day13;

public class Day13_4_p591 {
	public static void main(String[] args) {
		//객체 생성
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start(); //start 실행시 run으로 간다
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
