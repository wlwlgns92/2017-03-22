package ������;

public interface ������û1 {
	
	public boolean signup(); //ȸ������ �޼ҵ�.
	public String login(); // �α��� �޼�.
	public boolean idcheck(); // �ߺ�üũ �޼ҵ�
	public String findid(); // ���̵� ã�� �޼ҵ�
	public String findpw(); // ��й�ȣ ã�� �޼ҵ�


	default void ���� () { System.out.println("������û"); }
}
