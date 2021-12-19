package 과제;

import java.util.Calendar;
import java.util.Scanner;

public class 달력 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 입력객체
		System.out.println("연도 : "); int year = scanner.nextInt(); // 연도를 담을 변수
		System.out.println("월 : "); int month = scanner.nextInt(); // 월을 담을 변수
		달력보기(year,month);
	}
	
	public static void 달력보기( int year, int month) { // 년도, 월 을 인수로 받는 메소드
		
		Calendar calendar = Calendar.getInstance(); // 캘린더 객체 선언
		calendar.set(year, month-1, 1); // 사용자 정의 캘린더 설정
		int sweek = calendar.get(calendar.DAY_OF_WEEK); // 해당 월의 1일 요일 찾기 
		
		int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH); // 해당 월의 마지막 날짜 찾기
		
		System.out.println("----------"+year+"년 "+month+"월-----------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i = 1; i < sweek; i++) { // sweek의 길이만큼 반복되는 반복문
			System.out.print("\t"); // 공백찍기
		}
		for(int i = 1; i <=eday; i++) { // 1부터 eday의 길이만큼 반복되는 반복문
			System.out.print(i+"\t"); // i + \t 출력
			if(sweek % 7 == 0)  System.out.println();  // sweek를 7로 나누어서 나머지가 0이라면 칸 내리기
			sweek++; // sweek 1 증가
		}
	}
}
