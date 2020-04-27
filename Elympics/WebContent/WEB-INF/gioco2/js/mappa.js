// posizione iniziale dell'omino
var ominoX = 0; 
var ominoY = 0;

// posizione dell'arma
var armaX = 9; 
var armaY = 9;

// valore iniziale dell'energia
var energia =0;

// costanti e parametri per la configurazioen del gioco
var PILLOLA = -10;
var DELTA_ENERGIA = 20;
var OSTACOLO=3; 
var SFONDO = 0;
var ARMA=2;

var omino = "testa";
var ominoConSpada = "ominoConSpada";
var testa = 1;
var direzione="E";

var pathImg = "gioco2/img1/";

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

piano[0][2]=PILLOLA;
piano[0][0]=1;

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
	document.getElementById("Punteggio: ").innerHTML=testa;
} 

function generaOggetto(valOggetto){
	// si genera un indice di riga casuale tra 0 e R
	var r = Math.random(); 
	rx = Math.round( r * R);
	// si genera un indice di colonna casuale tra 0 e C
	var c = Math.random(); 
	ry = Math.round( c * C);
	if(piano[rx][ry]==0){
	// utilizzando rx e rc si ha una posizione casuale nel piano di gioco
	piano[rx][ry] = valOggetto; //posiziona oggetto nella matrice
	}else{
		generaOggetto(valOggetto);
		disegnaCella(rx,ry);
	}
	// in rx, ry c'è un nuovo valore quindi meglio ridisegnare la cella
}

function disegnaCella(i,j){
	var id = "c"+i+"_"+j;
	var src ="";
	if(piano[i][j]>0){
		src = pathImg + 1 + ".jpg";
	}else if(piano[i][j]==-10){
		src = pathImg + 2 + ".jpg";
	}else{
		src = pathImg + 0 + ".jpg";
	}
	document.getElementById(id).src= src;
} 

function disegnaCellaSpeciale(i,j,valore) {
	var id = "c"+i+"_"+j;
	var src = pathImg + valore + direzione + ".jpg";
	console.log(id + " " + src);
	document.getElementById(id).src=src;
} 