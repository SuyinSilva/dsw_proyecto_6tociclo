package net.spring.concurso.dao;
import java.util.List;
import net.spring.concurso.entity.Libro;

public interface LibroDAO {
	public void save(Libro bean);
	public void update(Libro bean);
	public void delete(int cod);
	public Libro findId(int cod);
	public List<Libro> listAll();
}
