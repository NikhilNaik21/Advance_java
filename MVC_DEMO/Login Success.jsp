<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN SUCCESS</title>
</head>
<body>
<h1  >Successful Login.....</h1>
<% 

/* String username =request.getParameter("UName"); */

String username =request.getParameter("UName"); 
%>

Welcome <%= username %>
</body>
</html>