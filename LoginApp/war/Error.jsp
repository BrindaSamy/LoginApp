<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.application.login.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<%
		User user=(User) request.getAttribute("user");
	%>
	
<h2  style="color:red" >Sorry!!! </h2>...<%= user.getUserName() %>
	
	Invalid password..Login again!
	
	<%@ include file="index.jsp" %>
</body>
</html>