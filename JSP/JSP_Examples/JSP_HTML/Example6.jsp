<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page  errorPage="ErrorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Example 6</title>
</head>
<body>

<%!

	public int divide(int n , int m)
	{
	int ans= n/m;
	return ans;
	}


%>

<%
	int num1 = Integer.parseInt(request.getParameter("Number1"));
int num2 = Integer.parseInt(request.getParameter("Number2"));
int ans = divide(num1,num2);
out.print("Division is " +ans);

%>
<br><br>
Div = <%=ans %>

</body>
</html>