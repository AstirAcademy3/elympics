Audio.prototype.rewindAndPlay = function(){
    this.pause();
    this.currentTime = 0.0;
    this.play();
}

 

var audioPillola  = new Audio("audio/beep.mp3");
var audioOstacolo  = new Audio("audio/beep.mp3");
var audioMuro  = new Audio("audio/beep.mp3");
var audioSpada  = new Audio("audio/beep.mp3");
var audioCacciatori = new Audio("audio/caccia.mp3");
