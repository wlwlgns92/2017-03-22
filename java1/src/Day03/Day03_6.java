package Day03;

public class Day03_6 {
	
	/*for( 초기값; 조건문; 증감식) {실행문}
	 * while(조건문 ) {
	 * 		실행문
	 * 		증감식)
	 */
	//p.125 예1
	public static void main(String[] args) {
		int i=1;
		while(i<=10) { System.out.println(i);
		i++;}
		
		
		//p.125 예2 while
		int sum =0;
		int h = 1; // 초기값
		while(h<=100) {sum+=h; h++;}
		System.out.println("1부터 100까지 누적합계는 : " + sum);
		// for 
		int sum2=0;
		for(int k=1; k<=100; k++) {sum2+=k;}
		System.out.println("1~100까지 합계는" + sum2);
		
		// 무한 루프-> while(true)
		while(true) {System.out.println("계속 실행중");}
		
	}
	
	

}
