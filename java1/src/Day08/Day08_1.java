package Day08;

public class Day08_1 {
		//실행클래스 => main메소드[스레드 : 코드를 읽어주는 역할]
		
	
		// 상속 : 설계도 연장 , 미리 만들어진 클래스로부터 설계도 제공받아 이어서 새로운 클래스 설계
			// 프로젝트마다 클래스를 설계하기에는 시간이부족하다
			// 부모클래스[수퍼클래스]
			//자식클래스[서브클래스]
	
			// 키워드 및 선언방법
			// extends : 연장하다 [설계도 연장]
			// public class 자식클래스명 extends 부모클래스명 {}
			// 다중 클래스 불가
		//2. super : 부모클래스내 멤버 접근
			// super() : 부모클래스내 생성자 호출
			// super.필드명/메소드명 : 부모클래스내 필드, 메소드 호출
		
		// @Override : 부모클래스내 메소드 재정의
			// 이름이 같을경우 자식클래스의 메소드가 실행
	
		// final : 클래스 필드 메소드 선언시 사용가능, 결코 수정 불가하다는 뜻
			// class 앞에 final 을 붙히면 부모클래스로 사용불가
			// public final class 이렇게 선언
			// 부모클래스 내 메소드에서 final을 사용하면 Override도 불가
	public static void main(String[] args) {
		//서브클래스 이용한 객체 생성
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		System.out.println("모델 : " + dmbCellPhone.model );  //부모 멤버//private 변수가 아닐경우 멤버 접근 가능
		System.out.println("색상 : " + dmbCellPhone.channel); //부모멤버
		System.out.println("채널 : " + dmbCellPhone.channel); //본인 멤버
		
		dmbCellPhone.powerOn(); //부모메소
		dmbCellPhone.bell(); //부모 메소드
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요 저는");
		dmbCellPhone.sendVoice("하이");
		dmbCellPhone.hangUp();
		
		//본인메소드
		dmbCellPhone.turmOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.trunOffDmb();
				
				
				
	}
}
