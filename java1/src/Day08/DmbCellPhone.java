package Day08;

public class DmbCellPhone extends CellPhone {
					//extends : 연장하다 // 상속 1개.
	//핸드폰 기본기능 = > CellPhone
	//필드
	int channel;
	
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		
		//부모 클래스내 생성자가 있으때 = > super(); 키우ㅝ드를 사용해 부모클래스 내 생성자 호출
		super(model, color);// 부모클래스내 생성자 호출
		
		//부모클래스내 생성자가 없을때
		// this : 현재 클래스내 멤버
//		this.model=model;
//		this.color=color;
		this.channel = channel;
	}




	//메소드
	void turmOnDmb() { System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다."); }
	void changeChannelDmb(int channel) {
		this.channel=channel;
		//this.channel : 파란색 : 현재클래스내 멤버
		// channel : 발간색 : 메소드에 외부로부터 들어온 변수 [인수]
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	void trunOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	// 오버라이딩 // 동일한 이름을 가진 메소드를 재정의 => 코드변경 [ 부모클래스내 메소드 재정의 ] : 자동완성
	@Override // @ : 어노테이션 
	void powerOn() {
		super.powerOn(); //부모메소드 호출
		System.out.println( "전원 메소드 재정의 : DMB 폰 켭니다.");
	}
	
}
