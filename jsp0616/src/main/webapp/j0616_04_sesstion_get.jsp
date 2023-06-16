<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<style>
	  *{padding: 0; margin: 0;}
	  table{width: 400px; margin:0px auto; text-align: center;}
	  table,th,td{border:1px solid black; border-collapse: collapse;}
	  th, td{width: 200px; height: 40px; }
	</style>
	<body>
	  <%
	  //session.setAttribute("sessionId", "admin");
	  //session.setAttribute("sessionNicName", "길동스");
	  //session.setAttribute("sessionName", "홍길동");
	  
	  //읽어오기
	  String sessionId = (String) session.getAttribute("sessionId");
	  String sessionNicName = (String) session.getAttribute("sessionNicName");
	  String sessionName = (String) session.getAttribute("sessionName");
	  %>
	  
	  <!-- 표로 출력하시오. -->
	  
	  <table>
	    <tr>
	      <th>sessionId</th>
	      <td><%= sessionId %></td>
	    </tr>
	    <tr>
	      <th>sessionNicName</th>
	      <td><%= sessionNicName %></td>
	    </tr>
	    <tr>
	      <th>sessionName</th>
	      <td><%= sessionName %></td>
	    </tr>
	  
	  </table>
	  
	  <%
	    /* 세션 지우기 */
	    session.removeAttribute("sessionId");
	    session.removeAttribute("sessionNicName");
	  
	  %>
	  
	  <a href="j0616_04_sesstion_confirm.jsp">섹션 재확인</a>
	  
	
	</body>
</html>