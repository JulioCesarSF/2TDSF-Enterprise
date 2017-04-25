package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Pessoa {

	@Column(name = "NR_RG")
	private String rg;

	public PessoaFisica() {
	}

	public PessoaFisica(String rg) {
		super();
		this.rg = rg;
	}

	public PessoaFisica(int cdigo, String nome) {
		super(cdigo, nome);
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
