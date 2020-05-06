
//gestione dell'evento onkeydown:
function checkKeyDown(e) {
    e = e || window.event;
    switch(e.keyCode){
	case 39: destra(); break;
	case 40: giu();    break;
	case 37: sinistra();   break;
	case 38: su();    break;
    }    
    //alert ("The Unicode character code is: " + e.keyCode);   
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
    //alert ("The Unicode character code is: " + chCode);   
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
			generaOggetto(PILLOLA);
			energia = energia + DELTA_ENERGIA;
			document.getElementById("energia").innerHTML=energia;
			document.getElementById("punteggio").value=energia;
			piano[x][y] = SFONDO;
			countPillole--;
			return true;
		default: 
	      return true; 
	}

	return true; 
}


function Cacciatore (x,y,nome){
    this.x=x;  // posizione iniziale del cacciatore 
    this.y=y;  // posizione iniziale del cacciatore 
    this.nome=nome; // proprietà utilizzata per caricare immagine del cacciatore (es. blu.jpg)
}
var c1  = new Cacciatore(9,0,"nemico");
var c2  = new Cacciatore(0,19,"nemico");


function sposta (daX,daY, aX,aY){
	if (controllaCella(aX, aY)){
	    
		var daSrc = "c" +daX+"_"+daY; 
	    var aSrc  = "c" + aX+"_"+ aY;
		console.log(daSrc + " " +aSrc);
        document.getElementById(daSrc).src = pathImg +  piano[daX][daY] + ".jpg";
		ominoX= aX;
		ominoY= aY;
		disegnaCellaSpeciale(ominoX,ominoY,omino);
	}
}


Cacciatore.prototype.insegui = function (){
    var precX = this.x;
    var precY = this.y;
    // aggiornamento della posizione
    if (this.x < ominoX) { this.x++;}
    if (this.x > ominoX) { this.x--;}
 
    if (this.y < ominoY) { this.y++;}
    if (this.y > ominoY) { this.y--;}

    var prec_id = "c"+precX+"_"+ precY;      // "gioco3/img1/" + "0.jpg"
    document.getElementById(prec_id).src   = pathImg + piano[precX][precY] + ".jpg";
    
    var curr_id = "c"+this.x+"_"+this.y;      // "gioco3/img1/" + "0.jpg"
    document.getElementById(curr_id).src   = pathImg + this.nome + ".jpg";
    
    if (this.x == ominoX && this.y == ominoY){
        gameOver();
    }
}


function su(){
	var newX = (ominoX -1 + R)%R; 
	sposta (ominoX,ominoY, newX,ominoY);
}

function sinistra(){
	var newY = (ominoY -1 + C)%C; 
	sposta (ominoX,ominoY, ominoX,newY);
}

function giu(){
	var newX = (ominoX + 1 + R)%R; 
	sposta (ominoX,ominoY, newX,ominoY);
}

function destra(){
	var newY = (ominoY + 1 + C)%C; 
	sposta (ominoX,ominoY, ominoX,newY);
}
function gameOver(){
	clearInterval(timerC1);
	clearInterval(timerC2);
	//document.getElementById("btnModal").click();
	init();
	document.getElementById("btnModal").click();
}