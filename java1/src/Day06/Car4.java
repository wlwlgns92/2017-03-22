package Day06;

public class Car4 {
	
	
	
	//필드
	int gas;
	
	//생성자
	
	
	//메소드
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas값이 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while (true) {
			if(gas >0) {
				System.out.println("달립니다. (gas잔량 : " + gas + ")");
				gas-=1;
			}else {
				System.out.println("멈춥니다 .(gas잔량:"+gas+")");
				return;
			}
		}
	}
	// 메소드 오버로딩 : 메소드명이 동일할 경우 인수 구분[타입,개수,순서]
	//void run() {} x
	//void run(int) {} o
	//내부 클래스 호출
	void start() {
		run();
	}
}
