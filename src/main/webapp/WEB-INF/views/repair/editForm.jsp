<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: mateusz
  Date: 07.11.2021
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Repair - Edit form</title>
</head>
<body>
<form:form modelAttribute="repair" method="post">
    <form:hidden path="id"/>
    <form:input path="desctription" placeholder="Opis naprawy"/>
    <form:input path="partsCost" placeholder="Koszt części"/>
    <form:input path="jobCost" placeholder="Koszt robocizny"/>
    <button type="submit">Zapisz naprawę</button>
</form:form>
</body>
</html>
