// posizione iniziale dell'omino
var ominoX = 0; 
var ominoY = 0;

// posizione dell'arma
var armaX = 9; 
var armaY = 9;

// valore iniziale dell'energia
var energia =0;

// costanti e parametri per la configurazioen del gioco
var PILLOLA = 1;
var DELTA_ENERGIA = 10;
var OSTACOLO=3; 
var SFONDO = 0;
var ARMA=2;
var c1;
var c2;

var omino = "omino";
var ominoConSpada = "ominoConSpada";

var pathImg = "gioco4/img1/";

var timer;
var timerPillole;

// dichiarazione variabili di lavoro
var i=0;
var j=0;
var countPillole = 0;

// numero di righe e numero di colonne
var R = 10; 
var C = 20; 

// definizione id matrice, come array di array
var piano = new Array();

for (var i=0; i<R; i++) {
	piano[i]=new Array(); // ogni riga contiene un array: si ha così una matrice
	for (var j=0; j<C;j++){
		piano[i][j]=SFONDO; // si assegna un valore di default a tutte le celle
	}
}

// posizionamento di un ostacolo per esempio
piano[4][4] = OSTACOLO;
piano[armaX][armaY] = ARMA;

function mostraMatriceHTML(){
	var s = "";

	for (var i=0; i<R; i++) {
		for (var j=0; j<C;j++){
			s = s + piano[i][j] + " " ;
		}
		s = s + "<br>";
	}
	document.getElementById("messaggioDebug").innerHTML=s; 
}

function disegnaPiano(){
	for (var i=0; i<R; i++){
		for (var j=0; j<C;j++){
			disegnaCella(i,j);
		}
	}
	// disegna l'omino in una data posizione
	disegnaCellaSpeciale(ominoX,ominoY,omino); 
	// disegna l'arma in una data posizione
	disegnaCellaSpeciale(armaX,armaY,ARMA);
} 

function generaPillole(){
    countPillole ++; //vanno raccolti tutti, meglio contarli
	generaOggetto(PILLOLA);
}

function generaPillola(){
	generaOggetto(PILLOLA);
};

function generaOstacolo(){
	generaOggetto(OSTACOLO);
}

function generaOggetto(valOggetto){
	// si genera un indice di riga casuale tra 0 e R
	var r = Math.random(); 
	rx = Math.round( r * R);
	// si genera un indice di colonna casuale tra 0 e C
	var c = Math.random(); 
	ry = Math.round( c * C);
	// utilizzando rx e rc si ha una posizione casuale nel piano di gioco
	piano[rx][ry] = valOggetto; //posiziona oggetto nella matrice
	// in rx, ry c'è un nuovo valore quindi meglio ridisegnare la cella
	disegnaCella(rx,ry);
	
	
}

function play(){
	
	azzerraPiano();
	
	ominoX = 0; 
    ominoY = 0;
	testa= 1;
	timerPillola= setInterval(generaPillola, 1000);
	disegnaPiano();
	// disegna l'omino in una data posizione
	disegnaCellaSpeciale(ominoX,ominoY,omino); 
	
	var suono = new Audio("beep.mp3");
	suono.currentTime=0.0;
	suono.play();
	
	var barra = document.getElementById("barraTempo");
	barra.style.width = "100%";   
	timer = setInterval ("clessidra()", 1000);
	disegnaCacciatori();
}


function disegnaCella(i,j){
	var id = "c"+i+"_"+j;
	var src = pathImg + piano[i][j] + ".jpg";
	document.getElementById(id).src= src;
} 

function disegnaCellaSpeciale(i,j,valore) {
	var id = "c"+i+"_"+j;
	var src = pathImg + valore + ".jpg";
	console.log(id + " " + src);
	document.getElementById(id).src=src;
	
} 
function disegnaOmino() {
	disegnaCellaSpeciale(ominoX,ominoY,omino);
	document.getElementById("posizioneOmino").innerHTML=" coordinate omino: Omino(" + ominoX + "," + ominoY + ")"; 
} 

	var c1  ;
	var c2  ;
	var c3 ;
var timerC1;
var timerC2;
var timerC3;

function disegnaCacciatori(){
	c1 =new Cacciatore(9,0,"blu");
	c2 =new Cacciatore(0,19,"rosso");
	c3 =new Cacciatore(0,19,"rosso");

	timerC1= setInterval("c1.insegui()", 1000); 
	timerC2= setInterval("c2.insegui()", 5000); 
	timerC3= setInterval("c3.insegui()", 10000); 
}



//var tempo = 3000 * 60; // millisecondi 

function clessidra(){
	var barra = document.getElementById("barraTempo");
	var width = parseInt(barra.style.width);
	width = width -1; 
	
	barra.style.width = width + "%";   
	
	if (width >= 50 ){
		barra.className="progress-bar progress-bar-striped bg-success progress-bar-animated"; 
	}
	else if (width < 50 && width > 20 ){
		barra.className="progress-bar progress-bar-striped bg-warning progress-bar-animated"; 
	}
	else if (width <= 20){
		barra.className="progress-bar progress-bar-striped bg-danger progress-bar-animated"; 
	}
	
	barra.innerHTML = "time: " +  width + "%";  
	
	if (width < 0 ){
		clearInterval(timer);
			gameOver();
	}
}

function azzerraPiano(){
		for (var i=0; i<R; i++) {
		piano[i]=new Array();  // ogni riga contiene un array: si ha così una matrice
		for (var j=0; j<C;j++){
			piano[i][j]=SFONDO; // si assegna un valore di default a tutte le celle
		}
	}	
}
function init(){
	ominoX=0;
	ominoY=0;
	document.getElementById("energia").innerHTML=0;
	document.getElementById("punteggio").value=0;

	azzerraPiano();
	disegnaPiano();
	disegnaCacciatori();
	
}



