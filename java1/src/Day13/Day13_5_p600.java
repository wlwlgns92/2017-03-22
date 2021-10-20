package Day13;

public class Day13_5_p600 {
		
	
	// 스레드 제어
		/* 1. Thread.sleep(밀리초 [1000/1초] ) : 밀리초 만큼 일시정지후 다시 실행
		 * 2. Thread.yield() : 다른 스레드에게 양보 
		 * 3. Thread.join() : 다른 스레드의 종료를 기다림
		 * 4. stop
		 */
		public static void main(String[] args) {
			
			ThreadA threadA = new ThreadA();
			ThreadB threadB = new ThreadB();
			threadA.start();
			threadB.start();
			
			// 3초간 일시정지
			
			try {Thread.sleep(3000);} catch (Exception e) {	}
			
			threadA.work = false; // 스레드 A가 양보 [ 스레드 A 실행]
			
			try {Thread.sleep(3000);} catch (Exception e) {	}
			
			threadA.work=true;
			
			try {Thread.sleep(3000);} catch (Exception e) {	}
			threadA.work=true;
			threadB.work=true;
			
			//p.607
			
			SumThread sumThread = new SumThread();
			sumThread.start();
			
			
			
			// main 스레드가 sum 스레드가 끝날떄까지 기다림
			
			try {
				sumThread.join();} catch (Exception e) {}
			System.out.println("1~ 100의 합 : " + sumThread.getSum() );
			
			// p.613
			PrintThread1 printThread1 = new PrintThread1();
			printThread1.start();
			
			try {Thread.sleep(1000);} catch (Exception e) {	}
			
//			printThread1.setStop(true); // while에 true 넣어서 무한루프 종료
//			printThread1.stop();// 권장하지 않음 : 강제종료
			
			printThread1.interrupt(); // 예외를 발생시켜서 반복문 탈출
			
			
			
		}
}
