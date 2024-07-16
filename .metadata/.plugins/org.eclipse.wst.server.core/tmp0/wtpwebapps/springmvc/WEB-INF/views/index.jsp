<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is home page called by colroller</h1>
<%
	String s=(String)request.getAttribute("f");
	//List<String> l=(List<String>)request.getAttribute("list");
	//for(String i:l)
	//{
%>
<c:forEach items="${list}" var = "row">
<h2>${row}</h2>
</c:forEach>
<h1><%=s %></h1>
</body>
</html>