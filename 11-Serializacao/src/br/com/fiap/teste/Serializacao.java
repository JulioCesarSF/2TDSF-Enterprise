package br.com.fiap.teste;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.fiap.bean.Cliente;

public class Serializacao {
	
	public static void main(String[] args) throws Exception {
		
		//serializar
		//gravar as infomacoes de um objeto em um arquivos
		
		Cliente cliente = new Cliente("Julio", "121212121");
		
		FileOutputStream out = new FileOutputStream("arquivo");
		
		ObjectOutputStream objS = new ObjectOutputStream(out);
		objS.writeObject(cliente);
		
		System.out.println("Cliente serializado!");
		
		objS.close();		
		out.close();
		
	}

}
