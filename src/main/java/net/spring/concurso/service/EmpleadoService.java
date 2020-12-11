package net.spring.concurso.service;
import java.util.List;
import net.spring.concurso.entity.Empleado;

public interface EmpleadoService {
	public List<Empleado> listAll();

	public void save(Empleado bean);
	public void update(Empleado bean);
	public void delete(int cod);
	public Empleado findId(int cod);
}
