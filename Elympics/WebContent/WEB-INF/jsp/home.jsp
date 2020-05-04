<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
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
			<li data-target="#carouselExampleCaptions" data-slide-to="3"></li>
		</ol>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="img/gioco1.png" class="d-block w-100 caro" alt="...">
				<div class="carousel-caption d-none d-md-block">
					

				</div>
			</div>
			<div class="carousel-item">
				<img src="img/gioco2.png" class="d-block w-100 caro" alt="...">
				<div class="carousel-caption d-none d-md-block">
					

				</div>
			</div>
			<div class="carousel-item">
				<img src="img/gioco3.png" class="d-block w-100 caro" alt="...">
				<div class="carousel-caption d-none d-md-block">
					

				</div>
			</div>
			<div class="carousel-item">
				<img src="img/gioco4.png" class="d-block w-100 caro" alt="...">
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
					<td  align="center">${primaRiga.gioco.nome}</td>
					<td align="center">${primaRiga.user.username}</td>
					<td align="center">${primaRiga.punti}</td>
				</tr>
				<tr>
					<td  align="center">${secondaRiga.gioco.nome}</td>
					<td align="center">${secondaRiga.user.username}</td>
					<td align="center">${secondaRiga.punti}</td>
				</tr>
				<tr>
					<td  align="center">${terzaRiga.gioco.nome}</td>
					<td align="center">${terzaRiga.user.username}</td>
					<td align="center">${terzaRiga.punti}</td>
				</tr>
				<tr>
					<td  align="center">${quartaRiga.gioco.nome}</td>
					<td align="center">${quartaRiga.user.username}</td>
					<td align="center">${quartaRiga.punti}</td>
				</tr>
			</tbody>
		</table>
		&nbsp
		<h2 class="nw" align="center">Descrizione giochi</h2>
		&nbsp
	  	<div class="container-fluid c1">
		  <img src="img/gioco1.png"  align="left" height="10%" width="15%" style="margin-right:1em;"><div align="justify">Il gioco numero 1 consiste in un omino ,che viene controllato con le apposite frecce della tastiera, il quale deve prendere il maggior numero di coppe prima che altri due cacciatori situati sul piano di gioco e mossi automaticamente riescano a prenderlo. Una volta che viene preso la partita finisce e il punteggio viene salvato nella classifica rank solo se l'utente ha già eseguito il login.</div>
		</div>
		&nbsp
		<div class="container-fluid c2">
			<img src="img/gioco2.png"  align="right" height="10%" width="15%" style="margin-left:1em;"><div align="justify">Il gioco numero 2 consiste in un serpente che mangiando il frutto che appare sul display si allunga, e il giocatore guadagna dei punti. Si muove utilizzando le apposite frcce situate sulla tastiera e deve evitare di sbattere contro sé stesso, cosa sempre più difficile man mano che il suo corpo si allunga. Una volta che si ha perso il punteggio viene salvato nella classifica rank solo se l'utente ha già eseguito il login.</div>
		</div>
		&nbsp
	  	<div class="container-fluid c1">
		  <img src="img/gioco3.png"  align="left" height="10%" width="15%" style="margin-right:1em;"><div align="justify">Il gioco numero 3 consiste in un omino che deve prendere il maggior numero di coppe prima che altri due cacciatori situati sul piano di gioco e mossi automaticamente riescano a prenderlo, l'omino viene controllato con le apposite frecce della tastiera. Una volta che viene preso la partita finisce e il punteggio viene salvato nella classifica rank solo se l'utente ha già eseguito il login.</div>
		</div>
		&nbsp
		<div class="container-fluid c2">
			<img src="img/gioco4.png"  align="right" height="10%" width="15%" style="margin-left:1em;"><div align="justify">Il gioco numero 4 consiste in un omino ,che viene controllato con le apposite frecce della tastiera, il quale deve prendere il maggior numero di sfere di energia prima che altri il cacciatore mosso automaticamente riesca a raggiungerlo ed evitando gli ostacoli. Una volta che viene preso la partita finisce e il punteggio viene salvato nella classifica rank solo se l'utente ha già eseguito il login.</div>
		</div>
	</div>
<!-- Include il footer -->
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>