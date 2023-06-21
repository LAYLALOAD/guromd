<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	  <c:set var ="varName" value="홍길" /> <%-- c:set -> 변수할당 --%>
	  <% String name="이순신"; %>
	  <h3>이름 : <c:out value = "${varName}" /></h3>  <%-- c:out -> 변수출력 --%>
	  <h3>이름 : ${varName}</h3>
	  <h3>스크립트릿 이름 : ${name}</h3><!-- jsp태크(스크립트릿)와 같이 쓰면 출력되지 않는다. -->
	  
	  <hr><!-- jstl if문 -->
	  <c:if test="${varName == '홍길동' }"><!-- c:if는 else가 없어서 비교를 원한다면 두번 써준다. -->
	    <h2>정답입니다. 홍길동</h2>
	  </c:if>
	  <c:if test="${varName != '홍길동' }">
	    <h2>오답입니다. 이순신이 아닙니다. ${varName} 입니다.</h2>
	  </c:if>
	  
	  <hr><!-- 스크립트릿으로 쓸경우 -->
	  <%if(name.equals("홍길동")){%>
	      <h2>정답입니다. 홍길동 입니다.</h2>	
	  <%}else{%>
	      <h2>오답입니다. <%=name %>입니다.</h2>
	  <%}%>
	  
	  <hr><!-- jstl for문 -->
	  <c:forEach var="i" begin="0" end="10" step="1">
	    ${i}<br>
	  </c:forEach>
	  <hr>
	  <h3>board 객체</h3>
	  <h3>${board.bno}</h3><!-- EL태크: 객체.컬럼명 -->
	  <h3>${board.id}</h3>
	  <h3>${board.btitle}</h3>
	  
	  <hr>
	  <c:forEach var="b" items="${list}"><!-- var를 board로 쓰기에는 객체로 가져온 위에오 동일하기에 b로 갈음 -->
	    <h3>${b.bno}</h3>
	    <h3>${b.id}</h3>
	    <h3>${b.btitle}</h3>
	    <br>
	  </c:forEach>
	  
	  
	</body>
</html>