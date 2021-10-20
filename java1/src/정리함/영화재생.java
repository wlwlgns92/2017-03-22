package 정리함;

public class 영화재생 extends Thread{
public static boolean stop = true;
	
	public static void moviestop (boolean sw) {
		stop=sw;
		if(stop) {System.out.println("영화시작");	}
		else {System.out.println("영화종료");}
	}

	@Override
	public void run() {
	while(stop) { // stop이 true인 경우에만 실행 // 아니면 실행 ㄴㄴ
		try {Thread.sleep(1000);} catch (Exception e) {	}
		System.out.println("영화재생");

	}
	}
}
