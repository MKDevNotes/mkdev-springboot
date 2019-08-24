<!DOCTYPE html>
 
<html lang="en">
<head>
    <!--  Static resources form Webjars -->
	<link rel="stylesheet" href="/webjars/bootstrap/4.3.1/css/bootstrap.min.css">
	<script src="/webjars/jquery/3.0.0/jquery.min.js"></script>
	<script src="/webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-secondary navbar-dark">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">MKDevNotes</a>
		</div>
		<ul class="navbar-nav">
			<li class="nav-item active"><a class="nav-link" href="/home">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="#">About</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Contact</a></li>
			<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
			</li>
		</ul>
	</nav>
    <div class="container">
        <div class="jumbotron">
            <h2>${title}</h2>
            <p>${message}</p>
        </div>
    </div>
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