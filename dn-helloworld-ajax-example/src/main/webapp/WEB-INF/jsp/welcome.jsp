<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/4.3.0/css/bootstrap.min.css" />
<script type="text/javascript" src="webjars/jquery/3.3.1/jquery.min.js"></script>
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>
	<div class="container">
		<div class="starter-template">
			<h1>Spring Boot Web AJAX Example</h1>
			<button>Click</button>
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

	<script type="text/javascript"
		src="webjars/bootstrap/4.3.0/js/bootstrap.min.js"></script>

</body>

</html>
