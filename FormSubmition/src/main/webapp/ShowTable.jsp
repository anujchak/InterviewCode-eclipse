<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Table page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
        h1{text-align: center;}
    </style>
</head>
<body>
<div class="container">
<h1>This is Table</h1>
</div>

<sql:setDataSource driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/student1" user="root" password="Anuj@1998" var="ds"></sql:setDataSource>
<sql:query dataSource="${ds}" var="rs">select * from boys </sql:query>
<div class="container">
<table class="table">
<tr>
<td>ROLL</td>
<td>Name</td>
<td>Password</td>
<td>Course</td>
<td>Email</td>
<c:forEach items="${rs.rows}" var = "row">
<tr>
<td><c:out value="${row.roll}"></c:out></td>
<td><c:out value="${row.name}"></c:out></td>
<td><c:out value="${row.password}"></c:out></td>
<td><c:out value="${row.course}"></c:out></td>
<td><c:out value="${row.email}"></c:out></td>
</tr>
</c:forEach>

</tr>
</table>
</div>

</body>
</html>