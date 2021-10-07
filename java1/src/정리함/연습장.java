package 정리함;

import java.util.Scanner;

public class 연습장 {
	// 100개 계좌객체를 저장할수 있는 배열 선언
	// main메소드 밖에 선언시 : main메소드 외 모든 메소드에서 호출 가능 
	private static Account_Practice[] accountArray = new Account_Practice[100];
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------");
			System.out.print("선택> : "); int selectNo = scanner.nextInt();
			System.out.println();
			
			if(selectNo == 1) { createAccount(); }
			else if (selectNo == 2) { accountList(); }
			else if (selectNo == 3) { deposit();}
			else if (selectNo == 4) {withdraw(); }
			else if (selectNo == 5) { run=false;} 
		}
			System.out.println("프로그램 종료");
			System.out.println();
	}	
	//계좌생성
	private static void createAccount() {
		System.out.println("--------------------");
		System.out.println("계좌생성");
		System.out.println("--------------------");
		
		//입력받기 
		System.out.print("생성하실 계좌번호를 입력하세요 : "); String ano = scanner.next();
		System.out.print("계좌를 생성하시는 본인 성함을 적어주세요 : "); String owner = scanner.next();
		System.out.print("초기 입금액을 입력해 주세요 : "); int balance = scanner.nextInt();
		
		Account_Practice account = new Account_Practice(ano, owner, balance);
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("계좌가 생성되었습니다.");
				break; //계좌생성완료시 반복문 종료
			}
		}
	}
	//계좌목록
	private static void accountList() {
		System.out.println("--------------------");
		System.out.println("계좌목록");
		System.out.println("--------------------");
		
		//1 배열내 모든 인덱스 호출
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] ==null) break;
			System.out.println(accountArray[i].getAno() + "\t" 
			+ accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
		
	}
	// Account 배열에서 ano와 동일한 Account객체찾기 메소드 [ 인수o( String ano ) 반환o ( Account 객체 ) 
	private static Account_Practice findAccount( String ano ) {
		Account_Practice account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano)) {
				account = accountArray[i];
				break;
				}
			}
		}
		return account;
	}
	//예금하기
	private static void deposit() {
		System.out.println("--------------------");
		System.out.println("예금하기");
		System.out.println("--------------------");
		
		System.out.println("계좌번호를 입력해주세요 : "); String ano = scanner.next();
		System.out.println("입금하실 금액을 입력해 주세요 : "); int balance = scanner.nextInt();
		
		Account_Practice account = findAccount(ano);
		
		if(account == null) {
			System.out.println("일치하는 계좌가 없습니다. ");
			return;
		}
		account.setBalance(account.getBalance() + balance);
		System.out.println("결과 : 예금이 성공되었습니다.");
		
	}
	//출금하기
	private static void withdraw() {
		System.out.println("--------------------");
		System.out.println("출금하기");
		System.out.println("--------------------");
		
		System.out.println("계좌번호를 입력해주세요 : "); String ano = scanner.next();
		System.out.println("출금하실 금액을 입력해 주세요 : "); int balance = scanner.nextInt();
		
		Account_Practice account = findAccount(ano);
		
		if(account == null) {
			System.out.println("일치하는 계좌가 없습니다. ");
			return;
		}
		account.setBalance(account.getBalance() - balance);
		System.out.println("결과 : 출금이 성공되었습니다.");
		
	}
} 

