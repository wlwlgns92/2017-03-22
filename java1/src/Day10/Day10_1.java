package Day10;

public class Day10_1 {
	//Ȯ�ι��� 3��
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void dbwork( DataAccessObject dao) {
		dao.intsert();
		dao.select();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
	printSound(new Cat());
	printSound(new Dog());
	
	dbwork(new OracleDao());
	dbwork(new MySqlDao());
	
	// �͸� ���� ��ü
	// �������̽��� ������ = new �������̽���(){ ����}
	//p.387 ����5
	
//	Action action = new Action() {
//		@Override
//		public void work() {
//			System.out.println("���縦 �մϴ�.");	
//		}
//		
//	}// ������
//	action.work();
	}
	
}
