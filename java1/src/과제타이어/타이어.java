package ����Ÿ�̾�;


public class Ÿ�̾� { // ���� Ŭ����
	public static void main(String[] args) { // 1���ñ�
		//��ü�� �ʱⰪ 15
		
		Car car = new Car();
		
		for(int i = 0; i<=5; i++) {
			int ��ȯ�� = car.run();
			
			switch (��ȯ��) {
			case 1:
				System.out.println("�տ��� ��ȣŸ�̾�� ��ü�մϴϴ�.");
				car.flt = new Kumhotire(15, "�տ���");
				break;

			case 2:
				System.out.println("�տ����� �ѱ�Ÿ�̾�� ��ü�մϴ�");
				car.frt = new Hankooktire(15, "�տ�����");
				break;
			case 3:
				System.out.println("�ڿ��� ��ȣŸ�̾�� ��ü�մϴ�.");
				car.blt = new Kumhotire(15, "�տ���");
				break;
			case 4:
				System.out.println("�ڿ����� �ѱ�Ÿ�̾�� ��ü�մϴ�.");
				car.brt = new Hankooktire(15, "�ڿ�����");
				break;
			}
			
			
		}
		
	}
}
