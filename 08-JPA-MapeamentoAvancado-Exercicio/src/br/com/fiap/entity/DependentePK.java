package br.com.fiap.entity;

import java.io.Serializable;

public class DependentePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int codigo;
	private int funcioncario;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getFuncioncario() {
		return funcioncario;
	}

	public void setFuncioncario(int funcioncario) {
		this.funcioncario = funcioncario;
	}

}
