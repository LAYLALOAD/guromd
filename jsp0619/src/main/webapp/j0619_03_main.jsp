<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>main</title>
	</head>
	<body>
	  <h2>메인페이지</h2>
	  <ul>
	  <% if(session.getAttribute("sessionId")==null){ %>
	  <h3>로그인을 해주세요.</h3>
	    <a href="j0619_03_join.jsp"><li>회원가입</li></a>
	    <a href="j0619_03_login.jsp"><li>로그인</li></a>
	 <%}else{%>
	  <h3><%=(String) session.getAttribute("sessionName") %>님 환영합니다.</h3>
	    <a href="j0619_03_memberList.jsp"><li>회원정보리스트</li></a>
	    <a href="j0619_03_logout.jsp"><li>로그아웃</li></a>
	    <a href="j0619_03_modify.jsp"><li>회원정보수정</li></a>
	    <a href="j0619_03_boardList.jsp"><li>게시판</li></a>
     <%}%>		  
	  </ul>
	</body>
</html>