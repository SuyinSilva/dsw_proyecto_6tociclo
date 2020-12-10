package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.RolDAO;
import net.spring.concurso.entity.Rol;

@Service
public class RolServiceImpl implements RolService{
	
	@Autowired
	private RolDAO rolDAO;


	@Override
	public List<Rol> listAll() {
		// TODO Auto-generated method stub
		return rolDAO.listAll();
	}


}
