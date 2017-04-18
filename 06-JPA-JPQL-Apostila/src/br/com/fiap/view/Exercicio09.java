package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;

public class Exercicio09 {
	
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();		
		PacoteDAO dao = new PacoteDAOImpl(em);
		
		long qtPacotes = dao.qtdPacotesPorDataSaida(
				new GregorianCalendar(2017, Calendar.MAY, 20), 
				new GregorianCalendar(2017, Calendar.SEPTEMBER, 17));
		
		System.out.println("Pacotes com dada de saida entre duas datas:" + qtPacotes);
		
		em.close();
		System.exit(0);
	}

}
