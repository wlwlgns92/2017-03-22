package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
	
	// 1. 빌드 -> 라이브러리 추가
		// 2. 프로젝트내 Web - inf - lib -> 라이브러리 추가
		
		protected Connection con;
		protected ResultSet rs;
		protected PreparedStatement ps;
		
		public DB() {
			try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp?serverTimezone=UTC", "root","1234");
			
			} 
			catch (Exception e) {}
		}
}
