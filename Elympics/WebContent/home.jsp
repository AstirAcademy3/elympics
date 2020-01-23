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
	
<div class="container cg">
	<table class="table table-bordered table-striped tab">
		<thead class="bg-primary" style="color: white">
			<tr align="center">
				
				<th scope="col" >Games</th>
				<th scope="col" >Best Player</th>
				<th scope="col" >High Score</th>
			</tr>
		</thead>
		<tbody>
		<tr>
				<td  align="center">Snake</td>
				<td align="center">Batman</td>
				<td align="center">10000</td>
			</tr>
			<tr>
				<td  align="center">Pac-Man</td>
				<td align="center">Capitan Spain</td>
				<td align="center">9000</td>
			</tr>
			<tr>
				<td  align="center">Solitaire</td>
				<td align="center">Wonder Woman</td>
				<td align="center">7000</td>
			</tr>
		</tbody>
	</table>
	&nbsp
	<h2 class="nw" align="center">News</h2>
	&nbsp
	
  <div class="container-fluid c1">
  <img src="img/snake.jpg"  align="left" height="10%" width="15%" style="margin-right:1em;"><div align="justify">Snake is a video game found on many mobile phones. Its origins go back to the seventies; Snake is a snake that eating what appears on the display stretches, and the player earns points. He constantly moves and must avoid crashing into obstacles, but above all against himself, which is increasingly difficult as his body stretches.Snake is a video game found on many mobile phones. Its origins go back to the seventies; Snake is a snake that eating what appears on the display stretches, and the player earns points. He constantly moves and must avoid crashing into obstacles, but above all against himself, which is increasingly difficult as his body stretches.
</div></div>
&nbsp
<div class="container-fluid c2">
 <img src="img/solitario.jpg"  align="right" height="10%" width="15%" style="margin-left:1em;"><div align="justify">The most clicked classic Spider-style solitaire game on the web, to have fun simply and for free. The objective of the Spider solitaire is to eliminate the cards that are found in the game table together with those present in the deck, composing the typical scales in descending order, that is, starting from the King and reaching the Ace.The most clicked classic Spider-style solitaire game on the web, to have fun simply and for free. The objective of the Spider solitaire is to eliminate the cards that are found in the game table together with those present in the deck, composing the typical scales in descending order, that is, starting from the King and reaching the Ace. 
</div></div>
</div>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>