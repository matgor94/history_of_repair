<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: mateusz
  Date: 28.10.2021
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj pojazd</title>
</head>
<body>
<form:form method="post" modelAttribute="vehicle">
    <form:input path="producent" placeholder="Producent"/>
    <form:input path="model" placeholder="Model"/>
    <form:input path="yearOfProduction" placeholder="Rok produckji"/>
    <form:input path="km" placeholder="Przebieg"/>
    <form:input path="capacity" placeholder="Pojemność"/>
    <input type="submit" value="Dodaj pojazd">
</form:form>
</body>
</html>
