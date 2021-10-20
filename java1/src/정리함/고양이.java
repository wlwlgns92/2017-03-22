package 정리함;

public class 고양이 extends Thread {
	
	
public 고양이() {
	super.setName("고양이소리");
}	
	
	@Override
	public void run() {
	for(int i = 0; i < 5; i++) {
		try {Thread.sleep(1000);} catch (Exception e) {	}
		System.out.println("야옹" + i);
	}	
	}
}
