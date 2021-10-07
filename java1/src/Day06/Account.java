package Day06;

public class Account { //계좌 설계라고 생각
	
	//1. 설계
	//[private] 필드 보호를 위한 접근제한자
		//	현재클래스내에서만 사용가능
		//	외부로 접근 불가 [간접접근 : get , set 메소드]
	private String ano; //계좌번호
	private String owner; //계좌주
	private int balance; // 예금액
	
	//2. 생성자
		// tip 자동완성 마우스 오른쪽 -> source -> -> using fields
			//단축키 alt + shift +S
	
	public Account(String ano, String owner, int balance) {
		this.ano=ano;
		this.owner=owner;
		this.balance=balance;
	}
	public Account() {
		}
	
	//3. 메소드
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner() {return owner;}
	public  void setOwner(String owner) {this.owner= owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
}
