package br.com.fiap.bo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.PerfumeDAO;
import br.com.fiap.dao.impl.PerfumeDaoImpl;
import br.com.fiap.entity.Perfume;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class PerfumeBO {

	private EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
	
	public List<Perfume> listar(){
		EntityManager em = fabrica.createEntityManager();
		PerfumeDAO dao = new PerfumeDaoImpl(em);
		List<Perfume> lista = dao.listar();
		em.close();
		return lista;
	}

	public Perfume buscar(int codigo){
		EntityManager em = fabrica.createEntityManager();
		PerfumeDAO dao = new PerfumeDaoImpl(em);
		Perfume perfume = dao.pesquisar(codigo);
		return perfume;
	}
	
	public void cadastrar(Perfume perfume) throws DBException {
		EntityManager em = fabrica.createEntityManager();
		PerfumeDAO dao = new PerfumeDaoImpl(em);
		dao.cadastrar(perfume);
		dao.salvar();
		em.close();
	}
	
}
