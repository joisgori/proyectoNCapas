package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public" , name="genero")


public class Genero {
	
	@Id
	@GeneratedValue(generator="genero_id_genero_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="genero_id_genero_seq",sequenceName="public.genero_id_genero_seq",allocationSize = 1)
	@Column(name="id_genero")
	private Integer cGenero;
	
	@Column(name="genero_peli")
	private String aGpeli;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pelicula")
	private Movie pelicula;
	
	public Genero(Integer cGenero, String aGpeli, Movie pelicula) {
		super();
		this.cGenero = cGenero;
		this.aGpeli = aGpeli;
		this.pelicula = pelicula;
	}
	
	public Integer getcGenero() {
		return cGenero;
	}

	public void setcGenero(Integer cGenero) {
		this.cGenero = cGenero;
	}

	public String getaGpeli() {
		return aGpeli;
	}

	public void setaGpeli(String aGpeli) {
		this.aGpeli = aGpeli;
	}

	public Movie getpelicula() {
		return pelicula;
	}

	public void setpelicula(Movie pelicula) {
		this.pelicula = pelicula;
	}

}
