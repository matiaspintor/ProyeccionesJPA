package com.example.demo.DTO;

/*Interfaz que proyecta de forma cerrada solo los datos
 * de nombre y apellidos de la persona sin la edad,
 * Se denomina interfaz cerrada por que el nombre
 * de los metodos, coincide con el nombre de los atributos 
 * de la entidad*/
public interface IPersonaProyeccionCerrada {
	public String getNombre();
	public String getAppPaterno();
	public String getAppMaterno();
}
