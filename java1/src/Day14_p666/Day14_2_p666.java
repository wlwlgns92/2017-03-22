package Day14_p666;

import java.util.Arrays;

public class Day14_2_p666 {
		
	
	// p.666
	// ���׸��� ��ü������ new ���� �Ұ�
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���", 5);
		// Person Ŭ������ �迭�� ����
			personCourse.add(new Person("�Ϲ���"));
			personCourse.add(new Worker("������"));
			personCourse.add(new Student("�л�"));
			personCourse.add(new HighStudent("����л�"));
				// �ش� �迭�� add�� �Ϲ���, ������, �л�, ����л�
		
		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���", 5);
			workerCourse.add(new Worker("������"));
			// worker Ŭ������ �迭�� ����
			// �ش� �迭�� add�� ������
		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
			studentCourse.add(new Student("�л�"));
			studentCourse.add(new HighStudent("����л�"));
			// Student Ŭ������ �迭�� ����
			//�ش� �迭���� �л��� �ڽ�Ŭ������ ����л��� �����ִ�.
		
		Course<HighStudent> highstudentCourse = new Course<HighStudent>("����л�����", 5);
			highstudentCourse.add(new HighStudent("����л�"));
			// highStudent Ŭ������ �迭�� ����
			// �ش� �迭�� add�� ����л��� �� �� �ִ�.
			System.out.println("------------------------- Course<?> : ��� �ڽ� ���� ------------");
			registerCourse(personCourse);
			registerCourse(workerCourse);
			registerCourse(studentCourse);
			registerCourse(highstudentCourse);
			System.out.println("------------------------- Course<? extends Ŭ���� > : �������� �ڽ�Ŭ������ ���� ------------");
//			registerCourseStudent(personCourse);
//			registerCourseStudent(workerCourse);
			registerCourseStudent(studentCourse);
			registerCourseStudent(highstudentCourse);
			
			System.out.println("------------------------- Course<? super Ŭ���� > : �������� �θ�Ŭ������ ���� ------------");
			registerCourseWorker(personCourse);
			registerCourseWorker(workerCourse);
//			registerCourseWorker(studentCourse);
//			registerCourseWorker(highstudentCourse);

			
	}//m e
	// 
	public static void registerCourse(Course<?> course) { // : ���ϵ�ī�� <?> ���Ŭ���� ����
		System.out.println( course.getName()+" ��������� : "+ Arrays.toString(course.getStudent()));
	}
	// �л� ��� ��� �޼ҵ� // ? extends �л� [ �л� Ŭ�����κ��� ��ӹ��� Ŭ������ ����(��������) ]
	public static void registerCourseStudent ( Course<? extends Student> course ) {
		System.out.println( course.getName()+" ��������� : "+ Arrays.toString(course.getStudent()));
	}
	
	//������ ��� ��� �޼ҵ� //  ? super ������ [ ������ Ŭ������ �θ�Ŭ������ ����(��������)]
	public static void registerCourseWorker ( Course < ? super Worker> course ) {
		System.out.println( course.getName()+" ��������� : "+ Arrays.toString(course.getStudent()));
	}
	
	
}
