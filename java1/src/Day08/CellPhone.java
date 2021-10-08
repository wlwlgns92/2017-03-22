package Day08;

public class CellPhone {
	//상속 : 설계도 연장 / 미리만들어진 클래스로부터 설계도 제공받아 이어서 새로운 클래스 설계
		// 프로젝트마다 설계도를 작성하기에는 시간이 부족하다
		//	부모클래스[슈퍼클래스]
		// 자식클래스	[서브클래스]
		
	//필드 
	String model;
	String color;
	
	//생성자
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	//메소드 : 접근제한자[생략=default] 반환타입 메소드(인수,1 인수2, 인수3) {실행코드}
	//void :반환이 없다 [return 없음]
	
	void powerOn() {System.out.println("전원을 켭니다.");}
	
	void powerOff() {System.out.println("전원을 끕니다."); }
	void bell() {System.out.println("벨이 울립니다."); }
	void sendVoice(String message) {System.out.println("자기" + message); }
	void receiveVoice(String message) {System.out.println("상대방" + message); } 
	void hangUp () {System.out.println("전화를 끊습니다."); }
	
}
