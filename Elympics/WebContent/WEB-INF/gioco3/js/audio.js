Audio.prototype.rewindAndPlay = function(){
    this.pause();
    this.currentTime = 0.0;
    this.play();
}

 

var audioPillola  = new Audio("gioco3/audio/beep.mp3");
var audioCacciatori = new Audio("gioco3/audio/caccia.mp3");
