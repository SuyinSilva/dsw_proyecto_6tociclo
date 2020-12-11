package net.spring.concurso.dao;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.spring.concurso.entity.TipoCarrera;

@Repository
public class TipoCarreraDAOImpl implements TipoCarreraDAO{
	
	@Autowired
	private SessionFactory factory;
	
	@Transactional(readOnly = true)
	@Override
	public List<TipoCarrera> listAll() {
		Session session=factory.getCurrentSession();
		Query query=null;
		try {
			String hql="select t from TipoCarrera t";
			query=session.createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}
	


}
