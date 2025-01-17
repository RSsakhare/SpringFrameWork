<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><H3>User Login Page</H3></center>
<center><a href='./userdash.jsp'> User Dashboard </a>|<a href='product.jsp'> Product </a>|<a href='service.jsp'> Service </a></center>
<p style="text-align:right">${msg}</p>
<p>Welcome to your dashboard!</p>
<p style="text-align:right"><a href='./home.jsp'>logout</a>&nbsp;&nbsp;&nbsp;&nbsp;</p>

</body>
</html>