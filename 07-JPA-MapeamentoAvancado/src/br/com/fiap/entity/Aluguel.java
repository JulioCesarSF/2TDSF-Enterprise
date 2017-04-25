package br.com.fiap.entity;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_ALUGUEL")
@SequenceGenerator(allocationSize = 1, name = "sqAluguel", sequenceName = "SQ_T_ALUGUEL")
public class Aluguel {

	private Calendar dataAluguel;

	@Column(name = "DT_RETORNO")
	@Temporal(value = TemporalType.DATE)
	private Calendar dataRetorno;

	@Column(name = "VL_ALUGUEL", nullable = false)
	private BigDecimal valor;

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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
