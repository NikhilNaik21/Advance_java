<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success</title>
</head>
<body>

<% String uname = (String) session.getAttribute("sessionName"); %>
<h1>Login Success <br> Welcome <%=uname %> </h1>
</body>
</html>