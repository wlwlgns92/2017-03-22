package Day13;

public class Calculator {
		//������ ����ȭ �޼ҵ�
			// ����ȭ : ���� �����尡 ������ �޼ҵ� �����Ҷ� ���� ������ �޼ҵ���� ó�� �������� ��⸦ ��Ų��.[�ϳ��� ó��]
	
		private int memory;

		public int getMemory () {
			return memory;
		}
		
		public synchronized void setMemory(int memory) {
				// synchronized (����ȭ) : �켱 �����尡 ���������� �ٸ� ������ ��� [ ���� ��� ]
			this.memory =memory;
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		}
}
