package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.TipoCarreraDAO;
import net.spring.concurso.entity.TipoCarrera;

@Service
public class TipoCarreraServiceImpl implements TipoCarreraService{
	
	@Autowired
	private TipoCarreraDAO tipocarreraDAO;


	@Override
	public List<TipoCarrera> listAll() {
		// TODO Auto-generated method stub
		return tipocarreraDAO.listAll();
	}


}
