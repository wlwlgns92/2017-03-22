package Day10;

public class ButtonExample {
	
	public static void main(String[] args) {
		Button button = new Button();
			// button ��ü �� �������̽� ����!
		button.setOnClickListener(new CallListener());
		button.touch();
		System.out.println("��ü�� �������̽��� ����� ������ü ����");
		button.setOnClickListener(new MessageListener());
		button.touch();
	}
}
