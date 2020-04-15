package com.elympics.bean;

public class RigaClassifica implements Comparable < RigaClassifica >{
 private int utente ;
 
@Override
public String toString() {
	return "RigaClassifica [utente=" + utente + ", gioco=" + gioco + ", punteggio=" + punteggio + "]";
}
public RigaClassifica(int utente, int gioco, int punteggio) {
	super();
	this.utente = utente;
	this.gioco = gioco;
	this.punteggio = punteggio;
}
public int getUtente() {
	return utente;
}
public void setUtente(int utente) {
	this.utente = utente;
}
public int getGioco() {
	return gioco;
}
public void setGioco(int gioco) {
	this.gioco = gioco;
}
public int getPunteggio() {
	return punteggio;
}
public void setPunteggio(int punteggio) {
	this.punteggio = punteggio;
}
private int gioco;
 private int punteggio;

@Override
public int compareTo(RigaClassifica o) {
	// TODO Auto-generated method stub
	return o.punteggio-this.punteggio;
}
}
