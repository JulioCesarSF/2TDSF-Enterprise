package br.com.fiap.teste;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.DependenteDAO;
import br.com.fiap.dao.impl.DependenteDAOImpl;
import br.com.fiap.entity.Dependente;
import br.com.fiap.entity.Funcionario;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		DependenteDAO dao = new DependenteDAOImpl(em);

		Funcionario func = new Funcionario("Teste", new GregorianCalendar(2013, 1, 1));
		func.setNumeroConta(121321);
		func.setSalario(123);

		Dependente dp = new Dependente(func, "Maria");

		try {
			dao.cadastrar(dp);
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		em.close();
		System.exit(0);

	}
}
