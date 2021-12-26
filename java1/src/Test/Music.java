package Test;

public class Music extends Thread{

	static boolean stop = true;
	
	public static void musicstop(boolean sw) {
		stop = sw;
		if(stop) { System.out.println("음악 재생한다."); }
		else { System.out.println("음악 종료"); }
	}
	
	@Override
	public void run() {
		while(stop) {
			System.out.println("음악 재생중");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}
