package Day11;

public class Day11_3_p480 {
	
	//System class [��� ����� static �̱� ������ ��ü�� �ʿ����]
			// 1. exit : ���α׷� ����
	
	
	public static void main(String[] args) {
//		System.setSecurityManager(new SecurityManager() { 
//			@Override
//			public void checkExit(int status) {
//				if(status != 5) {
//					throw new SecurityException();
//					//i�� 0�϶� status = 0 => true = > ���ܹ߻�o
//					//i�� 1�϶� status = 1 => true = > ���ܹ߻�o
//					//i�� 5�϶� status = 5 => false = > ���ܹ߻�x
//				}
//			
//			}
//		});
//		for (int i=0; i <10 ; i++) { // i 0���� 9���� 1�� ����
//			System.out.println(i); // ���
//			try {
//				System.exit(i); // i�� exit() [i�� 5�϶� ���ܰ� ���⶧���� exit ����] 	
//			} catch (Exception e) {
//			
//			}
//			
//		}
//		
		//2.
		
		//1. ���� �ð� ( for�� 1000000ȸ ���������� �ɸ��� �ð�
		long time1 = System.nanoTime();
		int sum =0;
		for( int i = 1 ; i <= 1000000; i++) {
			sum+=i;
		}
		//2. ������ �ð�
		long time2 = System.nanoTime();
		
		System.out.println( "1~1000000�� ��" + sum);
		System.out.println("�ɸ��ð� : " + (time2-time1) + "������");
		System.out.println(System.nanoTime());
		
		
		//3. �ý��������б� [ System.getgetProperty("ȣ��Ű"); ]
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("user.home"));
		
		//4. 
		
		
	}
	
		
	
}