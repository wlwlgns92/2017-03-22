package Day10;

public class SmartPhone extends Phone{
			// �߻�Ŭ���� : ��ӹ޾ƾ� �Ѵ�.
	// 1. ������
	public SmartPhone(String owner) {
		super(owner);
		// super() : ����Ŭ������ ������ ȣ��
	}
	
	public void internetSearch() {
		System.out.println(" ���ͳ� �˻��� �մϴ�.");
	}
	
}
