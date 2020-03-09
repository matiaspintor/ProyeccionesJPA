package com.example.demo.Service;

import java.util.List;

import com.example.demo.DTO.IPersonaProyeccionAbierta;
import com.example.demo.DTO.IPersonaProyeccionCerrada;
import com.example.demo.DTO.PersonaProyeccionClaseDTO;
import com.example.demo.Entity.Persona;

public interface IPersonaService {
	public List<Persona> findAll();
	public List<IPersonaProyeccionAbierta> listarDatosProyeccionAbierta();
	public List<IPersonaProyeccionCerrada> listarDatosProyeccionCerrada();
	public List<PersonaProyeccionClaseDTO> listarDatosProyeccionClase();
}
