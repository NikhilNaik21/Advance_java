<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1  > Login Failed.....</h1>

<% String uname = request.getParameter("UName"); %>
 <%= uname %>
 <%@ include file="Login.html" %>  
</body>
</html>