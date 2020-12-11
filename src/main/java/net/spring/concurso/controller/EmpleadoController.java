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

import net.spring.concurso.entity.Distrito;
import net.spring.concurso.entity.Empleado;
import net.spring.concurso.entity.TipoEmpleado;
import net.spring.concurso.service.DistritoService;
import net.spring.concurso.service.EmpleadoService;
import net.spring.concurso.service.TipoEmpleadoService;

@RestController
@RequestMapping(value = "/empleado")
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private TipoEmpleadoService tipoEmpleadoService;
	
	@Autowired
	private DistritoService distritoService;

	
	@GetMapping(path = "/listAllDistrito")
	@ResponseBody
	public List<Distrito> listAllDistrito(){
		return distritoService.listAll();
	}
	//select Pais > a una fila
	@GetMapping(path = "/listAllTipoEmpleado")
	@ResponseBody
	public List<TipoEmpleado> listAllPais(){
		return tipoEmpleadoService.listAll();
	}
	//select Editorial > a una fila
	@GetMapping(path = "/listAllEmpleado")
	@ResponseBody
	public List<Empleado> listAllEmpleado(){
		return empleadoService.listAll();
	}	
	//select Editorial una fila
	@GetMapping(path = "/findEmpleado/{codigo}")
	@ResponseBody
	public Empleado findEmpleado(@PathVariable("codigo") int cod){
		return empleadoService.findId(cod);
	}
	//insert
	@PostMapping(path = "/saveEmpleado")
	public void saveEditorial(@RequestBody Empleado bean) {
		empleadoService.save(bean);
	}
	//update
	@PutMapping(path = "/updateEmpleado")
	public void updateEditorial(@RequestBody Empleado bean) {
		empleadoService.update(bean);
	}	
	//delete
	@DeleteMapping(path = "/deleteEmpleado/{codigo}")
	public void deleteEditorial(@PathVariable("codigo") int cod){
		empleadoService.delete(cod);
	}
	
}





