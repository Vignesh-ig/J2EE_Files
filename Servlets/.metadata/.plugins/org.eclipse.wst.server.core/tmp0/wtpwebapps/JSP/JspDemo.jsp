<%@page import="com.JspStudent"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Info</title>
</head>
<body>
<% JspStudent s = (JspStudent)request.getAttribute("JspStudent"); %>
<table border="2px">
<tr>
  <th>ID</th>
  <th>NAME</th>
  <th>MARKS</th>
  <th>AGE</th>
</tr>
<tr>
	<td><%=s.getId() %></td>
	<td><%=s.getName() %></td>
	<td><%=s.getMark() %></td>
	<td><%=s.getAge() %></td>
</tr>
</table>
</body>
</html>