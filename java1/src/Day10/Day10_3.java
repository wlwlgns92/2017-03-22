package Day10;

public class Day10_3 {
	
	public static void main(String[] args) {
		
		// p.394 ��øŬ����
		A a = new A(); // A Ŭ������ �޸� �Ҵ� �� �� ��ø�� Ŭ�������� �޸��Ҵ��� ���� �ʴ´�.
		// 2. �ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b = a.new B(); // �ν��Ͻ� Ŭ����
			// A.B b2 = new A.B();	// ���� Ŭ���� 
		b.field1 = 3;
		b.method();
		
		//3. ���� ��� Ŭ���� ��ü ����
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2=3; // static �� ��ü���� ���� ���� ����
		A.C.method2();
		
		
		//4. ���� Ŭ����
		a.method();
	}
}
