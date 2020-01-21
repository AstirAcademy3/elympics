<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<style><%@include file="style.css" %></style>
	<style><%@include file="bootstrapLib/css/bootstrap.min.css" %></style>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.22.2/moment.min.js"></script>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/tempusdominus-bootstrap-4/5.0.1/js/tempusdominus-bootstrap-4.min.js"></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tempusdominus-bootstrap-4/5.0.1/css/tempusdominus-bootstrap-4.min.css" />
	<meta charset="ISO-8859-1">
	<title>Registrati</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<form class="sub">
	  <div class="form-row">
	  	<div class="form-group col-md-6">
			<label for="exampleInputPassword1">Nome</label>
			<input class="form-control" type="text" name="pass" id="pass">
		</div>
		<div class="form-group col-md-6">
			<label for="exampleInputPassword1">Cognome</label>
			<input class="form-control" type="text" name="pass" id="pass">
		</div>
	    <div class="form-group col-md-6">
	      <label for="inputEmail4">Email</label>
	      <input type="email" class="form-control" id="inputEmail4">
	    </div>
	    <div class="form-group col-md-6">
	      <label for="inputPassword4">Password</label>
	      <input type="password" class="form-control" id="inputPassword4">
	    </div>
	  </div>
	  <div class="form-row">
	  	<div class="col-md-6">
			<label for="exampleInputPassword1">Password</label>
			<input class="form-control" type="password" name="pass" id="pass">
		</div>
		<div class="col-md-6">
			<label for="exampleInputPassword1">Conferma Password</label>
			<input class="form-control" type="password" name="pass" id="pass">
		</div>
	  </div>
	  <div class="form-row">
	    <div class="form-group col-md-5">
	       <label for="inputCity">Giorno di nascita</label>
	       <div class="form-group">
                <div class="input-group date" id="datetimepicker4" data-target-input="nearest">
                    <input type="text" class="form-control datetimepicker-input" data-target="#datetimepicker4"/>
                    <div class="input-group-append" data-target="#datetimepicker4" data-toggle="datetimepicker">
                        <div class="input-group-text"><i class="fa fa-calendar"></i></div>
                    </div>
                </div>
            </div>
	       <script type="text/javascript">
		        $(function () {
		            $('#datetimepicker4').datetimepicker({
		                format: 'L'
		            });
		        });
		   </script>
	    </div>
	    <div class="form-group col-md-4">
	      <label for="inputState">State</label>
	      <select id="inputState" class="form-control">
	        <option selected>Choose...</option>
	        <option>...</option>
	      </select>
	    </div>
	    <div class="form-group col-md-3">
	      <label for="inputState">Sesso</label>
	      <select id="inputState" class="form-control">
	        <option selected> </option>
	        <option>Maschio</option>
	        <option>Femmina</option>
	        <option>Altro</option>
	      </select>
	    </div>
	  </div>
	  <div class="form-group">
	    <div class="form-check" align="center">
	      <input class="form-check-input" type="checkbox" id="gridCheck">
	      <label class="form-check-label" for="gridCheck">
	        Accetto condizioni d'uso
	      </label>
	    </div>
	  </div>
	  <button type="submit" class="btn btn-primary" style="width: 38.5rem">Suscribe</button>
	</form>
	<jsp:include page="footerLogReg.jsp"></jsp:include>
</body>
</html>