package Day14_p666;

import java.util.Arrays;

public class Day14_2_p666 {
		
	
	// p.666
	// 제네릭은 자체적으로 new 연산 불가
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		// Person 클래스로 배열이 생성
			personCourse.add(new Person("일반인"));
			personCourse.add(new Worker("직장인"));
			personCourse.add(new Student("학생"));
			personCourse.add(new HighStudent("고등학생"));
				// 해당 배열에 add는 일반인, 직장인, 학생, 고등학생
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
			workerCourse.add(new Worker("직장인"));
			// worker 클래스로 배열이 생성
			// 해당 배열에 add는 직장인
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
			studentCourse.add(new Student("학생"));
			studentCourse.add(new HighStudent("고등학생"));
			// Student 클래스로 배열이 생성
			//해당 배열에는 학생과 자식클래스인 고등학생이 들어갈수있다.
		
		Course<HighStudent> highstudentCourse = new Course<HighStudent>("고등학생과정", 5);
			highstudentCourse.add(new HighStudent("고등학생"));
			// highStudent 클래스로 배열이 생성
			// 해당 배열에 add는 고등학생만 들어갈 수 있다.
			System.out.println("------------------------- Course<?> : 모든 코스 가능 ------------");
			registerCourse(personCourse);
			registerCourse(workerCourse);
			registerCourse(studentCourse);
			registerCourse(highstudentCourse);
			System.out.println("------------------------- Course<? extends 클래스 > : 본인포함 자식클래스만 가능 ------------");
//			registerCourseStudent(personCourse);
//			registerCourseStudent(workerCourse);
			registerCourseStudent(studentCourse);
			registerCourseStudent(highstudentCourse);
			
			System.out.println("------------------------- Course<? super 클래스 > : 본인포함 부모클래스만 가능 ------------");
			registerCourseWorker(personCourse);
			registerCourseWorker(workerCourse);
//			registerCourseWorker(studentCourse);
//			registerCourseWorker(highstudentCourse);

			
	}//m e
	// 
	public static void registerCourse(Course<?> course) { // : 와일드카드 <?> 모든클래스 대응
		System.out.println( course.getName()+" 수강생명단 : "+ Arrays.toString(course.getStudent()));
	}
	// 학생 목록 출력 메소드 // ? extends 학생 [ 학생 클래스로부터 상속받은 클래스만 가능(본인포함) ]
	public static void registerCourseStudent ( Course<? extends Student> course ) {
		System.out.println( course.getName()+" 수강생명단 : "+ Arrays.toString(course.getStudent()));
	}
	
	//직장인 목록 출력 메소드 //  ? super 직장인 [ 직장인 클래스의 부모클래스만 가능(본인포함)]
	public static void registerCourseWorker ( Course < ? super Worker> course ) {
		System.out.println( course.getName()+" 수강생명단 : "+ Arrays.toString(course.getStudent()));
	}
	
	
}
