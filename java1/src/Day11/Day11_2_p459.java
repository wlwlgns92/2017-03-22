package Day11;

public class Day11_2_p459 {
	
	public static void main(String[] args) {
		/* API
		 * 	라이브러리 : 만들어진 클래스 , 인터페이스
		 * Object 클래스
		 *  equals() : 객체 비교
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println(" 두 객체는 동등합니다.");
		}else {
			System.out.println( " 두 객체는 다릅니다. " );
		}
		if(obj1.equals(obj3)) {
			System.out.println(" 두 객체는 동등합니다.");
		}else {
			System.out.println( " 두 객체는 다릅니다. " );
		}
		
		// 2. toString() : 객체 정보
			// 객체의 주소값[ 자료형들은 값 호출 ]
		System.out.println(obj1.toString());
		
		 // 3. clone() : 객체 복제
		
			// 얕은 복제 : 배열 객체는 복제 불가 [주소값] 만 복사 : 복제와 == 원본이 동일해줄수있음
			// 깊은 복제 : 참조타입 배열 객체도복제
		Member2 original = new Member2("blue", "홍길동", "12345", 25, true);
		
		// 3.1 객체 복제
		Member2 cloned = original.getMember2();
		
		cloned.password ="67890";
		
		System.out.println("복제된 객체");
		cloned.toString();
		
		System.out.println("원본 객체");
		original.toString();
		
		// 깊은복제
		
		Member3 original2 = new Member3("홍길동", 25, new int[] {90, 90}, new Car("소나타"));
		// 깊은 복제
		Member3 cloned2 = original2.getMember3();
		cloned2.scores[0] = 100;
		cloned2.car.model = "그랜져";
		
		System.out.println("--원본--");
		original2.toString();
		System.out.println("-깊은복제--");
		cloned2.toString();
		
		
		// finalize () : 객체 소멸자
		cloned2 = null; // 해당 객체가 null
				System.gc(); // 자동실행
					//스택 : 변수명, 주소값
					// 힙 : 값
						//int 변수명 = 10;
							//스택 : 변수명, 변수의 힙 주소값
							// 힙 : 주소를 가지고있는 메모리 : 값
	}
}
