package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
//@IdClass(AluguelPK.class)
@Table(name = "T_ALUGUEL_AUTO")
public class Aluguel {

	@Id
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "CD_CLIENTE")
	private Cliente cliente;

	@Id
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "CD_AUTOMOVEL")
	private Automovel automovel;

	@Id
	@Column(name = "DT_ALUGUEL")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Calendar dataAluguel;

	@Column(name = "DT_RETORNO")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Calendar dataRetorno;

	@Column(name = "VL_ALUGUEL", nullable = false)
	private double valor;

	public Aluguel() {
	}

	
	public Aluguel(Cliente cliente, Automovel automovel, Calendar dataAluguel, double valor) {
		super();
		this.cliente = cliente;
		this.automovel = automovel;
		this.dataAluguel = dataAluguel;
		this.valor = valor;
	}


	public Aluguel(Cliente cliente, Automovel automovel, Calendar dataAluguel, Calendar dataRetorno, double valor) {
		super();
		this.cliente = cliente;
		this.automovel = automovel;
		this.dataAluguel = dataAluguel;
		this.dataRetorno = dataRetorno;
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	public Calendar getDataAluguel() {
		return dataAluguel;
	}

	public void setDataAluguel(Calendar dataAluguel) {
		this.dataAluguel = dataAluguel;
	}

	public Calendar getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(Calendar dataRetorno) {
		this.dataRetorno = dataRetorno;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
