package Day10;

public class Anonymous2 {

	// �ʵ� = > �͸�ü
	
	Veicle field = new Veicle() {
		
		@Override
		public void run() {
		System.out.println("�����Ű� �޸��ϴ�.");
		}
	}; // ������
	
	//�޼ҵ� �ȿ��� �͸� ���� ��ü
	void method1 () {
		Veicle localVar = new Veicle() {
			
			@Override
			public void run() {
			System.out.println("�¿����� �ޤ���ϴ�.");
			}
		};// ������
		localVar.run();
		
		// �Ű����� = > �޼ҵ忡 �͸� ���� ��ü�� ���� �ޱ�[�μ� = �Ű�����]
		
		}
	void method2(Veicle vehicle) {
		vehicle.run();
	}
}
