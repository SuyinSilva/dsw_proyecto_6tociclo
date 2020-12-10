package net.spring.concurso.entity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_marca")
public class Marca implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_mar")
	private int codigoMarca;
	@Column(name = "nom_mar")
	private String nombreMarca;
	
	@JsonIgnore
	//relación uno "Marca" a muchos "Computadora"
	@OneToMany(mappedBy = "marca")
	private List<Computadora> listaComputadoras;

	
	
	public int getCodigoMarca() {
		return codigoMarca;
	}

	public void setCodigoMarca(int codigoMarca) {
		this.codigoMarca = codigoMarca;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public List<Computadora> getListaComputadoras() {
		return listaComputadoras;
	}

	public void setListaComputadoras(List<Computadora> listaComputadoras) {
		this.listaComputadoras = listaComputadoras;
	}
	
}
