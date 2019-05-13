package com.example.ids.myappis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ids.myappis.entities.Blog;
import com.example.ids.myappis.services.BlogService;

@RestController
@CrossOrigin
public class BlogRestController {
	

	@Autowired
	private BlogService service;
	
	@GetMapping("/api/blogs")
	public List<Blog> consultaAlumno(){
		List<Blog> alumnos = service.consultaArticulo();
		System.out.println("Articulo guardado");
		return alumnos;
	}
	
	@GetMapping("/api/blogs/{articuloId}")
	public Blog consultaAlumno(@PathVariable(name="articuloId") Long articuloId ) {
		Blog articulo = service.consultaArticulo(articuloId);
		System.out.println("Articulo encontrado"+ articulo);
		return articulo;
	}
	
	@PostMapping("/api/blogs")
	public void guardarAlumno(@RequestBody Blog articulo) {
		service.guardarArticulo(articulo);
		System.out.println("Articulo guardado");
	}
	
	
	@DeleteMapping("/api/blogs/{articuloId}")
	public void borraArticulo(@PathVariable(name="articuloId") Long articuloId ) {
		service.borrarArticulo(articuloId);
		System.out.println("AlumnoService borrado" + articuloId);
	}
	
	@PutMapping("/api/blogs/{articuloId}")
	public void actualizaArticulo(@RequestBody Blog articulo, 
			@PathVariable(name="articuloId") Long articuloId) {
		
		service.guardarArticulo(articulo);
		System.out.println("Alumno actualizado");
	}
}
