package Day10;

public class Anonymous {

	// 필드
	Person person = new Person(); 
	// 익명객체	: 일회성
	Person field = new Person() {
		
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
		System.out.println("7시에 일어납니다.");		
		}
	};// 익명객체 구현 끝
	
	
	//생성자
	
	//메소드
	
	void method1() {
		Person localVar = new Person() {
			void walk() { System.out.println("산책을 합니다.");
			}
			@Override
			void wake() {
			System.out.println("7시에 일어납니다.");
				walk();;
			}
		}; // 익명객체는 ; 꼭넣어야한다
	localVar.wake();
	
	
	}
	void method2(Person person) {
		person.wake();
	}
}
