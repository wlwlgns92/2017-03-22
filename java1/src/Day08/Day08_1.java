package Day08;

public class Day08_1 {
		//����Ŭ���� => main�޼ҵ�[������ : �ڵ带 �о��ִ� ����]
		
	
		// ��� : ���赵 ���� , �̸� ������� Ŭ�����κ��� ���赵 �����޾� �̾ ���ο� Ŭ���� ����
			// ������Ʈ���� Ŭ������ �����ϱ⿡�� �ð��̺����ϴ�
			// �θ�Ŭ����[����Ŭ����]
			//�ڽ�Ŭ����[����Ŭ����]
	
			// Ű���� �� ������
			// extends : �����ϴ� [���赵 ����]
			// public class �ڽ�Ŭ������ extends �θ�Ŭ������ {}
			// ���� Ŭ���� �Ұ�
		//2. super : �θ�Ŭ������ ��� ����
			// super() : �θ�Ŭ������ ������ ȣ��
			// super.�ʵ��/�޼ҵ�� : �θ�Ŭ������ �ʵ�, �޼ҵ� ȣ��
		
		// @Override : �θ�Ŭ������ �޼ҵ� ������
			// �̸��� ������� �ڽ�Ŭ������ �޼ҵ尡 ����
	
		// final : Ŭ���� �ʵ� �޼ҵ� ����� ��밡��, ���� ���� �Ұ��ϴٴ� ��
			// class �տ� final �� ������ �θ�Ŭ������ ���Ұ�
			// public final class �̷��� ����
			// �θ�Ŭ���� �� �޼ҵ忡�� final�� ����ϸ� Override�� �Ұ�
	public static void main(String[] args) {
		//����Ŭ���� �̿��� ��ü ����
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		System.out.println("�� : " + dmbCellPhone.model );  //�θ� ���//private ������ �ƴҰ�� ��� ���� ����
		System.out.println("���� : " + dmbCellPhone.channel); //�θ���
		System.out.println("ä�� : " + dmbCellPhone.channel); //���� ���
		
		dmbCellPhone.powerOn(); //�θ�޼�
		dmbCellPhone.bell(); //�θ� �޼ҵ�
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ��� ����");
		dmbCellPhone.sendVoice("����");
		dmbCellPhone.hangUp();
		
		//���θ޼ҵ�
		dmbCellPhone.turmOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.trunOffDmb();
				
				
				
	}
}
