<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<a href="/vehicle/edit?id=${vehicle.id}" role="button">Edytuj pojazd</a>
</body>
</html>
