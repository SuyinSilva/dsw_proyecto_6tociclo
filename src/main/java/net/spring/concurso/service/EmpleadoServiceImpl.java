package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.EmpleadoDAO;
import net.spring.concurso.entity.Editorial;
import net.spring.concurso.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	private EmpleadoDAO empleadoDAO;


	@Override
	public List<Empleado> listAll() {
		return empleadoDAO.listAll();
	}
	@Override
	public void save(Empleado bean) {
		empleadoDAO.save(bean);
	}
	
	@Override
	public void update(Empleado bean) {
		empleadoDAO.update(bean);
	}
	@Override
	public void delete(int cod) {
		empleadoDAO.delete(cod);
		
	}

	@Override
	public Empleado findId(int cod) {
		return empleadoDAO.findId(cod);
	}



}
