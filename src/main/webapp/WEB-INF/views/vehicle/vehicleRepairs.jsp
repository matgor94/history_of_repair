<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<br>
<head>
    <title>Historia napraw</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<style >
    table{
        counter-reset: rowNumber -1;
    }

    table tr{
        counter-increment: rowNumber;
    }

    table tr td:first-child::before{
        content: counter(rowNumber);
        min-width: 1em;
        margin-right: 0.5em;
    }
</style>
<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">Lp</th>
        <th scope="col">Opis naprawy</th>
        <th scope="col">Koszt części</th>
        <th scope="col">Koszt robocizny</th>
    </tr>
</thead>
    <c:forEach items="${repairs}" var="repair">
        <tbody>
        <tr>
            <td></td>
            <td>${repair.desctription}</td>
            <td>${repair.partsCost}</td>
            <td>${repair.jobCost}</td>
        </tr>
        </tbody>
    </c:forEach>
</table>
</br>
<div align="center">
    <a href="/repair/add?id=${id}" role="button" class="btn btn-secondary">Dodaj naprawę</a>
    <a href="/vehicle/all" role="button" class="btn btn-primary">Lista pojazdów</a>
</div>

</br>
<h3>Łącznie na naprawy wydano: ${allCost} zł</h3>
</body>
</html>
