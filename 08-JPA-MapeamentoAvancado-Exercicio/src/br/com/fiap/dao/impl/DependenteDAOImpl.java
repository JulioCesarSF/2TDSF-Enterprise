package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.DependenteDAO;
import br.com.fiap.entity.Dependente;

public class DependenteDAOImpl extends GenericDAOImpl<Dependente, Long> implements DependenteDAO  {

	public DependenteDAOImpl(EntityManager em) {
		super(em);
	}

}
