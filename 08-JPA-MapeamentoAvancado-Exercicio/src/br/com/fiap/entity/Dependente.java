package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@SequenceGenerator(allocationSize = 1, name = "sqDependente", sequenceName = "SQ_T_DEPENDENTE")
@Table(name = "T_TDSF_DEPENDENTE")
public class Dependente implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "sqDependente", strategy = GenerationType.SEQUENCE)
	private long codigo;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "CD_FUNCIONCARIO")
	private Funcionario funcionario;

	@Column(name = "NM_DEPENDENTE")
	private String nomeDependente;

	public Dependente() {
	}

	public Dependente(Funcionario funcionario, String nomeDependente) {
		super();
		this.funcionario = funcionario;
		this.nomeDependente = nomeDependente;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getNomeDependente() {
		return nomeDependente;
	}

	public void setNomeDependente(String nomeDependente) {
		this.nomeDependente = nomeDependente;
	}

}
