package Day09;

public class Television implements RemoteControl {
	// extends[���赵 ����] : ���
	// implements : �������̽� ���� , [�߻�޼ҵ� ���� �����ϴ�]
	
	// 1. �ʵ�
	private int volume;
	
	
	
	// ����� �������̽��� �߻�޼ҵ� �����ϱ�
	// ctrl + space : ������ �߻�޼ҵ� ��� @Override�� ��������
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	
	
	public void setVolume(int volume) {
	if(volume > RemoteControl.MAX_VOLUME) { // ���� ������ �ִ� �������� Ŀ����
		this.volume = RemoteControl.MAX_VOLUME;  //�ִ�������� �����ϱ� [ ���� ������ �ִ�۹Ǻ��� Ŀ������ ����]
	} else if(volume < RemoteControl.MIN_VOLUME) { // ���� ������ �ּҼ���[0] ���� ������ 
		this.volume = RemoteControl.MIN_VOLUME; // �ּ� �������� �����ϱ� [ ���� ������ ������ �� �� ����]
	}else {
		this.volume = volume;
	}
	System.out.println("���� Tv ���� : " + this.volume);
	}
}
