package Day10;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySql DB���� �˻�");
	}

	@Override
	public void intsert() {
		System.out.println("MySql DB���� ����");
	}

	@Override
	public void update() {
		System.out.println("MySql DB���� ����");
	}

	@Override
	public void delete() {
		System.out.println("MySql DB���� ����");
	}

	
}
