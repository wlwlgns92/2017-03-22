package ����Ÿ�̾�;

public class Tire {
	// 1���ñ�
	int �ִ�ȸ����;
	int ����ȸ����;
	String Ÿ�̾���ġ;
	
	
	
	public Tire(int �ִ�ȸ����, String Ÿ�̾���ġ) {
		this.�ִ�ȸ���� = �ִ�ȸ����;
		this.Ÿ�̾���ġ = Ÿ�̾���ġ;
	}



	boolean roll() {
		++����ȸ����;
		if(����ȸ���� < �ִ�ȸ���� ) {
			System.out.println(Ÿ�̾���ġ + "Ÿ�̾� ���� " + (�ִ�ȸ����-����ȸ����));
			return true;
		}
		else { 
			System.out.println(Ÿ�̾���ġ + " ���ٳ����ϴ�.");
			return false;
		}
	}

}
