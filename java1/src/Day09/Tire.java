package Day09;

public class Tire {
	//�ʵ�
	public int maxRotation; //�ִ� ȸ����(Ÿ�̾� ����)
	public int accmulatedRotation; //���� ȸ����
	public String location; // Ÿ�̾� ��ġ
	
	//������ : ��ü �ʱⰪ
	public Tire( String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	//�޼ҵ�
	public boolean roll() {
		++accmulatedRotation; //���� ȸ���� ����
		if(accmulatedRotation < maxRotation) { //�ִ�ȸ������ �� ũ��
			System.out.println(location + "tire : "+ (maxRotation-accmulatedRotation) + "ȸ"); // ���� ���� ���
			return true; // true�� ������ ������ ǥ���ϴ� ��ȯ
		}else { //�ִ� ȸ������ �� ������
			System.out.println("***" + location + "tire ��ũ ***");
			return false; // ������ ������ ǥ���ϴ� ��ȯ
		}
	}


}
