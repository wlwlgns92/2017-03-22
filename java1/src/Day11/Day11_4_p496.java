package Day11;

import java.io.IOException;

public class Day11_4_p496 {
	//키보드[바이트] 입력 => 입력 스트림 => 자바 프로그램
	
	//String 클래스
		//1. String 생성자 : 바이트열을 문자열 변환
			// 생성자 약 13개 정도 존재
			// 문자열에도 인덱스가 존재
	public static void main(String[] args) throws IOException {
		
	
	
	//p.497
	//1. 바이트배열에 정수 저장
	byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
	
	//2. 바이트 배열을 String 생성자에 넣기
	String str1 = new String(bytes);
	System.out.println(str1);
	
	//3.							//s , c : 6(0부터)번쨰부터 4개   
	String str2 = new String(bytes, 6, 4);
	System.out.println(str2);
	
	//p.498
	//1. 바이트 100개를 저장할 수 있는 배열
	byte[] bytes2= new byte[100];
	
	System.out.print("입력 : "); 
	int readcount = System.in.read(bytes2);
	System.in.read(bytes2);// 무조건 예외발생
		//입출력관련은 항상 예외처리 발생
			// System.in.read(배열명); : 키보드로부터 읽어온 바이트를 배열에 저장
	System.out.println(new String(bytes2));
									//바이트열 -> 문자열 변환
	System.out.println(new String (bytes2,0, readcount-2));
	
	//p.499
		// 2. charAt() : 문자 추출
	String ssn = "010624-1230123";
	char sex =ssn.charAt(7);
	switch (sex) {
	case '1':
	case '3':
		System.out.println("남자입니다.");
		break;
	case '2':
	case '4':
		System.out.println("여자입니다.");
		break;
	}	
	//p.500
		//3. eqyals(비교대상문자열) : 문자열 비교
	
	String strVar1 = new String("신민철");
	String strVar2 = "신민철";
	String strVar3 = "신민철";
	
	if(strVar1 == strVar2) {System.out.println("같다");}
	else {System.out.println("다르다");}
	
	if(strVar1.equals(strVar2)) {System.out.println("같다");}
	else {System.out.println("다르다");}
	
	//p.502
		//4. getBytes() : 문자열을 바이트열로 변환
	String str = "안녕하세요";
	byte[] bytes3 = str.getBytes(); // 문자열 String 을 바이트로 변환후 배열에 대입
	System.out.println(bytes3.length); // 한글은 한개당 2바이트여서 10바이트가 나온다. 글자수 *2
	
	//바이트 -> 문자열
	System.out.println( new String(bytes3));
	
		// 인코딩 종류
			// 1. UTF-8 : 전세계 공용어
			// 2. EUC-KR [ CP949 ] : 영문, 한글
	
	// p.504
	// 5. indexOf() : 문자열 찾기 [ 인수 : 찾을 문자열 반환 : 찾은 인덱스 위치]
	
	String subject = "자바 프로그래밍";
	subject.indexOf("자바 프로그래밍");
	System.out.println(subject.indexOf("프로그래밍"));
	if(subject.indexOf("자바") != -1) { // 인덱스가 -1 이면 인덱스가 없다 // 찾을문자가 존재하지 않음
		System.out.println("자바와 관련된  책입니다.");		
	}else { 
		System.out.println("자바와 관련없는 책입니다.");
	}
	
	// 5.1
	//contains() : 문자열 포함 여부 [인수: 찾을 문자열 반환 true /false 로 알려준다]
	subject.contains(subject);
	System.out.println(subject.contains("자바"));
	//p. 505
		//6. length() : 문자열의 길이를 알려줌
	System.out.println(subject.length());
	
	
	//p.506
		//7. replace("교체할 문자열", "새로운문자열") : 문자열 대치 
	String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다";
	String newStr = oldStr.replace("자바", "JAVA");
	System.out.println(oldStr);
	System.out.println(newStr);
	
	
	//p.507
		//8. substring() : 문자열을 잘라내기
		String ssn2 = "880815-1234567";
		System.out.println(ssn2.substring(0,6)); // 시작인덱스 , 끝인덱스
		System.out.println(ssn2.substring(7));// 시작인덱스만
		//9. split() : 문자열 분리
		String[] ssn3 = ssn2.split("-"); // - 기준으로 분리한다
		System.out.println(ssn3[0]);
		System.out.println(ssn3[1]);
		
	//p.508
		// 10. toLowerCase() : 소문자로 변환 toUpperCase() : 대문자로 변환
		String str3 = "Java Programming";
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		
	//p.509
		// 11. trim() : 문자열 앞뒤 공백 제거 [ 글자 사이공백 제거 불가 ]
		String str4 = "              자바               프로그래밍     ";
		System.out.println(str4.trim());
		
	//p.510
		// 12. valueOf() : 기본타입을 문자열 변환 [ "" 처리가 되면서 문자열 변환이 된다]
		String str5 = String.valueOf(10); //정수형 [int] = > 문자열
		String str6 = String.valueOf(10.5); // 실수형 [double] => 문자열
		String str7 = String.valueOf(true); //논리 => 문자열
		
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		

	}
	
}
