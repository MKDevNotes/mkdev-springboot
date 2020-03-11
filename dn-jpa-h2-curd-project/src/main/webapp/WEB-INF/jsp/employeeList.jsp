<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<%@ include file="init.jsp"%>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-secondary navbar-dark">
		<div class="container">
			<a class="navbar-brand" href="#">MKDevNotes</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> Hey UserName </a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="${userLogoutURL}">Logout</a>
							<!-- <a class="dropdown-item" href="#">Another action</a> -->
							<!-- <div class="dropdown-divider"></div> -->
							<!-- <a class="dropdown-item" href="#">Something else here</a> -->
						</div></li>
				</ul>
			</div>
		</div>
	</nav>

	<main class="login-form">
	<div class="cotainer">
		<div class="row justify-content-center">
			<div class="col-md-8">
			<a class="btn btn-primary" href="${viewHomePageURL}" role="button">Home</a>
				<div class="card">
					<div class="card-header">EmployeeList</div>
					<div class="card-body">
						<table class="table table-striped">
							<thead>
								<tr>
									<th scope="col">#</th>
									<th scope="col">First Name</th>
									<th scope="col">Last Name</th>
									<th scope="col">Job Title</th>
									<th scope="col">Salary</th>
									<th scope="col">Salary</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${employeeList}" var="employee">
									<tr>
										<th scope="row">${employee.employeeId}</th>
										<td>${employee.firstName}</td>
										<td>${employee.lastName}</td>
										<td>${employee.jobTitle}</td>
										<td>${employee.salary}</td>
										<td><a href="edit/${employee.employeeId}">Edit</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	</main>

	<div id="footer" class="text-center">
		<div class="container">
			<p>© Copyrights MKDevNotes. All rights reserved.</p>
			<div class="credits">
				Designed by <a href="#">MKDevNotesStudio</a>
			</div>
		</div>
	</div>
</body>
</html>
