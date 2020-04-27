//gestione dell'evento onkeydown:
function checkKeyDown(e) {
    e = e || window.event;
    switch(e.keyCode){
	case 39: destra(); break;
	case 40: giu();    break;
	case 37: sinistra();   break;
	case 38: su();    break;
    }    
    //alert ("The Unicode character code is (key down): " + e.keyCode);   
}

// gestione dell'evento onkey press:
function checkKeyPress (event){
    var chCode = ('charCode' in event) ? event.charCode : event.keyCode;
    
	switch(chCode){
    	case 100: destra();   break;
    	case 115: giu();      break;
    	case 97:  sinistra(); break;
    	case 119: su();       break;
    }
    //alert ("The Unicode character code is (key press): " + chCode);   
}

function controllaCella(x,y){
	if(piano[x][y]==PILLOLA){
		generaOggetto(PILLOLA);
		testa++;
		piano[x][y] = testa;
		ominoX= x;
		ominoY= y;
		disegnaCellaSpeciale(x,y,omino)
		return false;
	}else if(piano[x][y]>0){ 
		alert("Game over!");
		return false;
	}else{
		piano[x][y] = testa + 1;
    	return true; 
	}
	return true; 
}

function sposta (daX,daY, aX,aY){
	if (controllaCella(aX, aY)){
	    
		var daSrc = "c" +daX+"_"+daY; 
	    var aSrc  = "c" + aX+"_"+ aY;
		console.log(daSrc + " " +aSrc);

        for (var i=0; i<R; i++) {
			for (var j=0; j<C;j++){
				if(piano[i][j]>0){
					piano[i][j] = piano[i][j] - 1 ;
				}
			}
		}

		// cancella l'omino e disegna lo sfondo
		ominoX= aX;
		ominoY= aY;
		disegnaPiano();
	} else {}
}

function su(){
	var newX = (ominoX -1 + R)%R; 
	direzione="N";
	sposta (ominoX,ominoY, newX,ominoY);
}
function giu(){
	var newX = (ominoX + 1 + R)%R; 
	direzione="S";
	sposta (ominoX,ominoY, newX,ominoY);
}

function sinistra(){
	var newY = (ominoY -1 + C)%C; 
	direzione="W";
	sposta (ominoX,ominoY, ominoX,newY);
}

function destra(){
	var newY = (ominoY + 1 + C)%C; 
	direzione="E";
	sposta (ominoX,ominoY, ominoX,newY);
}