package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import br.com.fiap.dao.PerfumeDAO;
import br.com.fiap.entity.Perfume;

public class PerfumeDaoImpl extends GenericDAOImpl<Perfume, Integer> implements PerfumeDAO{

	public PerfumeDaoImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	public List<Perfume> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
