package Day10;

public class CallListener implements Button.OnClickListener{
									// 인터페이스가 내부에 있기때문에 클래스명.인터페이스
	
	@Override
	public void onClick() {
	System.out.println("전화를 겁니다.");
	}
}
