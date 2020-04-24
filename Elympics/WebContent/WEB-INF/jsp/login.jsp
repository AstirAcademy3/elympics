<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
		<link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<meta charset="ISO-8859-1">
		<title>Login form</title>
		<script>
			function myFunction() {
			  var x = document.getElementById("password");
			  if (x.type === "password") {
			    x.type = "text";
			    document.getElementById('imgEye').src='img/eyeT2.jpg';
			    document.getElementById("imgEye").style.filter="opacity(100%)";
			  } else {
			    x.type = "password";
			    document.getElementById('imgEye').src='img/eyeT.jpg';
			    document.getElementById("imgEye").style.filter="opacity(50%)";
			  }
		
			}
			function submit(e){
				e.disabled= true;
				document.form1.submit();
			}
			function check(){
				if(document.form1.invalid){
					document.getElementById("bt").disabled = true;
				}
				else{
					document.getElementById("bt").disabled = false;
					
				}
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
				<div class="row" class="passToggle">
					<div class="inputTogglePass col-md-11"><input class="form-control" type="password" name="password" id="pass" required></div>
					<div class="imgTogglePass col-sd-1"><img src="img/eyeT.jpg" style="width:100%;" onclick="myFunction()" id="imgEye"/></div>
				</div>
			</div>
			<div class="form-group form-check" align="center">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1" >Remember Me</label>
			</div>
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