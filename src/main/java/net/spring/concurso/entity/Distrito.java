package net.spring.concurso.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_distrito")
public class Distrito implements Serializable{
	@Id
	@Column(name="idDist")
	private int idDistrito;
	@Column(name = "distrito")
	private String nombreDistrito;
	//@Column(name="idProv")
	//private int idProvincia;
	
	
	
	//relación uno "Distrito" a muchos "Empleado"
	@JsonIgnore
	@OneToMany(mappedBy = "distritoEmpleado")//ASOCIACIÓN
	private List<Empleado> listaEmpleados;
	
	
	
	public Distrito() {
		//provincia=new Provincia();
	}
	
	public int getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}
	public String getNombreDistrito() {
		return nombreDistrito;
	}
	public void setNombreDistrito(String nombreDistrito) {
		this.nombreDistrito = nombreDistrito;
	}
	/*public int getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}*/
	
	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	
}
