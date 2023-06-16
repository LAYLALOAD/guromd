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
		  String[] hobbys = request.getParameterValues("hobbys");
		  
		  //id aaa, bbb, ccc 있다고 가정
		  //if(!(id.equals("aaa") || id.equals("bbb") || id.equals("ccc"))){ /* aaa,bbb,ccc 가 아니면 */
		  if(id.equals("aaa") || id.equals("bbb") || id.equals("ccc")){
			  response.sendRedirect("join02_info_input.jsp?memberCheck=0");/* 보통으로 0:false 1:true 간주한다. */
		  }else{
			  response.sendRedirect("join03_success.jsp?id="+id+"&name="+name);
		  }
			  
		 
		  
		%>
	
	</body>
</html>