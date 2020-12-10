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
@Table(name="tb_computadora")
public class Computadora implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_com")
	private int codigoComputadora;
	@Column(name = "des_com")
	private String descripcion;
	@Column(name = "can_com")
	private int cantidad;
	@Column(name = "pre_com")
	private double precio;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "fec_fab_com")
	private Date fecha;
	
	//relación muchos "Computadora" a uno "Marca"
	@ManyToOne
	@JoinColumn(name = "cod_mar")
	private Marca marca;//ASOCIACIÖN.

	
	
	public int getCodigoComputadora() {
		return codigoComputadora;
	}

	public void setCodigoComputadora(int codigoComputadora) {
		this.codigoComputadora = codigoComputadora;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}








