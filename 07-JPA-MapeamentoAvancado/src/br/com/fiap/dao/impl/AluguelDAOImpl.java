package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AluguelDAO;
import br.com.fiap.entity.Aluguel;
import br.com.fiap.entity.AluguelPK;

public class AluguelDAOImpl extends GenericDAOImpl<Aluguel, AluguelPK> implements AluguelDAO {

	public AluguelDAOImpl(EntityManager em) {
		super(em);
	}

}
