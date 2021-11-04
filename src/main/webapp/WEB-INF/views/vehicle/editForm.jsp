<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vehicle Edit Form</title>
</head>
<body>
<form:form method="post" modelAttribute="vehicle">
    <form:hidden path="id"/>
    <form:input path="producent" plcaholder="Producent"/>
    <form:input path="model" placeholder="Model"/>
    <form:input path="yearOfProduction" placeholder="Rok produkcji"/>
    <form:input path="km" placeholder="Przebieg"/>
    <form:input path="capacity" placeholder="Pojemność"/>
    <button type="submit">Zapisz</button>
</form:form>
</body>
</html>
