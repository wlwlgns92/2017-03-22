package Day07;


public class Member {

	//�ʵ� [ ���̵�(�ߺ��Ұ�), ��й�ȣ , �̸� , ����ó ���]
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	
	//������ [��ü ������ �ʵ��� �ʱⰪ]
		//1. ȸ�����Խ� �����Ǵ� ��ü�� ������
	public Member() {
	}

	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}

	//�޼ҵ�
		//1. �ʵ带 private => get, set ���
		//2. ȸ������ [�Է¹��� ������ ��ü �����ؼ� �迭�� ����]
	public static boolean signup() {
		

		//�Է� �ޱ�
		System.out.println("------ȸ������---------");
		System.out.print("����Ͻ� ���̵� �Է����ּ��� : "); String m_id = BookApplication.scanner.next();
			// ���̵� �ߺ�üũ
			boolean check = idcheck(m_id);
			if(check) {
				System.out.println("����� �� ���� ���̵� �Դϴ�.");
				return false;
			}
		System.out.print("����Ͻ� ��й�ȣ�� �Է����ּ��� : "); String m_pw = BookApplication.scanner.next();
		System.out.print("������ �Է��� �ּ��� : "); String m_name = BookApplication.scanner.next();
		System.out.print("����ó�� �Է��� �ּ��� : "); String m_phone = BookApplication.scanner.next();
		System.out.println();
		//2. �Է¹��� ������ ��ü ����
		Member member = new Member(m_id, m_pw, m_name, m_phone);
		
		//3. ���� ��ü�� �迭�� �ֱ�
		for(int i=0; i< BookApplication.members.length; i++) {
			if(BookApplication.members[i] ==null) {
				BookApplication.members[i] = member;
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
				return true;
			}
		}
			return false;
	}
		// public : main�� ���� Ŭ����[�ܺ�Ŭ����]�� ȣ�� �ϱ����ؼ�
		// ��ȯ�� : ���� / ���� => true / false
	
		//3. �α��� [�Է� ���� ���̵�� ��й�ȣ�� �迭�� �����ϸ� �α��� ���� �ƴϸ� ����]
	public static String login() {
		
		System.out.println("-------------�α��� ȭ��-------------");
		System.out.print("���̵� �Է����ּ��� : "); String m_id = BookApplication.scanner.next();
		System.out.print("��й�ȣ�� �Է����ּ��� : "); String m_pw = BookApplication.scanner.next();
		
		for(int i=0; i< BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null && 
					BookApplication.members[i].getM_id().equals(m_id) && 
					BookApplication.members[i].getM_pw().equals(m_pw)) {
				return m_id; // �α��� ������ ������ ���̵� ��ȯ
			}
		}
		return null; //�α��ν���
	}
		// ��ȯ��: �α��� ������ -> ������ ���̵� / ���н� null 
	
		//4. ���̵�ã��  (�̸�,����ó �Է¹޾� == ���̵� �˷��ֱ�)
	public static String findid() {
		System.out.println("--------------���̵� ã��------------");
		System.out.print("������ ������ �Է����ּ��� : "); String m_name = BookApplication.scanner.next();
		System.out.print("������ ����ó�� �Է����ּ��� : "); String m_phone = BookApplication.scanner.next();
		for(int i =0; i < BookApplication.members.length; i++ ) {
			if(BookApplication.members[i] != null && 
				BookApplication.members[i].getM_name().equals(m_name) &&
				BookApplication.members[i].getM_phone().equals(m_phone)) {
				System.out.println("�����Ͻ� ���̵�� : " + BookApplication.members[i].getM_id());
			}else {System.out.println("�Է��Ͻ� ������ ã���� �����ϴ�."); break;}
				
		}
		return null; // ã������� id / ���н� null
	}
		//��ȯ�� : ã������� => ���̵� / ���н� null
		//5. ��й�ȣ ã�� (���̵� ,����ó �Է¹޾� == ��й�ȣ �˷��ֱ�)
	public static String findpw() {
		System.out.println("--------------��й�ȣ ã��------------");
		System.out.print("�����Ͻ� ���̵� �Է����ּ��� : "); String m_id = BookApplication.scanner.next();
		System.out.print("������ ����ó�� �Է����ּ��� : "); String m_phone = BookApplication.scanner.next();
		for(int i =0; i < BookApplication.members.length; i++ ) {
			if(BookApplication.members[i] != null && 
				BookApplication.members[i].getM_id().equals(m_id) &&
				BookApplication.members[i].getM_phone().equals(m_phone)) {
				System.out.println("�����Ͻ� ��й�ȣ�� : " + BookApplication.members[i].getM_pw());
			}else {
				System.out.println("�Է��Ͻ� ������ ã���� �����ϴ�."); 
				break;
			}
				
		}
		return null; // ã������� pw / ���н� null
	}
		//6. ���̵� üũ(�ߺ�) �޼ҵ�
	public static boolean idcheck( String check_id) {
		for(int i =0; i < BookApplication.members.length; i++) {
			if ( BookApplication.members[i] != null && 
					BookApplication.members[i].getM_id().equals(check_id)) {
				return true;
			}
		}
		return false; // �迭�� ������ ���� �������
	}
	// 
	//�ʵ忡 private ��� = > get, set ���
	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_phone() {
		return m_phone;
	}

	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}

	

}
