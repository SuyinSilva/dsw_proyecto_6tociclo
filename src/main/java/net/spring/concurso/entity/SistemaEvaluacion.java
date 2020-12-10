package net.spring.concurso.entity;
import java.util.List;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "sistemaevaluacion")
public class SistemaEvaluacion implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSistemaEvaluacion")
	private int sisEvaluacion;
	
	@Column(name = "nombre")
	private String nombreSistemae;
	
	@JsonIgnore
	//relación uno "Marca" a muchos "Computadora"
	@OneToMany(mappedBy = "sistemaevaluacion")
	private List<Curso> listaCursos;

	
	
	public int getSisEvaluacion() {
		return sisEvaluacion;
	}

	public void setSisEvaluacion(int sisEvaluacion) {
		this.sisEvaluacion = sisEvaluacion;
	}

	public String getNombreSistemae() {
		return nombreSistemae;
	}

	public void setNombreSistemae(String nombreSistemae) {
		this.nombreSistemae = nombreSistemae;
	}

	public List<Curso> getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(List<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}

	
	
	
	
	
	
	
	
	
}
