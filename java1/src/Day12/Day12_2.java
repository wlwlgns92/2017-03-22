package Day12;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Day12_2 {
		
	//p.527
		// Wrapper ���� Ŭ���� : �⺻�ڷ��� -> ��üȭ
	
	//p.531
	// ���ڿ� - > �⺻Ÿ��
		// 1. Integer.parseInt("���ڿ�")
		// 2. Double.parseDouble("���ڿ�")
		// 3. Boolean.parseBoolean("���ڿ�")
		// * Byte.parseInt() , Short.parseInt(), Long.parseInt(), Float.parseInt()
		// �⺻Ÿ�� = > ���ڿ� valueOf()
			// 1. String.valueOf(�⺻�ڷ���)
		// ����Ʈ => ���ڿ� 
			// new ������(����Ʈ�迭)
	int value1 = Integer.parseInt("10"); // ���� "10" =>> ���� 10
	double value2 = Double.parseDouble("3.14"); // ���� "3.14" -> �Ǽ� 3.14
	boolean value3 = Boolean.parseBoolean("true"); //���� "true" => �� true
	
		//p.534 Math Ŭ����
		// 1. Math.abs()
	public static void main(String[] args) {
		System.out.println("���밪 : " + Math.abs(-5));	 // 5
		System.out.println("���밪 : " + Math.abs(-3.14)); // 3.14
		
			//2. Math.ceil()
		System.out.println("�ø��� : " + Math.ceil(5.3));  // 6.0
		System.out.println("�ø��� : " + Math.ceil(-5.3)); //-5.0
		
		//3. Math.floor()
		System.out.println("������ : " + Math.floor(5.3)); //5
		System.out.println("������ : " + Math.floor(-5.3)); //-6.0
		
		 //4. Math.max() 
		System.out.println("�ִ밪 : " + Math.max(5,9)); //9
		System.out.println("�ִ밪 : " + Math.max(5.3, 2.5)); // 5.3
		
		//5. Math.min()
		System.out.println("�ּҰ� : " + Math.min(5,9)); //5
		System.out.println("�ּҰ� : " + Math.min(5.3,2.5)); //2.5
		
			// 6. Math.random()
		System.out.println(" ���� : " + Math.random());
		
			// 7. Math.rint()
		System.out.println("����� ������ �Ǽ��� : " + Math.rint(5.3)); //5.0
		System.out.println("����� ������ �Ǽ��� : " + Math.rint(5.7)); //6.0
		
			//8. Math.round() : �Ҽ��� ù°�ڸ� �ݿø�
		System.out.println("�ݿø� : " + Math.round(5.3)); //5
		System.out.println("�ݿø� : " + Math.round(5.7)); //6
			//* �Ҽ��� ��°�ڸ� �ݿø� [ �ڸ��� �ø��� �ݿø� �� �ڸ��� ����]
		double value = 12.3456;
		double rvalue = Math.round(value*100); //1234.56
		System.out.println(rvalue/100);
		
		//p.536
		//int num = Math.random(); // 0~1
		//int num = Math.random()*6; // 0*6 ~ 1*6
		int num = (int)(Math.random()*6)+1; // 0*6+1 ~ 1*6+1 = 1~7
		
		// p.537 : Random Ŭ���� [Random Ŭ������ static �޼ҵ带 �������� ����] 
		Random random = new Random(); // Random Ŭ������ static �޼ҵ带 �������� ����
//		int num2 = random.nextInt(); // int�� ǥ���� �� �ִ� ������ŭ ����
		int num2 = random.nextInt(6)+1; //1~6
		System.out.println(num2);
		
		
		//p.539
		// Date Ŭ���� : �ý��� ��¥/�ð�
		Date date = new Date();
		
		
		//p.540
		// Calender Ŭ���� : �ü�� �ð����� ��¥/ �ð��� ���� ����
		
		Calendar now = Calendar.getInstance(); // ������ �ִ� ��ü�� ��������
		System.out.println("�⵵ : " + now.get(Calendar.YEAR));
		System.out.println("�� : " + (now.get(Calendar.MONTH)+1)); // 0~11���� ��µǼ� +1 ������Ѵ�.
								//+ : ���Ῥ���� 				// + : ���ϱ� ������ ()�� ����ؼ� ����
		System.out.println("�� : " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("���� : " + now.get(Calendar.DAY_OF_WEEK)); //������ ���ڷ� ��ȯ��
							// 1:�� 2:�� 3:ȭ 4:�� 5:�� 6:�� 7:��
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek =null;
				switch (week) {
				case Calendar.SUNDAY : strWeek = "��"; break;
				case Calendar.MONDAY : strWeek = "��"; break;
				case Calendar.TUESDAY : strWeek = "ȭ"; break;
				case Calendar.WEDNESDAY : strWeek = "��"; break;
				case Calendar.THURSDAY : strWeek = "��"; break;
				case Calendar.FRIDAY : strWeek = "��"; break;
				case Calendar.SATURDAY : strWeek = "��"; break;
				}
		System.out.println("���� : " + strWeek);
		
		System.out.println("����/���� : " + now.get(Calendar.AM_PM)); // 0: ���� 1: ����
		int ampm = now.get(Calendar.AM_PM);
		String strampm = null;
		if(ampm==Calendar.AM) { strampm = "����";}
		else { strampm = "����";}
		System.out.println("�������� : " + strampm);
		
		System.out.println("�� : " + now.get(Calendar.HOUR));
		System.out.println("�� : " + now.get(Calendar.MINUTE));
		System.out.println("�� : " + now.get(Calendar.SECOND));
		
		// �����ð�
			// ZonedDateTime Ŭ���� : �����ð� 
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("�����ð� �ð� : " + zonedDateTime);
		zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("���� �ð� : " + zonedDateTime);
		zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("���� �ð� : " + zonedDateTime);
				
		
				
	}
}
