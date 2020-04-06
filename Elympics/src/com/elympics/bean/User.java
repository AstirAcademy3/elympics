package com.elympics.bean;
import java.util.Date;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="utente")
@Proxy(lazy=false)
public class User implements BeanDO{
	private int id;
	private String username;
	private String nome;
	private String cognome;
	private String mail;
	private String password;
	private String paese;
	private Date creazione; 
	private Date eliminazione;
	private boolean isAmm;
	private boolean bloccato;
	private Set<Partita> partite;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column()
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column()
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column()
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column()
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	@Column(name="email")
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Column(name="pass")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column()
	public String getPaese() {
		return paese;
	}
	public void setPaese(String paese) {
		this.paese = paese;
	}
	@Column(name="data_inserimento")
	public Date getCreazione() {
		return creazione;
	}
	public void setCreazione(Date creazione) {
		this.creazione = creazione;
	}
	@Column(name="data_eliminazione")
	public Date getEliminazione() {
		return eliminazione;
	}
	public void setEliminazione(Date eliminazione) {
		this.eliminazione = eliminazione;
	}
	@Column(name="isamm")
	public boolean isAmm() {
		return isAmm;
	}
	public void setAmm(boolean isAmm) {
		this.isAmm = isAmm;
	}
	@OneToMany(fetch=FetchType.LAZY, orphanRemoval=true, cascade=CascadeType.ALL)
	@JoinColumn(name="utente_id")
	public Set<Partita> getPartite(){
		return partite;
	}
	
	public void setPartite(Set<Partita> partita) {
		this.partite = partita;
	}
	
	@Column(name="bloccato")
	public boolean isBloccato() {
		return bloccato;
	}
	public void setBloccato(boolean bloccato) {
		this.bloccato = bloccato;
	}
	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", nome=" + nome + ", cognome=" + cognome + ", mail="
				+ mail + ", password=" + password + ", paese=" + paese + ", creazione=" + creazione + ", eliminazione="
				+ eliminazione + ", isAmm=" + isAmm + "]";
	}
	public User(int id, String username, String nome, String cognome, String mail, String password, String paese,
			Date creazione, Date eliminazione, boolean isAmm, boolean bloccato, Set<Partita> partite) {
		super();
		this.id = id;
		this.username = username;
		this.nome = nome;
		this.cognome = cognome;
		this.mail = mail;
		this.password = password;
		this.paese = paese;
		this.creazione = creazione;
		this.eliminazione = eliminazione;
		this.isAmm = isAmm;
		this.bloccato = bloccato;
		this.partite = partite;
	}

	
	
}
