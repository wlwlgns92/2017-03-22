package Day09;

public class KumhoTire extends Tire{
	
	
	//������
	public KumhoTire(String locationint, int maxRotation) {
		super(locationint, maxRotation);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean roll() {
		++accmulatedRotation; //���� ȸ���� ����
		if(accmulatedRotation < maxRotation) { //�ִ�ȸ������ �� ũ��
			System.out.println(location + "Kumhotire ���� : "+ (maxRotation-accmulatedRotation) + "ȸ"); // ���� ���� ���
			return true; // true�� ������ ������ ǥ���ϴ� ��ȯ
		}else { //�ִ� ȸ������ �� ������
			System.out.println("***" + location + "Kumhotire ��ũ ***");
			return false; // ������ ������ ǥ���ϴ� ��ȯ
		}
	
	}
	
}
