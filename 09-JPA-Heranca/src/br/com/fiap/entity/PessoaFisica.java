package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
// @DiscriminatorValue("PF")
@Table(name = "T_PESSOA_FISICA")
public class PessoaFisica extends Pessoa {

	@Column(name = "NR_RG")
	private String rg;

	public PessoaFisica() {
	}

	public PessoaFisica(String nome, String rg) {
		super(nome);
		this.rg = rg;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
