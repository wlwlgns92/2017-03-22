package Day01;

public class Day01_2 { // class start
 
	public static void main(String[] args) { // main start
		
		// 1. 출력
			// print (출력할 문구); :출력
			// println(print line의 약자) : 출력후 줄바꿈[라인 바꿈]
			// printf(print format의 약자) : (형식문자, 출력문구); 로 작성하면 형식문자 맞는 출력
				//형식문자
					/* %d : 정수
					 * %f : 실수
					 * %s : 문자열
					 * %c : 문자 */
				// 제어문자 [p.34.]
					/* \ : 원화 기호
					 * \n : 줄바꿈
					 * \t : 탭[들여쓰기 -> 5칸]
					 * \r : 리턴 [ 맨앞으로 이동
					 * \\ : \ 출력된다.  */
		// 예1 : syso + ctrl + 스페이스바
		System.out.print("asd");
		System.out.print(1235); // 컴퓨터는 기계어를 사용하기 때문에 숫자에는 ""처리를 안해도된다.
		System.out.print("java1235"); // 문자 + 숫자는 문자이기때문에 ""처리를 해야한다. 
		
		// System : 미리 만들어진 시스템이라는 클래스
		// out : 출력 스트림
		// print(인수 : 출력하고 싶은말) : 출력함수
		// . 클래스내 멤버(함수, 변수) 접근 연산자[특수문자]
		// "" : 키워드(오라클에서 미리 작성한 단어), 변수 등 제외한 모든 문자에는 문자처리
		// ; : 한줄의 실행코드 끝 [일처리]
		
		//예2
		System.out.println("java");
		System.out.println(1234);
		System.out.println("java123");
		
		//에3
		System.out.printf("%s" , "java");
		System.out.printf("%d" , 12345);
		System.out.printf("%s" , "java10");
		
		// printf 장점
		System.out.printf("나이는 %d 입니다" , 20);
		System.out.println("나이는 "+ 20 + "입니다"); // 여기서 + 는 연결 연산자
		
		//예4 제어문자
		System.out.print("\njava\n");
		System.out.print("\t1235");
		System.out.print("\rjava10");
		
		//문제 1
		/* 출력결과
		 *  [[ 출석부]]
		 *  ---------------------------
		 *  이름		1교시 	2교시 	3교시 	비고
		 *  강호동	출석		결석		출석
		 *  유재석	출석		결석		출석
		 */
		
		System.out.println("\n\t\t[[출석부]]");
		System.out.println("----------------------------------------");
		System.out.println("이름\t 1교시\t 2교시\t 3교시\t 비고");
		System.out.println("강호동\t 출석\t 결석\t 출석");
		System.out.println("유재석\t 출석\t 결석\t 출석");
		System.out.println("----------------------------------------");
		
		//문제 2 : 고양이
		System.out.println("\\   /\\");
		System.out.println(" ) ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
		//문제3 : 개
		
		System.out.println("\n|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\"); // "를 문자로 사용하려면 \" 이렇게 사용해야 한다.
		System.out.println("|\"^\"     |");
		System.out.println("||_|=\\\\__|");
		
		
	} // main end
	
} // class end
