<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %> <!-- 에러에 대한 예외처리: 이거는 제대로 된 에러 페이지야  -->
<% response.setStatus(200); %> <!-- 정상페이지 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>error500</title>
		<style>
		  *{padding: 0; margin: 0;}
		  div{width: 500px; height: 180px; padding:30px; margin: 50px auto; border:1px solid #efefef;}
		  img{width: 500px;}
		</style>
	</head>
	<body>
	  <div>
	    <a href="main.jsp"><img src="images/error500.png"></a>
	  </div>
	
	</body>
</html>