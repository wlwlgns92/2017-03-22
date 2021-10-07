package Day06;

public class Korean {
	
	
	//1. 필드
	String nation = "대한민국";
	String name;
	String ssn;
			
	
	//2. 생성자
	public Korean() {
	
	}
	
	
	public Korean(String n, String s) {
					//객체선언시 생성자로부터 N,s값을 입력받기
		name = n; //생성자로부터 들어온 n을 현재 필드에 저장
		ssn = s;
		
			//this.내부변수
			//this.ssn = ssn;
	
	}
	//3. 메소드

}
