package Day11;

import java.io.IOException;

public class Day11_4_p496 {
	//Ű����[����Ʈ] �Է� => �Է� ��Ʈ�� => �ڹ� ���α׷�
	
	//String Ŭ����
		//1. String ������ : ����Ʈ���� ���ڿ� ��ȯ
			// ������ �� 13�� ���� ����
			// ���ڿ����� �ε����� ����
	public static void main(String[] args) throws IOException {
		
	
	
	//p.497
	//1. ����Ʈ�迭�� ���� ����
	byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
	
	//2. ����Ʈ �迭�� String �����ڿ� �ֱ�
	String str1 = new String(bytes);
	System.out.println(str1);
	
	//3.							//s , c : 6(0����)�������� 4��   
	String str2 = new String(bytes, 6, 4);
	System.out.println(str2);
	
	//p.498
	//1. ����Ʈ 100���� ������ �� �ִ� �迭
	byte[] bytes2= new byte[100];
	
	System.out.print("�Է� : "); 
	int readcount = System.in.read(bytes2);
	System.in.read(bytes2);// ������ ���ܹ߻�
		//����°����� �׻� ����ó�� �߻�
			// System.in.read(�迭��); : Ű����κ��� �о�� ����Ʈ�� �迭�� ����
	System.out.println(new String(bytes2));
									//����Ʈ�� -> ���ڿ� ��ȯ
	System.out.println(new String (bytes2,0, readcount-2));
	
	//p.499
		// 2. charAt() : ���� ����
	String ssn = "010624-1230123";
	char sex =ssn.charAt(7);
	switch (sex) {
	case '1':
	case '3':
		System.out.println("�����Դϴ�.");
		break;
	case '2':
	case '4':
		System.out.println("�����Դϴ�.");
		break;
	}	
	//p.500
		//3. eqyals(�񱳴���ڿ�) : ���ڿ� ��
	
	String strVar1 = new String("�Ź�ö");
	String strVar2 = "�Ź�ö";
	String strVar3 = "�Ź�ö";
	
	if(strVar1 == strVar2) {System.out.println("����");}
	else {System.out.println("�ٸ���");}
	
	if(strVar1.equals(strVar2)) {System.out.println("����");}
	else {System.out.println("�ٸ���");}
	
	//p.502
		//4. getBytes() : ���ڿ��� ����Ʈ���� ��ȯ
	String str = "�ȳ��ϼ���";
	byte[] bytes3 = str.getBytes(); // ���ڿ� String �� ����Ʈ�� ��ȯ�� �迭�� ����
	System.out.println(bytes3.length); // �ѱ��� �Ѱ��� 2����Ʈ���� 10����Ʈ�� ���´�. ���ڼ� *2
	
	//����Ʈ -> ���ڿ�
	System.out.println( new String(bytes3));
	
		// ���ڵ� ����
			// 1. UTF-8 : ������ �����
			// 2. EUC-KR [ CP949 ] : ����, �ѱ�
	
	// p.504
	// 5. indexOf() : ���ڿ� ã�� [ �μ� : ã�� ���ڿ� ��ȯ : ã�� �ε��� ��ġ]
	
	String subject = "�ڹ� ���α׷���";
	subject.indexOf("�ڹ� ���α׷���");
	System.out.println(subject.indexOf("���α׷���"));
	if(subject.indexOf("�ڹ�") != -1) { // �ε����� -1 �̸� �ε����� ���� // ã�����ڰ� �������� ����
		System.out.println("�ڹٿ� ���õ�  å�Դϴ�.");		
	}else { 
		System.out.println("�ڹٿ� ���þ��� å�Դϴ�.");
	}
	
	// 5.1
	//contains() : ���ڿ� ���� ���� [�μ�: ã�� ���ڿ� ��ȯ true /false �� �˷��ش�]
	subject.contains(subject);
	System.out.println(subject.contains("�ڹ�"));
	//p. 505
		//6. length() : ���ڿ��� ���̸� �˷���
	System.out.println(subject.length());
	
	
	//p.506
		//7. replace("��ü�� ���ڿ�", "���ο�ڿ�") : ���ڿ� ��ġ 
	String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�";
	String newStr = oldStr.replace("�ڹ�", "JAVA");
	System.out.println(oldStr);
	System.out.println(newStr);
	
	
	//p.507
		//8. substring() : ���ڿ��� �߶󳻱�
		String ssn2 = "880815-1234567";
		System.out.println(ssn2.substring(0,6)); // �����ε��� , ���ε���
		System.out.println(ssn2.substring(7));// �����ε�����
		//9. split() : ���ڿ� �и�
		String[] ssn3 = ssn2.split("-"); // - �������� �и��Ѵ�
		System.out.println(ssn3[0]);
		System.out.println(ssn3[1]);
		
	//p.508
		// 10. toLowerCase() : �ҹ��ڷ� ��ȯ toUpperCase() : �빮�ڷ� ��ȯ
		String str3 = "Java Programming";
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		
	//p.509
		// 11. trim() : ���ڿ� �յ� ���� ���� [ ���� ���̰��� ���� �Ұ� ]
		String str4 = "              �ڹ�               ���α׷���     ";
		System.out.println(str4.trim());
		
	//p.510
		// 12. valueOf() : �⺻Ÿ���� ���ڿ� ��ȯ [ "" ó���� �Ǹ鼭 ���ڿ� ��ȯ�� �ȴ�]
		String str5 = String.valueOf(10); //������ [int] = > ���ڿ�
		String str6 = String.valueOf(10.5); // �Ǽ��� [double] => ���ڿ�
		String str7 = String.valueOf(true); //���� => ���ڿ�
		
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		

	}
	
}