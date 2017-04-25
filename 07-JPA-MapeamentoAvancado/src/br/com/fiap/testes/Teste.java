package br.com.fiap.testes;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AluguelDAO;
import br.com.fiap.dao.impl.AluguelDAOImpl;
import br.com.fiap.entity.Aluguel;
import br.com.fiap.entity.Automovel;
import br.com.fiap.entity.Cliente;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		AluguelDAO dao = new AluguelDAOImpl(em);

		Aluguel a = new Aluguel(new Cliente(0, "Julio"), new Automovel(0, "Model", "marca"),
				new GregorianCalendar(2017, 1, 1), 1500);

		try {
			dao.cadastrar(a);
		} catch (Exception e) {
			e.printStackTrace();
		}

		em.close();

		System.exit(0);

	}

}
