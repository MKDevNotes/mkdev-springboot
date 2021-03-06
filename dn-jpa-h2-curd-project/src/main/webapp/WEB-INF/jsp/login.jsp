<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
					<li class="nav-item"><a class="nav-link" href="${userRegisterUrl}">Register</a></li>
				</ul>

			</div>
		</div>
	</nav>

	<main class="login-form">
	<div class="cotainer">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card">
					<div class="card-header">Login</div>
					<div class="card-body">
						<form:form class="form-horizontal" method="post"  action="${loginPageURL}">
							<div class="form-group row">
								<label for="email_address"
									class="col-md-4 col-form-label text-md-right">User Name</label>
								<div class="col-md-6">
									<input type="text" id="username" class="form-control"
										name="username" required autofocus>
								</div>
							</div>
							<div class="form-group row">
								<label for="password"
									class="col-md-4 col-form-label text-md-right">Password</label>
								<div class="col-md-6">
									<input type="password" id="password" class="form-control"
										name="password" required>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-md-6 offset-md-4">
									<div class="checkbox">
										<label> <input type="checkbox" name="remember">
											Remember Me
										</label>
									</div>
								</div>
							</div>
							<div class="col-md-6 offset-md-4">
								<button type="submit" class="btn btn-primary">Login</button>
								<a href="/reset" class="btn btn-link"> Forgot Your Password? </a>
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