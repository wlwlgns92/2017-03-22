package Day09;

public class RemoteControlExample {
	//p 347~354
	// 1. �������̽� ���� : RemoteControl
	// 2. Ŭ���� ���� : Television
	// 3. Ŭ���� ���� : Audio
	
	public static void main(String[] args) {
		//1. ������ ����
		RemoteControl rc;
		
		// 2. �������� �ڷ����� Ŭ���� ����
		rc= new Television(); // �ش� �������� �ڷ��������� ���
			// �ڷ����� ������ ���
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		// 3. �ڷ����� �������� ����� ���������� �����
		System.out.println("�������� ������� �����մϴ�.");
		rc = new Audio();
			//����� ������ ���
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(15);
		rc.setMute(true); // p.360 ����Ʈ �޼ҵ� ������
		
		RemoteControl.changeBattery(); // p.361 �����޼ҵ�� ��ü���� ��밡��
		// p. 355 : �͸� ���� ��ü : ��ȸ�� �ڵ�
		RemoteControl re2= new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
