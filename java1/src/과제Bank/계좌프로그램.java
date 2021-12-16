package 과제Bank;

public class 계좌프로그램 {
	// 계좌 프로그램 [ 상속 , 인터페이스 ]
			// ATM [인터페이스] 
				// 추상메소드 : 계좌등록 , 예금 , 출금 , 이체 , 잔고 
			// 1. 은행[슈퍼클래스]
					// 필드(속성) : 계좌번호 , 예금액 
			// 2. 국민은행[서브클래스]
			// 3. 신한은행[서브클래스]
	// 3차시기 
	
	public static Bank[] banks = new Bank[100];
	public static void main(String[] args) {
		ATM atm = new 국민은행();
		
		atm.계좌등록();
		atm.예금();
		atm.이체();
		atm.잔고();
		atm.출금();
		
		atm = new 신한은행();
		
		atm.계좌등록();
		
		Bank account1 = new Bank();
		banks[0] = account1;
		System.out.println(banks[0]);
		
		국민은행 account2 = new 국민은행();
		banks[1] = account2;
		System.out.println(banks[1]);
		
		신한은행 account3 = new 신한은행();
		banks[2] = account3;
		System.out.println(banks[2]);
	}
}
