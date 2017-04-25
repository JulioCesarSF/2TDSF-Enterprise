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
@Table(name = "T_AUTOMOVEL")
@SequenceGenerator(allocationSize = 1, name = "sqAuto", sequenceName = "SQ_T_AUTOMOVEL")
public class Automovel implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "sqAuto", strategy = GenerationType.SEQUENCE)
	@Column(name = "CD_AUTOMOVEL", nullable = false)
	private long id;

	@Column(name = "NM_MODELO", nullable = false, unique = true)
	private String modelo;

	@Column(name = "DS_MARCA", nullable = false)
	private String marca;

	public Automovel() {
	}

	public Automovel(long id, String modelo, String marca) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
