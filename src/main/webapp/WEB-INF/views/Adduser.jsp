<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome User Register Page</h1>
	<form:form action="/save" method="post" modelAttribute="user">
		<pre>
		
		User Id   :  <form:input path="id" />
		
		Name      :  <form:input path="username" />
		
		Password  :  <form:password path="password" />
		
		Set Roles :  <select name="roleId">
		             <option value="">--select--</option> 
		             
		              <c:forEach items="${roles}" var="obs"> 
		            
		             <option value="${obs.getRoleId()}">${obs.getRoleName()}</option>
                        
                     
                    < </c:forEach> 
		  
		             </select> 
		
		
	<input type="submit" value="create" />
		</pre>

	</form:form>

	${msg}
</body>
</html>






<%-- <select name = “roles”>
		             <option value = "">--select-- </option>
		             <c:forEach items="${roles}" var="obs">
		             <tr> 
                        <option value="${obs.roleId}">${obs.roleName}</option>
                        <option value="${obs.roleId}">${obs.roleId}</option>
                       <h:input type="hidden" value="${obs.roleId}" />
                     </tr>
                     </c:forEach>
                     </select> --%>





