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
	     <% out.print(1+2); %>
	     <hr>
	     <%= 1+2 %>
	     <hr>
	     
	     <!-- EL 태그, JSP 태그 비교, 실행 안될 것임 향후 수업에 설명 예정-->
	     <!-- 예시 1번 (Parameter) -->
	     ${1}
	     <%= request.getParameter("id") %>
	     ${param.id}
	     <!-- 예시 2번 (session) -->
    	 <%= session.getAttribute("sessionId") %>
    	 ${sessionId} <!-- ${ sessionScope.sessionId } 의 약식, 출력 가능 -->
         ${sessionScope.sessionId} <!-- ${ sessionId } 와 같음 -->
    	 <%-- 
    	 <%= if(${sessionId}==null) %> <!-- 스트립트릿 안에 EL태그 쓸 수 없음 -> 이경우 jstl이라는 방식의 태그를 사용함--> 
    	 --%>
	     
	     
	     
	</body>
</html>