package ������;

public class ��ȭ��� extends Thread{
public static boolean stop = true;
	
	public static void moviestop (boolean sw) {
		stop=sw;
		if(stop) {System.out.println("��ȭ����");	}
		else {System.out.println("��ȭ����");}
	}

	@Override
	public void run() {
	while(stop) { // stop�� true�� ��쿡�� ���� // �ƴϸ� ���� ����
		try {Thread.sleep(1000);} catch (Exception e) {	}
		System.out.println("��ȭ���");

	}
	}
}
