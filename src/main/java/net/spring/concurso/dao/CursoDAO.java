package net.spring.concurso.dao;
import java.util.List;
import net.spring.concurso.entity.Curso;

public interface CursoDAO {
	public void save(Curso bean);
	public void update(Curso bean);
	public void delete(int cod);
	public Curso findId(int cod);
	public List<Curso> listAll();
}
