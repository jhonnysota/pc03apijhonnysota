package com.redsocial.service;

import java.util.List;

import com.redsocial.entity.Libro;
import com.redsocial.entity.TipoLibro;

public interface LibroService {

	public List<Libro>listaLibro();
	public List<Libro>listaLibroXTipo(int idTipoLibro);
}
