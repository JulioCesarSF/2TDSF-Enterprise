package br.com.fiap.entity;

import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@SequenceGenerator(allocationSize = 1, name = "sqDependente", sequenceName = "SQ_T_DEPENDENTE")
public class Dependente implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "sqDependente", strategy = GenerationType.SEQUENCE)
	private long cd_dependente;

	@ManyToOne
	@JoinColumn(name = "CD_FUNCIONCARIO")
	private Funcionario funcionario;

	@Column(name = "NM_DEPENDENTE")
	private String nomeDependente;
	
	
}
