package Day11;

public class NotExistIDException extends Exception {
	//필드
	
	
	//생성자 : 클래스명과 동일한 메소드
	//빈생성자
	public NotExistIDException () { }
	
	// 인수가 있는생성자
	public NotExistIDException(String message) {
		super(message); //예외클래스에게 메시지 보내기
		// super() : 부모의 생성자
		// super.필드 : super.메소드
	}
}
