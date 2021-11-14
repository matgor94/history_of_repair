<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista wszystkich napraw</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Opis naprawy</th>
        <th scope="col">Koszt części</th>
        <th scope="col">Koszt robocizny</th>
    </tr>
    </thead>
    <c:forEach items="${allRepairs}" var="repair">
        <tbody>
        <tr>
            <td>${repair.id}</td>
            <td>${repair.desctription}</td>
            <td>${repair.partsCost}</td>
            <td>${repair.jobCost}</td>
        </tr>
        </tbody>
    </c:forEach>
</table>
</br>
<div align="center">
    <a href="/vehicle/all" role="button" class="btn btn-primary">Lista pojazdów</a>
</div>
</body>
</html>
