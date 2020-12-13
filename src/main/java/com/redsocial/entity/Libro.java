package com.redsocial.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "libro")
@Getter
@Setter
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idlibro;
	private String codigo;
	private String titulo;
	private String estado;
	private String tipo;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipoLibro")
	private TipoLibro tipodelibro;
}
