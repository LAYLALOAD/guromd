<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	     <!-- EL 태그로 출력 -->
	     ${1}
	     ${1+2}
	     ${1*2}
	     ${3/2}
	     <hr>
	     
	     <!-- JSP 태그로 출력 -->
	     <%
	       out.print(1+2);
	     %>
	     <hr>
	     <%= 1+2 %>
	     <hr>
	     
	     <!-- EL 태그, JSP 태그 비교, 실행 안될 것임 마무리 안함-->
	     <!-- 예시 1번 -->
	     ${1}
	     <%= request.getParameter("id") %>
	     <!-- 예시 2번 -->
	     ${param.id}
    	 <%= session.getAttribute("sessionId") %>
         ${ sessionScope.sessionId }<!-- ${ sessionId } 와 같음 -->
    	 ${ sessionId }
	     
	     
	     
	</body>
</html>