package ������;

public class ������ extends Thread {
	
	
	
	public ������() {
		super.setName("�������Ҹ�");
	}
	
	
	@Override
	public void run() {
	for(int i = 0; i < 5; i++) {
		try {Thread.sleep(1000);} catch (Exception e) {	}
		System.out.println("�۸�"+i);
	}	
	}

}
