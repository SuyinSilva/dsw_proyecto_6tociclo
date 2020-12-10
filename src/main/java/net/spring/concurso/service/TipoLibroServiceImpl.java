package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.TipoLibroDAO;
import net.spring.concurso.entity.TipoLibro;

@Service
public class TipoLibroServiceImpl implements TipoLibroService{
	
	@Autowired
	private TipoLibroDAO tipolibroDAO;


	@Override
	public List<TipoLibro> listAll() {
		// TODO Auto-generated method stub
		return tipolibroDAO.listAll();
	}
}
