package 과제;

public class Music extends Thread {
	
	static boolean stop = true;
	
	public static void musicstop(boolean sw) { // boolean 타입의 변수 sw를 인수로 받아오는 메소드
		
		stop = sw; // stop변수에 인수로 받아온 sw값 대입
		if(stop) { System.out.println("음악실행한다."); } // stop이 true면 음악실행
		else { System.out.println("음악종료한다."); }	 // 아니면 종료
	}
	
	@Override
	public void run() {
		while(stop) { // stop이 true일 경우에 무한반복
			System.out.println("음악재생중"); 
			try {
				Thread.sleep(1000); // 쓰레드 1초간 일시정지	
			} catch (Exception e) {}
			
		}
	}
}
