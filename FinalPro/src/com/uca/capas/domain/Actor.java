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
@Table(schema="public" , name="actores")

public class Actor {
	
	@Id
	@GeneratedValue(generator="actor_id_actor_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="actor_id_actor_seq",sequenceName="public.actor_id_actor_seq",allocationSize = 1)
	@Column(name="id_actores")
	private Integer cActores;
	
	@Column(name="nombre_actor")
	private String aName;
	
	@Column(name="apellido_actor")
	private String aApellido;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pelicula")
	private Movie pelicula;
	
	public Actor(Integer cActores, String aName, String aApellido, Movie pelicula) {
		super();
		this.cActores = cActores;
		this.aName = aName;
		this.aApellido = aApellido;
		this.pelicula = pelicula;
	}

	public Integer getcActores() {
		return cActores;
	}

	public void setcActores(Integer cActores) {
		this.cActores = cActores;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaApellido() {
		return aApellido;
	}

	public void setaApellido(String aApellido) {
		this.aApellido = aApellido;
	}

	public Movie getpelicula() {
		return pelicula;
	}

	public void setpelicula(Movie pelicula) {
		this.pelicula = pelicula;
	}

}
