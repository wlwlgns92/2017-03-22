package Day08;

public class DmbCellPhone extends CellPhone {
					//extends : �����ϴ� // ��� 1��.
	//�ڵ��� �⺻��� = > CellPhone
	//�ʵ�
	int channel;
	
	//������
	public DmbCellPhone(String model, String color, int channel) {
		
		//�θ� Ŭ������ �����ڰ� ������ = > super(); Ű��͵带 ����� �θ�Ŭ���� �� ������ ȣ��
		super(model, color);// �θ�Ŭ������ ������ ȣ��
		
		//�θ�Ŭ������ �����ڰ� ������
		// this : ���� Ŭ������ ���
//		this.model=model;
//		this.color=color;
		this.channel = channel;
	}




	//�޼ҵ�
	void turmOnDmb() { System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�."); }
	void changeChannelDmb(int channel) {
		this.channel=channel;
		//this.channel : �Ķ��� : ����Ŭ������ ���
		// channel : �߰��� : �޼ҵ忡 �ܺηκ��� ���� ���� [�μ�]
		System.out.println("ä��" + channel + "������ �ٲߴϴ�.");
	}
	void trunOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
	
	// �������̵� // ������ �̸��� ���� �޼ҵ带 ������ => �ڵ庯�� [ �θ�Ŭ������ �޼ҵ� ������ ] : �ڵ��ϼ�
	@Override // @ : ������̼� 
	void powerOn() {
		super.powerOn(); //�θ�޼ҵ� ȣ��
		System.out.println( "���� �޼ҵ� ������ : DMB �� �մϴ�.");
	}
	
}
