package Day13;

public class Calculator {
		//스레드 동기화 메소드
			// 동기화 : 여러 스레드가 동일한 메소드 접근할때 먼저 접근한 메소드부터 처리 나머지는 대기를 시킨다.[하나씩 처리]
	
		private int memory;

		public int getMemory () {
			return memory;
		}
		
		public synchronized void setMemory(int memory) {
				// synchronized (동기화) : 우선 스레드가 끝날때까지 다른 스레드 대기 [ 순서 대기 ]
			this.memory =memory;
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		}
}
