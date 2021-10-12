package Day09;

public class RemoteControlExample {
	//p 347~354
	// 1. 인터페이스 설계 : RemoteControl
	// 2. 클래스 설계 : Television
	// 3. 클래스 설계 : Audio
	
	public static void main(String[] args) {
		//1. 리모컨 생성
		RemoteControl rc;
		
		// 2. 리모컨에 텔레비전 클래스 연결
		rc= new Television(); // 해당 리모컨은 텔레비전으로 사용
			// 텔레비전 리모컨 사용
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		// 3. 텔레비전 리모컨을 오디오 리모컨으로 변경★
		System.out.println("리모컨을 오디오로 변경합니다.");
		rc = new Audio();
			//오디오 리모컨 사용
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(15);
		rc.setMute(true); // p.360 디폴트 메소드 재정의
		
		RemoteControl.changeBattery(); // p.361 정적메소드는 객체없이 사용가능
		// p. 355 : 익명 구현 객체 : 일회성 코드
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
