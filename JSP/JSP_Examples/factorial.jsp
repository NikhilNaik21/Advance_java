<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import= "java.util.*" %>
   <%@ page errorPage="Exception.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! 
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

<%!
public int fibonacci(int n)
{
 	int n1=0,n2=1,sum=0;
		
 	
	for(int i=1;i<n;i++)
	{
		sum =n1+n2;
		n1=n2;
		n2=sum;
	}
return sum;
}
%>


<%
	int n = Integer.parseInt(request.getParameter("Number"));
	int result1;
	result1 = factorial(n);
	out.print("<h4>" +"factorial "+"of "+ n +" is "+ result1 + "<h4>");
	System.out.println("factorial:"+result1);
	
	int result2;
	result2=fibonacci(n);
	out.print("<h4>" +"fibonacci: "+"of "+ n +" is " +result2 + "<h4>");
	
	

%>

<%


 	int n1=0,n2=1,sum=0;
		
 	out.print(" [ "+n1);
 	
	for(int i=1;i<n;i++)
	{
		sum =n1+n2;
		n1=n2;
		n2=sum;
		out.print("-"+sum);
	}out.print(" ]");



%>
<br>
<br>
<h3>Power of numbers from range [0-10]</h3>
<% 

for(int i=0;i<=10;i++)
{
	int a =(int) Math.pow(2,i);
	out.print(a + "<br>");
}


%>



<br>
</body>
</html>