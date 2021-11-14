<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formularz dodawania naprawy</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>

<form:form method="post" modelAttribute="repair">
    <form:hidden path="id"/>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Opis naprawy</label>
        <div class="col-sm-10">
            <form:textarea path="desctription" placeholder="Opis naprawy" class="form-control"/>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Koszt części</label>
        <div class="col-sm-10">
            <form:input path="partsCost" placeholder="Koszt części" class="form-control"/>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Koszt robocizny</label>
        <div class="col-sm-10">
            <form:input path="jobCost" placeholder="Koszt robocizny" class="form-control"/>
        </div>
    </div>
    <form:hidden path="vehicle"/>
    <div align="center">
        <button type="submit" class="btn btn-dark">Dodaj naprawę</button>
    </div>
</form:form>
</body>
</html>
