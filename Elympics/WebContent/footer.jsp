<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<div align="center" class="foot">
	Astir Academy <br>
	© Creator Andrea Mazza, Alberto Lorena, Davide Gentile, Filippo Caselli
	<button onclick="topFunction()" id="btnTop" title="Go to top"><svg class="bi bi-chevron-up" width="1.5em" height="1.5em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M9.646 6.646a.5.5 0 01.708 0l6 6a.5.5 0 01-.708.708L10 7.707l-5.646 5.647a.5.5 0 01-.708-.708l6-6z" clip-rule="evenodd"></path>
</svg></button>
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