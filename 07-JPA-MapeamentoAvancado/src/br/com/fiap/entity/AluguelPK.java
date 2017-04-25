package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;

public class AluguelPK implements Serializable {

	private int cliente;
	private int automovel;
	private Calendar dataAluguel;
	

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public int getAutomovel() {
		return automovel;
	}

	public void setAutomovel(int automovel) {
		this.automovel = automovel;
	}

	public Calendar getDataAluguel() {
		return dataAluguel;
	}

	public void setDataAluguel(Calendar dataAluguel) {
		this.dataAluguel = dataAluguel;
	}

}
