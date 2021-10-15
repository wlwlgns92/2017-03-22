package Day11;

import java.io.IOException;

public class Team {
//	도서 검색 프로그램
//	1.조건 : 도서목록 배열 선언 
//		[ 4개의 도서를 배열에 등록 ]
//		1. 된다! 네이버 블로그&포스트
//		2. 스프링 부트 실전 활용 마스터
//		3. Tucker의 Go 언어 프로그래밍
//		4. 혼자 공부하는 C 언어
//
//	2. Scanner -> System.in.read()
//
//	3.검색기능 : 검색을 입력받아 검색한 단어가 포함된 도서를 모두 출력
//	4.수정기능 : 수정할 도서를 입력받아 선택후 교체할 단어와 새로운 단어 입력받아 교체
//	
//	String[] 도서목록 = {	
//			"된다! 네이버 블로그&포스트",
//			"스프링 부트 실전 활용 마스터",
//			"Tucker의 Go 언어 프로그래밍",
//			"혼자 공부하는 C 언어"
//	};
	public static void main(String[] args) throws IOException {
		
		//0. 준비물
		String[] 도서목록 = {"된다! 네이버 블로그&포스트", "스프링 부트 실전 활용 마스터", "Tucker의 Go 언어 프로그래밍", "혼자 공부하는 C 언어"};
		
		//1. 입력받기
		while(true) {
			System.out.println("1.검색 2.수정");
			System.out.println("선택 : ");
			//바이트배열선언 [ 키보드로부터 입력받은 바이트를 저장할 배열 생성]
			byte[] bs = new byte[100];
			// 입력[키보드 = 바이트] 받기 ---> 바이트배열에 저장
			int count = System.in.read(bs);
				// count : 바이트를 읽어온 개수 저장 변수
				// 문자수 +2 [\n, \r]
			// 바이트 --> 문자열 변환
			String ch= new String(bs, 0, count-2); // 100바이트 모두 문자열 전환
			//문자열 --- > 숫자열 변환
			
			//예1
			if(ch.equals("1")) {System.out.println("검색창");}
			if(ch.equals("2")) {System.out.println("수정창");}
			
			//예2 문자열을 다시 숫자열로 바꿔서 할떄 
			int ch2 = Integer.parseInt(ch);
			if(ch2==1) {System.out.println("검색창");}
			if(ch2==2) {System.out.println("수정창");}
			
		}
	}
}
