package net.spring.concurso.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.spring.concurso.entity.Empleado;
import net.spring.concurso.entity.Rol;
import net.spring.concurso.entity.Usuario;
import net.spring.concurso.service.EmpleadoService;
import net.spring.concurso.service.RolService;
import net.spring.concurso.service.UsuarioService;
@RestController
@RequestMapping(value = "/cliente")
public class UsuarioClienteController {
	@Autowired
	private UsuarioService usuarioService;	
	@Autowired
	private RolService rolService;
	@Autowired
	private EmpleadoService empleadoService;
	
	///
	@GetMapping(path = "/listAllEmpleado")
	@ResponseBody
	public List<Empleado> listAllEmpleado(){
		return empleadoService.listAll();
	}
	@GetMapping(path = "/listAllRol")
	@ResponseBody
	public List<Rol> listAllRol(){
		return rolService.listAll();
	}
	//select computadora > a una fila
	@GetMapping(path = "/listAllUsuario")
	@ResponseBody
	public List<Usuario> listAllUsuario(){
		return usuarioService.listAll();
	}	
	//select computadora una fila
	@GetMapping(path = "/findUsuario/{codigo}")
	@ResponseBody
	public Usuario findUsuario(@PathVariable("codigo") int cod){
		return usuarioService.findId(cod);
	}
	//insert
	@PostMapping(path = "/saveUsuario")
	public void saveUsuario(@RequestBody Usuario bean) {
		usuarioService.save(bean);
	}
	//update
	@PutMapping(path = "/updateUsuario")
	public void updateUsuario(@RequestBody Usuario bean) {
		usuarioService.update(bean);
	}	
	//delete
	@DeleteMapping(path = "/deleteUsuario/{codigo}")
	public void deleteUsuario(@PathVariable("codigo") int cod){
		usuarioService.delete(cod);
	}
}
