<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<!--  Static resources form Webjars -->
<link rel="stylesheet"
	href="/webjars/bootstrap/4.3.1/css/bootstrap.min.css">
<script type="text/javascript" src="webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
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
		<div class="starter-template">
			<h1>Spring Boot Web AJAX Example</h1>
			<button>Click</button>
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
	<script type="text/javascript">
		$(document).ready(function() {
			// executes when HTML-Document is loaded and DOM is ready
			alert("document is ready");
			$("button").click(function() {
				alert("Button click demo..");
				$.ajax({
					type : "GET",
					//contentType : "application/json",
					url : window.location + "/api/ajaxdemo/testmsg",
					// data : JSON.stringify(formData),
					// dataType : 'json',
					success : function(result) {
						alert(result);
						console.log(result);
					},
					error : function(e) {
						alert("Error!")
						console.log("ERROR: ", e);
					}
				});
			});
		});

		$(window).on('load', function() {
			alert("window is loaded");
		});
	</script>

	<!-- /.container -->
</body>

</html>
