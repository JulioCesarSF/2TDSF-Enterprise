package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.FuncionarioDAO;
import br.com.fiap.entity.Funcionario;

public class FuncioncarioDAOImpl extends GenericDAOImpl<Funcionario, Long> implements FuncionarioDAO {

	public FuncioncarioDAOImpl(EntityManager em) {
		super(em);
		
	}

}
