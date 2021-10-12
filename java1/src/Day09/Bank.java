package Day09;

public class Bank implements ATM {
	// 필드
	String 계좌번호;
	int 예금액;
	
	// 생성자x
	
	
	
	// 메소드
	@Override
	public void 계좌등록() {
		System.out.println("---- 계좌등록 ----");
		
	}
	@Override
	public void 예금() {
		System.out.println("---- 예금 ----");
		
	}
	@Override
	public void 출금() {
		System.out.println("---- 출금 ----");
		
	}
	@Override
	public void 잔고() {
		System.out.println("---- 잔고확인 ----");
		
	}
	

	
	
	
	
	
}
