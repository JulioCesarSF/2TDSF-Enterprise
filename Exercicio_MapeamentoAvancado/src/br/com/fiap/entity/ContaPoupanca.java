package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T_POUPANCA")
public class ContaPoupanca extends Conta {

	@Column(name = "VL_RENDIMENTO", nullable = false)
	private double rendimento;

	public ContaPoupanca(double rendimento) {
		super();
		this.rendimento = rendimento;
	}

	public ContaPoupanca(double saldo, double rendimento) {
		super(saldo);
		this.rendimento = rendimento;
	}

	public ContaPoupanca(double saldo, Agencia agencia, double rendimento) {
		super(saldo, agencia);
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

}
