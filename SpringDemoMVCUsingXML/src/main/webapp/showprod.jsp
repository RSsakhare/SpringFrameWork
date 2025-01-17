<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product List</title>
</head>
<body>
    <h2>Product List</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Product ID</th>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="product" items="${plist}">
                <tr>
                    <td>${product.pid}</td>
                    <td>${product.pname}</td>
                    <td>${product.pqty}</td>
                    <td>${product.pprice}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    ${plist}
</body>
</html>
