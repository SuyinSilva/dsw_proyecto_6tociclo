package net.spring.concurso.entity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "curso")
public class Curso implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCurso")
	private int codigoCurso;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "estado")
	private String estado;
	

	//relación muchos "Curso" a uno "SistemaEvaluacion"
	//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne //(fetch = FetchType.LAZY)
	@JoinColumn(name = "idSistemaEvaluacion")
	private SistemaEvaluacion sistemaevaluacion;//ASOCIACIÖN.


	
	public int getCodigoCurso() {
		return codigoCurso;
	}


	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public SistemaEvaluacion getSistemaevaluacion() {
		return sistemaevaluacion;
	}


	public void setSistemaevaluacion(SistemaEvaluacion sistemaevaluacion) {
		this.sistemaevaluacion = sistemaevaluacion;
	}

	
	
	
	
	
	
}








