package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.LibroDAO;
import net.spring.concurso.entity.Libro;

@Service
public class LibroServiceImpl implements LibroService{
	@Autowired
	private LibroDAO libroDAO;
	
	@Override
	public void save(Libro bean) {
		libroDAO.save(bean);
	}
	
	@Override
	public void update(Libro bean) {
		libroDAO.update(bean);
	}
	@Override
	public void delete(int cod) {
		libroDAO.delete(cod);
		
	}

	@Override
	public Libro findId(int cod) {
		return libroDAO.findId(cod);
	}

	@Override
	public List<Libro> listAll() {
		return libroDAO.listAll();
	}


}
