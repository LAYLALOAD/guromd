<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>forward</title><!-- forward보다는 include를 더 많이 쓰기는 한다. -->
	</head>
	<body>
	<h2>1번째 페이지입니다.</h2>
    <jsp:forward page="j0616_02_top.jsp" /> <!--jsp코드:: 주소가 안바뀌며 forward 한 페이지로 출력된다. (ex. 리뉴얼시) -->
	<%-- <% response.sendRedirect("j0616_02_top.jsp"); %> <!--jsp코드:: 주소가 바뀌며 sendRedirect 한 페이지로 출력된다. --> --%>
	<!-- <script>location.href="j0616_02_top.jsp";</script>js코드:: 주소가 바뀌며 href한 페이지로 출력된다.  -->
	
	</body>
</html>