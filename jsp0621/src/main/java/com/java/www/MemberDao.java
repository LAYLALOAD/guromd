package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {
	
	private Context context = null;
	private DataSource dataSource = null;
	private Connection conn = null;	//sql developer를 여는 것
	private Member member = null; //초기화
	private PreparedStatement pstmt;
	private ResultSet rs;		// 쿼리문을 작성하면 데이터를 받아오는 것
	private String id,pw,name,phone,gender,hobby;
	private String query;
	
	//member 전체 가져오기
	public ArrayList<Member> selectAll(){ //ArrayList<Member>: 리턴타입
		ArrayList<Member> list = new ArrayList<>(); //ArrayList<Member>: 객체선언
		try {
			conn = getConnection();
	  		query = "SELECT * FROM MEMBER";
	  		pstmt = conn.prepareStatement(query); //워크시트에 쿼리를 보내줘
	  		rs = pstmt.executeQuery();
	  		while(rs.next()) {
	  			id = rs.getString("id");
	  			pw = rs.getString("pw");
	  			name = rs.getString("name");
	  			phone = rs.getString("phone");
	  			gender = rs.getString("gender");
	  			hobby = rs.getString("hobby");
	  			//member = new Member(id,pw,name,phone,gender,hobby);
	  			//list.add(member);
	  			list.add(new Member(id,pw,name,phone,gender,hobby));
	  		}
		} catch (Exception e) {e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
	 			if(pstmt!=null) pstmt.close();
	 			if(conn!=null) conn.close();
			} catch (Exception e2) { e2.printStackTrace();}
		}
		return list;
	}//selectAll
	
	//로그인 메소드
	public Member selectLogin(String userId, String userPw) {
		try {
			conn = getConnection();
	  		query = "SELECT * FROM MEMBER WHERE ID=? AND PW=?";
	  		pstmt = conn.prepareStatement(query); //워크시트에 쿼리를 보내줘
	  		pstmt.setString(1, userId);
	  		pstmt.setString(2, userPw);
	  		rs = pstmt.executeQuery();
	  		while(rs.next()) {
	  			id = rs.getString("id");
	  			pw = rs.getString("pw");
	  			name = rs.getString("name");
	  			phone = rs.getString("phone");
	  			gender = rs.getString("gender");
	  			hobby = rs.getString("hobby");
	  			member = new Member(id,pw,name,phone,gender,hobby);
	  		}
		} catch (Exception e) {e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
	 			if(pstmt!=null) pstmt.close();
	 			if(conn!=null) conn.close();
			} catch (Exception e2) { e2.printStackTrace();}
		}
		return member;
	}//selectLogin
	
	
	
	//커넥션 메소드
	public Connection getConnection() {
		Connection connection = null;
		try {
			context = new InitialContext();
	  		dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
	  		connection = dataSource.getConnection();
		}catch (Exception e) {e.printStackTrace();}
		return connection;
	}//getConnection
}//MemberDao
