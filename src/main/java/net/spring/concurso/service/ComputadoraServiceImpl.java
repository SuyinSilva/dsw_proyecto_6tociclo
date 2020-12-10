package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.ComputadoraDAO;
import net.spring.concurso.entity.Computadora;

@Service
public class ComputadoraServiceImpl implements ComputadoraService{
	@Autowired
	private ComputadoraDAO computadoraDAO;
	
	@Override
	public void save(Computadora bean) {
		computadoraDAO.save(bean);
	}
	
	@Override
	public void update(Computadora bean) {
		computadoraDAO.update(bean);
	}
	@Override
	public void delete(int cod) {
		computadoraDAO.delete(cod);
		
	}

	@Override
	public Computadora findId(int cod) {
		return computadoraDAO.findId(cod);
	}

	@Override
	public List<Computadora> listAll() {
		return computadoraDAO.listAll();
	}


}
