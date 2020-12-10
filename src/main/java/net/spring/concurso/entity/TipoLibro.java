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
@Table(name = "tipoLibro")
public class TipoLibro implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoLibro")
	private int tipLibro;
	
	@Column(name = "nombre")
	private String nombreTipol;
	
	@JsonIgnore
	//relación uno "Marca" a muchos "Computadora"
	@OneToMany(mappedBy = "tipolibro")
	private List<Libro> listaLibros;
	
	
	
	

	public int getTipLibro() {
		return tipLibro;
	}

	public void setTipLibro(int tipLibro) {
		this.tipLibro = tipLibro;
	}

	public String getNombreTipol() {
		return nombreTipol;
	}

	public void setNombreTipol(String nombreTipol) {
		this.nombreTipol = nombreTipol;
	}

	public List<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	
	
	
	
}
