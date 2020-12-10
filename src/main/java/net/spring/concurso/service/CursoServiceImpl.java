package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.CursoDAO;
import net.spring.concurso.entity.Curso;

@Service
public class CursoServiceImpl implements CursoService{
	@Autowired
	private CursoDAO cursoDAO;
	
	@Override
	public void save(Curso bean) {
		cursoDAO.save(bean);
	}
	
	@Override
	public void update(Curso bean) {
		cursoDAO.update(bean);
	}
	@Override
	public void delete(int cod) {
		cursoDAO.delete(cod);
		
	}

	@Override
	public Curso findId(int cod) {
		return cursoDAO.findId(cod);
	}

	@Override
	public List<Curso> listAll() {
		return cursoDAO.listAll();
	}


}
