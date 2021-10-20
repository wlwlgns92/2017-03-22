package 정리함;

public class 강아지 extends Thread {
	
	
	
	public 강아지() {
		super.setName("강아지소리");
	}
	
	
	@Override
	public void run() {
	for(int i = 0; i < 5; i++) {
		try {Thread.sleep(1000);} catch (Exception e) {	}
		System.out.println("멍멍"+i);
	}	
	}

}
