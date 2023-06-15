<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
		  *{padding:0; margin:0;}
		  table{text-align: center; width: 750px; margin:30px auto;}
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  th, td{width: 150px; height: 30px; }
		</style>
	</head>
	<body>
	  <!-- html주석은 외부에서 보인다. -->
	  <table>
	   <tr>
	     <th>단</th>
	     <th>*</th>
	     <th>수</th>
	     <th>=</th>
	     <th>합계</th>
	   </tr>
	   <%
	     int sum=0;
	     for(int i=2;i<10;i++){
	   %>
	     <tr>
		   <td colspan="5"><%= i %>단</td>
	     </tr>
	   <%
	    	 for(int j=1;j<10;j++){
	    		 
	   %>
	    <tr>
	     <td><%= i %></td>
	     <td>*</td>
	     <td><%= j %></td>
	     <td>=</td>
	     <td><%= i*j %></td>
	   </tr>
	   
	   <%
	    	 }
	     }
	   %>
	   <%-- jsp주석은 외부에서 보이지 않는다. --%>
	     
	  </table>
	
	</body>
</html>