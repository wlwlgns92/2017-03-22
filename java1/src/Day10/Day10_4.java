package Day10;

public class Day10_4 {
		public static void main(String[] args) {
		
			// p.417 : Ȯ�ι���
			
			// 1. 4 [���� ��� Ŭ���� ���ο��� �ٱ� Ŭ������ ���� ������ ��밡��]
				// ���� static [ static ��������� ���ٰ���]
			// 2. 3 [����Ŭ������ static ���Ұ�/�޼ҵ� �ȿ��ֱ� ������]
				// ���� Ŭ���� : �޼ҵ� �ȿ��� ����� Ŭ����
				// �ν��Ͻ� Ŭ���� , ���� Ŭ������ �ٱ�Ŭ������ ��� ��� ����
			// 3. �͸�ü : ��ȸ��
				// �͸� ��ü�� �����ڸ� ������ �� ����. : ��ȸ��.
			// 4.
				// static �� ������ ���� ������ �ν��Ͻ�
				// Tire : �ν��Ͻ� Ŭ����  Car.Tire tire = myCar.new Tire();
				// Engine : ���� Ŭ����	Car.Engine engine = new Car.Engine();
			// 5. 
			Anonymous2 anonymous2 = new Anonymous2();
			anonymous2.field.run();
			anonymous2.method1();
			anonymous2.method2(new Veicle() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
				}
			});
			
			
			// 6. ��øŬ���� �ȿ��� ���Ǵ� 
		}
}
