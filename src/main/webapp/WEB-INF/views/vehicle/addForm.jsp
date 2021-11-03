<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj pojazd</title>
</head>
<body>
<form:form method="post" modelAttribute="vehicle">
    <form:input path="producent" placeholder="Producent"/>
    <form:input path="model" placeholder="Model"/>
    <form:input path="yearOfProduction" placeholder="Rok produkcji"/>
    <form:input path="km" placeholder="Przebieg"/>
    <form:input path="capacity" placeholder="Pojemność"/>
    <input type="submit" value="Dodaj pojazd">
</form:form>
</body>
</html>
