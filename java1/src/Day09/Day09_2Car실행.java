package Day09;

public class Day09_2Car���� {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		for(int i =0; i <=5; i++) {
			int problemLocation = car.run();

			switch(problemLocation) {
				case 1:
					System.out.println("�� ���� HankookTire�α�ü");
					car.frontLeftTire = new HankookTire("�տ���", 15);
					break;
				case 2:
					System.out.println("�� ������ KumhoTire�α�ü");
					car.frontLeftTire = new HankookTire("�տ�����", 13);
					break;

				case 3:
					System.out.println("�� ���� HankookTire�α�ü");
					car.frontLeftTire = new HankookTire("�ڿ���", 14);
					break;

				case 4:
					System.out.println("�� ������ HankookTire�α�ü");
					car.frontLeftTire = new HankookTire("�ڿ�����", 17);
					break;

			}
			System.out.println("----------------------------------");
		}
	}
}
