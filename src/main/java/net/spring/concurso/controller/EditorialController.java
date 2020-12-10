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

import net.spring.concurso.entity.Editorial;
import net.spring.concurso.entity.Pais;
import net.spring.concurso.service.EditorialService;
import net.spring.concurso.service.PaisService;

@RestController
@RequestMapping(value = "/editorial")
public class EditorialController {
	
	@Autowired
	private EditorialService editorialService;
	
	@Autowired
	private PaisService paisService;

	//select Pais > a una fila
	@GetMapping(path = "/listAllPais")
	@ResponseBody
	public List<Pais> listAllPais(){
		return paisService.listAll();
	}
	//select Editorial > a una fila
	@GetMapping(path = "/listAllEditorial")
	@ResponseBody
	public List<Editorial> listAllEditorial(){
		return editorialService.listAll();
	}	
	//select Editorial una fila
	@GetMapping(path = "/findEditorial/{codigo}")
	@ResponseBody
	public Editorial findEditorial(@PathVariable("codigo") int cod){
		return editorialService.findId(cod);
	}
	//insert
	@PostMapping(path = "/saveEditorial")
	public void saveEditorial(@RequestBody Editorial bean) {
		editorialService.save(bean);
	}
	//update
	@PutMapping(path = "/updateEditorial")
	public void updateEditorial(@RequestBody Editorial bean) {
		editorialService.update(bean);
	}	
	//delete
	@DeleteMapping(path = "/deleteEditorial/{codigo}")
	public void deleteEditorial(@PathVariable("codigo") int cod){
		editorialService.delete(cod);
	}
	
}





