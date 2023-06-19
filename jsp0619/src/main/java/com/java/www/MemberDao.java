package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {
	
	Context context = null;
    DataSource dataSource = null;
	Connection conn = null;	//sql developer를 여는 것
	PreparedStatement pstmt;
	ResultSet rs;		// 쿼리문을 작성하면 데이터를 받아오는 것
	//컬럼타입
	Member member = null;
	String id,pw,name,phone;
	String query;
	int result;
	
	// 커넥션 연결 메소드
	private Connection getConnection() {
		Connection connection = null;
		try {
			context = new InitialContext();
	  		dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
	  		connection = dataSource.getConnection();
		}catch (Exception e) {e.printStackTrace();}
		return connection;
	}
	
	//로그인 확인 메소드 - 성공:1 실패:0
	public Member selectLogin(String userId, String userPw) {
		System.out.println("userId : "+userId);
		Member member = null;
		try{
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
	  			member = new Member(id,pw,name,phone);
	  		}
	  	}catch(Exception e){
	  		e.printStackTrace();
	 	}finally{
	 		try{
	 			if(rs!=null) rs.close();
	 			if(pstmt!=null) pstmt.close();
	 			if(conn!=null) conn.close();
	 		}catch(Exception e2){e2.printStackTrace();}
	 		
	 	}
		
		return member;
	}//selectLogin
	
	//1개 회원정보 검색 메소드
	public Member selectMemberOne(String sessionId) {
		Member member = null;
		try{
	  		conn = getConnection();
	  		query = "SELECT * FROM MEMBER WHERE ID=?";
	  		pstmt = conn.prepareStatement(query); //워크시트에 쿼리를 보내줘
	  		pstmt.setString(1, sessionId);
	  		rs = pstmt.executeQuery();
	  		while(rs.next()) {
	  			id = rs.getString("id");
	  			pw = rs.getString("pw");
	  			name = rs.getString("name");
	  			phone = rs.getString("phone");
	  			member = new Member(id,pw,name,phone);
	  		}
	  	}catch(Exception e){
	  		e.printStackTrace();
	 	}finally{
	 		try{
	 			if(rs!=null) rs.close();
	 			if(pstmt!=null) pstmt.close();
	 			if(conn!=null) conn.close();
	 		}catch(Exception e2){e2.printStackTrace();}
	 		
	 	}
		return member;
	}//selectMemberOne
	
		
	
	//회원정보리스트 메소드
	public ArrayList<Member> selectMember() {
		ArrayList<Member> list = new ArrayList<>();
		try{
	  		conn = getConnection();
	  		query = "SELECT * FROM MEMBER";
	  		pstmt = conn.prepareStatement(query); //워크시트에 쿼리를 보내줘
	  		rs = pstmt.executeQuery();
	  		while(rs.next()) {
	  			id = rs.getString("id");
	  			pw = rs.getString("pw");
	  			name = rs.getString("name");
	  			phone = rs.getString("phone");
	  			list.add(new Member(id,pw,name,phone));
	  		}
	  	}catch(Exception e){
	  		e.printStackTrace();
	 	}finally{
	 		try{
	 			if(rs!=null) rs.close();
	 			if(pstmt!=null) pstmt.close();
	 			if(conn!=null) conn.close();
	 		}catch(Exception e2){e2.printStackTrace();}
	 		
	 	}
		return list;
	}//selectMember
	
	//회원정보수정 메소드
	public int updateMember(Member member) {
		try{
	  		conn = getConnection();
	  		query = "UPDATE MEMBER SET PW=?,NAME=?,PHONE=? WHERE ID = ?";
	  		pstmt = conn.prepareStatement(query); //워크시트에 쿼리를 보내줘
	  		pstmt.setString(1, member.getPw());
	  		pstmt.setString(2, member.getName());
	  		pstmt.setString(3, member.getPhone());
	  		pstmt.setString(4, member.getId());
	  		
	  		//성공-1, 실패-0 리턴
	  		result =  pstmt.executeUpdate(); //executeUpdate()-insert,update,delete	executeQuery()-select
	  		
	  		
	  	}catch(Exception e){
	  		e.printStackTrace();
	 	}finally{
	 		try{
	 			if(pstmt!=null) pstmt.close();
	 			if(conn!=null) conn.close();
	 		}catch(Exception e2){e2.printStackTrace();}
	 	}
		return result;
		
	}//updateMember
	
	
	//회원정보입력 메소드
	public int insertMember(Member member) {
		try{
	  		conn = dataSource.getConnection();
	  		query = "INSERT INTO MEMBER VALUES(?,?,?,?)";
	  		pstmt = conn.prepareStatement(query); //워크시트에 쿼리를 보내줘
	  		pstmt.setString(1, member.getId());
	  		pstmt.setString(2, member.getPw());
	  		pstmt.setString(3, member.getName());
	  		pstmt.setString(4, member.getPhone());
	  		
	  		//성공-1, 실패-0 리턴
	  		result =  pstmt.executeUpdate(); //executeUpdate()-insert,update,delete	executeQuary()-select
	  		
	  		
	  	}catch(Exception e){
	  		e.printStackTrace();
	 	}finally{
	 		try{
	 			if(pstmt!=null) pstmt.close();
	 			if(conn!=null) conn.close();
	 		}catch(Exception e2){e2.printStackTrace();}
	 	}
		
		return result;
	}//insertMember

}
