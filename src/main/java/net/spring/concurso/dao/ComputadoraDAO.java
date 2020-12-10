package net.spring.concurso.dao;
import java.util.List;
import net.spring.concurso.entity.Computadora;

public interface ComputadoraDAO {
	public void save(Computadora bean);
	public void update(Computadora bean);
	public void delete(int cod);
	public Computadora findId(int cod);
	public List<Computadora> listAll();
}
