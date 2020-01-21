<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<div align="center" class="foot">
	Astir Academy <br>
	© Creator Andrea Mazza, Alberto Lorena, Davide Gentile, Filippo Caselli
	<button onclick="topFunction()" id="btnTop" title="Go to top">Top</button>
</div>

<script>
	//Get the button
	var btnTop = document.getElementById("btnTop");
	
	// When the user scrolls down 20px from the top of the document, show the button
	window.onscroll = function() {scrollFunction()};
	
	function scrollFunction() {
	  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
		  btnTop.style.display = "block";
	  } else {
		  btnTop.style.display = "none";
	  }
	}
	
	// When the user clicks on the button, scroll to the top of the document
	function topFunction() {
	  document.body.scrollTop = 0;
	  document.documentElement.scrollTop = 0;
	}
</script>