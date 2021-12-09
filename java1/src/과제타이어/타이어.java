package 과제타이어;


public class 타이어 { // 실행 클래스
	public static void main(String[] args) { // 1차시기
		//교체시 초기값 15
		
		Car car = new Car();
		
		for(int i = 0; i<=5; i++) {
			int 반환값 = car.run();
			
			switch (반환값) {
			case 1:
				System.out.println("앞왼쪽 금호타이어로 교체합니니다.");
				car.flt = new Kumhotire(15, "앞왼쪽");
				break;

			case 2:
				System.out.println("앞오른쪽 한국타이어로 교체합니다");
				car.frt = new Hankooktire(15, "앞오른쪽");
				break;
			case 3:
				System.out.println("뒤왼쪽 금호타이어로 교체합니다.");
				car.blt = new Kumhotire(15, "앞왼쪽");
				break;
			case 4:
				System.out.println("뒤오른쪽 한국타이어로 교체합니다.");
				car.brt = new Hankooktire(15, "뒤오른쪽");
				break;
			}
			
			
		}
		
	}
}
