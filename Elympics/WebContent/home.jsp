<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<style><%@include file="style.css" %></style>
	<style><%@include file="bootstrapLib/css/bootstrap.min.css" %></style>
	<meta charset="ISO-8859-1">
	<title>Elympics|Home</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
		
		<ol class="carousel-indicators">
			<li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
			<li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
			<li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="img/snake.jpg" class="d-block w-100 caro" alt="...">
				<div class="carousel-caption d-none d-md-block">
					

				</div>
			</div>
			<div class="carousel-item">
				<img src="img/pacman.jpg" class="d-block w-100 caro" alt="...">
				<div class="carousel-caption d-none d-md-block">
					

				</div>
			</div>
			<div class="carousel-item">
				<img src="img/solitario.jpg" class="d-block w-100 caro" alt="...">
				<div class="carousel-caption d-none d-md-block">
					

				</div>
			</div>
		</div>
		<a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span>
			<span class="sr-only">Previous</span>
		</a>
		<a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
		
	</div>
	

	<table class="table table-bordered table-striped tab">
		<thead class="bg-primary" style="color: white">
			<tr align="center">
				<th scope="col"></th>
				<th scope="col" >Snake</th>
				<th scope="col" >Pac-Man</th>
				<th scope="col" >Solitario</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">Best Player</th>
				<td align="center">Batman</td>
				<td align="center">Capitan Spain</td>
				<td align="center">Wonder Woman</td>
			</tr>
			<tr>
				<th scope="row">High Score</th>
				<td align="center">10000</td>
				<td align="center">9000</td>
				<td align="center">7000</td>
			</tr>
		</tbody>
	</table>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>