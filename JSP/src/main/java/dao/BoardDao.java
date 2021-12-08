package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Board;
import dto.Reply;

public class BoardDao {
	
	
	private Connection con;
	private ResultSet rs;
	private PreparedStatement ps;
	
	public BoardDao() {
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp?serverTimezone=UTC", "root","1234");
		
		} 
		catch (Exception e) {	System.out.println("연동 실패"+e);	}
	}
	
	public static BoardDao boardDao = new BoardDao();
	public static BoardDao getBoardDao() { return boardDao; }
	
	// 게시물 등록 메소드
	public boolean boardwrite(Board board) {
		
		String sql = "insert into board(b_title, b_contents, m_num, b_file) values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getB_title());
			ps.setString(2, board.getB_contents());
			ps.setInt(3, board.getM_num());
			ps.setString(4, board.getB_file());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {} return false;
		
	}
	// 모든 게시물 출력
	public ArrayList<Board> boardlist(int startrow , int listsize) {
		
		ArrayList<Board> boards = new ArrayList<Board>();
		String sql = "select * from board order by b_num DESC limit "+startrow+","+listsize; // limit 검색 개수 제한
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Board board = new Board(rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8));
				boards.add(board);	
			}
			System.out.println(boards.toString());
			return boards;
		} catch (Exception e) { System.out.println(e);} 
		return null;
	}
	
	// 게시물 검색 메소드 [ 포함된 값을 찾는 검색 ]
	public ArrayList<Board> boardlist2(String key, String keyword) {
		
		ArrayList<Board> boards = new ArrayList<Board>();
		String sql =null;
		if(key.equals("b_writer")) { // 제목 or 내용 검색 : 포함된 값 검색
			int m_num = MemberDao.getMemberDao().getmembernum(keyword);
			sql = "select * from board where m_num = "+ m_num;
		}else if (key.equals("b_num")) { // 번호검색 : 일치한 값만 검색
			sql = "select * from board where b_num = "+ keyword; 
		}else { // 작성자 검색 : 작성자 -> 회원번호
			
			sql = "select * from board where "+key+" like '%"+keyword+"%' order by b_num desc"; 
		}
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Board board = new Board(rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8));
				boards.add(board);	
			}
			System.out.println(boards.toString());
			return boards;
		} catch (Exception e) { System.out.println(e);} 
		return null;
	}
	// 게시물번호의 해당 게시물 가져오기
	public Board getBoard(int b_num) {
		
		String sql = "select * from board where b_num = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, b_num);
			rs = ps.executeQuery();
			if(rs.next()) {
				Board board = new Board(rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8));
				return board;
			}
		} catch (Exception e) {}
		
		return null;
	}
	
	public boolean boardcount(int b_num) {
		
		String sql = "update board set b_view = b_view +1 where b_num = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, b_num);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {} return false;
	}
	// 게시물 수정 메소드
	public boolean update(Board board) {
		
		String sql = "update board set b_title = ?,  b_contents = ?, b_file = ? where b_num =?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getB_title());
			ps.setString(2, board.getB_contents());
			ps.setString(3, board.getB_file());
			ps.setInt(4, board.getB_num());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {} return false;
	}
	
	// 게시물 삭제 메소드
	public boolean delete(int b_num) {
		
		String sql = "delete from board where b_num = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, b_num);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {} return false;
	}
	
	// 게시물 조회 메소드
	
	// 댓글 작성
	public boolean replywrite (Reply reply) {
		
		String sql = "insert * into reply(r_contents, m_num, b_num) values(?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, reply.getR_contents());
			ps.setInt(2, reply.getM_num());
			ps.setInt(3, reply.getB_num());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {} return false;
		
	}
	
	// 게시물번호의 해당 댓글 가져오기
		public Reply getreply(int b_num) {
			
			String sql = "select * from reply where b_num = ?";
			try {
				ps = con.prepareStatement(sql);
				ps.setInt(1, b_num);
				rs = ps.executeQuery();
				if(rs.next()) {
					Reply reply = new Reply(rs.getInt(1), rs.getString(2), rs.getString(3),
							rs.getInt(4), rs.getInt(5));
					return reply;
				}
			} catch (Exception e) {}
			
			return null;
		}
	// 게시물의 총 개수를 반환해주는 메소드
		public int boardcount() {
			
			String sql = "select count(*) from board "; // count(*) : 개수 함수 : count(*)와일드카드 개수
			
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				if(rs.next()) {	return rs.getInt(1); }
			} catch (Exception e) {} return 0;
		}
}
