package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.www.dto.Board;

public class BoardDao {
	
	private Context context;
	private DataSource dataSource ;
	private Connection conn;	//sql developer를 여는 것
	private Board board; //초기화
	private PreparedStatement pstmt;
	private ResultSet rs;		// 쿼리문을 작성하면 데이터를 받아오는 것
	
	private int bno, bhit, bgroup, bstep, bindent;
	private String id, btitle, bcontent, bfile;
	private Date bdate;
	
	private String query;
	private int result; // 결과 보고: 성공 1 실패 0
	
	//게시글 삭제
	public int deleteOne(int bno) {
		try {
			conn = getConnection();
	  		query = "DELETE BOARD WHERE BNO=?";
	  		pstmt = conn.prepareStatement(query); //워크시트에 쿼리를 보내줘
	  		pstmt.setInt(1, bno);
	  		result = pstmt.executeUpdate();
	  		
	  		System.out.println("bno :"+bno);
	  		System.out.println("result :"+result);
	  		
		}catch(Exception e){
	  		e.printStackTrace();
	 	}finally{
	 		try{
	 			if(rs!=null) rs.close();
	 			if(pstmt!=null) pstmt.close();
	 			if(conn!=null) conn.close();
	 		}catch(Exception e2){e2.printStackTrace();}
	 	}
		return result;
	}//deleteOne
	
	//게시글 수정
	public int updateOne(int ubNO, String uid, String ubtitle, String ubcontent, String ubfile) {
		
		try{
	  		conn = getConnection();
	  		query = "UPDATE BOARD SET BTITLE=?,BCONTENT=?,BFILE=? WHERE BNO=?";
	  		pstmt = conn.prepareStatement(query); //워크시트에 쿼리를 보내줘
	  		pstmt.setString(1, ubtitle);
	  		pstmt.setString(2, ubcontent);
	  		pstmt.setString(3, ubfile);
	  		pstmt.setInt(4, ubNO);
	  		result = pstmt.executeUpdate();
	  		
	  	}catch(Exception e){
	  		e.printStackTrace();
	 	}finally{
	 		try{
	 			if(rs!=null) rs.close();
	 			if(pstmt!=null) pstmt.close();
	 			if(conn!=null) conn.close();
	 		}catch(Exception e2){e2.printStackTrace();}
	 	}
		
		return result;
	}//updateOne
	
	
	//게시글 저장
	public int insertOne(String userId, String userBtitle, String userBcontent, String userBfile) {
		try{
	  		conn = getConnection();
	  		query = "INSERT INTO BOARD VALUES ("
	  				+ "BOARD_SEQ.NEXTVAL,?,?,?,SYSDATE,0,BOARD_SEQ.CURRVAL,0,0,?)";
	  		pstmt = conn.prepareStatement(query); //워크시트에 쿼리를 보내줘
	  		pstmt.setString(1, userId);
	  		pstmt.setString(2, userBtitle);
	  		pstmt.setString(3, userBcontent);
	  		pstmt.setString(4, userBfile);
	  		result = pstmt.executeUpdate();
	  		
	  	}catch(Exception e){
	  		e.printStackTrace();
	 	}finally{
	 		try{
	 			if(rs!=null) rs.close();
	 			if(pstmt!=null) pstmt.close();
	 			if(conn!=null) conn.close();
	 		}catch(Exception e2){e2.printStackTrace();}
	 	}
		return result;
	}//insertOne
	
	//조회수 1증가
	public void updateHit(int ubno) {
		try{
	  		conn = getConnection();
	  		query = "UPDATE BOARD SET BHIT=BHIT+1 WHERE BNO=? ";
	  		pstmt = conn.prepareStatement(query); //워크시트에 쿼리를 보내줘
	  		pstmt.setInt(1, ubno);
	  		result = pstmt.executeUpdate();
	  		
	  	}catch(Exception e){
	  		e.printStackTrace();
	 	}finally{
	 		try{
	 			if(rs!=null) rs.close();
	 			if(pstmt!=null) pstmt.close();
	 			if(conn!=null) conn.close();
	 		}catch(Exception e2){e2.printStackTrace();}
	 	}
	}
	
	//게시글 1개 가져오기
	public Board selectOne(int userBno) {
		try{
	  		conn = getConnection();
	  		query = "SELECT * FROM BOARD WHERE BNO=?";
	  		pstmt = conn.prepareStatement(query); //워크시트에 쿼리를 보내줘
	  		pstmt.setInt(1, userBno);
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
	   			board = new Board(bno,id,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent,bfile);
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
		return board;
	}//selectOne
	
	//게시판 목록 메소드 (게시글 전체 가져오기)
	public ArrayList<Board> selectAll() {
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
	}//selectAll
	
	
	// 커넥션 연결메소드 - conn
	public Connection getConnection() {
		Connection connection = null;
		try {
			context = new InitialContext();
	    	dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
	    	connection = dataSource.getConnection();
		}catch(Exception e){e.printStackTrace();}
		return connection;
	}//getConnection



}
