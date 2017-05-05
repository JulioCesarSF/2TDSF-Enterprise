package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_PESSOA")
// @DiscriminatorColumn(name = "TIPO_PESSOA")
// @DiscriminatorValue("P")
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator(allocationSize = 1, name = "sqPessoa", sequenceName = "SQ_T_PESSOA")
public class Pessoa {

	@Id
	@Column(name = "CD_PESSOA")
	@GeneratedValue(generator = "sqPessoa", strategy = GenerationType.SEQUENCE)
	private int cdigo;

	@Column(name = "NM_PESSOA", nullable = false)
	private String nome;

	public Pessoa() {
	}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public Pessoa(int cdigo, String nome) {
		super();
		this.cdigo = cdigo;
		this.nome = nome;
	}

	public int getCdigo() {
		return cdigo;
	}

	public void setCdigo(int cdigo) {
		this.cdigo = cdigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
