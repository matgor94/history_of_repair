<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vehicles List</title>
</head>
<body>
   <table>
       <tr>
           <th>Id</th>
           <th>Producent</th>
           <th>Model</th>
           <th>Rok produkcji</th>
           <th>Pojemność</th>
       </tr>
       <c:forEach items="${allVehicles}" var="vehicle">
           <tr>
               <td>${vehicle.id}</td>
               <td>${vehicle.producent}</td>
               <td>${vehicle.model}</td>
               <td>${vehicle.yearOfProduction}</td>
               <td>${vehicle.capacity}</td>
           </tr>
       </c:forEach>
   </table>
<a href="/vehicle/edit?id=${vehicle.id}" role="button">Edytuj pojazd</a><br/>
<a href="/repair/add?id=${vehicle.id}" role="button">Dodaj naprawę</a>
</body>
</html>
