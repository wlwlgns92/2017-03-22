package Day10;

public class Day10_5 {

	// ����ó�� : 1.�Ϲݿ��� 2.���࿹��
		// ���� : �پ��� ���� �߻��� => ���α׷� ����ȭ�� ����
		
	// p.423 NullPointerException ����
	public static void main(String[] args) {
		try {
		String data = null; // String ��ü�� null ���� o
				System.out.println(data.toString()); // toString : ��ü������ȯ
		} catch (Exception e) {
		System.out.println("���ܰ� �߻� �߽��ϴ�. [ ������ ���� ]");
		System.out.println("�������� : " + e);
		}finally {
			System.out.println("������ ����Ǵ� ��ġ");
		}
	// ��2 : ArrayIndexOutOfBoundsException ����
	
	try {
	String[] ���ڿ��迭 = new String[2];// String 2���� �����ϴ� �迭 ����
	���ڿ��迭[0] = "���缮"; ���ڿ��迭[1] = "��ȣ��"; ���ڿ��迭[3] ="�ŵ���";
	}
	catch (Exception e) {
		System.out.println("�迭�� �ڸ��� �����մϴ�. [������ ����]");
		System.out.println("�������� : "+ e);
	}finally {
		System.out.println("������ ����Ǵ� ��ġ");	
	}
	// ��3 p.426 : NumberFormatException ���� [ a100�� ���ڷ� ǥ���� �� ����.]
	
	try {
	String data1 = "100"; // ���� 100 �� ���� 100���� �ٲ۴� [ ����] 
	String data2 = "a100"; // a100 �� ���� 100���� �ٲ۴�[ �Ұ���]
	
	System.out.println(Integer.parseInt(data1));
	System.out.println(Integer.parseInt(data2));
			// integer : �������� Ŭ���� [ ���� ���� �޼ҵ� ����]
			// .parseint(����)  : ���ڸ� ���������� ��ȯ���ִ� �޼ҵ�
	}catch (Exception e) {
		System.out.println("���ڰ� ���Ե� ���ڿ��� ������ ��ȯ�� �Ұ� [ ������ ����]");
		System.out.println("���������� : "+e);
	}finally {
		System.out.println("������ ����Ǵ� ��ġ");	
	}
	
	// ����ó�� �ڵ�
	// try {} �ȿ��� ���ܹ߻��ϸ� catch �� ��ü�� �����߻������� �����ϰ� catch ����
	// �� ���ܰ� ������� try {} ������� catch {}�� ���� ����
	// finally {���� ������ ������� ����Ǵ� �ڵ�} (�ᵵ�ǰ� �Ƚᵵ��)
	
	// �ۼ����
	// try { ���ܰ� �߻� ���� �ڵ�}
	// catch(���� Ŭ������ ������) { ���� �߻��� ����Ǵ� �ڵ�}
	
	// ����Ŭ����
	/* Exception : ���� ����Ŭ���� : ��� ���� ���� ����
	 * NullPointerException
	 * ArrayIndexOutOfBoundsException
	 * NumberFormatException 
	 */
	// ���� ���ѱ��
		// ���� : �޼ҵ峻���� �߻��� ���ܸ� ȣ���� ������ �̵� [���� ���ϼ�]
	// ����� ����
	

	}
}
