package Test;

public class second extends Thread {
	static boolean stop = true;

	public static void start(boolean sw2) {
		stop = sw2;
		if (stop) {
			System.out.println("두번째 인덕션이 작동합니다.");
		} else {
			System.out.println("두번째 인덕션을 끕니다.");
		}
	}

	@Override
	public void run() {
		while (stop) {
			System.out.println("두번째 인덕션 가열중");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

}
