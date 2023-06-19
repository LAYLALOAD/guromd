<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! //!: 전역변수로 쓸 거여서 써준다. 
	Connection conn;	//sql developer를 여는 것
	PreparedStatement pstmt;
	ResultSet rs;		// 쿼리문을 작성하면 데이터를 받아오는 것
	//컬럼타입
	int empno;
	String ename;
	String job;
	int mgr;
	String hiredate;
	double sal;
	double comm;
	int deptno;
	
	String query;
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>employee List</title>
		<style>
		  *{padding:0; margin:0;}
		  h2{width:800px; text-align: center; margin:0 auto;}
		  table{width:800px; margin:30px auto; text-align: center; }
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  th{height:40px; background: #EFEFEF; }
		  td{height:35px; width:100px; }
		</style>
	</head>
	<body>
	  <h2>직원리스트</h2>
	    <table>
	      <tr>
	        <th>사원번호</th>
	        <th>이름</th>
	        <th>직무</th>
	        <th>상관번호</th>
	        <th>입사일</th>
	        <th>봉급</th>
	        <th>수당</th>
	        <th>부서번호</th>
	      </tr>
	  <%
	  	try{
	  		Class.forName("oracle.jdbc.driver.OracleDriver"); //sqldevelop를 실행
	  		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger"); //BDA 실행
	  		query = "SELECT * FROM EMP ORDER BY EMPNO DESC";
	  		pstmt = conn.prepareStatement(query); //워크시트에 쿼리를 보내줘

	  		rs = pstmt.executeQuery(); //질의결과를 JSP로 가져와줘
	  		
	  		while(rs.next()){
	  			empno = rs.getInt("empno");
	  			ename = rs.getString("ename");
	  			job = rs.getString("job");
	  			mgr = rs.getInt("mgr");
	  			hiredate = rs.getString("hiredate");
	  			sal = rs.getDouble("sal");
	  			comm = rs.getDouble("comm");
	  			deptno = rs.getInt("deptno");
	  			
	  			//out.println("EMPNO : "+EMPNO+", ENAME : "+ENAME+", JOB : "+JOB+", MGR : "+MGR+", HIREDATE : "+HIREDATE+", SAL : "+SAL+", COMM : "+COMM+", DEPTNO : "+DEPTNO+"<br>");
	  			%>
	  			<!-- html 태그 -->
		        <tr>
		          <td><%= empno %></td>
		          <td><%= ename %></td>
		          <td><%= job %></td>
		          <td><%= mgr %></td>
		          <td><%= hiredate %></td>
		          <td><%= sal %></td>
		          <td><%= comm %></td>
		          <td><%= deptno %></td>
		        </tr>
	  			<%
	  			
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
	    </table>
	</body>
</html>