<%--
  Created by IntelliJ IDEA.
  User: mateusz
  Date: 03.11.2021
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vehicle Info</title>
</head>
<body>
    <b>Dane Twojego pojazdu</b><br/>
    Producent:  ${vehicle.producent}<br/>
    Model:${vehicle.model}<br/>
    Rok produkcji: ${vehicle.yearOfProduction}<br/>
    Przebieg:${vehicle.km}<br/>
    Pojemność silnika: ${vehicle.capacity}<br/>
</body>
</html>
