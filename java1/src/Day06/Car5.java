package Day06;

public class Car5 {
	
	
	//�ʵ� [������ ����]
	String model;
	int speed;
	//������ [ ������ �ʱⰪ ]
	public Car5(String model) {
		
		//�ܺηκ��� ���� ������[�μ�]�� ���ο� ����
		//[���κ��� == �μ�����] :
		this.model=model; // [this.���κ��� = �μ�����]
		//�μ��� ���κ����� �̸��� �����ϰ� ����
	}
	//�޼ҵ� [ ������ �ൿ ]
	void setSpeed(int speed) {
		this.speed=speed;
	}
	//
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);// ����Ŭ���������� �޼ҵ� �ٷ� ȣ�� ����
			System.out.println(this.model + "�� �޸��ϴ�.(�ü� : "+ this.speed + "km/h)");
			
		}
	}
}
