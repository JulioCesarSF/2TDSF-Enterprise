package br.com.fiap.entity;

public class PessoaJuridica extends Pessoa {

	private int codigo;

	private String cnpj;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
