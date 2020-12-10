package net.spring.concurso.dao;
import java.util.List;
import net.spring.concurso.entity.Editorial;

public interface EditorialDAO {
	public void save(Editorial bean);
	public void update(Editorial bean);
	public void delete(int cod);
	public Editorial findId(int cod);
	public List<Editorial> listAll();
}
