package Day02;

public class Day02_5 {

	
	/* 문자 : char
	 * 문자열 : 자료형 없음 -> String 클래스
	 * 
	 */
	
	public static void main(String[] args) {
		
		char 문자1 = 'a';
		// char 문자2 = 'asd'; char 2바이트라서 하나의 문자만 저장
		// 1. String 이용한 문자열 저장
		String 문자열1 = "asd"; System.out.println(문자열1);
		
		// 2. 배열을 이용한 문자열 저장
		char[] 문자열2 = { 'a', 'b', 'c'}; System.out.println(문자열2);
		
		// String : 문자열을 관리해주는 클래스
			// 객체는 비교 연산자 사용불가 비교 하기위해서는 [.equals(문자열)] 사용
		String 이름 = "유재석"; // 영문 1바이트 한글 2바이트
		String 이름2 = new String("유재석");
		System.out.println(이름.equals(이름2));
	}
}
