<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	  <%
	    String id = request.getParameter("id");
	    String name = request.getParameter("name");
	    
	    if(id.equals("aaa")){
	    	response.sendRedirect("j0615_08.jsp");
	    }else{
	    	response.sendRedirect("join03_success.jsp?userId="+id+"&name="+name); //userId: 키, id: 값 -> 보내는 형태는 키와 값으로 이루어짐 중요!!!!!!
	    }
	  %>
	
	</body>
</html>