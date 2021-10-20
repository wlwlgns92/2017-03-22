package Day13;

public class Day13_5_p600 {
		
	
	// ������ ����
		/* 1. Thread.sleep(�и��� [1000/1��] ) : �и��� ��ŭ �Ͻ������� �ٽ� ����
		 * 2. Thread.yield() : �ٸ� �����忡�� �纸 
		 * 3. Thread.join() : �ٸ� �������� ���Ḧ ��ٸ�
		 * 4. stop
		 */
		public static void main(String[] args) {
			
			ThreadA threadA = new ThreadA();
			ThreadB threadB = new ThreadB();
			threadA.start();
			threadB.start();
			
			// 3�ʰ� �Ͻ�����
			
			try {Thread.sleep(3000);} catch (Exception e) {	}
			
			threadA.work = false; // ������ A�� �纸 [ ������ A ����]
			
			try {Thread.sleep(3000);} catch (Exception e) {	}
			
			threadA.work=true;
			
			try {Thread.sleep(3000);} catch (Exception e) {	}
			threadA.work=true;
			threadB.work=true;
			
			//p.607
			
			SumThread sumThread = new SumThread();
			sumThread.start();
			
			
			
			// main �����尡 sum �����尡 ���������� ��ٸ�
			
			try {
				sumThread.join();} catch (Exception e) {}
			System.out.println("1~ 100�� �� : " + sumThread.getSum() );
			
			// p.613
			PrintThread1 printThread1 = new PrintThread1();
			printThread1.start();
			
			try {Thread.sleep(1000);} catch (Exception e) {	}
			
//			printThread1.setStop(true); // while�� true �־ ���ѷ��� ����
//			printThread1.stop();// �������� ���� : ��������
			
			printThread1.interrupt(); // ���ܸ� �߻����Ѽ� �ݺ��� Ż��
			
			
			
		}
}
