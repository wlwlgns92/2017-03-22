package Day06;

public class Calculator {
		
	// �ʵ�
	
	// ������
	
	// �޼ҵ�
	
	void powerOn() {
		System.out.println( "������ �մϴ�.");
	}
	
		//�μ�o[int,int] ��ȯo
	int plus(int x, int y) {
		int result = x+y;
		return result;
		
	}
		////�μ�o[double,double] ��ȯo
	double divide(int x, int y) {
		double result = (double)x / (double) y;
		return result;
	}
	//�μ�x ��ȯx[void]
	void poweroff() {
		System.out.println("������ ���ϴ�.");
	}
}
