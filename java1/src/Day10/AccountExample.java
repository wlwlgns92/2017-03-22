package Day10;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		//�����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ� : "+ account.getBalance());
		//����ϱ�
		
		try {
		account.withdraw(30000); //�ش� �޼ҵ�� ���ܴ����� ���
		
		}catch (�ܰ���� e) {
			System.out.println(e.getMessage());
				// ���ܰ�ü.geMessage : ���� ����
			e.printStackTrace();
				// ���ܰ�ü.printStackTrace(); : ���� ���� [ ���� ��ġ ]
		}
	}

}
