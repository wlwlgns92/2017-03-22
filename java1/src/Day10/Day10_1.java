package Day10;

public class Day10_1 {
	//확인문제 3번
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
	
	// 익명 구현 객체
	// 인터페이스명 변수명 = new 인터페이스명(){ 구현}
	//p.387 문제5
	
//	Action action = new Action() {
//		@Override
//		public void work() {
//			System.out.println("복사를 합니다.");	
//		}
//		
//	}// 구현끝
//	action.work();
	}
	
}
