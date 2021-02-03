<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	isELIgnored="false"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>WELCOME TO USER DATA</h3>
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>PASSWORD</th>
			<th colspan=2>OPERATIONS</th>
		</tr>
		<c:forEach items="${list}" var="ob">
		<td>${ob.roles.roleId} </td>
			<tr>
				<td><c:out value="${ob.id}"/></td>
				<td><c:out value="${ob.username}"/></td>
				<td><c:out value="${ob.password}"/></td>
				<td><c:out value="${ob.roleId}"/></td>
				<td><%-- <a href="delete?id=${ob.id}">Delete</a>
				    <a href="edit?id=${ob.id}">Edit</a> --%>
				    <a href="view?id=${ob.id}">View</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>