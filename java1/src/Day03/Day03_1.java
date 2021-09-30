package Day03;

public class Day03_1 {
	
	
	// 제어문 : if(논리제어 , switch(데이터제어)
		// 목적 : 경우의수에 따른 코드 처리
		// if : true, false 만 제어 가능
			// 형태1 : if(논리) true실행문.
			// 형태2 : if(논리) true실행문
			// 		  else false 실행문
			// 형태3 : if(논리) {실행문;, 실행문;}
			//		  else(논리){실행문;, 실행문;}
			// 형태4 : if(논리) {  }
			//		  else if(논리2) {  }
			//		  else if(논리3) {  }	
			//		  else if(논리4) {  }
			//		  else 
	public static void main(String[] args) {
		/* // 예1) true 이면 싱행
		if( 3> 1) System.out.println("예1) 3이 1보다 크다");
		// 예2) false 이면 실행문 실행x
		if(3>5) System.out.println("예2) 3이 5보다 크다.");
		// 예3) ture false 이면 실행문 실행
		if(3 > 5) System.out.println("예3) 3이 5보다 크다");
		else System.out.println("3이 5보다 작다.");
		// 예4) 실행문이 2개 이상일때 {} 가 사용된다.
		if( 3>2) { //if start
			System.out.println("true이면 실행되는 자리");
			System.out.println("3이 2보다 크다");
		}// if end
		else {
			System.out.println("flase이면 실행되는자리");
			System.out.println("3이 2보다 크다");
			
		// 예5) 다양한 경우의수의 따른 제어
			if(3>5) System.out.println("예5) 3이 5보다 크다");
			else if (3>4) System.out.println("예5) 3이 4보다 크다");
			else if (3>3) System.out.println("예5) 3이 3보다 크다");
			else if (3>2) System.out.println("예5) 3이 2보다 크다");
			else System.out.println("true가 없다"); 
			
			if(3>5) System.out.println("예5) 3이 5보다 크다");
			if (3>4) System.out.println("예5) 3이 4보다 크다");
			if (3>3) System.out.println("예5) 3이 3보다 크다");
			if (3>2) System.out.println("예5) 3이 2보다 크다");
			else System.out.println("true가 없다"); */
			
			
			/*// p.109 예 
			int score = 93;
			if( score>=90 ) {
				System.out.println("점수가 90보다 큽니다.");
				System.out.println("등급은 A 입니다.");
			}
			
			if( score < 90 )
				System.out.println("점수가 90보다 작습니다.");
				System.out.println("등급은 B 입니다."); */
			
		/* p.111예
			int score2 = 85;
			if (score2>=90) { System.out.println("점수가 90보다 큽니다."); System.out.println("등급은 A 입니다.");}
			else { System.out.println("점수가 90보다 작습니다."); System.out.println("등급은 B 입니다."); */
		
		// p.112 예
		int score3 = 75;
		if (score3>=90) { System.out.println("점수가 100 ~ 90입니다"); System.out.println("등급은 A 입니다."); }
		else if (score3 >= 80) {System.out.println("점수가 80~89 입니다"); System.out.println("등급은 B 입니다");}
		else if (score3 >=70)  {System.out.println("점수가 70~79 입니다"); System.out.println("등급은 C 입니다");}
		else { System.out.println("점수가 70 미만 입니다"); System.out.println("등급은 D 입니다.");}
		}
			
			
				
		
		
			
	}	
	
	

