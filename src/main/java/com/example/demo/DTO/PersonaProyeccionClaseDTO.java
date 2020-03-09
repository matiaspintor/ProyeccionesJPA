package com.example.demo.DTO;

/*
 * Clase para realizar la proyeccion de los datos de la persona
 * segun patron de diseño Data Transfer Object. JPA se apoya
 * del constructor con argumentos para crear el objeto
 * */
public class PersonaProyeccionClaseDTO {
	
	public PersonaProyeccionClaseDTO(String nombre, String appPaterno, String appMaterno) {
		this.nombre = nombre;
		this.appPaterno = appPaterno;
		this.appMaterno = appMaterno;
	}
	private final String nombre;
	private final String appPaterno;
	private final String appMaterno;
	public String getNombre() {
		return nombre;
	}
	public String getAppPaterno() {
		return appPaterno;
	}
	public String getAppMaterno() {
		return appMaterno;
	}

}
