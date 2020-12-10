package net.spring.concurso.dao;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import net.spring.concurso.entity.Computadora;

@Repository
public class ComputadoraDAOImpl implements ComputadoraDAO{
	
	@Autowired
	private SessionFactory factory;
	
	@Transactional
	@Override
	public void save(Computadora bean) {
		Session session=factory.getCurrentSession();
		try {
			session.save(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Transactional
	@Override
	public void update(Computadora bean) {
		Session session=factory.getCurrentSession();
		try {
			session.update(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Transactional
	@Override
	public void delete(int cod) {
		Session session=factory.getCurrentSession();
		try {
			Computadora bean=session.get(Computadora.class, cod);
			session.delete(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Transactional(readOnly = true)
	@Override
	public Computadora findId(int cod) {
		Computadora bean=null;
		Session session=factory.getCurrentSession();
		try {
			bean=session.get(Computadora.class, cod);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Computadora> listAll() {
		List<Computadora> lista=null;
		Query query=null;
		Session session=factory.getCurrentSession();
		try {
			String hql="select c from Computadora c";
			query=session.createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}
	
	

}
