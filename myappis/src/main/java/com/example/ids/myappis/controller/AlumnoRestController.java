package com.example.ids.myappis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ids.myappis.entities.Alumno;
import com.example.ids.myappis.services.AlumnoService;

import java.util.List;

@RestController
@CrossOrigin
public class AlumnoRestController {
	
	@Autowired
	private AlumnoService service;
	
	@GetMapping("/api/alumnos")
	public List<Alumno> consultaAlumno(){
		List<Alumno> alumnos = service.consultaAlumno();
		System.out.println("Alumno guardado");
		return alumnos;
	}
	
	@GetMapping("/api/alumnos/{alumniId}")
	public Alumno consultaAlumno(@PathVariable(name="alumniId") Long alumnoId ) {
		Alumno alumno = service.consultaAlumno(alumnoId);
		System.out.println("Alumno encontrado"+ alumno);
		return alumno;
	}
	
	@PostMapping("/api/alumnos")
	public void guardarAlumno(@RequestBody Alumno alumno) {
		service.guardarAlumno(alumno);
		System.out.println("Alumno guardado");
	}
	
	
	@DeleteMapping("/api/alumnos/{alumniId}")
	public void borraAlumno(@PathVariable(name="alumniId") Long alumnoId ) {
		service.borrarAlumno(alumnoId);
		System.out.println("AlumnoService borrado" + alumnoId);
	}
	
	@PutMapping("/api/alumnos/{alumnoId}")
	public void actualizaAlumno(@RequestBody Alumno alumno, 
			@PathVariable(name="alumnoId") Long alumnoId) {
		
		service.guardarAlumno(alumno);
		System.out.println("Alumno actualizado");
	}
	
}
