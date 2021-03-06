package br.com.fiap.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class PacoteDAOImpl extends GenericDAOImpl<Pacote,Integer> implements PacoteDAO{

	public PacoteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Pacote> listar() {
		//Nome da classe (Primeira letra maiuscula)
		TypedQuery<Pacote> query =
				em.createQuery("from Pacote",Pacote.class);
		//Executar a query e retornar o resultado
		return query.getResultList();
	}

	/***
	 * Busca pacotes que possuem o pre�o menor 
	 * ou igual ao valor do par�metro
	 */
	@Override
	public List<Pacote> buscarPorPrecoMaximo(float preco) {
		//Criar a query
		TypedQuery<Pacote> query = em.createQuery(
			"from Pacote p where p.preco <= :pre",Pacote.class);
		//Setar o parametro
		query.setParameter("pre", preco);
		//Executar e retornar
		return query.getResultList();
	}

	@Override
	public List<Pacote> buscarPorTransporte(Transporte transporte) {
		TypedQuery<Pacote> query = em.createQuery(
			"from Pacote p where p.transporte = :t",Pacote.class);
		query.setParameter("t", transporte);
		return query.getResultList();
	}

	@Override
	public List<Pacote> buscarPorData(Calendar dataInicio, Calendar dataFim) {
		return em.createQuery("from Pacote p where p.dataSaida "
			+ "between :inicio and :fim",Pacote.class)
			.setParameter("inicio", dataInicio)
			.setParameter("fim", dataFim).getResultList();
	}

	@Override
	public double precoMediaPacotes() {		
		return em.createQuery("select avg(preco) from Pacote", Double.class).getSingleResult();
	}

	@Override
	public long qtdPacotesPorDataSaida(Calendar dataInicio, Calendar dataFim) {		
		return em.createQuery("select count(p) from Pacote p where p.dataSaida "
				+ "between :inicio and :fim", Long.class)
				.setParameter("inicio", dataInicio)
				.setParameter("fim", dataFim).getSingleResult();
	}

	
	@Override
	public List<Pacote> pacotesMaiorPreco() {		
		return em.createQuery("select p from Pacote p where p.preco = (select max(preco) from Pacote)", Pacote.class).getResultList();
	}

}
