package ������;



public class �л� extends Top{

	static String s_id;
	static String s_pw;
	static String s_birth;
	static String s_phone;
	static String s_name;
	
	public �л�(String s_id, String s_pw, String s_birth, String s_phone, String s_name) {
		this.s_id = s_id;
		this.s_pw = s_pw;
		this.s_birth = s_birth;
		this.s_phone = s_phone;
		this.s_name = s_name;	
	}
	
	public boolean signup() {
		System.out.println("========ȸ������ ������=========");
		System.out.print(" ����Ͻ� �й��� �Է����ּ��� : "); 	String s_id = Total.scanner.next();
		boolean check = idcheck(s_id);
		System.out.print("����Ͻ� ��й�ȣ ��й�ȣ : ");	String s_pw = Total.scanner.next();
		System.out.print("�л� ������ ��������� �Է����ּ��� : ");	String s_birth = Total.scanner.next();
		System.out.print("�л� ������ ����ó�� �Է����ּ��� : ");		String s_phone = Total.scanner.next(); 
		System.out.print("�л� ������ �̸��� �Է����ּ��� : ");		String s_name = Total.scanner.next();
		
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		System.out.println();
		// 2. ��ü ����
		�л� �л�1 = new �л�(s_id, s_pw, s_birth, s_phone, s_name);
		
		// 3. �迭�� �ֱ�
		for( int i = 0 ; i<Total.�л�.length; i++ ) {
			if( Total.�л�[i] == null ) {
				Total.�л�[i] = �л�1;
				return true; 
			}		
		}
		return false;
	}
	public String login() {
		System.out.println("--------------�α���---------------");
		System.out.println("�й��� �Է��� �ּ��� : "); String s_id = Total.scanner.next();
		System.out.println("��й�ȣ�� �Է��� �ּ��� : "); String s_pw = Total.scanner.next();
		
		for(int i=0; i < Total.�л�.length; i++) {
			if (Total.�л�[i] != null && 
					Total.�л�[i].getS_id().equals(s_id) &&
					Total.�л�[i].getS_pw().equals(s_pw)) {
					return s_id;
			} 
		} return null;
	}
	
	public static boolean idcheck(String check_id) { 
		for(int i = 0; i < Total.�л�.length; i++) {
			if( Total.�л�[i] != null &&  Total.�л�[i].getS_id().equals(check_id)) {
				System.out.println("[�˸�] �ߺ��� ���̵� �ֽ��ϴ�."); return true;
			}
		}return false;
	}
	public String findid() { 
		System.out.println("--------------���̵� ã��---------------");
		System.out.println("�л� ���� ������ �Է��� �ּ��� : "); String s_name = Total.scanner.next();
		System.out.println("�л� ���� ��������� �Է��� �ּ��� : "); String s_birth = Total.scanner.next();
		System.out.println("�л� ���� ����ó�� �Է��� �ּ��� : "); String s_phone = Total.scanner.next();
		
		for(int i = 0 ; i < Total.�л�.length; i++) {
			if(Total.�л�[i] != null && Total.�л�[i].getS_name().equals(s_name) &&
					Total.�л�[i].getS_birth().equals(s_birth) && 
					Total.�л�[i].getS_phone().equals(s_phone)) {
				System.out.println();
				System.out.println("�й��� : " + Total.�л�[i].getS_id()); break;
			}else {System.out.println("�Է��Ͻ� ������ �������� �ʽ��ϴ�.");}
		}
			return null;
	}
	public String findpw() {
		System.out.println("--------------���̵� ã��---------------");
		System.out.println("�л� ���� ������ �Է��� �ּ��� : "); String s_name = Total.scanner.next();
		System.out.println("�л� ���� ��������� �Է��� �ּ��� : "); String s_birth = Total.scanner.next();
		System.out.println("�л� ���� ����ó�� �Է��� �ּ��� : "); String s_phone = Total.scanner.next();
		
		for(int i = 0 ; i < Total.�л�.length; i++) {
			if(Total.�л�[i] != null && Total.�л�[i].getS_name().equals(s_name) &&
					Total.�л�[i].getS_birth().equals(s_birth) && 
					Total.�л�[i].getS_phone().equals(s_phone)) {
				System.out.println();
				System.out.println("�й��� : " + Total.�л�[i].getS_id()); break;
			}else {System.out.println("�Է��Ͻ� ������ �������� �ʽ��ϴ�.");}
		}
			return null;
	}

	public static String getS_id() {
		return s_id;
	}

	public static void setS_id(String s_id) {
		�л�.s_id = s_id;
	}

	public static String getS_pw() {
		return s_pw;
	}

	public static void setS_pw(String s_pw) {
		�л�.s_pw = s_pw;
	}

	public static String getS_birth() {
		return s_birth;
	}

	public static void setS_birth(String s_birth) {
		�л�.s_birth = s_birth;
	}

	public static String getS_phone() {
		return s_phone;
	}

	public static void setS_phone(String s_phone) {
		�л�.s_phone = s_phone;
	}

	public static String getS_name() {
		return s_name;
	}

	public static void setS_name(String s_name) {
		�л�.s_name = s_name;
	}
	

}
