<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
        
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Employee</title>
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
      <li class="nav-item active">
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



<div class="row">
		<div class="container">
			<h2 class="text-center">List of Employees</h2>
			<hr>

			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Emp_Id</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Phone</th>
						<th>Address</th>
						<th>Team</th>
						<th>Project</th>
						<th>Actions</th>
						
					</tr>
				</thead>
				<tbody>
			
					<c:forEach var="emp" items="${employees}">

						<tr>
							<td><c:out value="${emp.id}" /></td>
							<td><c:out value="${emp.fname}" /></td>
							<td><c:out value="${emp.lname}" /></td>
							<td><c:out value="${emp.email}" /></td>
							
							<td><c:out value="${emp.phone}" /></td>
							<td><c:out value="${emp.address}" /></td>
							<td><c:out value="${emp.team}" /></td>
							<td><c:out value="${emp.project}" /></td>
							
							<td><a href="EditServlet?id=<c:out value='${emp.id}' />">Edit</a>
								&nbsp;&nbsp;<span>|</span>&nbsp;&nbsp; 
								<a href="DeleteServlet?id=<c:out value='${emp.id}' />">Delete</a></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>



</body>
</html>