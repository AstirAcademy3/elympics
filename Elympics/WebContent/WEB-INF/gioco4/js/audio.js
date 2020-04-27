Audio.prototype.rewindAndPlay = function(){
    this.pause();
    this.currentTime = 0.0;
    this.play();
}

 

var audioPillola  = new Audio("beep.mp3");
var audioOstacolo  = new Audio("beep.mp3");
var audioMuro  = new Audio("beep.mp3");
var audioSpada  = new Audio("beep.mp3");