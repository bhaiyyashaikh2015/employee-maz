<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
<link href="${contextPath}/resource/bootstrap.min.css" rel="stylesheet">
</head>
<body style="background-color: #bfc9c2;">





<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Employee Management</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="http://localhost:8080/Database1/index.jsp">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="ViewServlet">Show Employee</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>



<br><br>


<div class="container">
<h2 class="text-center">Update an Employee</h2>
<hr>

<br>
<form action="EditServlet2" method="post">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="id">Emp_id</label>
      <input type="text" class="form-control" id="id" name="id" value="${emp.id}" readonly>
    </div>
    <div class="form-group col-md-6">
      <label for="fname">First Name</label>
      <input type="text" class="form-control" id="fname" name="fname" value="${emp.fname}">
    </div>
  </div>
  
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="lname">Last Name</label>
      <input type="text" class="form-control" id="lname" name="lname" value="${emp.lname}">
    </div>
    <div class="form-group col-md-6">
      <label for="email">Email</label>
      <input type="email" class="form-control" id="email" name="email" value="${emp.email}">
    </div>
  </div>
  
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="phone">Phone</label>
      <input type="text" class="form-control" id="phone" name="phone" value="${emp.phone}">
    </div>
    <div class="form-group col-md-6">
      <label for="address">Address</label>
      <input type="text" class="form-control" id="address" name="address" value="${emp.address}">
    </div>
  </div>
  
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="team">Team</label>
      <input type="text" class="form-control" id="team" name="team" value="${emp.team}">
    </div>
    <div class="form-group col-md-6">
      <label for="project">Project</label>
      <input type="text" class="form-control" id="project" name="project" value="${emp.project}">
    </div>
  </div>
   <button type="submit" class="btn btn-primary">Update</button>
 
</form>

</div>

</body>
</html>