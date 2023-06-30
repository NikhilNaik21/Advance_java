<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<b>Create new employees</b>
	<%-- ${employee } --%>
	
	<sf:form modelAttribute="employee">
		
		<table border="1">
			
			<tr>
				<td>Id: </td>
				<td> <sf:input id="txtId" path="id"/> </td>
			</tr>
			<tr>
				<td>Name: </td>
				<td><sf:input id="txtName" path="name"/> </td>
			</tr>
			<tr>
				<td>Designation: </td>
				<td><sf:input id="txtDesgn" path="designation"/> </td>
			</tr>
			<tr>
				<td>EmailId: </td>
				<td><sf:input id="txtEmail" path="emailId"/> </td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="SaveEmp">
				</td>				
			</tr>
			
		</table>
	</sf:form>
	

</body>
</html>




