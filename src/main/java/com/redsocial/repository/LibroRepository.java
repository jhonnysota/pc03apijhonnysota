package com.redsocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.redsocial.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

	@Query("select x from Libro x where x.tipodelibro.idTipoLibro = :param")
	public abstract List<Libro> listarLibroXTipo(@Param("param") int idTipoLibro);
}
