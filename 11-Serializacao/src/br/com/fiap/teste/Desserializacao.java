package br.com.fiap.teste;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.com.fiap.bean.Cliente;

public class Desserializacao {

	public static void main(String[] args) throws Exception {
		// ler o arquivo e recuperar o bjeto serializado
		FileInputStream in = new FileInputStream("arquivo");

		ObjectInputStream iS = new ObjectInputStream(in);

		Cliente cliente = (Cliente) iS.readObject();

		System.out.println(cliente.getNome());

		iS.close();
		in.close();

	}
}
