<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
     <jsp:useBean id="empInfo" class="com.labexam.employeeBean"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">



<title>TABLE</title>
</head>
<body>
		<table border="1">
		<tr>
			<th>empno</th> 
			<th>ename</th> 
			<th>department</th> 
		</tr>
		
					
		<c:forEach var="employeee" items="${empInfo.entries}">
				<tr>
				<td>${employeee.eno}</td>
					<td>${employeee.ename}</td>
					<td>${employeee.department}</td> 
				</tr>
			</c:forEach> 
			

		
		</table>
		
</html>
