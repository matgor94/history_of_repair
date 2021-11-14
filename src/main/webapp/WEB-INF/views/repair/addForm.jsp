<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj naprawę</title>
</head>
<body>
<form:form method="post" modelAttribute="repair">
    <form:hidden path="id"/>
    <form:input path="desctription" placeholder="Opis naprawy"/>
    <form:input path="partsCost" placeholder="Koszt części"/>
    <form:input path="jobCost" placeholder="Koszt robocizny"/>
    <form:hidden path="vehicle"/>
    <input type="submit" value="Dodaj naprawę">
</form:form>
</body>
</html>
