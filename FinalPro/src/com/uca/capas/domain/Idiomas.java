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
@Table(schema="public" , name="idioma")


public class Idiomas {
	
	@Id
	@GeneratedValue(generator="idioma_id_idioma_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="idioma_id_idioma_seq",sequenceName="public.idioma_id_idioma_seq",allocationSize = 1)
	@Column(name="id_idioma")
	private Integer cIdioma;
	
	@Column(name="idioma_peli")
	private String aIpeli;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pelicula")
	private Movie pelicula;

	public Idiomas(Integer cIdioma, String aIpeli, Movie pelicula) {
		super();
		this.cIdioma = cIdioma;
		this.aIpeli = aIpeli;
		this.pelicula = pelicula;
	}

	public Integer getcIdioma() {
		return cIdioma;
	}

	public void setcIdioma(Integer cIdioma) {
		this.cIdioma = cIdioma;
	}

	public String getaIpeli() {
		return aIpeli;
	}

	public void setaIpeli(String aIpeli) {
		this.aIpeli = aIpeli;
	}

	public Movie getpelicula() {
		return pelicula;
	}

	public void setpelicula(Movie pelicula) {
		this.pelicula = pelicula;
	}
	
}
