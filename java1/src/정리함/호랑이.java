package Á¤¸®ÇÔ;

public class È£¶ûÀÌ extends Thread{

	
	public È£¶ûÀÌ() {
	super.setName("È£¶ûÀÌ¼Ò¸®");
	}
	
	@Override
	public void run() {
	for(int i = 0; i < 5; i++) {
		try {Thread.sleep(1000);} catch (Exception e) {	}
		System.out.println("¾îÈï"+i);
	}	
	}
}
