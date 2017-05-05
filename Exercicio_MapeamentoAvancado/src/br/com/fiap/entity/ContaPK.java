package br.com.fiap.entity;

import java.io.Serializable;

public class ContaPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int agencia;

	private int conta;

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

}
