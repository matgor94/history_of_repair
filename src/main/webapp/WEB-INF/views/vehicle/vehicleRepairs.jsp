<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vehicle repairs</title>
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
<body>
<%--<h1>Historia: ${vehicle.producent} ${vehicle.model}</h1>--%>
<table>
    <tr>
        <th>Lp</th>
        <th>Opis naprawy</th>
        <th>Koszt części</th>
        <th>Koszt robocizny</th>
    </tr>
    <c:forEach items="${repairs}" var="repair">
        <tr>
            <td>${repair.desctription}</td>
            <td>${repair.partsCost}</td>
            <td>${repair.jobCost}</td>
        </tr>
    </c:forEach>
</table>
Części: ${partsCost} Robocizna: ${jobsCost} Łącznie: ${allCost}
</body>
</html>
