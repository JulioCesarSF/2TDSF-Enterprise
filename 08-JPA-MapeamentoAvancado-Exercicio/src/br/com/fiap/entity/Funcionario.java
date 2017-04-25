package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity

@Table(name = "T_FUNC")
public class Funcionario implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CD_FUNCIONARIO")
	@SequenceGenerator(allocationSize = 1, name = "sqFuncionario", sequenceName = "SQ_T_FUNCIONARIO")
	@GeneratedValue(generator = "sqFuncionario", strategy = GenerationType.SEQUENCE)
	private long id;

	@Column(name = "NM_FUNCIONCARIO", nullable = false)
	private String nome;

	@Column(name = "DT_ADMISSAO")
	@Temporal(value = TemporalType.DATE)
	private Calendar dataAdmissao;

	public Funcionario() {
	}

	public Funcionario(String nome, Calendar dataAdmissao) {
		super();
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

}
