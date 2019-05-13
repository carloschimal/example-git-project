package com.example.ids.myappis.services;

import java.util.List;

import com.example.ids.myappis.entities.Blog;

public interface BlogService {
	List<Blog> consultaArticulo();
	Blog consultaArticulo(Long articuloID);
	void guardarArticulo(Blog articulo);
	void borrarArticulo(Long articuloId);
	void actualizaArticulo(Blog articulo);

}
