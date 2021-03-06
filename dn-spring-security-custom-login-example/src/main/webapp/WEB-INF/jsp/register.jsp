<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="init.jsp" %>
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
					<li class="nav-item"><a class="nav-link" href="${loginPageURL}">Login</a></li>
				</ul>

			</div>
		</div>
	</nav>
	
	
	<main class="login-form">
	<div class="cotainer">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card">
					<div class="card-header">Register</div>
					<div class="card-body">
						<form:form class="form-horizontal" method="post"  action="${userRegisterUrl}">
							<div class="form-group row">
								<label for="username"
									class="col-md-4 col-form-label text-md-right">User Name</label>
								<div class="col-md-6">
									<input type="text" id="username" class="form-control"
										name="username" >
								</div>
							</div>
							<div class="form-group row">
								<label for="firstName"
									class="col-md-4 col-form-label text-md-right">First Name</label>
								<div class="col-md-6">
									<input type="text" id="firstName" class="form-control"
										name="firstName" >
								</div>
							</div>
							<div class="form-group row">
								<label for="lastName"
									class="col-md-4 col-form-label text-md-right">Last Name</label>
								<div class="col-md-6">
									<input type="text" id="lastName" class="form-control"
										name="lastName">
								</div>
							</div>
							<div class="form-group row">
								<label for="email" class="col-md-4 col-form-label text-md-right">E-Mail	Address</label>
								<div class="col-md-6">
									<input type="text" id="email" class="form-control" name="email">
								</div>
							</div>
							<div class="form-group row">
								<label for="gender"
									class="col-md-4 col-form-label text-md-right">Gender</label>
								<div class="col-md-6">
									<input type="text" id="gender" class="form-control" name="gender" >
								</div>
							</div>
							<div class="form-group row">
								<label for="contact"
									class="col-md-4 col-form-label text-md-right">Contact Number</label>
								<div class="col-md-6">
									<input type="contact" id="contact" class="form-control" name="contact">
								</div>
							</div>
							<div class="form-group row">
								<label for="password"
									class="col-md-4 col-form-label text-md-right">Password</label>
								<div class="col-md-6">
									<input type="password" id="password" class="form-control" name="password">
								</div>
							</div>
							<div class="form-group row">
								<label for="confpassword"
									class="col-md-4 col-form-label text-md-right">Confirm Password</label>
								<div class="col-md-6">
									<input type="password" id="confirmPassword" class="form-control" name="confirmPassword">
								</div>
							</div>
							<div class="col-md-6 offset-md-4">
								<button type="submit" class="btn btn-primary">Register</button> &nbsp;
								<button type="reset" class="btn btn-primary">Cancel</button>
							</div>
					</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
	</main>

	<div id="footer" class="text-center">
		<div class="container">
			<p>� Copyrights MKDevNotes. All rights reserved.</p>
			<div class="credits">
				Designed by <a href="#">MKDevNotesStudio</a>
			</div>
		</div>
	</div>
</body>
</html>
