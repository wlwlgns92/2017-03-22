package Day06;

public class Car3 {
		
	//1. �ʵ�
	String company ="�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//2. ������ : ���� �ٸ� �μ��� ���� ������ ������ ���� ����
	
	//2.1 :������� : �ʵ带 ���� ����
	public Car3() {
		}
	//2.2
	public Car3(String model) {
		this.model =model;
	}
	
	//2.3 �޼ҵ�
	public Car3(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
