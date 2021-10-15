package Day11;

public class Day11_3_p480 {
	
	//System class [모든 멤버가 static 이기 때문에 객체가 필요없음]
			// 1. exit : 프로그램 종료
	
	
	public static void main(String[] args) {
//		System.setSecurityManager(new SecurityManager() { 
//			@Override
//			public void checkExit(int status) {
//				if(status != 5) {
//					throw new SecurityException();
//					//i가 0일때 status = 0 => true = > 예외발생o
//					//i가 1일때 status = 1 => true = > 예외발생o
//					//i가 5일때 status = 5 => false = > 예외발생x
//				}
//			
//			}
//		});
//		for (int i=0; i <10 ; i++) { // i 0부터 9까지 1씩 증가
//			System.out.println(i); // 출력
//			try {
//				System.exit(i); // i를 exit() [i가 5일때 예외가 없기때문에 exit 실행] 	
//			} catch (Exception e) {
//			
//			}
//			
//		}
//		
		//2.
		
		//1. 시작 시간 ( for이 1000000회 실행했을때 걸리는 시간
		long time1 = System.nanoTime();
		int sum =0;
		for( int i = 1 ; i <= 1000000; i++) {
			sum+=i;
		}
		//2. 끝나는 시간
		long time2 = System.nanoTime();
		
		System.out.println( "1~1000000의 합" + sum);
		System.out.println("걸린시간 : " + (time2-time1) + "나노초");
		System.out.println(System.nanoTime());
		
		
		//3. 시스템정보읽기 [ System.getgetProperty("호출키"); ]
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("user.home"));
		
		//4. 
		
		
	}
	
		
	
}
