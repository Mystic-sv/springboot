<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Create Employee</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: blue;">
			<div>
				<a href="<%=request.getContextPath()%>/" class="navbar-brand"> Create Employee </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/viewEmployees"
					class="navbar-brand">Employee List</a></li>
			</ul>
		</nav>
	</header>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				

					 <h2>Create New Employee</h2>
				
<form:form action="createEmployee" method="post" modelAttribute="employee">
							<div class="form-group">
								<label>Employee Name<font color="red"> *</font></label> <input
									class="form-control" required="required" name="employeeName" type="text"></div>
							
							<div class="form-group">
								<label>Email<font color="red"> *</font></label> <input
									class="form-control" required="required" name="email" type="text"></div>
									<div><form:errors path="email" class="error" /></div>
															
							<center><button  type="submit" class="btn btn-success">Save</button></center>
							
						</form:form>
			
			</div>
		</div>
	</div>
</body>
</html>