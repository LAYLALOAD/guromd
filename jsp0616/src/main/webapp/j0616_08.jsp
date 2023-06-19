<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! //!: 전역변수로 쓸 거여서 써준다. 
	Connection conn;	//sql developer를 여는 것
	PreparedStatement pstmt;
    //Statement stmt;		// 작성칸을 실행시키는 것 (더블클릭해서 들어가는 것: 접속)
    ResultSet rs;		// 쿼리문을 작성하면 데이터를 받아오는 것
    String ID,PW,NAME,PHONE;
    String query;
    
    
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	  <%
	  	try{
	  		Class.forName("oracle.jdbc.driver.OracleDriver"); //sqldevelop를 실행
	  		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger"); //BDA 실행
	  		String userId = "AAA";
	  		String userPw = "1111";
	  		query = "SELECT * FROM MEMBER WHERE ID=? AND PW=?";
	  		pstmt = conn.prepareStatement(query); //워크시트에 쿼리를 보내줘
			pstmt.setString(1, userId);
	  		pstmt.setString(2, userPw);
	  		
	  		rs = pstmt.executeQuery(); //질의결과를 JSP로 가져와줘
	  		
	  		while(rs.next()){ //명
	  			ID = rs.getString("ID");
	  			PW = rs.getString("PW");
	  			NAME = rs.getString("NAME");
	  			PHONE = rs.getString("phone");
	  			
	  			out.println("아이디 : "+ID+", 패스워드 : "+PW+", 이름 : "+NAME+", 전화번호 : "+PHONE+"<br>");
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
	  %>
	
	</body>
</html>