package ����Ÿ�̾�;

public class Hankooktire extends Tire{
	//1���ñ� 
	
	public Hankooktire(int �ִ�ȸ����, String Ÿ�̾���ġ) {
		super(�ִ�ȸ����, Ÿ�̾���ġ);
	}
	
	@Override
	
	boolean roll() {
		++����ȸ����;
		if(����ȸ���� < �ִ�ȸ���� ) {
			System.out.println(Ÿ�̾���ġ + "�ѱ�Ÿ�̾� ���� " + (�ִ�ȸ����-����ȸ����));
			return true;
		}
		else { 
			System.out.println(Ÿ�̾���ġ + " �ѱ�Ÿ�̾� ���ٳ����ϴ�.");
			return false;
		}
	}
}
