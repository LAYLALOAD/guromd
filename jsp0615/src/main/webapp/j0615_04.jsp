<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>표현식 쓰기</title>
		<style>
		  *{padding:0; margin:0;}
		  table{width: 350px; margin:30px auto; text-align: center; }
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  th, td{width: 150px; height: 30px; }
		</style>
	</head>
	<body>
	  <%! //servlet,class
	    //1,10이 있을 때 1~10의 합을 출력하여라
	    int num = 1;
	    int num2 = 10;
	    private int sum(int a, int b){ 
		    int total = 0;
	    	for(int i=a; i<=b; i++){
				total += i;
		    }
	    	return total;
	  }
	  %>
	  
	  <%
	    int[] arr = {10,20,30};
	  %>
	  
	  <table>
	    <tr>
	      <td><%= num %></td>
	      <td><%= num2 %></td>
	      <td><%= sum(num,num2) %></td>
	    </tr>
	  </table>
	  
	  
	
	</body>
</html>