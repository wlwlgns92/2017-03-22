package ������;

public class ȣ���� extends Thread{

	
	public ȣ����() {
	super.setName("ȣ���̼Ҹ�");
	}
	
	@Override
	public void run() {
	for(int i = 0; i < 5; i++) {
		try {Thread.sleep(1000);} catch (Exception e) {	}
		System.out.println("����"+i);
	}	
	}
}
