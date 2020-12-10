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

import net.spring.concurso.entity.Libro;
import net.spring.concurso.entity.TipoLibro;
import net.spring.concurso.service.LibroService;
import net.spring.concurso.service.TipoLibroService;

@RestController
@RequestMapping(value = "/libro")
public class LibroController {
	
	@Autowired
	private LibroService libroService;
	
	@Autowired
	private TipoLibroService tipolibroService;

	//select marca > a una fila
	@GetMapping(path = "/listAllTipoLibro")
	@ResponseBody
	public List<TipoLibro> listAllTipoLibro(){
		return tipolibroService.listAll();
	}
	//select computadora > a una fila
	@GetMapping(path = "/listAllLibro")
	@ResponseBody
	public List<Libro> listAllLibro(){
		return libroService.listAll();
	}	
	//select computadora una fila
	@GetMapping(path = "/findLibro/{codigo}")
	@ResponseBody
	public Libro findLibro(@PathVariable("codigo") int cod){
		return libroService.findId(cod);
	}
	//insert
	@PostMapping(path = "/saveLibro")
	public void saveLibro(@RequestBody Libro bean) {
		libroService.save(bean);
	}
	//update
	@PutMapping(path = "/updateLibro")
	public void updateLibro(@RequestBody Libro bean) {
		libroService.update(bean);
	}	
	//delete
	@DeleteMapping(path = "/deleteLibro/{codigo}")
	public void deleteLibro(@PathVariable("codigo") int cod){
		libroService.delete(cod);
	}
	
}





