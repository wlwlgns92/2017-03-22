package Test;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner =  new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------");
			System.out.println(">>>선택 : "); int ch = scanner.nextInt();
			
			if(ch==1) {creatAccount(); } 
			else if(ch==2) {accountList(); } 
			else if(ch==3) { deposit();}
			else if(ch==4) { withdraw();}
			else if(ch==5) {run=false; }			
		}System.out.println("프로그램이 종료되었습니다.");
	}
	private static void creatAccount() {
		System.out.print("사용하실 계좌번호를 입력해 주세요 : "); String ano = scanner.next();
		System.out.print("성함을 입력해 주세요 : "); String owner = scanner.next();
		System.out.print("초기예금액을 입력해 주세요 : "); int balance = scanner.nextInt();
		System.out.print(">>> 선택 : ");
		
		Account account = new Account(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++ ) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("계좌가 생성되었습니다.");	
				break;
			}
		}
	}
	private static void accountList() {
		System.out.println("계좌목록");
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] ==null) {break;}
			System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
			
		}
	}
	private static void deposit() {
		System.out.print("계좌번호를 입력해주세요 : "); String ano = scanner.next();
		System.out.print("입금하실 금액을 입력해주세요 : "); int balance = scanner.nextInt();
		
		Account account = findacAccount(ano);
		
			if(account==null) {
				System.out.println("등록된 계좌번호가 없습니다.");
				return;
			}account.setBalance(account.getBalance()+balance);
			System.out.println("입금이 완료되었습니다.");

	}
	private static void withdraw() {
		System.out.print("계좌번호를 입력해주세요 : "); String ano = scanner.next();
		System.out.print("출금하실 금액을 입력해주세요 : "); int balance = scanner.nextInt();
		
		Account account = findacAccount(ano);
		
			if(account==null) {
				System.out.println("등록된 계좌번호가 없습니다.");
				return;
			}account.setBalance(account.getBalance()-balance);
			System.out.println("출금이 완료되었습니다.");
	}
	private static Account findacAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano)) {
					account=accountArray[i];
					break;
				}
			}
		}return account;
		
	}
}
