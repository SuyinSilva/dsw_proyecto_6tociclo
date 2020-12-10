package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.MarcaDAO;
import net.spring.concurso.entity.Marca;

@Service
public class MarcaServiceImpl implements MarcaService{
	
	@Autowired
	private MarcaDAO marcaDAO;


	@Override
	public List<Marca> listAll() {
		// TODO Auto-generated method stub
		return marcaDAO.listAll();
	}


}
