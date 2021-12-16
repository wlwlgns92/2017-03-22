package 과제1;

import java.io.IOException;

public class 도서검색 {
	
	// 1. 메뉴 => while 무한루프
		// 2. 입력받기 : 1. Scanner 객체  2. System.in.read()
		// 3. 세부메뉴 구현 
		
//		도서 검색 프로그램
//		1.조건 : 도서목록 배열 선언 
//			[ 4개의 도서를 배열에 등록 ]
//			1. 된다! 네이버 블로그&포스트
//			2. 스프링 부트 실전 활용 마스터
//			3. Tucker의 Go 언어 프로그래밍
//			4. 혼자 공부하는 C 언어
	//
//		2. Scanner -> System.in.read()
	//
//		3.검색기능 : 검색을 입력받아 검색한 단어가 포함된 도서를 모두 출력
//		4.수정기능 : 수정할 도서를 입력받아 선택후 교체할 단어와 새로운 단어 입력받아 교체
	//	
//		String[] 도서목록 = {	
//				"된다! 네이버 블로그&포스트",
//				"스프링 부트 실전 활용 마스터",
//				"Tucker의 Go 언어 프로그래밍",
//				"혼자 공부하는 C 언어"
//		};
	
	public static void main(String[] args) throws IOException {
		
		String[] 도서목록 = { "된다! 네이버 블로그&포스트", "스프링 부트 실전 활용 마스터", "Tucker의 Go 언어 프로그래밍", "혼자 공부하는 C 언어" }; // 도서목록 배열
		
		while(true) { // 무한루프
			System.out.print("1.검색 | 2.수정 선택"); //메뉴
			
			byte[] bs = new byte[100]; // 100바이트 까지 저장가능한 바이트배열
			
			int count = System.in.read(bs); // 입력받은 문자열을 바이트배열에 저장 count 바이트를 저장하는 변수
			
			String ch = new String(bs,0, count-2); // 바이트배열을 문자열로 변환 -2 는 \n\r 제거
			if(ch.equals("1")) { // 문자열이기 때문에 equals
				System.out.println("검색창"); 
				System.out.println("검색할 도서명 : "); 
				count = System.in.read(bs); // 입력받아 바이트배열에 저장
				String book = new String(bs, 0, count-2); // 바이트배열을 문자열로 변환 -2 는 \n\r 제거
				for(int i = 0; i < 도서목록.length; i++) { // 도서목록 배열의 길이만큼 반복하는 반복문
					if(도서목록[i].equals(book)) { // 만약에 배열의 i번째가 book과 같다면
						System.out.println(도서목록[i]); //배열의 i번째 출력
					}else if (도서목록[i].contains(book)) { // i번째가 book에 있는 문자를 포함한다면
						System.out.println(도서목록[i]); //배열의 i번째 출력
					}else if (도서목록[i].indexOf(book) != -1) { // 만약에 i번째의 위치에서 book과 같은 값을 포함한다면 못찾으면 -1이 리턴
						System.out.println(도서목록[i]); //배열의 i번째 출력
					}
				}
			}else if(ch.equals("2")) { // ch가 2와 같다면
				System.out.println("수정하실 도서명을 입력해주세요 : "); 
				count = System.in.read(bs); // 입력받아 바이트배열에 저장후 count변수에 바이트를 저장
				String book = new String(bs,0,count-2); // 바이트를 문자열로 변환
				for(int i = 0; i < 도서목록.length; i++) { // 도서목록의 길이만큼 반복하는 반복문
					if(도서목록[i].contains(book)) { // 배열의 i번째가 book의 값을 포함한다면
						System.out.println("수정명을 입력해 주세요 :"); 
						count = System.in.read(bs); // 입력받아 바이트배열에 저장후 count변수에 바이트를 대입
						String update = new String(bs,0,count-2); // 문자열로 변환후 update 변수에 대입
						도서목록[i] = update; // 배열 i번째에 update 값을 대입
						break; // 반복문 종료
					}
				}
			}
		}
	}
}

// String book = new String(bs, 0, count-2); 0은 인덱스번호 ?

