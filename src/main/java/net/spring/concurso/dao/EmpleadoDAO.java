package net.spring.concurso.dao;
import java.util.List;

import net.spring.concurso.entity.Empleado;

public interface EmpleadoDAO {
	public List<Empleado> listAll();
	
	public void save(Empleado bean);
	public void update(Empleado bean);
	public void delete(int cod);
	public Empleado findId(int cod);
	public List<Empleado> listAllB();
}
