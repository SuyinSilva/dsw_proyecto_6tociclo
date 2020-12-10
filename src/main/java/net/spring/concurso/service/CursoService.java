package net.spring.concurso.service;
import java.util.List;

import net.spring.concurso.entity.Curso;

public interface CursoService {
	public void save(Curso bean);
	public void update(Curso bean);
	public void delete(int cod);
	public Curso findId(int cod);
	public List<Curso> listAll();
}
