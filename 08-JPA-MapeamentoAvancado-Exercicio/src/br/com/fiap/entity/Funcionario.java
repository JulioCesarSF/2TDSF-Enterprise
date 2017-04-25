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
@SequenceGenerator(allocationSize = 1, name = "sqFuncionario", sequenceName = "SQ_T_FUNCIONARIO")
@Table(name = "T_FUNC")
public class Funcionario implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CD_FUNCIONARIO")
	@GeneratedValue(generator = "sqFuncionario", strategy = GenerationType.SEQUENCE)
	private long id;

	@Column(name = "NM_FUNCIONCARIO", nullable = false)
	private String nome;

	@Column(name = "DT_ANIVERSARIO")
	@Temporal(value = TemporalType.DATE)
	private Calendar dataAniversario;

	public Funcionario() {
	}

	public Funcionario(String nome, Calendar dataAniversario) {
		super();
		this.nome = nome;
		this.dataAniversario = dataAniversario;
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

	public Calendar getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Calendar dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

}
