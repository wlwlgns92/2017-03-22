package Day09;

public class HankookTire extends Tire {
	//�ʵ�
	
	
	
	//������
	public HankookTire(String locationint, int maxRotation) {
		super(locationint, maxRotation);
		
	}
	
	//�޼ҵ� 
	//�������̵� : �޼ҵ� ������ [�޼ҵ� ���빰 �ٲٱ�]
	@Override
	public boolean roll() {
		++accmulatedRotation; //���� ȸ���� ����
		if(accmulatedRotation < maxRotation) { //�ִ�ȸ������ �� ũ��
			System.out.println(location + "Hankooktire ���� : "+ (maxRotation-accmulatedRotation) + "ȸ"); // ���� ���� ���
			return true; // true�� ������ ������ ǥ���ϴ� ��ȯ
		}else { //�ִ� ȸ������ �� ������
			System.out.println("***" + location + "Hankooktire ��ũ ***");
			return false; // ������ ������ ǥ���ϴ� ��ȯ
		}
	}
	
	
}
