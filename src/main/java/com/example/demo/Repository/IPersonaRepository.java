package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.DTO.IPersonaProyeccionAbierta;
import com.example.demo.DTO.IPersonaProyeccionCerrada;
import com.example.demo.DTO.PersonaProyeccionClaseDTO;
import com.example.demo.Entity.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Integer>{
	public List<Persona> findAll();
	
	@Query(value = "SELECT * FROM Persona", nativeQuery = true)
	@Transactional(readOnly = true)
	public List<IPersonaProyeccionAbierta> listarDatosProyeccionAbierta();
	
	@Query(value = "SELECT * FROM Persona", nativeQuery = true)
	@Transactional(readOnly = true)
	public List<IPersonaProyeccionCerrada> listarDatosProyeccionCerrada();
	
	/*En este tipo de proyeccion no se debe ejecutar como una consulta nativa*/
	@Query(value = "SELECT new com.example.demo.DTO.PersonaProyeccionClaseDTO(nombre, apppaterno, appmaterno) FROM Persona")
	@Transactional(readOnly = true)
	public List<PersonaProyeccionClaseDTO> listarDatosProyeccionClase();
}
