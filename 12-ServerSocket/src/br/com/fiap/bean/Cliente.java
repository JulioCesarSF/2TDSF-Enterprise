package br.com.fiap.bean;

import java.io.Serializable;

public class Cliente implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = -6255088260622917246L;
	
	private String nome;
	private String rg;

	public Cliente() {
		super();
	}

	public Cliente(String nome, String rg) {
		super();
		this.nome = nome;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
