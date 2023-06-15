<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Example 3</title>
</head>
<body>



<!-- Declaration tag -->
<%!
	public int multiplication(int num1,int num2)
	{
		int result;
		result = num1*num2;
		return result;
	}
/* factorial code */
public int factorial(int n)
{
	
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
		
	}
	return fact;
}

%>
	
<h1>Declaration</h1>

<%
int num1=20;
int num2=20;
	int result;
	result = multiplication(num1,num2);
	out.print("<h1><b>" +"Multiplication of  "+ num1 + " and " + num2 + " = "+ result + "<b><h1>");
	System.out.println("Multiplication of "+ num1 + "and" + num2 + "=" +result);
	//System.out.printf("%d",result);
	
%>

<%
	int n = Integer.parseInt(request.getParameter("Number"));
	int result1;
	result1 = factorial(n);
	out.print("<h4>" +"factorial:"+ result1 + "<h4>");
	System.out.println("factorial:"+result1);

%>
<br>

Multiplication is = result 
<h5>Multiplication is = <%=result %></h5>


<% 
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<i;j++)
		{
			out.print("@@");
		}
		out.println("<br>");
	}

for(int i=5;i>1;i--)
{
	char c='a';
	for(int j=1;j<i;j++)
	{
		out.print("<b>"+  (int)c + "<b>");
		c++;
	}
	out.println("<br>");
}
%>


</body>
</html>