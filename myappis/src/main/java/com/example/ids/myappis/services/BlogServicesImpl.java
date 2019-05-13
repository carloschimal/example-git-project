package com.example.ids.myappis.services;


import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ids.myappis.entities.Blog;
import com.example.ids.myappis.repositories.BlogRepository;

@Service
public class BlogServicesImpl implements BlogService{

	
	@Autowired
	private BlogRepository repository;
	
	@Override
	public List<Blog> consultaArticulo(){
		return repository.findAll();
	}
	
	@Override
	public Blog consultaArticulo(Long articuloId) {
		Optional<Blog> alumno = repository.findById(articuloId);
		if(alumno.isPresent()) {
			return alumno.get();
		}
		return new Blog();
	}

	@Override
	public void guardarArticulo(Blog articulo) {
		// TODO Auto-generated method stub
		repository.save(articulo);
		
	}

	@Override
	public void borrarArticulo(Long articuloId) {
		// TODO Auto-generated method stub
		repository.deleteById(articuloId);
	}

	@Override
	public void actualizaArticulo(Blog articulo) {
		// TODO Auto-generated method stub
		repository.save(articulo);
		
	}
}
