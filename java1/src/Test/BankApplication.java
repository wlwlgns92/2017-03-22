package Test;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner =  new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("-----------------------------------");
			System.out.println(">>>���� : "); int ch = scanner.nextInt();
			
			if(ch==1) {creatAccount(); } 
			else if(ch==2) {accountList(); } 
			else if(ch==3) { deposit();}
			else if(ch==4) { withdraw();}
			else if(ch==5) {run=false; }			
		}System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
	private static void creatAccount() {
		System.out.print("����Ͻ� ���¹�ȣ�� �Է��� �ּ��� : "); String ano = scanner.next();
		System.out.print("������ �Է��� �ּ��� : "); String owner = scanner.next();
		System.out.print("�ʱ⿹�ݾ��� �Է��� �ּ��� : "); int balance = scanner.nextInt();
		System.out.print(">>> ���� : ");
		
		Account account = new Account(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++ ) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("���°� �����Ǿ����ϴ�.");	
				break;
			}
		}
	}
	private static void accountList() {
		System.out.println("���¸��");
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] ==null) {break;}
			System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
			
		}
	}
	private static void deposit() {
		System.out.print("���¹�ȣ�� �Է����ּ��� : "); String ano = scanner.next();
		System.out.print("�Ա��Ͻ� �ݾ��� �Է����ּ��� : "); int balance = scanner.nextInt();
		
		Account account = findacAccount(ano);
		
			if(account==null) {
				System.out.println("��ϵ� ���¹�ȣ�� �����ϴ�.");
				return;
			}account.setBalance(account.getBalance()+balance);
			System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");

	}
	private static void withdraw() {
		System.out.print("���¹�ȣ�� �Է����ּ��� : "); String ano = scanner.next();
		System.out.print("����Ͻ� �ݾ��� �Է����ּ��� : "); int balance = scanner.nextInt();
		
		Account account = findacAccount(ano);
		
			if(account==null) {
				System.out.println("��ϵ� ���¹�ȣ�� �����ϴ�.");
				return;
			}account.setBalance(account.getBalance()-balance);
			System.out.println("����� �Ϸ�Ǿ����ϴ�.");
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
