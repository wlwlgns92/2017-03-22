package 과제;

import java.util.Calendar;
import java.util.Scanner;

public class 달력test {
	/*
	별도 문제 : 달력 범위 출력 
	[조건] : 시작날짜와 끝날짜를 입력받아 달력 출력하기 
		// 1. 시작 날짜부터 끝날짜까지의 모든 달력 출력 
		// 2. 2021 08 ~ 2022 10
		 * 3차시기 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연도 : "); int year = scanner.nextInt();
		System.out.println("월 : "); int month = scanner.nextInt();
		달력(year,month);
	}
	public static void 달력(int year, int month) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, 1);
		
		int sweek = calendar.get(calendar.DAY_OF_WEEK);
		int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
		
		System.out.println("-----------"+year+"년 "+month+"월 -----------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i = 1; i <sweek; i++) {
			System.out.print("\t");
		}
		for(int i =1; i <=eday; i++) {
			System.out.print(i+"\t");
			if(sweek %7 == 0) System.out.println();
			sweek++;
		}
	}
}

