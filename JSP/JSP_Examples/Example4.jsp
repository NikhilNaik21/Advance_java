<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Example of Directives</title>
</head>
<body>
	<h1> Welcome to CDAC</h1>
	<h2>Today is a beautiful day</h2>
	Today is <%=new Date() %>
</body>
</html>