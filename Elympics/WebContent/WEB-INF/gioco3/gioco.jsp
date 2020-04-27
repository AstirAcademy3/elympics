<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<script type="text/javascript" src="gioco3/js/mappa.js"></script>
<script type="text/javascript" src="gioco3/js/audio.js"></script>
<script type="text/javascript" src="gioco3/js/movimento.js"></script>
</head>
<body onkeydown="checkKeyDown(event);" onkeypress="checkKeyPress(event)" style="background-color: blue;">

<div class="progress">
  <div id="barraTempo" class="progress-bar progress-bar-striped bg-danger" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
</div>
<div class="progress">
  <div class="progress-bar bg-danger" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
</div>
<h1 >ENERGIA: </h1><h1 id="energia">0</h1>
<img id="c0_0" src="gioco3/img1/0.jpg">
<img id="c0_1" src="gioco3/img1/0.jpg">
<img id="c0_2" src="gioco3/img1/0.jpg">
<img id="c0_3" src="gioco3/img1/0.jpg">
<img id="c0_4" src="gioco3/img1/0.jpg">
<img id="c0_5" src="gioco3/img1/0.jpg">
<img id="c0_6" src="gioco3/img1/0.jpg">
<img id="c0_7" src="gioco3/img1/0.jpg">
<img id="c0_8" src="gioco3/img1/0.jpg">
<img id="c0_9" src="gioco3/img1/0.jpg">
<img id="c0_10" src="gioco3/img1/0.jpg">
<img id="c0_11" src="gioco3/img1/0.jpg">
<img id="c0_12" src="gioco3/img1/0.jpg">
<img id="c0_13" src="gioco3/img1/0.jpg">
<img id="c0_14" src="gioco3/img1/0.jpg">
<img id="c0_15" src="gioco3/img1/0.jpg">
<img id="c0_16" src="gioco3/img1/0.jpg">
<img id="c0_17" src="gioco3/img1/0.jpg">
<img id="c0_18" src="gioco3/img1/0.jpg">
<img id="c0_19" src="gioco3/img1/0.jpg">
<br>
<img id="c1_0" src="gioco3/img1/0.jpg">
<img id="c1_1" src="gioco3/img1/0.jpg">
<img id="c1_2" src="gioco3/img1/0.jpg">
<img id="c1_3" src="gioco3/img1/0.jpg">
<img id="c1_4" src="gioco3/img1/0.jpg">
<img id="c1_5" src="gioco3/img1/0.jpg">
<img id="c1_6" src="gioco3/img1/0.jpg">
<img id="c1_7" src="gioco3/img1/0.jpg">
<img id="c1_8" src="gioco3/img1/0.jpg">
<img id="c1_9" src="gioco3/img1/0.jpg">
<img id="c1_10" src="gioco3/img1/0.jpg">
<img id="c1_11" src="gioco3/img1/0.jpg">
<img id="c1_12" src="gioco3/img1/0.jpg">
<img id="c1_13" src="gioco3/img1/0.jpg">
<img id="c1_14" src="gioco3/img1/0.jpg">
<img id="c1_15" src="gioco3/img1/0.jpg">
<img id="c1_16" src="gioco3/img1/0.jpg">
<img id="c1_17" src="gioco3/img1/0.jpg">
<img id="c1_18" src="gioco3/img1/0.jpg">
<img id="c1_19" src="gioco3/img1/0.jpg">
<br>
<img id="c2_0" src="gioco3/img1/0.jpg">
<img id="c2_1" src="gioco3/img1/0.jpg">
<img id="c2_2" src="gioco3/img1/0.jpg">
<img id="c2_3" src="gioco3/img1/0.jpg">
<img id="c2_4" src="gioco3/img1/0.jpg">
<img id="c2_5" src="gioco3/img1/0.jpg">
<img id="c2_6" src="gioco3/img1/0.jpg">
<img id="c2_7" src="gioco3/img1/0.jpg">
<img id="c2_8" src="gioco3/img1/0.jpg">
<img id="c2_9" src="gioco3/img1/0.jpg">
<img id="c2_10" src="gioco3/img1/0.jpg">
<img id="c2_11" src="gioco3/img1/0.jpg">
<img id="c2_12" src="gioco3/img1/0.jpg">
<img id="c2_13" src="gioco3/img1/0.jpg">
<img id="c2_14" src="gioco3/img1/0.jpg">
<img id="c2_15" src="gioco3/img1/0.jpg">
<img id="c2_16" src="gioco3/img1/0.jpg">
<img id="c2_17" src="gioco3/img1/0.jpg">
<img id="c2_18" src="gioco3/img1/0.jpg">
<img id="c2_19" src="gioco3/img1/0.jpg">
<br>
<img id="c3_0" src="gioco3/img1/0.jpg">
<img id="c3_1" src="gioco3/img1/0.jpg">
<img id="c3_2" src="gioco3/img1/0.jpg">
<img id="c3_3" src="gioco3/img1/0.jpg">
<img id="c3_4" src="gioco3/img1/0.jpg">
<img id="c3_5" src="gioco3/img1/0.jpg">
<img id="c3_6" src="gioco3/img1/0.jpg">
<img id="c3_7" src="gioco3/img1/0.jpg">
<img id="c3_8" src="gioco3/img1/0.jpg">
<img id="c3_9" src="gioco3/img1/0.jpg">
<img id="c3_10" src="gioco3/img1/0.jpg">
<img id="c3_11" src="gioco3/img1/0.jpg">
<img id="c3_12" src="gioco3/img1/0.jpg">
<img id="c3_13" src="gioco3/img1/0.jpg">
<img id="c3_14" src="gioco3/img1/0.jpg">
<img id="c3_15" src="gioco3/img1/0.jpg">
<img id="c3_16" src="gioco3/img1/0.jpg">
<img id="c3_17" src="gioco3/img1/0.jpg">
<img id="c3_18" src="gioco3/img1/0.jpg">
<img id="c3_19" src="gioco3/img1/0.jpg">
<br>
<img id="c4_0" src="gioco3/img1/0.jpg">
<img id="c4_1" src="gioco3/img1/0.jpg">
<img id="c4_2" src="gioco3/img1/0.jpg">
<img id="c4_3" src="gioco3/img1/0.jpg">
<img id="c4_4" src="gioco3/img1/0.jpg">
<img id="c4_5" src="gioco3/img1/0.jpg">
<img id="c4_6" src="gioco3/img1/0.jpg">
<img id="c4_7" src="gioco3/img1/0.jpg">
<img id="c4_8" src="gioco3/img1/0.jpg">
<img id="c4_9" src="gioco3/img1/0.jpg">
<img id="c4_10" src="gioco3/img1/0.jpg">
<img id="c4_11" src="gioco3/img1/0.jpg">
<img id="c4_12" src="gioco3/img1/0.jpg">
<img id="c4_13" src="gioco3/img1/0.jpg">
<img id="c4_14" src="gioco3/img1/0.jpg">
<img id="c4_15" src="gioco3/img1/0.jpg">
<img id="c4_16" src="gioco3/img1/0.jpg">
<img id="c4_17" src="gioco3/img1/0.jpg">
<img id="c4_18" src="gioco3/img1/0.jpg">
<img id="c4_19" src="gioco3/img1/0.jpg">
<br>
<img id="c5_0" src="gioco3/img1/0.jpg">
<img id="c5_1" src="gioco3/img1/0.jpg">
<img id="c5_2" src="gioco3/img1/0.jpg">
<img id="c5_3" src="gioco3/img1/0.jpg">
<img id="c5_4" src="gioco3/img1/0.jpg">
<img id="c5_5" src="gioco3/img1/0.jpg">
<img id="c5_6" src="gioco3/img1/0.jpg">
<img id="c5_7" src="gioco3/img1/0.jpg">
<img id="c5_8" src="gioco3/img1/0.jpg">
<img id="c5_9" src="gioco3/img1/0.jpg">
<img id="c5_10" src="gioco3/img1/0.jpg">
<img id="c5_11" src="gioco3/img1/0.jpg">
<img id="c5_12" src="gioco3/img1/0.jpg">
<img id="c5_13" src="gioco3/img1/0.jpg">
<img id="c5_14" src="gioco3/img1/0.jpg">
<img id="c5_15" src="gioco3/img1/0.jpg">
<img id="c5_16" src="gioco3/img1/0.jpg">
<img id="c5_17" src="gioco3/img1/0.jpg">
<img id="c5_18" src="gioco3/img1/0.jpg">
<img id="c5_19" src="gioco3/img1/0.jpg">
<br>
<img id="c6_0" src="gioco3/img1/0.jpg">
<img id="c6_1" src="gioco3/img1/0.jpg">
<img id="c6_2" src="gioco3/img1/0.jpg">
<img id="c6_3" src="gioco3/img1/0.jpg">
<img id="c6_4" src="gioco3/img1/0.jpg">
<img id="c6_5" src="gioco3/img1/0.jpg">
<img id="c6_6" src="gioco3/img1/0.jpg">
<img id="c6_7" src="gioco3/img1/0.jpg">
<img id="c6_8" src="gioco3/img1/0.jpg">
<img id="c6_9" src="gioco3/img1/0.jpg">
<img id="c6_10" src="gioco3/img1/0.jpg">
<img id="c6_11" src="gioco3/img1/0.jpg">
<img id="c6_12" src="gioco3/img1/0.jpg">
<img id="c6_13" src="gioco3/img1/0.jpg">
<img id="c6_14" src="gioco3/img1/0.jpg">
<img id="c6_15" src="gioco3/img1/0.jpg">
<img id="c6_16" src="gioco3/img1/0.jpg">
<img id="c6_17" src="gioco3/img1/0.jpg">
<img id="c6_18" src="gioco3/img1/0.jpg">
<img id="c6_19" src="gioco3/img1/0.jpg">
<br>
<img id="c7_0" src="gioco3/img1/0.jpg">
<img id="c7_1" src="gioco3/img1/0.jpg">
<img id="c7_2" src="gioco3/img1/0.jpg">
<img id="c7_3" src="gioco3/img1/0.jpg">
<img id="c7_4" src="gioco3/img1/0.jpg">
<img id="c7_5" src="gioco3/img1/0.jpg">
<img id="c7_6" src="gioco3/img1/0.jpg">
<img id="c7_7" src="gioco3/img1/0.jpg">
<img id="c7_8" src="gioco3/img1/0.jpg">
<img id="c7_9" src="gioco3/img1/0.jpg">
<img id="c7_10" src="gioco3/img1/0.jpg">
<img id="c7_11" src="gioco3/img1/0.jpg">
<img id="c7_12" src="gioco3/img1/0.jpg">
<img id="c7_13" src="gioco3/img1/0.jpg">
<img id="c7_14" src="gioco3/img1/0.jpg">
<img id="c7_15" src="gioco3/img1/0.jpg">
<img id="c7_16" src="gioco3/img1/0.jpg">
<img id="c7_17" src="gioco3/img1/0.jpg">
<img id="c7_18" src="gioco3/img1/0.jpg">
<img id="c7_19" src="gioco3/img1/0.jpg">
<br>
<img id="c8_0" src="gioco3/img1/0.jpg">
<img id="c8_1" src="gioco3/img1/0.jpg">
<img id="c8_2" src="gioco3/img1/0.jpg">
<img id="c8_3" src="gioco3/img1/0.jpg">
<img id="c8_4" src="gioco3/img1/0.jpg">
<img id="c8_5" src="gioco3/img1/0.jpg">
<img id="c8_6" src="gioco3/img1/0.jpg">
<img id="c8_7" src="gioco3/img1/0.jpg">
<img id="c8_8" src="gioco3/img1/0.jpg">
<img id="c8_9" src="gioco3/img1/0.jpg">
<img id="c8_10" src="gioco3/img1/0.jpg">
<img id="c8_11" src="gioco3/img1/0.jpg">
<img id="c8_12" src="gioco3/img1/0.jpg">
<img id="c8_13" src="gioco3/img1/0.jpg">
<img id="c8_14" src="gioco3/img1/0.jpg">
<img id="c8_15" src="gioco3/img1/0.jpg">
<img id="c8_16" src="gioco3/img1/0.jpg">
<img id="c8_17" src="gioco3/img1/0.jpg">
<img id="c8_18" src="gioco3/img1/0.jpg">
<img id="c8_19" src="gioco3/img1/0.jpg">
<br>
<img id="c9_0" src="gioco3/img1/0.jpg">
<img id="c9_1" src="gioco3/img1/0.jpg">
<img id="c9_2" src="gioco3/img1/0.jpg">
<img id="c9_3" src="gioco3/img1/0.jpg">
<img id="c9_4" src="gioco3/img1/0.jpg">
<img id="c9_5" src="gioco3/img1/0.jpg">
<img id="c9_6" src="gioco3/img1/0.jpg">
<img id="c9_7" src="gioco3/img1/0.jpg">
<img id="c9_8" src="gioco3/img1/0.jpg">
<img id="c9_9" src="gioco3/img1/0.jpg">
<img id="c9_10" src="gioco3/img1/0.jpg">
<img id="c9_11" src="gioco3/img1/0.jpg">
<img id="c9_12" src="gioco3/img1/0.jpg">
<img id="c9_13" src="gioco3/img1/0.jpg">
<img id="c9_14" src="gioco3/img1/0.jpg">
<img id="c9_15" src="gioco3/img1/0.jpg">
<img id="c9_16" src="gioco3/img1/0.jpg">
<img id="c9_17" src="gioco3/img1/0.jpg">
<img id="c9_18" src="gioco3/img1/0.jpg">
<img id="c9_19" src="gioco3/img1/0.jpg">
<br>


<input type="button" onClick="generaPillole()"      value="genera pillole" ></input>
<input type="button" onClick="generaOstacolo()"     value="genera ostacolo" ></input>
<input type="button" onClick="disegnaPiano()"       value="disegna piano" ></input>
<input type="button" onClick="mostraMatriceHTML()"  value="mostra matrice" ></input>
<input type="button" onClick="disegnaOmino()"       value="mostra omino" ></input>

<p id="posizioneOmino"></p>
<p id="messaggioDebug"></p>
  <!-- Button to Open the Modal -->
  <button hidden id="btnModal" type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
    Open modal
  </button>

  <!-- The Modal -->
  <div class="modal" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Game Over!</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          Hai finito la partita!
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal" onclick="init()">Close</button>
          <button type="button" class="btn btn-info" data-dismiss="modal" onclick="play()">Gioca</button>
        
		</div>
        
      </div>
    </div>
  </div>
	<form method="POST" action="salvapartita">
		<input type="hidden" value="3" name="gioco"></input>
		<input type ="hidden" value="50" name="punteggio" id="punteggio"></input>
		<input type="submit"  value="Salva" class="btn"></input>
	</form>
</body>
</html>