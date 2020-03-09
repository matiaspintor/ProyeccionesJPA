package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Persona" )
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int idPersona;
	
	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApppaterno() {
		return apppaterno;
	}

	public void setApppaterno(String apppaterno) {
		this.apppaterno = apppaterno;
	}

	public String getAppmaterno() {
		return appmaterno;
	}

	public void setAppmaterno(String appmaterno) {
		this.appmaterno = appmaterno;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APPPATERNO")
	private String apppaterno;
	
	@Column(name = "APPMATERNO")
	private String appmaterno;
	
	@Column(name = "TALLA")
	private String talla;
	

	

}
