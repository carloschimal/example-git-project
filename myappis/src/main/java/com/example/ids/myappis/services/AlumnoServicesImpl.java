package com.example.ids.myappis.services;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ids.myappis.entities.Alumno;
import com.example.ids.myappis.repositories.AlumnoRepository;

@Service
public class AlumnoServicesImpl implements  AlumnoService{
	
	
	@Autowired
	private AlumnoRepository repository;
	
	@Override
	public List<Alumno> consultaAlumno(){
		return repository.findAll();
	}
	
	@Override
	public Alumno consultaAlumno(Long alumnoId) {
		Optional<Alumno> alumno = repository.findById(alumnoId);
		if(alumno.isPresent()) {
			return alumno.get();
		}
		return new Alumno();
	}

	@Override
	public void guardarAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		repository.save(alumno);
		
	}

	@Override
	public void borrarAlumno(Long alumnoId) {
		// TODO Auto-generated method stub
		repository.deleteById(alumnoId);
	}

	@Override
	public void actualizaAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		repository.save(alumno);
		
	}
	
}
