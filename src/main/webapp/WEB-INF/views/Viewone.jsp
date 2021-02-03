<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h2>  Welcome View Page </h2>
<table border="1">
             <tr>
                    <th>User ID</th>
                    <td> ${r.id}</td>
             </tr>
             <tr>
                    <th>USER NAME</th>
                    <td> ${r.username}</td>
             </tr>
              <tr>
                     <th>PASSWORD</th>
                     <td> ${r.password}</td>
              </tr>
              <tr>
                      <th>ROLE NAME</th>
                      <td>${r.roleName}</td>
               </tr>
               </table>

</body>
</html>