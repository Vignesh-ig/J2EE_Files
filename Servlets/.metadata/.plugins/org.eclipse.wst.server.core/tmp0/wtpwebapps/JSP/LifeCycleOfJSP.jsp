<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 


	<%!public void jspInit() {
		System.out.println("Hey am init method.");
	}%>
	<%!public void jspDestroy() {
	System.out.println("Hey am Destroy method.");
	}%>
	<% jspInit();
	System.out.println("hey am Service method."); 
	%>
	<%= "WELCOME" %>
</body>
</html>