<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<script src="js/bootstrap.min.js"></script>
	
<meta charset="ISO-8859-1">
<title>Ranking</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h3 class="font-italic med" align="center">Medal</h3>
${medagliere}
	<table class="table table-bordered table-striped shadow p-3 mb-5 mt-4 bg-white rounded">
		<thead class="bg-primary" style="color: white">
			<tr align="center">
				<th scope="col" class="rk">Country</th>
				<th scope="col" class="rk" >Gold<img class="medat" src="img/m1.png"></th>
				<th scope="col" class="rk">Silver<img class="medat" src="img/m2.png"></th>
				<th scope="col" class="rk">Bronze<img class="medat" src="img/m3.png"></th>
				<th scope="col" class="rk">Tot Medal</th>
				<th scope="col" >Score
					<div class="btn-group dropleft">
    					<button type="button" class="btn btn-primary btn-sm rounded-circle btnrk" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    						<svg class="bi bi-info inf" width="1.3em" height="1.3em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
							  <path fill-rule="evenodd" d="M10 17a7 7 0 100-14 7 7 0 000 14zm8-7a8 8 0 11-16 0 8 8 0 0116 0z" clip-rule="evenodd"></path>
							  <path d="M10.93 8.588l-2.29.287-.082.38.45.083c.294.07.352.176.288.469l-.738 3.468c-.194.897.105 1.319.808 1.319.545 0 1.178-.252 1.465-.598l.088-.416c-.2.176-.492.246-.686.246-.275 0-.375-.193-.304-.533l1.002-4.705z"></path>
							  <circle cx="10" cy="6.5" r="1"></circle>
							</svg>
						</button>
			    <div class="dropdown-menu" style="">
			     <h6 class="dropdown-header">Legenda</h6>
			      <a class="dropdown-item disabled"><img class="medadd" src="img/m1.png">= 3pt</a>
			      <a class="dropdown-item disabled" ><img class="medadd" src="img/m2.png">= 2pt</a>
			      <a class="dropdown-item disabled" ><img class="medadd" src="img/m3.png">= 1pt</a> 
			  	</div>
			  	</div>
				</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">Italy</th>
				<td align="center">5</td>
				<td align="center">3</td>
				<td align="center">1</td>
				<td align="center">9</td>
				<td align="center">22</td>
			</tr>
			<tr>
				<th scope="row"></th>
				<td align="center"></td>
				<td align="center"></td>
				<td align="center"></td>
				<td align="center"></td>
				<td align="center"></td>
			</tr>
		</tbody>
	</table>
&nbsp
<h3 class="font-italic med" align="center">Best Country's Player</h3>

${classificaPaese}

	<table class="table table-bordered table-striped shadow p-3 mb-5 mt-4 bg-white rounded" >
		<thead class="bg-primary" style="color: white">
			<tr align="center">
				<th scope="col">State</th>
				<th scope="col" >Player</th>
				<th scope="col" >Game</th>
				<th scope="col" >Score</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">Italy</th>
				<td align="center">Batman</td>
				<td align="center">Snake</td>
				<td align="center">10000</td>
			</tr>
			<tr>
				<th scope="row"></th>
				<td align="center"></td>
				<td align="center"></td>
				<td align="center"></td>
			</tr>
		</tbody>
	</table>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>