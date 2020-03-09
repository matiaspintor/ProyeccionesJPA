package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.IPersonaProyeccionAbierta;
import com.example.demo.DTO.IPersonaProyeccionCerrada;
import com.example.demo.DTO.PersonaProyeccionClaseDTO;
import com.example.demo.Entity.Persona;
import com.example.demo.Service.IPersonaService;

@RestController
@RequestMapping(path = {"/persona"})
public class PersonaController {
	@Autowired
	private IPersonaService personaService;
	
	/*
	 * Metodo que lista todos los datos de las personas que encuentran almacenadas
	 * en la base de datos
	 * */
	@GetMapping(path = "/listarTodo")
	public ResponseEntity<Object> listarTodo(){
		List<Persona> listaPersonas = this.personaService.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(listaPersonas);
	}
	
	/*
	 * Metodo que utiliza una proyeccion CERRADA basada en interfaz para consultar
	 * solo algunos datos de la persona nombre, apellido paterno y apellido materno
	 * */
	@GetMapping(path = "/ejemploProyeccionInterfazCerrada")
	public ResponseEntity<Object> ejemploProyeccionInterfazCerrada(){
		List<IPersonaProyeccionCerrada> listaPersonas = this.personaService.listarDatosProyeccionCerrada();
		return ResponseEntity.status(HttpStatus.OK).body(listaPersonas);
	}
	
	/*
	 * Metodo que utiliza una proyeccion ABIERTA basada en interfaz para consultar
	 * el nombre completo de la persona en un solo campo
	 * */
	@GetMapping(path = "/ejemploProyeccionInterfazAbierta")
	public ResponseEntity<Object> ejemploProyeccionInterfazAbierta(){
		List<IPersonaProyeccionAbierta> listaPersonas = this.personaService.listarDatosProyeccionAbierta();
		return ResponseEntity.status(HttpStatus.OK).body(listaPersonas);
	}
	
	/*
	 * Metodo que utiliza una proyeccion basada en una clase segun el 
	 * patron de diseño Data Transfer Object
	 * */
	@GetMapping(path = "/ejemploProyeccionClase")
	public ResponseEntity<Object> ejemploProyeccionClase(){
		List<PersonaProyeccionClaseDTO> listaPersonas = this.personaService.listarDatosProyeccionClase();
		return ResponseEntity.status(HttpStatus.OK).body(listaPersonas);
	}
}
