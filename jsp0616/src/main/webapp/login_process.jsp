<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	  <!-- 아이디, 비밀번호를 쿠키에 저장 하기 cid, cpw-->
	  <a href="login_confirm.jsp">쿠키확인</a>
	  <%
	    //'login_cookie'페이지에서 로그인 한 것을 받기
	    String id = request.getParameter("id");
	    String pw = request.getParameter("pw");
	    
	    //받아온 id pw가 있는가를 확인
	    if(!(id.equals("admin") && pw.equals("1234"))){
	    	response.sendRedirect("login_cookie.jsp?idCheck=0");
	    }
	    // id pw가 admin 1234가 맞으면 출력됨
	    out.println("id : "+id+"<br>");
	    out.println("id : "+pw+"<br>");
	    
	    	    
	    //쿠키 저장
	    Cookie cid = new Cookie("cid",id);
	    cid.setMaxAge(60*60); //60초*60분
	    response.addCookie(cid);
	   
	    Cookie cpw = new Cookie("cpw",pw);
	    cpw.setMaxAge(60*60); //60초*60분
	    response.addCookie(cpw);
	    
	  %>
	</body>
</html>