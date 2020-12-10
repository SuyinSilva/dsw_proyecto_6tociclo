package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.TipoEmpleadoDAO;
import net.spring.concurso.entity.TipoEmpleado;

@Service
public class TipoEmpleadoServiceImpl implements TipoEmpleadoService{
	
	@Autowired
	private TipoEmpleadoDAO tipoEmpleadoDAO;


	@Override
	public List<TipoEmpleado> listAll() {
		return tipoEmpleadoDAO.listAll();
	}




}
