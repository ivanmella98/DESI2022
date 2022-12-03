package com.tsti.smn.entidades;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class clima_extendido {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Ciudad ciudad;
	private Date fecha;
	private double probabilidad_lluvia;
	private double cantidad_prevista;
	private String descripcion_pronostico; 
	
	public clima_extendido() {};
	
	public clima_extendido(Ciudad ciudad, Date f, double p_ll, double c_p, String d_p) {
		this.cantidad_prevista=c_p;
		this.descripcion_pronostico=d_p;
		this.fecha = f;
		this.probabilidad_lluvia=p_ll;
		this.ciudad=ciudad;
	};
	
	public void setFecha(Date fecha) {
		this.fecha=fecha;
	}
	public void setProbabilidad_lluvia(double p_ll) {
		this.probabilidad_lluvia=p_ll;
	}
	
	public void setCantidad_prevista(double c_p) {
		this.cantidad_prevista=c_p;
	}
	public void setDescripcion_pronostico(String d_p) {
		this.descripcion_pronostico= d_p;
	}
	public void setCiudad(Ciudad c) {
		this.ciudad= c;
	}

	
	
	public Date getFecha() {
		return this.fecha;
	}
	public double getProbabilidad_lluvia() {
		return this.probabilidad_lluvia;
	}
	
	public double getCantidad_prevista() {
		return this.cantidad_prevista;
	}
	public String getDescripcion_pronostico() {
		return this.descripcion_pronostico;
		
	}
	public Ciudad getCiudad() {
		return this.ciudad;
		
	}

	
	
}
