package Day08;

public class CellPhone {
	//��� : ���赵 ���� / �̸�������� Ŭ�����κ��� ���赵 �����޾� �̾ ���ο� Ŭ���� ����
		// ������Ʈ���� ���赵�� �ۼ��ϱ⿡�� �ð��� �����ϴ�
		//	�θ�Ŭ����[����Ŭ����]
		// �ڽ�Ŭ����	[����Ŭ����]
		
	//�ʵ� 
	String model;
	String color;
	
	//������
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	//�޼ҵ� : ����������[����=default] ��ȯŸ�� �޼ҵ�(�μ�,1 �μ�2, �μ�3) {�����ڵ�}
	//void :��ȯ�� ���� [return ����]
	
	void powerOn() {System.out.println("������ �մϴ�.");}
	
	void powerOff() {System.out.println("������ ���ϴ�."); }
	void bell() {System.out.println("���� �︳�ϴ�."); }
	void sendVoice(String message) {System.out.println("�ڱ�" + message); }
	void receiveVoice(String message) {System.out.println("����" + message); } 
	void hangUp () {System.out.println("��ȭ�� �����ϴ�."); }
	
}
