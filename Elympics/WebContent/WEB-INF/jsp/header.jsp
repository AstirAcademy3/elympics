<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Elympics</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
	<link rel="stylesheet" type="text/css" href="style.css">
	<link rel='icon' href='img/favicon1.ico' type='image/x-icon' sizes="40x40" />
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-link bg-link" >

		<img class="astirimg" src="img/astir.png">
		<div class="cvoci text-center">
			<div class="collapse navbar-collapse text-center" id="navbarNavDropdown">

				<ul class="navbar-nav nav text-center"> 

					<li class="nav-item active">
						<a class="nav-link" href="home">HOME<span class="sr-only">(current)</span></a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="games">GAMES</a>
					</li>

					<li class="nav-item">
						<a class="nav-link" href="rank">RANK</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="aboutus">ABOUT US</a>
					</li>

				</ul>

			</div>
		</div>

		<div class="dropdown">
  <a class="btn dropdown-toggle" role="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
   <svg class="bi bi-person text-primary" width="32" height="32" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
			<path fill-rule="evenodd" d="M15 16s1 0 1-1-1-4-6-4-6 3-6 4 1 1 1 1h10zm-9.995-.944v-.002zM5.022 15h9.956a.274.274 0 00.014-.002l.008-.002c-.001-.246-.154-.986-.832-1.664C13.516 12.68 12.289 12 10 12c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664a1.05 1.05 0 00.022.004zm9.974.056v-.002zM10 9a2 2 0 100-4 2 2 0 000 4zm3-2a3 3 0 11-6 0 3 3 0 016 0z" clip-rule="evenodd">
			</path>
		</svg>
  </a>
  ${ user.nome }
  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
    <a class="dropdown-item dd" href="prelogin">LOGIN</a>
    <a class="dropdown-item dd" href="registrazione">SUBSCRIBE</a>
  </div>
</div>	

		<img class="etlaboraimg" src="img/etlabora.png">
	</nav>
	</body>
	</html>