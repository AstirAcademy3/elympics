
//gestione dell'evento onkeydown:
function checkKeyDown(e) {
    e = e || window.event;
    switch(e.keyCode){
	case 39: destra(); break;
	case 40: giu();    break;
	case 37: sinistra();   break;
	case 38: su();    break;
	//case 49: setInterval("c1.insegui()",502); break;
    //case 50: setInterval("c2.insegui()",500); break;
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
			document.getElementById("energia").innerHTML=energia;
			piano[x][y] = SFONDO;
			countPillole--;
			if (countPillole==0){
				document.getElementById("energia").innerHTML="<img src=\"coppa.jpg\" >";
				document.getElementById("btnModal").click();
			}
			return true;
		default: 
	      return true; 
	}

	return true; 
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
    this.nome=nome; // proprietà utilizzata per caricare immagine del cacciatore (es. blu.jpg)
    this.inseguimento=false;
}

var c1  = new Cacciatore(7,7,"blu");
var c2  = new Cacciatore(0,19,"rosso");
var timerC1 =setInterval(avviaCacciatore1,1010);
var timerC2 =setInterval(avviaCacciatore2,1000);

function avviaCacciatore1(){
	c1.insegui();
}
function avviaCacciatore2(){
	c2.insegui();
}
function sposta (daX,daY, aX,aY){
	if(controllaCella(aX,aY)){
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
var finito = false;

Cacciatore.prototype.insegui = function (){

    var precX = this.x;
    var precY = this.y;
 
    if((Math.abs((this.x - ominoX)<5) && Math.abs((this.y-ominoY)<5)) || this.inseguimento){
    	this.inseguimento=true;
    	audioCacciatori.rewindAndPlay();
    	// aggiornamento della posizione
        if (this.x < ominoX) { this.x++;}
        if (this.x > ominoX) { this.x--;}
     
        if (this.y < ominoY) { this.y++;}
        if (this.y > ominoY) { this.y--;}
    }
    
    var prec_id = "c"+precX+"_"+ precY;      // "gioco3/img1/" + "0.jpg"
    document.getElementById(prec_id).src   = pathImg + piano[precX][precY] + ".jpg";
    
    var curr_id = "c"+this.x+"_"+this.y;      // "gioco3/img1/" + "0.jpg"
    document.getElementById(curr_id).src   = pathImg + this.nome + ".jpg";
    
    if (this.x == ominoX && this.y == ominoY && !finito){
        finito=true;
        gameOver();
    }
}

function gameOver(){
	init();
	//document.getElementById("pianoGioco").innerHTML = "GAME OVER"; 
	//alert("GAME OVER!");
	clearInterval(timer);
	clearInterval(timerC1);
	clearInterval(timerC2);
	document.getElementById("btnModal").click();

}
//var tempo = 3000 * 60; // millisecondi 

function clessidra(){
	var barra = document.getElementById("barraTempo");
	var width = parseInt(barra.style.width);
	width = width -1; 
	
	barra.style.width = width + "%";   
	
	if (width < 50 && width > 20 ){
		barra.className="progress-bar progress-bar-striped bg-warning progress-bar-animated"; 
	}
	else if (width <= 20){
		barra.className="progress-bar progress-bar-striped bg-danger progress-bar-animated"; 
	}
	
	barra.innerHTML = "time: " +  width + "%";  
}