package ������;

public class ������� extends Thread{
	
	public static boolean stop = true;
	
	public static void musicstop (boolean sw) {
		stop=sw;
		if(stop) {System.out.println("���ǽ���");	}
		else {System.out.println("��������");}
	}

	@Override
	public void run() {
	while(stop) { // stop�� true�� ��쿡�� ���� // �ƴϸ� ���� ����
		try {Thread.sleep(1000);} catch (Exception e) {	}
		System.out.println("�������");

	}
	}

}
