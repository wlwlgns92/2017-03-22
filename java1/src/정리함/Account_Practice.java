package ������;

public class Account_Practice {
	
	//1.����
	private String ano;
	private String owner;
	private int balance;
	
	//2. ������
	public Account_Practice() {
	
	}

	public Account_Practice(String ano, String owner, int balance) {
		
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	
	//3. �޼ҵ�
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
	
	
	//3. �޼ҵ�
	
}
