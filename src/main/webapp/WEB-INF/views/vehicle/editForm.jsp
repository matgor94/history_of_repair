<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formularz edycji pojazdu</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<form:form method="post" modelAttribute="vehicle">
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Producent</label>
        <div class="col-sm-10">
            <form:input path="producent" placeholder="Producent" class="form-control"/>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Model</label>
        <div class="col-sm-10">
            <form:input path="model" placeholder="Model" class="form-control"/>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Rok produkcji</label>
        <div class="col-sm-10">
            <form:input path="yearOfProduction" placeholder="Rok produkcji" class="form-control"/>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Przebieg</label>
        <div class="col-sm-10">
            <form:input path="km" placeholder="Przebieg" class="form-control"/>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Pojemność</label>
        <div class="col-sm-10">
            <form:input path="capacity" placeholder="Pojemność" class="form-control"/>
        </div>
    </div>
    <div align="center">
        <button type="submit" class="btn btn-dark">Dodaj pojazd</button>
    </div>
</form:form>
</body>
</html>
