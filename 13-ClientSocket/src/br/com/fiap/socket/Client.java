package br.com.fiap.socket;

import java.io.ObjectOutputStream;
import java.net.Socket;

import br.com.fiap.bean.Cliente;

public class Client {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("10.3.2.41", 123);

		ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());

		Cliente cliente = new Cliente("Tira print EDU", "123");

		outStream.writeObject(cliente);

		socket.close();
	}
}
