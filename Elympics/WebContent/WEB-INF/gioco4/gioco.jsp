<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script type="text/javascript" src="gioco4/js/mappa.js"></script>
<script type="text/javascript" src="gioco4/js/audio.js"></script>
<script type="text/javascript" src="gioco4/js/movimento.js"></script>
</head>
<body onkeydown="checkKeyDown(event);" onkeypress="checkKeyPress(event)" >
<jsp:include page="../jsp/header.jsp"></jsp:include>

  <div class="progress"style="width:50%">
    <div class="progress-bar progress-bar-striped progress-bar-animated" style="width:0%" id="barraTempo"></div>
  </div>
		<p class="txt">ENERGIA: </p><p id="energia" class="txt">0</p>
  <p></p>
<img id="c0_0" src="gioco4/img1/0.jpg">
<img id="c0_1" src="gioco4/img1/0.jpg">
<img id="c0_2" src="gioco4/img1/0.jpg">
<img id="c0_3" src="gioco4/img1/0.jpg">
<img id="c0_4" src="gioco4/img1/0.jpg">
<img id="c0_5" src="gioco4/img1/0.jpg">
<img id="c0_6" src="gioco4/img1/0.jpg">
<img id="c0_7" src="gioco4/img1/0.jpg">
<img id="c0_8" src="gioco4/img1/0.jpg">
<img id="c0_9" src="gioco4/img1/0.jpg">
<img id="c0_10" src="gioco4/img1/0.jpg">
<img id="c0_11" src="gioco4/img1/0.jpg">
<img id="c0_12" src="gioco4/img1/0.jpg">
<img id="c0_13" src="gioco4/img1/0.jpg">
<img id="c0_14" src="gioco4/img1/0.jpg">
<img id="c0_15" src="gioco4/img1/0.jpg">
<img id="c0_16" src="gioco4/img1/0.jpg">
<img id="c0_17" src="gioco4/img1/0.jpg">
<img id="c0_18" src="gioco4/img1/0.jpg">
<img id="c0_19" src="gioco4/img1/0.jpg">
<br>
<img id="c1_0" src="gioco4/img1/0.jpg">
<img id="c1_1" src="gioco4/img1/0.jpg">
<img id="c1_2" src="gioco4/img1/0.jpg">
<img id="c1_3" src="gioco4/img1/0.jpg">
<img id="c1_4" src="gioco4/img1/0.jpg">
<img id="c1_5" src="gioco4/img1/0.jpg">
<img id="c1_6" src="gioco4/img1/0.jpg">
<img id="c1_7" src="gioco4/img1/0.jpg">
<img id="c1_8" src="gioco4/img1/0.jpg">
<img id="c1_9" src="gioco4/img1/0.jpg">
<img id="c1_10" src="gioco4/img1/0.jpg">
<img id="c1_11" src="gioco4/img1/0.jpg">
<img id="c1_12" src="gioco4/img1/0.jpg">
<img id="c1_13" src="gioco4/img1/0.jpg">
<img id="c1_14" src="gioco4/img1/0.jpg">
<img id="c1_15" src="gioco4/img1/0.jpg">
<img id="c1_16" src="gioco4/img1/0.jpg">
<img id="c1_17" src="gioco4/img1/0.jpg">
<img id="c1_18" src="gioco4/img1/0.jpg">
<img id="c1_19" src="gioco4/img1/0.jpg">
<br>
<img id="c2_0" src="gioco4/img1/0.jpg">
<img id="c2_1" src="gioco4/img1/0.jpg">
<img id="c2_2" src="gioco4/img1/0.jpg">
<img id="c2_3" src="gioco4/img1/0.jpg">
<img id="c2_4" src="gioco4/img1/0.jpg">
<img id="c2_5" src="gioco4/img1/0.jpg">
<img id="c2_6" src="gioco4/img1/0.jpg">
<img id="c2_7" src="gioco4/img1/0.jpg">
<img id="c2_8" src="gioco4/img1/0.jpg">
<img id="c2_9" src="gioco4/img1/0.jpg">
<img id="c2_10" src="gioco4/img1/0.jpg">
<img id="c2_11" src="gioco4/img1/0.jpg">
<img id="c2_12" src="gioco4/img1/0.jpg">
<img id="c2_13" src="gioco4/img1/0.jpg">
<img id="c2_14" src="gioco4/img1/0.jpg">
<img id="c2_15" src="gioco4/img1/0.jpg">
<img id="c2_16" src="gioco4/img1/0.jpg">
<img id="c2_17" src="gioco4/img1/0.jpg">
<img id="c2_18" src="gioco4/img1/0.jpg">
<img id="c2_19" src="gioco4/img1/0.jpg">
<br>
<img id="c3_0" src="gioco4/img1/0.jpg">
<img id="c3_1" src="gioco4/img1/0.jpg">
<img id="c3_2" src="gioco4/img1/0.jpg">
<img id="c3_3" src="gioco4/img1/0.jpg">
<img id="c3_4" src="gioco4/img1/0.jpg">
<img id="c3_5" src="gioco4/img1/0.jpg">
<img id="c3_6" src="gioco4/img1/0.jpg">
<img id="c3_7" src="gioco4/img1/0.jpg">
<img id="c3_8" src="gioco4/img1/0.jpg">
<img id="c3_9" src="gioco4/img1/0.jpg">
<img id="c3_10" src="gioco4/img1/0.jpg">
<img id="c3_11" src="gioco4/img1/0.jpg">
<img id="c3_12" src="gioco4/img1/0.jpg">
<img id="c3_13" src="gioco4/img1/0.jpg">
<img id="c3_14" src="gioco4/img1/0.jpg">
<img id="c3_15" src="gioco4/img1/0.jpg">
<img id="c3_16" src="gioco4/img1/0.jpg">
<img id="c3_17" src="gioco4/img1/0.jpg">
<img id="c3_18" src="gioco4/img1/0.jpg">
<img id="c3_19" src="gioco4/img1/0.jpg">
<br>
<img id="c4_0" src="gioco4/img1/0.jpg">
<img id="c4_1" src="gioco4/img1/0.jpg">
<img id="c4_2" src="gioco4/img1/0.jpg">
<img id="c4_3" src="gioco4/img1/0.jpg">
<img id="c4_4" src="gioco4/img1/0.jpg">
<img id="c4_5" src="gioco4/img1/0.jpg">
<img id="c4_6" src="gioco4/img1/0.jpg">
<img id="c4_7" src="gioco4/img1/0.jpg">
<img id="c4_8" src="gioco4/img1/0.jpg">
<img id="c4_9" src="gioco4/img1/0.jpg">
<img id="c4_10" src="gioco4/img1/0.jpg">
<img id="c4_11" src="gioco4/img1/0.jpg">
<img id="c4_12" src="gioco4/img1/0.jpg">
<img id="c4_13" src="gioco4/img1/0.jpg">
<img id="c4_14" src="gioco4/img1/0.jpg">
<img id="c4_15" src="gioco4/img1/0.jpg">
<img id="c4_16" src="gioco4/img1/0.jpg">
<img id="c4_17" src="gioco4/img1/0.jpg">
<img id="c4_18" src="gioco4/img1/0.jpg">
<img id="c4_19" src="gioco4/img1/0.jpg">
<br>
<img id="c5_0" src="gioco4/img1/0.jpg">
<img id="c5_1" src="gioco4/img1/0.jpg">
<img id="c5_2" src="gioco4/img1/0.jpg">
<img id="c5_3" src="gioco4/img1/0.jpg">
<img id="c5_4" src="gioco4/img1/0.jpg">
<img id="c5_5" src="gioco4/img1/0.jpg">
<img id="c5_6" src="gioco4/img1/0.jpg">
<img id="c5_7" src="gioco4/img1/0.jpg">
<img id="c5_8" src="gioco4/img1/0.jpg">
<img id="c5_9" src="gioco4/img1/0.jpg">
<img id="c5_10" src="gioco4/img1/0.jpg">
<img id="c5_11" src="gioco4/img1/0.jpg">
<img id="c5_12" src="gioco4/img1/0.jpg">
<img id="c5_13" src="gioco4/img1/0.jpg">
<img id="c5_14" src="gioco4/img1/0.jpg">
<img id="c5_15" src="gioco4/img1/0.jpg">
<img id="c5_16" src="gioco4/img1/0.jpg">
<img id="c5_17" src="gioco4/img1/0.jpg">
<img id="c5_18" src="gioco4/img1/0.jpg">
<img id="c5_19" src="gioco4/img1/0.jpg">
<br>
<img id="c6_0" src="gioco4/img1/0.jpg">
<img id="c6_1" src="gioco4/img1/0.jpg">
<img id="c6_2" src="gioco4/img1/0.jpg">
<img id="c6_3" src="gioco4/img1/0.jpg">
<img id="c6_4" src="gioco4/img1/0.jpg">
<img id="c6_5" src="gioco4/img1/0.jpg">
<img id="c6_6" src="gioco4/img1/0.jpg">
<img id="c6_7" src="gioco4/img1/0.jpg">
<img id="c6_8" src="gioco4/img1/0.jpg">
<img id="c6_9" src="gioco4/img1/0.jpg">
<img id="c6_10" src="gioco4/img1/0.jpg">
<img id="c6_11" src="gioco4/img1/0.jpg">
<img id="c6_12" src="gioco4/img1/0.jpg">
<img id="c6_13" src="gioco4/img1/0.jpg">
<img id="c6_14" src="gioco4/img1/0.jpg">
<img id="c6_15" src="gioco4/img1/0.jpg">
<img id="c6_16" src="gioco4/img1/0.jpg">
<img id="c6_17" src="gioco4/img1/0.jpg">
<img id="c6_18" src="gioco4/img1/0.jpg">
<img id="c6_19" src="gioco4/img1/0.jpg">
<br>
<img id="c7_0" src="gioco4/img1/0.jpg">
<img id="c7_1" src="gioco4/img1/0.jpg">
<img id="c7_2" src="gioco4/img1/0.jpg">
<img id="c7_3" src="gioco4/img1/0.jpg">
<img id="c7_4" src="gioco4/img1/0.jpg">
<img id="c7_5" src="gioco4/img1/0.jpg">
<img id="c7_6" src="gioco4/img1/0.jpg">
<img id="c7_7" src="gioco4/img1/0.jpg">
<img id="c7_8" src="gioco4/img1/0.jpg">
<img id="c7_9" src="gioco4/img1/0.jpg">
<img id="c7_10" src="gioco4/img1/0.jpg">
<img id="c7_11" src="gioco4/img1/0.jpg">
<img id="c7_12" src="gioco4/img1/0.jpg">
<img id="c7_13" src="gioco4/img1/0.jpg">
<img id="c7_14" src="gioco4/img1/0.jpg">
<img id="c7_15" src="gioco4/img1/0.jpg">
<img id="c7_16" src="gioco4/img1/0.jpg">
<img id="c7_17" src="gioco4/img1/0.jpg">
<img id="c7_18" src="gioco4/img1/0.jpg">
<img id="c7_19" src="gioco4/img1/0.jpg">
<br>
<img id="c8_0" src="gioco4/img1/0.jpg">
<img id="c8_1" src="gioco4/img1/0.jpg">
<img id="c8_2" src="gioco4/img1/0.jpg">
<img id="c8_3" src="gioco4/img1/0.jpg">
<img id="c8_4" src="gioco4/img1/0.jpg">
<img id="c8_5" src="gioco4/img1/0.jpg">
<img id="c8_6" src="gioco4/img1/0.jpg">
<img id="c8_7" src="gioco4/img1/0.jpg">
<img id="c8_8" src="gioco4/img1/0.jpg">
<img id="c8_9" src="gioco4/img1/0.jpg">
<img id="c8_10" src="gioco4/img1/0.jpg">
<img id="c8_11" src="gioco4/img1/0.jpg">
<img id="c8_12" src="gioco4/img1/0.jpg">
<img id="c8_13" src="gioco4/img1/0.jpg">
<img id="c8_14" src="gioco4/img1/0.jpg">
<img id="c8_15" src="gioco4/img1/0.jpg">
<img id="c8_16" src="gioco4/img1/0.jpg">
<img id="c8_17" src="gioco4/img1/0.jpg">
<img id="c8_18" src="gioco4/img1/0.jpg">
<img id="c8_19" src="gioco4/img1/0.jpg">
<br>
<img id="c9_0" src="gioco4/img1/0.jpg">
<img id="c9_1" src="gioco4/img1/0.jpg">
<img id="c9_2" src="gioco4/img1/0.jpg">
<img id="c9_3" src="gioco4/img1/0.jpg">
<img id="c9_4" src="gioco4/img1/0.jpg">
<img id="c9_5" src="gioco4/img1/0.jpg">
<img id="c9_6" src="gioco4/img1/0.jpg">
<img id="c9_7" src="gioco4/img1/0.jpg">
<img id="c9_8" src="gioco4/img1/0.jpg">
<img id="c9_9" src="gioco4/img1/0.jpg">
<img id="c9_10" src="gioco4/img1/0.jpg">
<img id="c9_11" src="gioco4/img1/0.jpg">
<img id="c9_12" src="gioco4/img1/0.jpg">
<img id="c9_13" src="gioco4/img1/0.jpg">
<img id="c9_14" src="gioco4/img1/0.jpg">
<img id="c9_15" src="gioco4/img1/0.jpg">
<img id="c9_16" src="gioco4/img1/0.jpg">
<img id="c9_17" src="gioco4/img1/0.jpg">
<img id="c9_18" src="gioco4/img1/0.jpg">
<img id="c9_19" src="gioco4/img1/0.jpg">
<br>


<input type="button" onClick="play()"      value="Play" ></input>
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
          <input type="button" class="btn btn-danger" data-dismiss="modal" value="Close" class="btn" form="formSalvataggio" onclick="submitClose()"></input>
          <input type="button"  class="btn btn-info" data-dismiss="modal" value="Save" class="btn" form="formSalvataggio"
          	onclick="submitSave()"></input>
		</div>
        
      </div>
    </div>
  </div>
<script type="text/javascript">
  function submitSave(){
	  document.getElementById("formSalvataggio").submit();
  }
  function submitClose(){
	  document.getElementById("formSalvataggio").action="gioco?id=4";
	  document.getElementById("formSalvataggio").submit();
  }
  </script>
	<form method="POST" action="salvapartita" id="formSalvataggio"> 
		<input type="hidden" value="4" name="gioco"></input>
		<input type ="text" value="0" name="punteggio" id="punteggio"></input>
	</form>
</body>
</html>