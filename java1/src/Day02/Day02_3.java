package Day02;

public class Day02_3 {
	
	/* p.64 연산자 [연산시 사용되는 특수문자]
		// 산술연산자 : + - * / %(나머지)
		// 비교연산자
		   >= 이상[크거나 같다]		>초과 [크다]	==[같다]
		   <= 이하[직가니 깉다]		<미만 [작다]	!=[같지않다]
		   
		   논리연산자 : 비교연산자 2개이상일때
		   && : AND[이면서, 면서, 이고, 그리고, 모두]
		   || : or [이거나, 거나, 또는, 하나라도]
		   ! : not[부정 (반대)]
		   
		   대입연산자 : 
		   		= [ 오른쪽값이; 왼쪽에 대입]
		   		+=[ 오른쪽 값을 왼쪽값에 더한 후 왼쪽에 대입] (수학에서는 말이 안되지만 컴퓨터에서는 가능)
		   		*=, /=, -=, %=
		   	
		   증감연산자 :
		    	++ [1증가]
		    	-- [1감소]
		    	
		    조건연산자 : 
		    	조건식 ? true(참) : false(거짓)
	*/
	public static void main(String[] args) {
		
		int a = 10; int b = 20;
		System.out.println("더하기 : " + (a+b));
		System.out.println("빼기 : " + (a-b));
		System.out.println("곱하기 : " + (a*b));
		System.out.println("나누기 : " + (a/b));
		System.out.println("나머지 : " + (a%b));
		
		// p.70 : 증감연산자
			// 규칙적인 증가/감소 
		// 
		a++; System.out.println("증감 : " + a);
		a--; System.out.println("감소 : " + a);
			// 선위증가[++변수명] , 후위증가[변수명++]
		System.out.println(" 선위증가 : " + ++a); // 1증가 11
		System.out.println(" 확인 : " + a);		// 확인 11
		System.out.println(" 후위증가 : " + a++); // 증감연산자가 프린트가 되고나서 마지막에 처리됨 그래서 11
		System.out.println(" 확인 : " + a); // 12
		
		System.out.println(" 후위감소 : " + --a); // 1감소 11
		System.out.println(" 확인 : " + a);		// 11
		System.out.println(" 후위감소 : " + a--);	// 1감소 11
		System.out.println(" 확인 : " + a);		// 10
		
		// p.88 비교연산자
		System.out.println(" 이상 : " + (a >= b));
		System.out.println(" 이하 : " + (a <= b));
		System.out.println(" 초과 : " + (a > b));
		System.out.println(" 미만 : " + (a < b));
		System.out.println(" 같다 : " + (a == b));
		System.out.println(" 같지않다 : " + (a != b));
		
		// p.92 논리연산자 and, or : 비교연산자가 2개 이상일때
			// and : 2개이상의 비교연산자가 모두 True -> 결과 true 하나라도 false -> false
			// or : 2개이상의 비교연산자가 하나랃도 ture -> ture
		int c = 30; int d = 40;
		System.out.println(" and : " + (a>=b && d >= c));
		System.out.println(" or : " + (a>=b || d >= c));
		System.out.println(" not : " + !(a>=b || d >= c));
		
		// p.98 대입연산자
		a+= 1; // 변수명 += 값 오른쪽값을 왼쪽 변수명 더한후에 왼쪽 변수에 대입
		a*= 10;		System.out.println(a);
		a -= 10;	System.out.println(a);
		a /= 10l;	System.out.println(a);
		
		// p.100 조건연산자
		int e = 85;
		char f = e > 90 ? 'A' : 'B'; System.out.println(f);
		char g = e > 90 ? 'A' : e > 80 ? 'B' : 'C'; System.out.println(g);
		
		
			
	}

}
