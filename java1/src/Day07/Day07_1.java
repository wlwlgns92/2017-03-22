package Day07;

public class Day07_1 {
	// Day06 : Ŭ���� [ ���赵 : �ڷ��� �����]
		// 1. ��� (���û��� �ʼ��� �ƴ�)
			//1.1�ʵ� : ������ ����[�޸��Ҵ�]
			//1.2������  : ��ü �ʵ� �ʱⰪ
			//1.3�޼ҵ� : ������ ����
				// ��ȯŸ�� �޼ҵ�� (�μ�1, �μ�2, �μ�3 ~~~) {return 
		// 2. ��ü(Ŭ������ �ν��Ͻ�) ����
			// Ŭ������ ��ü��
				// ��ü�� = new ������(); <---�ν��Ͻ�
			//��ü�� ���(�ʵ�,������) �����Ҷ� .(���ٿ�����)�� ���
	public static void main(String[] args) {
		// p.236
		
		
		// p.239
		double result = 10* 10 * Calculator.pi;
				// �ش� Ŭ������ ��� ���� ���
					//1. ��ü ���� [ �ش� Ŭ�����κ��� �޸� �Ҵ� ]
					//2. static [ �������� ] : ���α׷� ���۽� �޸� �Ҵ�[ main ���ຸ�� �켱 ����]
						//static ���� : �޸� ȿ���� ���� �ʴ�.
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		// p.245
		Person p1 = new Person("123456-1234567", "���");
		
				// �ʵ� ����
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//�ʵ����
//		p1.nation = "usa";
//		p1.ssn = "654321-7654321";
		p1.name = "��������";
		
		// p.253 : import : �ٸ� ��Ű���κ��� Ŭ������ �������� Ű����
					// 1. ����� : import.��Ű����.Ŭ����;  [Ŭ���� �ܺο� �ۼ�]
					// 2. ������� ��Ű����.Ŭ������ ��ü��; [Ŭ���� ���ο� �ۼ�]
					// �ڵ��ϼ��� import �ڵ� �ϼ� �����ϸ� ���[�ڵ��ϼ��� ��Ű���� �� Ȯ��]
		
	}
}
