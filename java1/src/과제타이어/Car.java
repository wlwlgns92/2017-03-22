package ����Ÿ�̾�;

public class Car { // 1���ñ� 
	// Ÿ�̾� �ʱⰪ 6,2,3,4
	Tire flt = new Tire(6, "�տ���");
	Tire frt = new Tire(2, "�տ�����");
	Tire blt = new Tire(3, "�ڿ���");
	Tire brt = new Tire(4, "�ڿ�����");
	
	int run() {
		
		if(flt.roll() == false) {stop(); return 1; }
		if(frt.roll() == false) {stop(); return 2; }
		if(blt.roll() == false) {stop(); return 3; }
		if(brt.roll() == false) {stop(); return 4; }
		return 0;
	}
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
	
}
