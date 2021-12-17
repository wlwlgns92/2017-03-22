package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Board;

public class BoardDao {
	
	PreparedStatement ps;
	ResultSet rs;
	Connection con;
	
	public BoardDao() {
		try{
			System.out.println("try ���� ");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class.forname ����");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root","1234");
		System.out.println("�������� ");
		} 
		catch (Exception e) {	System.out.println("���� ����");	}
	}
	public static BoardDao boardDao = new BoardDao();
	public static BoardDao getBoardDao() { return boardDao; }
	
	public boolean b_write(Board board) {
	
		String sql = "insert into board(b_title, b_contents, b_writer) values(?,?,?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getB_title());
			ps.setString(2, board.getB_contents());
			ps.setString(3, board.getB_writer());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("����" + e);} return false;
	}
	
	//���Խù� ��������
	public ArrayList<Board> getboard() {
		
		ArrayList<Board> boards = new ArrayList<Board>();
		
		String sql = " select * from board";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Board board = new Board(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				boards.add(board);
			}return boards;
		} catch (Exception e) {} return null;
	}
	
	// �Խù� ����
	public Board getboard(int b_no) {
		
		String sql = "select * from board where b_no ="+b_no;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				Board board = new Board(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				return board;
			}
			
		} catch (Exception e) {} return null;
	}
	
	//����
	public boolean update(Board board) {
		
		String sql = "update board set b_title = ?, b_contents = ? where b_no = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getB_title());
			ps.setString(2, board.getB_contents());
			ps.setInt(3, board.getB_no());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("������Ʈ ���� " +e);} return false;
		
	}
	
	//����
	public boolean delete(int b_no) {
		
		String sql = "delete from board where b_no="+b_no;
		
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("�������� "+ e);} return false;
	}
}
