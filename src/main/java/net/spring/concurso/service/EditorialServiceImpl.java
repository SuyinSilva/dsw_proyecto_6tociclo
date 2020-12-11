package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.EditorialDAO;
import net.spring.concurso.entity.Editorial;

@Service
public class EditorialServiceImpl implements EditorialService{
	@Autowired
	private EditorialDAO editorialDAO;
	
	@Override
	public void save(Editorial bean) {
		editorialDAO.save(bean);
	}
	
	@Override
	public void update(Editorial bean) {
		editorialDAO.update(bean);
	}
	@Override
	public void delete(int cod) {
		editorialDAO.delete(cod);
		
	}

	@Override
	public Editorial findId(int cod) {
		return editorialDAO.findId(cod);
	}

	@Override
	public List<Editorial> listAll() {
		return editorialDAO.listAll();
	}
}
