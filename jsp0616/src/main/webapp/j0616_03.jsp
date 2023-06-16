<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cookie</title>
	</head>
	<body>
	  
	  <!-- 쿠키 2개 생성 -->
	<%
	    Cookie cookieCheckbox = new Cookie("cookieCheckbox","1");
	    cookieCheckbox.setMaxAge(60*60); //60초*60분
	    response.addCookie(cookieCheckbox);
	   
	    Cookie cookieId = new Cookie("cookieId","admin");
	    cookieId.setMaxAge(60*60); //60초*60분
	    response.addCookie(cookieId);
	  %>
	  <h2>
	    <a href="j0616_03_cookie_get.jsp">쿠키 읽어오기</a>
	  </h2>
	
	
	
	
	<%-- 
	  <%
	    Cookie cookieId = new Cookie("userid","admin");
	    cookieId.setMaxAge(60*60); //60초*60분
	    response.addCookie(cookieId); /* 본인 컴퓨터에 저장 */
	  %>
	  <h2>
        <a href="j0616_03_cookie_get.jsp">쿠키 읽어오기</a>
	  </h2>
	   --%>
	
	</body>
</html>