package 과제Bank;

public class Bank implements ATM{

	@Override
	public void 계좌등록() {
		System.out.println("계좌를 등록합니다.");
	}

	@Override
	public void 예금() {
		System.out.println("예금합니다.");
	}

	@Override
	public void 출금() {
		System.out.println("출금합니다.");
	}

	@Override
	public void 이체() {
		System.out.println("이체합니다.");
	}

	@Override
	public void 잔고() {
		System.out.println("잔액입니다.");
	}


}
