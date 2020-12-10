package net.spring.concurso.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the rol database table.
 * 
 */
@Entity
@Table(name="tb_rol")
@NamedQuery(name="Rol.findAll", query="SELECT r FROM Rol r")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idrol")
	private int idrol;
	@Column(name = "descripcion")
	private String descripcion;

	@JsonIgnore
	@OneToMany(mappedBy="rol")
	private List<RolEnlace> rolenlaces;
	
	@JsonIgnore
	@OneToMany(mappedBy="rol")
	private List<Usuario> listaUsuario;
	
	public Rol() {
	}

	public int getIdrol() {
		return this.idrol;
	}

	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<RolEnlace> getRolenlaces() {
		return rolenlaces;
	}

	public void setRolenlaces(List<RolEnlace> rolenlaces) {
		this.rolenlaces = rolenlaces;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	

}