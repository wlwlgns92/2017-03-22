package ����;

public class ���� {
	
	public static void main(String[] args) {
		String[] �迭 = {"10", "2a"};
		int value = 0;
		
		for(int i =0; i <= 2; i++) {
			try {
				value = Integer.parseInt(�迭[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε����� �ʰ��ߴ�.");
			} catch (NumberFormatException e) {
				System.out.println("���ڷ� ����ȯ �Ұ�");
			}finally {
				System.out.println(value);
			}
		}
	}
}
