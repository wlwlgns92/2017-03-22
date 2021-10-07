package Day07;

public class Day07_1 {
	// Day06 : 클래스 [ 설계도 : 자료형 만들기]
		// 1. 멤버 (선택사항 필수는 아님)
			//1.1필드 : 데이터 저장[메모리할당]
			//1.2생성자  : 객체 필드 초기값
			//1.3메소드 : 데이터 동작
				// 반환타입 메소드명 (인수1, 인수2, 인수3 ~~~) {return 
		// 2. 객체(클래스의 인스턴스) 생성
			// 클래스명 객체명
				// 객체명 = new 생성자(); <---인스턴스
			//객체가 멤버(필드,생성자) 접근할때 .(접근연산자)을 사용
	public static void main(String[] args) {
		// p.236
		
		
		// p.239
		double result = 10* 10 * Calculator.pi;
				// 해당 클래스의 멤버 접근 방법
					//1. 객체 생성 [ 해당 클래스로부터 메모리 할당 ]
					//2. static [ 정적변수 ] : 프로그램 시작시 메모리 할당[ main 실행보다 우선 실행]
						//static 단점 : 메모리 효율이 좋지 않다.
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		// p.245
		Person p1 = new Person("123456-1234567", "계백");
		
				// 필드 수정
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//필드수정
//		p1.nation = "usa";
//		p1.ssn = "654321-7654321";
		p1.name = "을지문덕";
		
		// p.253 : import : 다른 패키지로부터 클래스를 가져오는 키워드
					// 1. 사용방법 : import.패키지명.클래스;  [클래스 외부에 작성]
					// 2. 직접사용 패키지명.클래스명 객체명; [클래스 내부에 작성]
					// 자동완성은 import 자동 완성 웬만하면 써라[자동완성은 패키지명 꼭 확인]
		
	}
}
