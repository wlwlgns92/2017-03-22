package Day06;

public class Day06_1 {
	
	public static void main(String[] args) {
		
		//p.195
		//1. ��ü ����� : Ŭ������ �̿��� �޸� �Ҵ�
			//Ŭ������ ��ü�� = new ������();
				//Ŭ������ == �����ڸ�
		Student student= new Student();
		System.out.println("student ������  student ��ü�� �����մϴ�.");
		
		Student student2 = new Student();
		
		System.out.println("student2 ������ �� �ٸ� student ��ü�� �����մϴ�.");
		
		System.out.println("��ü�̸� ��� : " + student );
		
		// p.201
			//1. �ڵ��� ��ü �����
			Car car= new Car();
			
			//2. ��ü�� ���[�ʵ�]ȣ��
			System.out.println("����ȸ�� : " + car.company);
			System.out.println("�𵨸� : " + car.model);
			System.out.println("���� : " + car.color);
			System.out.println("�ְ�ӵ��� : " + car.maxSpeed);
			System.out.println("����ӵ� : " + car.speed);
			
			//3. ��ü�� ���[�ʵ�] �� ����
			System.out.println(">>>�ӵ�����");
			car.speed = 60;
			System.out.println("������ �ӵ� "+ car.speed);
		
		//p.205 : �����ڸ� �̿��� ��ü ����
			Car2 car2 = new Car2("����", 3000); // ������
			
		//p.207 : ������ -> �ʵ� �ʱ�ȭ\
		
			Korean korean = new Korean("���ڹ�", "011225-1234567");
			System.out.println("korean1 name : " + korean.name);
			System.out.println("korean1 ssn : "+ korean.ssn);
			
			Korean korean2 = new Korean("���ڹ�", "123465-2413456");
			System.out.println("korean2 name : " + korean2.name);
			System.out.println("korean2 ssn : "+ korean2.ssn);		
			
			
			//����ִ� ��ü [�������]
			Korean korean3 =new Korean();
			korean3.name = "���ڹ�";
			korean3.ssn = "453445-31434";
			System.out.println("korean3 name : " + korean.name);
			System.out.println("korean3 ssn : "+ korean.ssn);
	}
}
