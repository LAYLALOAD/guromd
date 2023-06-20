package com.java.www;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
public class BoardDao {
	
	Context context = null;
    DataSource dataSource = null;
    Connection conn = null; // SQL Developer 오픈
	PreparedStatement pstmt; // BDA 입력창
	ResultSet rs; // 쿼리문에 따른 결과
	
	//컬럼타입 선언
	int bno;
	String id;
	String btitle;
	String bcontent;
	Date bdate;
	int bhit;
	int bgroup;
	int bstep;
	int bindent;
	String bfile;
	String query;
	int result;
	
	// 커넥션 연결메소드 - conn
	private Connection getConnection() {
		Connection connection = null;
		try {
			context = new InitialContext();
	    	dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
	    	connection = dataSource.getConnection();
		}catch(Exception e){e.printStackTrace();}
		return connection;
	}//getConnection
	
	
	//게시판 목록 메소드
	public ArrayList<Board> selectBoard() {
		ArrayList<Board> list = new ArrayList<>();
		try{
	    	 conn = getConnection();
	    	 query = "SELECT * FROM BOARD";
	    	 pstmt = conn.prepareStatement(query);// 쿼리문 저장
	    	 rs = pstmt.executeQuery();
	    	 while(rs.next()) {
	    		 
    			bno = rs.getInt("bno");
    			id = rs.getString("id");
    			btitle = rs.getString("btitle");
    			bcontent = rs.getString("bcontent");
    			bdate = rs.getDate("bdate");
    			bhit = rs.getInt("bhit");
    			bgroup = rs.getInt("bgroup");
    			bstep = rs.getInt("bstep");
    			bindent = rs.getInt("bindent");
    			bfile = rs.getString("bfile");
    			list.add(new Board(bno,id,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent,bfile));
	    	 }//while
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
	}//selectBoard
	
	
}//class