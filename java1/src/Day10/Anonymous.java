package Day10;

public class Anonymous {

	// �ʵ�
	Person person = new Person(); 
	// �͸�ü	: ��ȸ��
	Person field = new Person() {
		
		void work() {
			System.out.println("����մϴ�.");
		}
		
		@Override
		void wake() {
		System.out.println("7�ÿ� �Ͼ�ϴ�.");		
		}
	};// �͸�ü ���� ��
	
	
	//������
	
	//�޼ҵ�
	
	void method1() {
		Person localVar = new Person() {
			void walk() { System.out.println("��å�� �մϴ�.");
			}
			@Override
			void wake() {
			System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();;
			}
		}; // �͸�ü�� ; ���־���Ѵ�
	localVar.wake();
	
	
	}
	void method2(Person person) {
		person.wake();
	}
}
