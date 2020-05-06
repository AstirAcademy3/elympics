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
var DELTA_ENERGIA = 20;
var OSTACOLO=3; 
var SFONDO = 0;

var omino = "omino";

var pathImg = "gioco3/img1/";

// dichiarazione variabili di lavoro
var i=0;
var j=0;
var countPillole = 0;

// numero di righe e numero di colonne
var R = 10; 
var C = 20; 

var timer;
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

function azzerraPiano(){
		for (var i=0; i<R; i++) {
		piano[i]=new Array();  // ogni riga contiene un array: si ha così una matrice
		for (var j=0; j<C;j++){
			piano[i][j]=SFONDO; // si assegna un valore di default a tutte le celle
		}
	}	
}

function disegnaPiano(){
	timer=setInterval ("clessidra()", 1000);
	for (var i=0; i<R; i++) {
		piano[i]=new Array();  // ogni riga contiene un array: si ha così una matrice
		for (var j=0; j<C;j++){
			piano[i][j]=SFONDO; // si assegna un valore di default a tutte le celle
		}
	}
	generaPillole();
	generaOstacoli();
	for (var i=0; i<R; i++){
		for (var j=0; j<C;j++){
			disegnaCella(i,j);
		}
	}
	// disegna l'omino in una data posizione
	disegnaCellaSpeciale(ominoX,ominoY,omino);
	countPillole ++; //vanno raccolti tutti, meglio contarli
} 

function init(){
	
	azzerraPiano();
	ominoX=0;
	ominoY=0;
	disegnaPiano();
	
	
}

function generaPillole(){
    //vanno raccolti tutti, meglio contarli
    for(var i= 0; i<10; i++){
    	generaOggetto(PILLOLA);
    	countPillole ++;
    }
}

function generaOstacoli(){
	for(var i=0; i<20; i++){
		generaOggetto(OSTACOLO);
	}
}

function generaOggetto(valOggetto){
	// si genera un indice di riga casuale tra 0 e R
	var r = Math.random(); 
	rx = Math.floor( r * R);
	// si genera un indice di colonna casuale tra 0 e C
	var c = Math.random(); 
	ry = Math.floor( c * C);
	// utilizzando rx e rc si ha una posizione casuale nel piano di gioco
	if(piano[rx][ry] == 0){
		piano[rx][ry] = valOggetto; //posiziona oggetto nella matrice
		disegnaCella(rx,ry);
	}
	else{
		generaOggetto(valOggetto);
	}
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