package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_AGENCIA")
@SequenceGenerator(name = "sqAgencia", sequenceName = "SQ_AGENCIA")
public class Agencia {

	@Id
	@Column(name="NR_AGENCIA")
	@GeneratedValue(generator = "sqAgencia", strategy = GenerationType.SEQUENCE)
	private int agencia;

	@Column(name = "DS_ENDERECO")
	private String endereco;

	@OneToMany(mappedBy = "agencia", cascade = CascadeType.PERSIST)
	@Column(name="NR_CONTA")
	private List<Conta> contas = new ArrayList<>();

	public Agencia() {
	}

	public Agencia(String endereco) {
		super();
		this.endereco = endereco;
	}

	public void addConta(Conta conta) {
		conta.setAgencia(this);
		contas.add(conta);
	}

	public Agencia(int codigo, String endereco) {
		super();
		this.agencia = codigo;
		this.endereco = endereco;
	}

	public int getCodigo() {
		return agencia;
	}

	public void setCodigo(int codigo) {
		this.agencia = codigo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
