package com.elympics.bean;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="partita")
@Proxy(lazy=false)
public class Partita {
	private int id;
	private Date tempo;
	private int punteggio;
	private Gioco gioco;
	private int utente;
	@Column()
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column()
	public Date getTempo() {
		return tempo;
	}
	public void setTempo(Date tempo) {
		this.tempo = tempo;
	}
	@Column()
	public int getPunteggio() {
		return punteggio;
	}
	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}
	@ManyToOne
	@JoinColumn(name="gioco_id")
	public Gioco getGioco() {
		return gioco;
	}
	public void setGioco(Gioco gioco) {
		this.gioco = gioco;
	}
	@Column(name="utente_id")
	public int getUtente() {
		return utente;
	}
	public void setUtente(int utente) {
		this.utente = utente;
	}
	public Partita(int id, Date tempo, int punteggio, Gioco gioco, int utente) {
		super();
		this.id = id;
		this.tempo = tempo;
		this.punteggio = punteggio;
		this.gioco = gioco;
		this.utente = utente;
	}
	public Partita() {
		super();
	}
	@Override
	public String toString() {
		return "Partita [id=" + id + ", tempo=" + tempo + ", punteggio=" + punteggio + ", gioco=" + gioco + ", utente="
				+ utente + "]";
	}
	
}
