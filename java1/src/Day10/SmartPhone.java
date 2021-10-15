package Day10;

public class SmartPhone extends Phone{
			// 추상클래스 : 상속받아야 한다.
	// 1. 생성자
	public SmartPhone(String owner) {
		super(owner);
		// super() : 수퍼클래스의 생성자 호출
	}
	
	public void internetSearch() {
		System.out.println(" 인터넷 검색을 합니다.");
	}
	
}
