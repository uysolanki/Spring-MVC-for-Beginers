<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="registerionForm" class="btn btn-primary"> Add New Player </a>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Jno</th>
      <th scope="col">Player Name</th>
      <th scope="col">Matches Played</th>
      <th scope="col">Runs Scored</th>
       <th scope="col">Delete</th>
    </tr>
  </thead>
  <tbody>
<c:forEach var="player" items="${players}" >
   <tr>
      <td scope="col">${player.jno}</td>
      <td scope="col">${player.pname}</td>
      <td scope="col">${player.mp}</td>
      <td scope="col">${player.rs}</td>
      <td scope="col"><a href="deletePlayer" class="btn btn-danger"> Delete </a></td>
    </tr>
</c:forEach>
</tbody>
</table>
</body>
</html>