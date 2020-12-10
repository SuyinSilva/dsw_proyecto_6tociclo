package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.UsuarioDAO;
import net.spring.concurso.entity.Enlace;
import net.spring.concurso.entity.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Override
	public Usuario iniciaSesion(String login, String clave) {
		return usuarioDAO.iniciaSesion(login, clave);
	}

	@Override
	public List<Enlace> traerPrivilegios(int rol) {
		return usuarioDAO.traerPrivilegios(rol);
	}

	@Override
	public void save(Usuario bean) {
		usuarioDAO.save(bean);
	}

	@Override
	public void update(Usuario bean) {
		usuarioDAO.update(bean);
	}

	@Override
	public void delete(int cod) {
		 usuarioDAO.delete(cod);
	}

	@Override
	public Usuario findId(int cod) {
		return usuarioDAO.findId(cod);
	}

	@Override
	public List<Usuario> listAll() {
		return usuarioDAO.listAll();
	}

}
