package ������;

public class gogo {

	public static void main(String[] args) {
		
		������ ������ = new ������();
		����� ����� = new �����();
		ȣ���� ȣ���� = new ȣ����();
		
		������.start();
		�����.start();
		ȣ����.start();
		
		try {Thread.sleep(6000);} catch (InterruptedException e) {	}
		
		System.out.println("������1 �̸� : " + ������.getName());
		System.out.println("������2 �̸� : " + �����.getName());
		System.out.println("������3 �̸� : " + ȣ����.getName());
	}
}
