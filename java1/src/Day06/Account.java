package Day06;

public class Account { //���� ������ ����
	
	//1. ����
	//[private] �ʵ� ��ȣ�� ���� ����������
		//	����Ŭ������������ ��밡��
		//	�ܺη� ���� �Ұ� [�������� : get , set �޼ҵ�]
	private String ano; //���¹�ȣ
	private String owner; //������
	private int balance; // ���ݾ�
	
	//2. ������
		// tip �ڵ��ϼ� ���콺 ������ -> source -> -> using fields
			//����Ű alt + shift +S
	
	public Account(String ano, String owner, int balance) {
		this.ano=ano;
		this.owner=owner;
		this.balance=balance;
	}
	public Account() {
		}
	
	//3. �޼ҵ�
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner() {return owner;}
	public  void setOwner(String owner) {this.owner= owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
}
