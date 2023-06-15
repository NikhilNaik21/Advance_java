<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isErrorPage ="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Descriptor Page</title>
</head>
<body>
<h1 style=color:red >ERROR RAISED</h1>


<% 
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<i;j++)
		{
			out.print("ERROR ");
		}
		out.println("<br>");
	}

for(int i=5;i>1;i--)
{
	char c='a';
	for(int j=1;j<i;j++)
	{
		out.print("<b>"+ "ERROR " + "<b>");
		c++;
	}
	out.println("<br>");
}
%>
</body>
</html>