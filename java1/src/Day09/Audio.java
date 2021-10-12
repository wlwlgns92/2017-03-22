package Day09;

public class Audio implements RemoteControl{
		// implements : Ŭ������ �������̽� ����
	
	//1. �ʵ�
	private int volume;
	private boolean mute;
	//2. ������
	
	//3. �޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
		
	}
	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	
	}
	@Override
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
	
	@Override
	public void setMute(boolean mute) {
	this.mute = mute;
	if(mute) {
		System.out.println("audio ���� ó�� �մϴ�.");
	} else { 
		System.out.println("audio ���� �����մϴ�.");
	}
	
	}
}
