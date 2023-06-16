<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>bean</title>
	</head>
	<body>
	<%
	  request.setCharacterEncoding("utf-8"); /* Post 방식 시 한글처리 */
	%>
	<!-- 객체를 선언한 것과 같다. -->
	<!--useBean:특정 Bean을 사용한다고 명시 할 때 사용, id는 사용할 이름 -->
	<jsp:useBean id="student" class="com.java.www.Student" />
	
	
	<%-- <!-- setProperty: 데이터 값을 설정 할 때 사용 -->
	<!-- j0616_06.jsp 실행할 때 사용 -->	 
	<jsp:setProperty property="stuNo" name="student" value="1"/>
	<jsp:setProperty property="name" name="student" value="honggildong"/>
	<jsp:setProperty property="kor" name="student" value="100"/>
	<jsp:setProperty property="eng" name="student" value="100"/>
	<jsp:setProperty property="math" name="student" value="100"/> --%>
	 

	<!-- j0616_07.jsp 실행할 때 사용 -->
	<jsp:setProperty property="*" name="student" /> <!-- "*": 전체를 받는다.  -->  
	
	
	
	<!-- getProperty: 데이터 값을 가져올 때 사용 -->
	학번 : <jsp:getProperty property="stuNo" name="student" /><br>
	이름 : <jsp:getProperty property="name" name="student" /><br>
	국어 : <jsp:getProperty property="kor" name="student" /><br>
	영어 : <jsp:getProperty property="eng" name="student" /><br>
	수학 : <jsp:getProperty property="math" name="student" /><br>
	
	</body>
</html>