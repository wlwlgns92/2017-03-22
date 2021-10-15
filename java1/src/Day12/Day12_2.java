package Day12;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Day12_2 {
		
	//p.527
		// Wrapper 포장 클래스 : 기본자료형 -> 객체화
	
	//p.531
	// 문자열 - > 기본타입
		// 1. Integer.parseInt("문자열")
		// 2. Double.parseDouble("문자열")
		// 3. Boolean.parseBoolean("문자열")
		// * Byte.parseInt() , Short.parseInt(), Long.parseInt(), Float.parseInt()
		// 기본타입 = > 문자열 valueOf()
			// 1. String.valueOf(기본자료형)
		// 바이트 => 문자열 
			// new 생성자(바이트배열)
	int value1 = Integer.parseInt("10"); // 문자 "10" =>> 정수 10
	double value2 = Double.parseDouble("3.14"); // 문자 "3.14" -> 실수 3.14
	boolean value3 = Boolean.parseBoolean("true"); //문자 "true" => 논리 true
	
		//p.534 Math 클래스
		// 1. Math.abs()
	public static void main(String[] args) {
		System.out.println("절대값 : " + Math.abs(-5));	 // 5
		System.out.println("절대값 : " + Math.abs(-3.14)); // 3.14
		
			//2. Math.ceil()
		System.out.println("올림값 : " + Math.ceil(5.3));  // 6.0
		System.out.println("올림값 : " + Math.ceil(-5.3)); //-5.0
		
		//3. Math.floor()
		System.out.println("버림값 : " + Math.floor(5.3)); //5
		System.out.println("버림값 : " + Math.floor(-5.3)); //-6.0
		
		 //4. Math.max() 
		System.out.println("최대값 : " + Math.max(5,9)); //9
		System.out.println("최대값 : " + Math.max(5.3, 2.5)); // 5.3
		
		//5. Math.min()
		System.out.println("최소값 : " + Math.min(5,9)); //5
		System.out.println("최소값 : " + Math.min(5.3,2.5)); //2.5
		
			// 6. Math.random()
		System.out.println(" 난수 : " + Math.random());
		
			// 7. Math.rint()
		System.out.println("가까운 정수의 실수값 : " + Math.rint(5.3)); //5.0
		System.out.println("가까운 정수의 실수값 : " + Math.rint(5.7)); //6.0
		
			//8. Math.round() : 소수점 첫째자리 반올림
		System.out.println("반올림 : " + Math.round(5.3)); //5
		System.out.println("반올림 : " + Math.round(5.7)); //6
			//* 소수점 셋째자리 반올림 [ 자릿수 올리고 반올림 후 자리수 내림]
		double value = 12.3456;
		double rvalue = Math.round(value*100); //1234.56
		System.out.println(rvalue/100);
		
		//p.536
		//int num = Math.random(); // 0~1
		//int num = Math.random()*6; // 0*6 ~ 1*6
		int num = (int)(Math.random()*6)+1; // 0*6+1 ~ 1*6+1 = 1~7
		
		// p.537 : Random 클래스 [Random 클래스는 static 메소드를 제공하지 않음] 
		Random random = new Random(); // Random 클래스는 static 메소드를 제공하지 않음
//		int num2 = random.nextInt(); // int가 표현할 수 있는 범위만큼 난수
		int num2 = random.nextInt(6)+1; //1~6
		System.out.println(num2);
		
		
		//p.539
		// Date 클래스 : 시스템 날짜/시간
		Date date = new Date();
		
		
		//p.540
		// Calender 클래스 : 운영체제 시간대의 날짜/ 시간에 대한 정보
		
		Calendar now = Calendar.getInstance(); // 기존에 있는 객체를 가져오기
		System.out.println("년도 : " + now.get(Calendar.YEAR));
		System.out.println("월 : " + (now.get(Calendar.MONTH)+1)); // 0~11까지 출력되서 +1 해줘야한다.
								//+ : 연결연산자 				// + : 더하기 연산자 ()를 사용해서 구분
		System.out.println("일 : " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 : " + now.get(Calendar.DAY_OF_WEEK)); //요일이 숫자로 반환됨
							// 1:일 2:월 3:화 4:수 5:목 6:금 7:토
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek =null;
				switch (week) {
				case Calendar.SUNDAY : strWeek = "일"; break;
				case Calendar.MONDAY : strWeek = "월"; break;
				case Calendar.TUESDAY : strWeek = "화"; break;
				case Calendar.WEDNESDAY : strWeek = "수"; break;
				case Calendar.THURSDAY : strWeek = "목"; break;
				case Calendar.FRIDAY : strWeek = "금"; break;
				case Calendar.SATURDAY : strWeek = "토"; break;
				}
		System.out.println("요일 : " + strWeek);
		
		System.out.println("오전/오후 : " + now.get(Calendar.AM_PM)); // 0: 오전 1: 오후
		int ampm = now.get(Calendar.AM_PM);
		String strampm = null;
		if(ampm==Calendar.AM) { strampm = "오전";}
		else { strampm = "오후";}
		System.out.println("오전오후 : " + strampm);
		
		System.out.println("시 : " + now.get(Calendar.HOUR));
		System.out.println("분 : " + now.get(Calendar.MINUTE));
		System.out.println("초 : " + now.get(Calendar.SECOND));
		
		// 협정시계
			// ZonedDateTime 클래스 : 협정시계 
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정시계 시간 : " + zonedDateTime);
		zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 시간 : " + zonedDateTime);
		zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간 : " + zonedDateTime);
				
		
				
	}
}
