package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.Board;
import domain.Reply;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.print.Collation;

public class BoardDao {
	
	// 필드
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	// 객체
	private static BoardDao boardDao = new BoardDao();
	
	// 생성자 [ DB연동용 ]
	public BoardDao() {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC","root","1234");
	
		}
		catch (Exception e) {System.out.println("db실패");}
	}
	
	// 객체 반환 메소드
	public static BoardDao getboardDao() {
		return boardDao;
	}
	// 메소드 [ CRUD ] 
	
		// 1. 게시물 등록 메소드
	public boolean write(Board board) {
		String sql = "insert into board(b_title, b_contents, b_write)"+"values(?, ?, ?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, board.getB_title());
			preparedStatement.setString(2, board.getB_contents());
			preparedStatement.setString(3, board.getB_write());
			preparedStatement.executeUpdate();
			return true;
		}catch (Exception e) {}
		return false;
	}
		// 2. 게시물 조회 메소드
		public ObservableList<Board> boardlist( ) {
			
			ObservableList<Board> boards = FXCollections.observableArrayList();
		
			String sql = " select * from board order by b_no desc" ;
			try {
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				// 검색된 레코드의 하나씩 객체화
				while( resultSet.next()) {
					Board board = new Board(
							resultSet.getInt(1), 
							resultSet.getString(2), 
							resultSet.getString(3),
							resultSet.getString(4),
							resultSet.getString(5), 
							resultSet.getInt(6));
					boards.add(board);
				}
				return boards;
			}
			catch (Exception e) {}
			return boards;
			
		
		}
		// 3. 게시물 삭제 메소드
		public boolean delete(int b_no) {
			String sql = "delete from board where b_no = ?";	
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, b_no);
				preparedStatement.executeUpdate();
				return true;
			} catch (Exception e) {}
			return false;
		}
		// 4. 게시물 수정 메소드
		public boolean update(int b_no, String b_title, String b_contents ) {
			
			String sql = "update board set  b_title = ?, b_contents = ? where b_no=?";
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(3, b_no);
				preparedStatement.setString(1, b_title);
				preparedStatement.setString(2, b_contents);
				preparedStatement.executeUpdate();
				return true;
			} catch (Exception e) {}
			return false;
		}
		// 5. 게시물 개별조회 메소드
		
		// 6. 게시물 조회 증가 메소드
		public boolean viewupdate(int b_no) {
			String sql = "update board set b_view = b_view + 1 where b_no = ?";
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, b_no);
				preparedStatement.executeUpdate();
				return true;
			} catch (Exception e) {}
			return false;
		}
		
		// 7. 댓글 등록 메소드
		public boolean replywrite(Reply reply) {
			String sql = "insert into reply (r_contents, r_write, b_no) values(?,?,?)";
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, reply.getR_contents());
				preparedStatement.setString(2, reply.getR_write());
				preparedStatement.setInt(3, reply.getB_no());
				preparedStatement.executeUpdate();
				return true;
			} catch (Exception e) {}
			return false;
		}
		// 8. 댓글 출력 메소드
		public ObservableList<Reply> replylist(int b_no) {
			
			ObservableList<Reply> replys = FXCollections.observableArrayList();
			String sql = "select * from reply where b_no = ? order by r_no desc";
			
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, b_no);
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) { // 다음 레코드가 없을때까지
					// 댓글 레코드 한줄씩 객체화
					Reply reply = new Reply(resultSet.getInt(1), resultSet.getString(2),
							resultSet.getString(3), resultSet.getString(4), resultSet.getInt(5));
					replys.add(reply);
				}
				return replys;
			} catch (Exception e) {	}
			return replys;
		}
		
	// 9. 로그인된 회원의 게시물 출력	
		public ObservableList<Board> myboardlist( String id ) {
			
			ObservableList<Board> boards = FXCollections.observableArrayList();
		
			String sql = " select * from board where b_write = ? order by b_no desc" ;
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, id);
				resultSet = preparedStatement.executeQuery();
				// 검색된 레코드의 하나씩 객체화
				while( resultSet.next()) {
					Board board = new Board(
							resultSet.getInt(1), 
							resultSet.getString(2), 
							resultSet.getString(3),
							resultSet.getString(4),
							resultSet.getString(5), 
							resultSet.getInt(6));
					boards.add(board);
				}
				return boards;
			}
			catch (Exception e) {}
			return boards;
			
		
		}
		
		public int boardcount() {
			String sql = "select count(*) from board";
			try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				return resultSet.getInt(1);
			}
			}catch (Exception e) {} return 0;
		}
		
		public String selectwriter() {
			
			String sql = "select m_id from Member where m_num = 1";
			try {
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					return resultSet.getString(1);
				}
			} catch (Exception e) {} return "";
		}
}
