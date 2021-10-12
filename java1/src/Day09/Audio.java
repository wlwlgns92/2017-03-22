package Day09;

public class Audio implements RemoteControl{
		// implements : 클래스에 인터페이스 연결
	
	//1. 필드
	private int volume;
	private boolean mute;
	//2. 생성자
	
	//3. 메소드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	
	}
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) { // 현재 소음이 최대 소음보다 커지면
			this.volume = RemoteControl.MAX_VOLUME;  //최대소음으로 대입하기 [ 현재 소음은 최대송므보다 커질수가 없음]
		} else if(volume < RemoteControl.MIN_VOLUME) { // 현재 소음이 최소소음[0] 보다 작으면 
			this.volume = RemoteControl.MIN_VOLUME; // 최소 소음으로 대입하기 [ 현재 소음은 음수가 될 수 없음]
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Tv 볼륨 : " + this.volume);
	
	}
	
	@Override
	public void setMute(boolean mute) {
	this.mute = mute;
	if(mute) {
		System.out.println("audio 무음 처리 합니다.");
	} else { 
		System.out.println("audio 무음 해제합니다.");
	}
	
	}
}
