package Day06;

import java.util.Scanner;

public class BankApplication { // p.277
	
	// ���������� : �ʵ峪 �޸� ��ȣ
				// public :���� ���� : ������Ʈ�� �������� ȣ��[���] ����
				// private : ������ ���� �پ : ���� ����[Ŭ����]������ ȣ�� ����
				// default[����] : ������ ��Ű�� �������� ȣ�� ����
				// protected : ������ ��Ű���������� ȣ�� ����
			//static : ���� ���� : ���α׷� ���� ���ݿ� ���� ������ ������ �����ȴ�.
			// main �޼ҵ�� ���� ���α׷� ���۽� �޸� �Ҵ�
			// ��� �޼ҵ忡 ���Ǵ� �ʵ忡 ���
			// <---> �������� : �����{}�ȿ����� ��� --> {]������ ������ �ʱ�ȭ
	//100�� ���°�ü�� ������ �� �ִ� �迭 ����
		// main�޼ҵ� �ۿ� ����� : main�޼ҵ� �� ��� �޼ҵ忡�� ȣ�� ����
	private static Account[] accountArray =new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("----------------------------------");
			System.out.println("����>"); int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) { 
				accountList();
			} else if (selectNo == 3 ) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
			
		}
		System.out.println("���α׷� ����");
	}
	//�޼ҵ� ����
	//���������� Ű���� ��ȯŸ�� �޼ҵ��(�Ű�����, �Ű�����2 ~~) {�����ڵ� ; return;}
	
	//���»����ϱ�	[�μ�x ��ȯx]
			//static ���ο��� ȣ���ϱ� ���� ��� [ �̻��� : main �ش� �޼ҵ� ��� �Ұ�]
	private static void createAccount() {
		//1. �Է¹��� ������ ������ ���� //�ۼ���ġ
		System.out.println("------------");
		System.out.println("���»���");
		System.out.println("------------");
		System.out.println();
		//1. �Է¹ޱ� => ������ ����
		System.out.print(">>���¹�ȣ : "); String ano = scanner.next();
		System.out.print(">>������ : "); String owner = scanner.next();
		System.out.print(">>�ʱ��Աݾ� : "); int balance = scanner.nextInt();
		
		
		//2. ��ü���� [ �Է¹��� �������� ��ü �����ڿ� �־ ��ü �����
		Account account = new Account(ano, owner, balance);
		
		//3. �迭�� ����[ �迭�� ������� ã�Ƽ� ����� �ε����� ��ü ����]
		for(int i=0; i<accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account; //i��° �ε����� ��ü �ֱ�
				System.out.println("���°� �����Ǿ����ϴ�.");
				break; // ���»����� �ݺ��� ����
			}
		}
			
	}
	//���¸�Ϻ��� [�μ�x ��ȯx]
	private static void accountList() {
		System.out.println("------------");
		System.out.println("���¸��");
		System.out.println("------------");
		//1. �迭�� ��� �ε����� ȣ��
		for(int i =0; i<accountArray.length; i++) {
			if(accountArray[i] == null ) break; 
			System.out.println(accountArray[i].getAno() + 
					"\t" + accountArray[i].getOwner() + 
					"\t" + accountArray[i].getBalance());//�ۼ� ��ġ
		}
	}
	//Account �迭���� ano�� ������ Account ��ü ã�� [�μ�o(String ano) ��ȯo (Account ��ü)]
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) { //i��° �ε����� ������ �ƴϸ鼭
				if(accountArray[i].getAno().equals(ano) ) {// i��°�� �ε����� ��ü�� ���¹�ȣ�� �μ�[�Է°���]�� ������ o
					account = accountArray[i]; // ã�� ��ü�� �ӽ� ��ü�� ����
					break;//�ۼ� ��ġ
				}
			}
		}
		return account; // ���࿡ ������ ���¹�ȣ�� ������ ��ü[ã����ü] ��ȯ ������ ���¹�ȣ�� ������ ��ü[null]��ȯ
	} 
	//�����ϱ� [�μ�x ��ȯx]
	private static void deposit() {
		System.out.println("------------");
		System.out.println("�����ϱ�");
		System.out.println("------------");
		//1.�Է¹ޱ�
		System.out.println(">>>���¹�ȣ : "); String ano =scanner.next();
		System.out.println(">>>���ݾ� : "); int balance = scanner.nextInt();
		//2.�Է¹��� ���¹�ȣ �����ϴ��� üũ�ϴ� �޼ҵ� ȣ��
		Account account = findAccount(ano);
		// findAccount ��ȯ : ã�� ��ü Ȥ�� null
		//3.
		if( account == null ) { //��ȯ�� null �ϰ��
			System.out.println("���°� �������� �ʽ��ϴ�.");
			return;//���� �޼ҵ� ���� ����
		}
		//4. 
		account.setBalance(account.getBalance()+balance);
									//�������ݾ� + �Է¹��� �Աݾ�
		//set �޼ҵ� : �ʵ忡 �� ���� �޼ҵ�
		//get �޼ҵ� : �ʵ忡 �� ȣ�� �޼ҵ�
		System.out.println("���ݵǾ����ϴ�.");
		
	}
	//����ϱ� [�μ�x ��ȯx]
	private static void withdraw() {
		System.out.println("------------");
		System.out.println("����ϱ�");
		System.out.println("------------");
		//1.�Է¹ޱ�
		System.out.println(">>>���¹�ȣ : "); String ano =scanner.next();
		System.out.println(">>>��ݾ� : "); int balance = scanner.nextInt();
		//2.�Է¹��� ���¹�ȣ �����ϴ��� üũ�ϴ� �޼ҵ� ȣ��
				Account account = findAccount(ano);
				// findAccount ��ȯ : ã�� ��ü Ȥ�� null
				//3.
				if( account == null ) { //��ȯ�� null �ϰ��
					System.out.println("���°� �������� �ʽ��ϴ�.");
					return;//���� �޼ҵ� ���� ����
				}if( account.getBalance()<balance) { // �ܾ׺���
					System.out.println("�ܾ��� �����մϴ�."); return;
				}
				//4. �������ݾ� - ��ݾ� 
				account.setBalance(account.getBalance()-balance);
						//private�� ����ؼ� set�� ���//�������ݾ� - �Է¹��� ��ݾ�
				//set �޼ҵ� : �ʵ忡 �� ���� �޼ҵ�
				//get �޼ҵ� : �ʵ忡 �� ȣ�� �޼ҵ�
				System.out.println("��ݵǾ����ϴ�.");
		
	}
	
	
}