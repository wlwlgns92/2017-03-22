package dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import dao.MemberDao;

public class Reply {
	
	private int r_num;
	private String r_contents;
	private String r_date;
	private int m_num;
	private int b_num;
	private String r_writer;
	// 깡통
	public Reply() {
		
	}
	//풀생성
	public Reply(int r_num, String r_contents, String r_date, int m_num, int b_num) {
		this.r_num = r_num;
		this.r_contents = r_contents;
		
		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("hh : mm");
		try {
			Date date = dateFormat.parse(r_date);
			this.r_date = dateFormat.format(date);
			if(this.r_date.equals(dateFormat.format(today))) {
				this.r_date = dateFormat2.format(today);
			}
		} catch (Exception e) {}
		this.m_num = m_num;
		this.b_num = b_num;
		this.r_writer = MemberDao.getMemberDao().getmemberid(m_num);
	}
	
	
	// 댓글 저장
	public Reply(String r_contents, int m_num, int b_num) {
		this.r_contents = r_contents;
		this.m_num = m_num;
		this.b_num = b_num;
	}
	public int getR_num() {
		return r_num;
	}
	public void setR_num(int r_num) {
		this.r_num = r_num;
	}
	public String getR_contents() {
		return r_contents;
	}
	public void setR_contents(String r_contents) {
		this.r_contents = r_contents;
	}
	public String getR_date() {
		return r_date;
	}
	public void setR_date(String r_date) {
		this.r_date = r_date;
	}
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public int getB_num() {
		return b_num;
	}
	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
	public String getR_writer() {
		return r_writer;
	}
	public void setR_writer(String r_writer) {
		this.r_writer = r_writer;
	}
	
	
	
}
