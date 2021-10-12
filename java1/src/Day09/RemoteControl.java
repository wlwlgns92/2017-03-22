package Day09;

public interface RemoteControl {
	// class : Ŭ���� ����� ���Ǵ� Ű����
	// interface : �������̽� ����� ���Ǵ� Ű����
	
	// 1. ����ʵ� : [ �ݵ�� �ʱⰪ ���� ]
	// 2. �߻�޼ҵ� : [ �޼ҵ� ���� / ���� x ](�߰�ȣ x)
	// 3. ����Ʈ �޼ҵ� [ �޼ҵ� ����� �����ڵ� ���� o ] 
	// 4. �����޼ҵ� [ ��ü ������� ���Ǵ� �޼ҵ� ] 
	
	
	// ����ʵ� : [ �ݵ�� �ʱⰪ ���� : ���� �Ұ�]
	public int MAX_VOLUME =10;
	public int MIN_VOLUME =0;
	
	// �߻�޼ҵ� [ �޼ҵ� ���� / ���� x ���Ǵ� Ŭ�������� ](�߰�ȣ x)
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// ����Ʈ �޼ҵ� [ �޼ҵ� ����� �����ڵ� ���� o ] (�߰�ȣ ����)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else { 
			System.out.println("���� �����մϴ�.");
		}
	}
	
	// �����޼ҵ� [ ��ü ������� ���Ǵ� �޼ҵ� ] 
	
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}

