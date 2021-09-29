package Day02;

import java.util.Scanner;

public class Day02_1 {
// public : 접근제한자
	// class : 클래스 선언시 사용되는 키워드 [미리 만들어진 단어], 클래스 명은 첫클자를 대문자로 만든다
	public static void main(String[] args) {
		
		System.out.println("java");
		
		// 1. 입력객체 선언 [ 키보드로부터 입력받은 값을 저장하는 객체]
		Scanner scanner = new Scanner(System.in);
		// 2. next() 메소드를 이용한 객체내 입력값 뺴오기
		String a = scanner.next();
		// 3. 출력 [ + : 연결연산자 ( 문자 + 변수 연결)
		System.out.println("안녕하세요" + a);
		// "" 문자처리 : 키워드[ 미리 만들어진단어], 객체, 클래스명, 변수 등 제외

	}

}
