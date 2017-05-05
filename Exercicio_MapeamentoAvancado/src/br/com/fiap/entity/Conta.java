package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_CONTA")
@Inheritance(strategy = InheritanceType.JOINED)
@IdClass(ContaPK.class)
public class Conta {

	@Id
	@SequenceGenerator(name = "sqConta", sequenceName = "SQ_CONTA")
	@GeneratedValue(generator = "sqConta", strategy = GenerationType.SEQUENCE)
	@Column(name = "NR_CONTA", nullable = false)
	private int conta;

	@Column(name = "VL_SALDO", nullable = false)
	private double saldo;

	@Id
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "NR_AGENCIA")
	private Agencia agencia;

	public Conta() {
	}
	

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public Conta(double saldo, Agencia agencia) {
		super();
		this.saldo = saldo;
		this.agencia = agencia;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Conta(int codigo, double saldo, Agencia agencia) {
		super();
		this.conta = codigo;
		this.saldo = saldo;
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
