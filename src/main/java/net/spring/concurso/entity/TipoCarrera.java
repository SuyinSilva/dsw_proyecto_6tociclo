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
@Table(name = "tipocarrera")
public class TipoCarrera implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoCarrera")
	private int tipCarrera;
	
	@Column(name = "nombre")
	private String nombreTipoc;
	
	@JsonIgnore
	//relación uno "Marca" a muchos "Computadora"
	@OneToMany(mappedBy = "tipocarrera")
	private List<Curso> listaCursos;
	
	

	public int getTipCarrera() {
		return tipCarrera;
	}

	public void setTipCarrera(int tipCarrera) {
		this.tipCarrera = tipCarrera;
	}

	public String getNombreTipoc() {
		return nombreTipoc;
	}

	public void setNombreTipoc(String nombreTipoc) {
		this.nombreTipoc = nombreTipoc;
	}

	public List<Curso> getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(List<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}

	
}
