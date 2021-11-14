<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj pojazd</title>
</head>
<body>
<table>
    <tr>
        <th>Id</th>
        <th>Opis naprawy</th>
        <th>Koszt części</th>
        <th>Koszt robocizny</th>
    </tr>
    <c:forEach items="${allRepairs}" var="repair">
        <tr>
            <td>${repair.id}</td>
            <td>${repair.desctription}</td>
            <td>${repair.partsCost}</td>
            <td>${repair.jobCost}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
