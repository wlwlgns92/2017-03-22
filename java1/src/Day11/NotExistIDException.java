package Day11;

public class NotExistIDException extends Exception {
	//�ʵ�
	
	
	//������ : Ŭ������� ������ �޼ҵ�
	//�������
	public NotExistIDException () { }
	
	// �μ��� �ִ»�����
	public NotExistIDException(String message) {
		super(message); //����Ŭ�������� �޽��� ������
		// super() : �θ��� ������
		// super.�ʵ� : super.�޼ҵ�
	}
}
