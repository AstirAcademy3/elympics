package com.elympics.bean;


import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="gioco")
@Proxy(lazy=false)
public class Gioco implements BeanDO {
	private int id;
	private String nome;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Gioco(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Gioco() {
		super();
	}
	@Override
	public String toString() {
		return "Gioco [id=" + id + ", nome=" + nome + "]";
	}
	

}
