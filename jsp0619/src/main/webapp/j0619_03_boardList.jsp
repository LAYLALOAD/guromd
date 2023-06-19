<%@page import="com.java.www.BoardDao"%>
<%@page import="java.util.Date"%>
<%@page import="com.java.www.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판 리스트</title>
		<style>
		  *{padding:0; margin:0;}
		  h2{width:1000px; text-align: center; margin:0 auto;}
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  table{width:1000px; margin:30px auto; text-align: center; }
		  th{width:200px; height:30px; background: #EFEFEF; }
		  td{width:200px; height:30px;}
		</style>
		
	</head>
	<body>
	  <h2>게시판리스트</h2>
	  <table>
	    <colgroup>
		  <col width="10%">	    
		  <col width="20%">	    
		  <col width="40%">	    
		  <col width="10%">	    
		  <col width="10%">	    
		  <col width="10%">	    
	    </colgroup>
	    <tr>
	      <th>No.</th>
	      <th>제목</th>
	      <th>내용</th>
	      <th>작성자</th>
	      <th>작성일</th>
	      <th>조회수</th>
	    </tr>
	    <%
	      int bno;
	      String btitle;
	      String bcontent;
	      String id;
	      Date bdate;
	      int bhit;
	      BoardDao bdao = new BoardDao();
	      ArrayList<Board> list = bdao.selectBoard();
	      
	      for(int i=0;i<list.size();i++){
	    	  Board b = list.get(i);
	    	  bno = b.getBno();
	    	  btitle = b.getBtitle();
	    	  bcontent = b.getBcontent();
	    	  id = b.getId();
	    	  bdate = b.getBdate();
	    	  bhit = b.getBhit();
        %>
	        <tr>
	          <td><%= bno %></td>
	          <td><%= btitle %></td>
	          <td><%= bcontent %></td>
	          <td><%= id %></td>
	          <td><%= bdate %></td>
	          <td><%= bhit %></td>
	        </tr>
	    <%}%>
	  </table>
	</body>
</html>