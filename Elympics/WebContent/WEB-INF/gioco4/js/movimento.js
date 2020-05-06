
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
	switch (piano[x][y]){
		case ARMA:
		omino = ominoConSpada;
		piano[x][y] = SFONDO; 
		return true; 	
		case OSTACOLO: 
		return false; 
		case PILLOLA:
			audioPillola.rewindAndPlay();
			energia = energia + DELTA_ENERGIA;
			document.getElementById("punteggio").value=energia;
			document.getElementById("energia").innerHTML=energia;
			piano[x][y] = SFONDO;
			
			return true;
		default: 
			return true; 
	}

	return true; 
}

function sposta (daX,daY, aX,aY){
	if (controllaCella(aX, aY)){
		
		var daSrc = "c" +daX+"_"+daY; 
		var aSrc  = "c" + aX+"_"+ aY;
		console.log(daSrc + " " +aSrc);
		var immagine = document.getElementById(daSrc); 
		// cancella l'omino e disegna lo sfondo
		immagine.src = pathImg +  piano[daX][daY] + ".jpg";
		ominoX= aX;
		ominoY= aY;
		disegnaOmino();
	} else {
		
		//non può spostarsi...
		
	}
}

function su(){
	var newX = (ominoX -1 + R)%R; 
	sposta (ominoX,ominoY, newX,ominoY);
}
function giu(){
	var newX = (ominoX + 1 + R)%R; 
	sposta (ominoX,ominoY, newX,ominoY);
}

function sinistra(){
	var newY = (ominoY -1 + C)%C; 
	sposta (ominoX,ominoY, ominoX,newY);
}

function destra(){
	var newY = (ominoY + 1 + C)%C; 
	sposta (ominoX,ominoY, ominoX,newY);
}

function Cacciatore (x,y,nome){
    this.x=x;  // posizione iniziale del cacciatore 
    this.y=y;  // posizione iniziale del cacciatore 
    this.nome=nome; 
    var r = Math.random(); 
	this.x = Math.round( r * R);
	// si genera un indice di colonna casuale tra 0 e C
	var c = Math.random(); 
	this.y = Math.round( c * C);// proprietà utilizzata per caricare immagine del cacciatore (es. blu.jpg)
}

function gameOver(){
	init()
	
	clearInterval(timerC1);
	clearInterval(timerC2);
	clearInterval(timerC3);
	clearInterval(timerPillole);
	document.getElementById("btnModal").click();
	
}



Cacciatore.prototype.insegui = function (){
    var precX = this.x;
    var precY = this.y;

 

    // aggiornamento della posizione
    if (this.x < ominoX) { this.x++;} else
    if (this.x > ominoX) { this.x--;} else

 

    if (this.y < ominoY) { this.y++;} else
    if (this.y > ominoY) { this.y--;}
    var prec_id = "c"+precX+"_"+ precY;      // "img1/" + "0.jpg"
    document.getElementById(prec_id).src   = pathImg + piano[precX][precY] + ".jpg";
    
    var curr_id = "c"+this.x+"_"+this.y;      // "img1/" + "0.jpg"
   
    document.getElementById(curr_id).src   = pathImg + this.nome + ".jpg";

  if (this.x==ominoX && this.y==ominoY)  {
  	gameOver();
  }
}




