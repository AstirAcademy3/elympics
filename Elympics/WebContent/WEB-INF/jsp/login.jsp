<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.2/jquery.min.js">
	<meta charset="ISO-8859-1">
	<title>Login form</title>
	<script>
		function submit(e){
			e.disabled= true;
			document.form1.submit();
		}
	</script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<form method="GET" action="login" name="form1" onload="check()">
		<div class="log">
			<div class="form-group">
				<label for="exampleInputEmail1">Username</label>
				<input class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="username" required>
				<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label>
				<div class="inputTogglePass"><input class="form-control" type="password" name="password" id="pass" required></div>
			</div>
			<br>
			<button id="bt" type="button" onclick="submit(this)" class="btn btn-primary" style="width: 38.5rem;" name="bt">Login</button>
		</div>
	</form>
	<p></p>
	<div align="center">
		<a href="registrazione" >Non sei registrato ? Clicca qui ! </a>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>