package com.example.demo.DTO;

import org.springframework.beans.factory.annotation.Value;
/*Proyeccion de interfaz abierta que proyecta solo los datos
 * de nombre y apellidos de la persona sin la edad en un solo campo,
 * Se denomina interfaz abierta por que el nombre
 * de los metodos no coincide con el nombre de los atributos 
 * de la entidad, es una concatenacion de uno o mas atributos*/
public interface IPersonaProyeccionAbierta {
	@Value("#{target.nombre + ' ' + target.apppaterno + ' ' + target.appmaterno}")
	public String getNombreCompleto();
}
