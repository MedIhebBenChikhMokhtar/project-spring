package com.example.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Commande implements Serializable {
	@Id
	private String idC;
	private String idP;
	private String cmd;
	private int qte;
	public String getIdC() {
		return idC;
	}
	public void setIdC(String idC) {
		this.idC = idC;
	}
	public String getIdP() {
		return idP;
	}
	public void setIdP(String idP) {
		this.idP = idP;
	}
	public String getCmd() {
		return cmd;
	}
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public Commande(String cmd, int qte) {
		super();
		this.cmd = cmd;
		this.qte = qte;
	}
	public Commande() {
		super();
	}
	

}
