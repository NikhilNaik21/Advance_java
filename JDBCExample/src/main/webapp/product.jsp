<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
     <jsp:useBean id="productInfo" class="com.JDBC.ProductBean"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TABLE</title>
</head>
<body>
		<table border="1">
		<tr>
			<th>productId</th> 
			<th>productName</th> 
			<th>price</th> 
		</tr>
		
	<%-- 		<c:forEach var = "Product" items="productInfo.entries">
			<tr>
				<td>${Product.productId }</td>
				<td>${Product.productName }</td>
				<td>${ Product.price}</td>
			</tr>
			
			
			</c:forEach> --%>
					
		<c:forEach var="product" items="${productInfo.entries}">
				<tr>
				<td>${product.productId }</td>
					<td>${product.productName }</td>
					<td>${product.price }</td> 
				</tr>
			</c:forEach> 
		
		</table>
		<a href="Queries.jsp">To add more records</a>
</body>
</html>