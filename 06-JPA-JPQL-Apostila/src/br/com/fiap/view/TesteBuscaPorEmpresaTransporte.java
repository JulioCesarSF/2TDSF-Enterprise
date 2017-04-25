package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.TransporteDAO;
import br.com.fiap.dao.impl.TransporteDAOImpl;
import br.com.fiap.entity.Transporte;

public class TesteBuscaPorEmpresaTransporte {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		TransporteDAO dao = new TransporteDAOImpl(em);

		List<Transporte> l = dao.buscarPorEmpresa("GOL");
		l.forEach(x -> System.out.println(x.getId() + " - " + x.getEmpresa()));

		em.close();

		System.exit(0);

	}

}
