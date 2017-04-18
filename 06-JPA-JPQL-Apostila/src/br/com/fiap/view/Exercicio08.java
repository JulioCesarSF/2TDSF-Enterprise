package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;

public class Exercicio08 {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();		
		PacoteDAO dao = new PacoteDAOImpl(em);
		
		double precoMedio = dao.precoMediaPacotes();
		
		System.out.println("Preço médio: " + precoMedio);
		
		em.close();
		System.exit(0);
	}

}
