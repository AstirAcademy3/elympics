package com.elympics.bean;

public class RigaMedagliereVO {
	private String paese;
	private int medOro;
	private int medArg;
	private int medBro;
	public String getPaese() {
		return paese;
	}
	public void setPaese(String paese) {
		this.paese = paese;
	}
	public int getMedOro() {
		return medOro;
	}
	public void setMedOro(int medOro) {
		this.medOro = medOro;
	}
	public int getMedArg() {
		return medArg;
	}
	public void setMedArg(int medArg) {
		this.medArg = medArg;
	}
	public int getMedBro() {
		return medBro;
	}
	public void setMedBro(int medBro) {
		this.medBro = medBro;
	}
	public void incrementaOro() {
		this.medOro++;
	}
	public RigaMedagliereVO(String paese, int medOro, int medArg, int medBro) {
		super();
		this.paese = paese;
		this.medOro = medOro;
		this.medArg = medArg;
		this.medBro = medBro;
	}
	public RigaMedagliereVO() {
		super();
	}
	public void incrementaArgento() {
		this.medArg++;
		
	}
	public void incrementaBronzo() {
		this.medBro++;
		
	}
	@Override
	public String toString() {
		return "RigaMedagliereVO [paese=" + paese + ", medOro=" + medOro + ", medArg=" + medArg + ", medBro=" + medBro
				+ "]";
	}
	
}
