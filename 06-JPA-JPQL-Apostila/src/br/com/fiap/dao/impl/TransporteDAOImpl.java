package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.TransporteDAO;
import br.com.fiap.entity.Transporte;

public class TransporteDAOImpl extends GenericDAOImpl<Transporte,Integer> implements TransporteDAO{

	public TransporteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Transporte> buscarPorEmpresa(String empresa) {		
		return em.createNativeQuery("select * from Transporte t where t.empresa like :emp", Transporte.class)
				.setParameter("emp", "%".concat(empresa).concat("%"))
				.getResultList();
	}

}
