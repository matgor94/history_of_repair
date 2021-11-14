<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista wszystkich pojazdów</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
   <table class="table">
       <thead class="thead-dark">
       <tr>
           <th scope="col">Id</th>
           <th scope="col">Producent</th>
           <th scope="col">Model</th>
           <th scope="col">Rok produkcji</th>
           <th scope="col">Pojemność</th>
           <th scope="col">Opcje</th>
       </tr>
       </thead>
       <c:forEach items="${allVehicles}" var="vehicle">
           <tbody>
           <tr>
               <td>${vehicle.id}</td>
               <td>${vehicle.producent}</td>
               <td>${vehicle.model}</td>
               <td>${vehicle.yearOfProduction}</td>
               <td>${vehicle.capacity}</td>
               <td>
                   <a href="/vehicle/edit?id=${vehicle.id}" role="button" class="btn btn-primary btn-sm">Edytuj pojazd</a>
                   <a href="/repair/add?vehID=${vehicle.id}" role="button" class="btn btn-secondary btn-sm">Dodaj naprawę</a>
                   <a href="/vehicleRepairs?id=${vehicle.id}" role="button" class="btn btn-success btn-sm">Historia</a>
               </td>
           </tr>
           </tbody>
       </c:forEach>
   </table>
</body>
</html>
