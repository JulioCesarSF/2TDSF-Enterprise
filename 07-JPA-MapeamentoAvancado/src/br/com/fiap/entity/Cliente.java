package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "T_CLIENTE")
@SequenceGenerator(allocationSize = 1, name = "sqCliente", sequenceName = "SQ_T_CLIENTE")
public class Cliente implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "sqCliente", strategy = GenerationType.SEQUENCE)
	@Column(name = "CD_CLIENTE")
	private long id;

	@Column(name = "NM_NOME", nullable = false, unique = true)
	private String nome;

	public Cliente() {
	}

	public Cliente(long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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

}
