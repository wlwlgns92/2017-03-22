package Test;

public class Movie extends Thread{

	static boolean stop = true;
	
	public static void moviestop(boolean sw) {
		stop = sw;
		if(stop) { System.out.println("영화 재생한다."); }
		else { System.out.println("영화 종료"); }
	}
	
	@Override
	public void run() {
		while(stop) {
			System.out.println("영화 재생중");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}
