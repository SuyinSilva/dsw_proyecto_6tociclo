package net.spring.concurso.service;
import java.util.List;

import net.spring.concurso.entity.Editorial;

public interface EditorialService {
	public void save(Editorial bean);
	public void update(Editorial bean);
	public void delete(int cod);
	public Editorial findId(int cod);
	public List<Editorial> listAll();
}
