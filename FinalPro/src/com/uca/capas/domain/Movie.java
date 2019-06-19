package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public" , name="pelicula")
public class Movie {
	
	@Id
	@GeneratedValue(generator="pelicula_id_pelicula_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="pelicula_id_pelicula_seq",sequenceName="public.pelicula_id_pelicula_seq",allocationSize = 1)
	@Column(name="id_pelicula")
	private Integer cMovie;
	
	@Column(name="nombre_pelicula")
	private String pName;
	
	@Column(name="imagen_pelicula")
	private String pImage;
	
	@Column(name="duracion")
	private String pDuration;
	
	public Movie(Integer cMovie, String pName, String pImage, String pDuration) {
		super();
		this.cMovie = cMovie;
		this.pName = pName;
		this.pImage = pImage;
		this.pDuration = pDuration;
	}
	
	
	

	public Integer getcMovie() {
		return cMovie;
	}




	public void setcMovie(Integer cMovie) {
		this.cMovie = cMovie;
	}




	public String getpName() {
		return pName;
	}




	public void setpName(String pName) {
		this.pName = pName;
	}




	public String getpImage() {
		return pImage;
	}




	public void setpImage(String pImage) {
		this.pImage = pImage;
	}




	public String getpDuration() {
		return pDuration;
	}




	public void setpDuration(String pDuration) {
		this.pDuration = pDuration;
	}

}
