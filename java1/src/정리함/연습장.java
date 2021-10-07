package ������;

import java.util.Scanner;

public class ������ {
	// 100�� ���°�ü�� �����Ҽ� �ִ� �迭 ����
	// main�޼ҵ� �ۿ� ����� : main�޼ҵ� �� ��� �޼ҵ忡�� ȣ�� ���� 
	private static Account_Practice[] accountArray = new Account_Practice[100];
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("---------------------------");
			System.out.print("����> : "); int selectNo = scanner.nextInt();
			System.out.println();
			
			if(selectNo == 1) { createAccount(); }
			else if (selectNo == 2) { accountList(); }
			else if (selectNo == 3) { deposit();}
			else if (selectNo == 4) {withdraw(); }
			else if (selectNo == 5) { run=false;} 
		}
			System.out.println("���α׷� ����");
			System.out.println();
	}	
	//���»���
	private static void createAccount() {
		System.out.println("--------------------");
		System.out.println("���»���");
		System.out.println("--------------------");
		
		//�Է¹ޱ� 
		System.out.print("�����Ͻ� ���¹�ȣ�� �Է��ϼ��� : "); String ano = scanner.next();
		System.out.print("���¸� �����Ͻô� ���� ������ �����ּ��� : "); String owner = scanner.next();
		System.out.print("�ʱ� �Աݾ��� �Է��� �ּ��� : "); int balance = scanner.nextInt();
		
		Account_Practice account = new Account_Practice(ano, owner, balance);
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("���°� �����Ǿ����ϴ�.");
				break; //���»����Ϸ�� �ݺ��� ����
			}
		}
	}
	//���¸��
	private static void accountList() {
		System.out.println("--------------------");
		System.out.println("���¸��");
		System.out.println("--------------------");
		
		//1 �迭�� ��� �ε��� ȣ��
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] ==null) break;
			System.out.println(accountArray[i].getAno() + "\t" 
			+ accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
		
	}
	// Account �迭���� ano�� ������ Account��üã�� �޼ҵ� [ �μ�o( String ano ) ��ȯo ( Account ��ü ) 
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
	//�����ϱ�
	private static void deposit() {
		System.out.println("--------------------");
		System.out.println("�����ϱ�");
		System.out.println("--------------------");
		
		System.out.println("���¹�ȣ�� �Է����ּ��� : "); String ano = scanner.next();
		System.out.println("�Ա��Ͻ� �ݾ��� �Է��� �ּ��� : "); int balance = scanner.nextInt();
		
		Account_Practice account = findAccount(ano);
		
		if(account == null) {
			System.out.println("��ġ�ϴ� ���°� �����ϴ�. ");
			return;
		}
		account.setBalance(account.getBalance() + balance);
		System.out.println("��� : ������ �����Ǿ����ϴ�.");
		
	}
	//����ϱ�
	private static void withdraw() {
		System.out.println("--------------------");
		System.out.println("����ϱ�");
		System.out.println("--------------------");
		
		System.out.println("���¹�ȣ�� �Է����ּ��� : "); String ano = scanner.next();
		System.out.println("����Ͻ� �ݾ��� �Է��� �ּ��� : "); int balance = scanner.nextInt();
		
		Account_Practice account = findAccount(ano);
		
		if(account == null) {
			System.out.println("��ġ�ϴ� ���°� �����ϴ�. ");
			return;
		}
		account.setBalance(account.getBalance() - balance);
		System.out.println("��� : ����� �����Ǿ����ϴ�.");
		
	}
} 

