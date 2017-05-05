package br.com.fiap.teste;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PessoaDAO;
import br.com.fiap.dao.impl.PessoaDAOImpl;
import br.com.fiap.entity.PessoaFisica;
import br.com.fiap.entity.PessoaJuridica;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		PessoaDAO dao = new PessoaDAOImpl(em);

		PessoaJuridica pj = new PessoaJuridica("FIAP", "321321321/0001-52");
		PessoaFisica pf = new PessoaFisica("Bruce", "321321321-56");

		try {
			dao.cadastrar(pj);
			dao.cadastrar(pf);
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		em.close();
		System.exit(0);
	}
}
