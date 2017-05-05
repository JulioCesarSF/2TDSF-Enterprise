package br.com.fiap.teste;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AgenciaDAO;
import br.com.fiap.dao.impl.AgenciaDAOImpl;
import br.com.fiap.entity.Agencia;
import br.com.fiap.entity.ContaCorrente;
import br.com.fiap.entity.ContaPoupanca;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		AgenciaDAO dao = new AgenciaDAOImpl(em);

		try {
			Agencia a = new Agencia("Endereço");

			a.addConta(new ContaCorrente(99, 99));
			a.addConta(new ContaPoupanca(99, 1));

			dao.cadastrar(a);
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		em.close();
		System.exit(0);
	}
}
