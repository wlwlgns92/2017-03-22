package Day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ȸ������ {

	
	
	//�ʵ� [ �޸� = ���� ] 
	
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
		
	// ������
	public ȸ������() {
		}
	public ȸ������(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}


	//�޼ҵ� private �ʵ� ���� get, set�ʿ� [ �ٸ� Ŭ�������� ���� �Ұ� ]
	//�α��� �޼ҵ�
	//ȸ������ �޼ҵ� 
	public static void login() {
		
	}
	public static void signup() {
		//�Է°�ü ��������
		Scanner scanner = �α���ȸ������.scanner;

	
		// 1. �Է�
		System.out.println("-----------ȸ������----------"); 
		System.out.print("����Ͻ� ID�� �Է����ּ��� : "); String m_id = scanner.next();
		System.out.print("����Ͻ� PW�� �Է����ּ��� : "); String m_pw = scanner.next();
		System.out.print("������� ������ �Է����ּ��� : "); String m_name = scanner.next();
		System.out.print("������� ����ó�� �Է����ּ��� : "); String m_phone = scanner.next();
		
		// 2. ��ü ����
		ȸ������ member = new ȸ������(m_id, m_pw, m_name, m_phone);
		
		
		// �迭������
		for(int i =0; i < �α���ȸ������.Members.length; i++) {
			if(�α���ȸ������.Members[i] == null) {
				�α���ȸ������.Members[i] = member; break;
			}
		}
			
		
		
		
		// 3. ���� ����
			// 1. ȸ����[\n] �ʵ庰[ , ] ���� ���� 
		
		
			try {
				
				FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/2017-03-22/java1/src/Day12/memberlist.txt",true);
				// ��ü �������� [ �ʵ屸�� ]
				String out = member.m_id+","+member.m_pw+","+member.m_name+","+member.m_phone+"\n";
				fileOutputStream.write(out.getBytes());
			} 
			catch (Exception e) {
				System.out.println( " �������� ���� "+e);
			}
		}
		
		


	
	
	
	
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
