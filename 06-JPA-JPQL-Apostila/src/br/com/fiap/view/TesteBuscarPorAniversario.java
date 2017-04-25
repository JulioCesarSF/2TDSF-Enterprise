package br.com.fiap.view;

import java.text.DateFormat;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

public class TesteBuscarPorAniversario {

	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		ClienteDAO dao = new ClienteDAOImpl(em);
		
		List<Cliente> clientes = dao.buscarPorAniversario(2);
		DateFormat dF = DateFormat.getDateInstance();
		
		clientes.forEach( x -> System.out.println(x.getNome() + " " + dF.format(x.getDataNascimento().getTime())));
		
		em.close();
		
		System.exit(0);
		
	}

}
