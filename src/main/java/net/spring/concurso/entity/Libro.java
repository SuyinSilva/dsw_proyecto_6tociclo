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
@Table(name = "libro")
public class Libro implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idLibro")
	private int codigoLibro;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "tipo")
	private String tipo;

	//relación muchos "Computadora" a uno "Marca"
	//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne //(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipoLibro")
	private TipoLibro tipolibro;//ASOCIACIÖN.

	
	
	public int getCodigoLibro() {
		return codigoLibro;
	}

	public void setCodigoLibro(int codigoLibro) {
		this.codigoLibro = codigoLibro;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public TipoLibro getTipolibro() {
		return tipolibro;
	}

	public void setTipolibro(TipoLibro tipolibro) {
		this.tipolibro = tipolibro;
	}

	
	
	
}








