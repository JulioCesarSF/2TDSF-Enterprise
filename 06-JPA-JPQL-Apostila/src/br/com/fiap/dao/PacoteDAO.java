package br.com.fiap.dao;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public interface PacoteDAO extends GenericDAO<Pacote,Integer>{

	List<Pacote> listar();
	
	List<Pacote> buscarPorPrecoMaximo(float preco);
	
	List<Pacote> buscarPorTransporte(Transporte transporte);
	
	List<Pacote> buscarPorData(Calendar dataInicio, 
											Calendar dataFim);
	
	double precoMediaPacotes();
	
	long qtdPacotesPorDataSaida(Calendar dataInicio, Calendar dataFim);
	
	List<Pacote> pacotesMaiorPreco();
	
}
