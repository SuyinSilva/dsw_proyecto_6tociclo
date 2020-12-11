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

import net.spring.concurso.entity.Curso;
import net.spring.concurso.entity.TipoCarrera;
import net.spring.concurso.service.CursoService;
import net.spring.concurso.service.TipoCarreraService;

@RestController
@RequestMapping(value = "/curso")
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	@Autowired
	private TipoCarreraService tipocarreraService;

	//select marca > a una fila
	@GetMapping(path = "/listAllTipoCarrera")
	@ResponseBody
	public List<TipoCarrera> listAllTipoCarrera(){
		return tipocarreraService.listAll();
	}
	//select computadora > a una fila
	@GetMapping(path = "/listAllCurso")
	@ResponseBody
	public List<Curso> listAllCurso(){
		return cursoService.listAll();
	}	
	//select computadora una fila
	@GetMapping(path = "/findCurso/{codigo}")
	@ResponseBody
	public Curso findCurso(@PathVariable("codigo") int cod){
		return cursoService.findId(cod);
	}
	//insert
	@PostMapping(path = "/saveCurso")
	public void saveCurso(@RequestBody Curso bean) {
		cursoService.save(bean);
	}
	//update
	@PutMapping(path = "/updateCurso")
	public void updateCurso(@RequestBody Curso bean) {
		cursoService.update(bean);
	}	
	//delete
	@DeleteMapping(path = "/deleteCurso/{codigo}")
	public void deleteCurso(@PathVariable("codigo") int cod){
		cursoService.delete(cod);
	}
	
}





