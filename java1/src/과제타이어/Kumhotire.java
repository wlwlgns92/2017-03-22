package ����Ÿ�̾�;

public class Kumhotire extends Tire{ 
	// 1���ñ�
	
	public Kumhotire(int �ִ�ȸ����, String Ÿ�̾���ġ) {
		super(�ִ�ȸ����, Ÿ�̾���ġ);
	}
	
	@Override
	boolean roll() {
		++����ȸ����;
		if(����ȸ���� < �ִ�ȸ���� ) {
			System.out.println(Ÿ�̾���ġ + "��ȣŸ�̾� ���� " + (�ִ�ȸ����-����ȸ����));
			return true;
		}
		else { 
			System.out.println(Ÿ�̾���ġ + " ��ȣŸ�̾� ���ٳ����ϴ�.");
			return false;
		}
	}

}
