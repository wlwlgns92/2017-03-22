package 과제타이어;

public class Car { // 1차시기 
	// 타이어 초기값 6,2,3,4
	Tire flt = new Tire(6, "앞왼쪽");
	Tire frt = new Tire(2, "앞오른쪽");
	Tire blt = new Tire(3, "뒤왼쪽");
	Tire brt = new Tire(4, "뒤오른쪽");
	
	int run() {
		
		if(flt.roll() == false) {stop(); return 1; }
		if(frt.roll() == false) {stop(); return 2; }
		if(blt.roll() == false) {stop(); return 3; }
		if(brt.roll() == false) {stop(); return 4; }
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
}
