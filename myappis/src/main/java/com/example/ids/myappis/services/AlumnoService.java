package com.example.ids.myappis.services;

import com.example.ids.myappis.entities.Alumno;

import java.util.List;

public interface AlumnoService {
	
	List<Alumno> consultaAlumno();
	Alumno consultaAlumno(Long alumnoID);
	void guardarAlumno(Alumno alumno);
	void borrarAlumno(Long alumnoId);
	void actualizaAlumno(Alumno alumno);

}
