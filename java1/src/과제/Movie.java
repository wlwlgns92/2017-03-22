package 과제;

public class Movie extends Thread {
	
	static boolean stop = true; // stop 변수안에 true값 대입
	
	public static void moviestop(boolean sw) { // boolean 타입의 sw를 인수로 받음
		
		stop = sw; // stop변수에 인수로 받은 sw값 대입
		if(stop) { System.out.println("영화 시작한다."); } // stop이 true면
		else { System.out.println("영화 종료"); } // 아니면
	}
	
	@Override
	public void run() {
		while(stop) { // stop이 true면 무한반복
			System.out.println("영화 실행중");
			try {
				Thread.sleep(1000); // Thread.sleep 정적메소드, 일시정지 시킴, 1000은 1초  : 1초간 스레드 일시정지
			} catch (Exception e) {}
		}
	}
}
