package Day03;

public class Day03_6 {
	
	/*for( �ʱⰪ; ���ǹ�; ������) {���๮}
	 * while(���ǹ� ) {
	 * 		���๮
	 * 		������)
	 */
	//p.125 ��1
	public static void main(String[] args) {
		int i=1;
		while(i<=10) { System.out.println(i);
		i++;}
		
		
		//p.125 ��2 while
		int sum =0;
		int h = 1; // �ʱⰪ
		while(h<=100) {sum+=h; h++;}
		System.out.println("1���� 100���� �����հ�� : " + sum);
		// for 
		int sum2=0;
		for(int k=1; k<=100; k++) {sum2+=k;}
		System.out.println("1~100���� �հ��" + sum2);
		
		// ���� ����-> while(true)
		while(true) {System.out.println("��� ������");}
		
	}
	
	

}
