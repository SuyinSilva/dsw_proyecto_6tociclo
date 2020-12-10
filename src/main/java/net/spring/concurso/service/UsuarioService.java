package net.spring.concurso.service;
import java.util.List;

import net.spring.concurso.entity.Enlace;
import net.spring.concurso.entity.Usuario;

public interface UsuarioService {
	public Usuario iniciaSesion(String login, String clave);
	public List<Enlace> traerPrivilegios(int rol);
	
	////////
	public void save(Usuario bean);
	public void update(Usuario bean);
	public void delete(int cod);
	public Usuario findId(int cod);
	public List<Usuario> listAll();
	
}
