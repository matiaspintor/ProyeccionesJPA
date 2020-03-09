package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.IPersonaProyeccionAbierta;
import com.example.demo.DTO.IPersonaProyeccionCerrada;
import com.example.demo.DTO.PersonaProyeccionClaseDTO;
import com.example.demo.Entity.Persona;
import com.example.demo.Repository.IPersonaRepository;

@Service
public class PersonaService implements IPersonaService{

	@Autowired
	private IPersonaRepository personaRepository;
	
	@Override
	public List<Persona> findAll() {
		return this.personaRepository.findAll();
	}

	@Override
	public List<IPersonaProyeccionAbierta> listarDatosProyeccionAbierta() {
		return this.personaRepository.listarDatosProyeccionAbierta();
	}

	@Override
	public List<IPersonaProyeccionCerrada> listarDatosProyeccionCerrada() {
		return this.personaRepository.listarDatosProyeccionCerrada();
	}

	@Override
	public List<PersonaProyeccionClaseDTO> listarDatosProyeccionClase() {
		return this.personaRepository.listarDatosProyeccionClase();
	}


}
