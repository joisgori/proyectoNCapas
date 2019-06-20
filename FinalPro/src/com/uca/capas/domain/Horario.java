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
@Table(schema="public" , name="horario")


public class Horario {
	
	@Id
	@GeneratedValue(generator="horario_id_horario_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="horario_id_horario_seq",sequenceName="public.horario_id_horario_seq",allocationSize = 1)
	@Column(name="id_horario")
	private Integer cHorario;
	
	@Column(name="horario_peli")
	private String aHpeli;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pelicula")
	private Movie pelicula;

	public Horario(Integer cHorario, String aHpeli, Movie pelicula) {
		super();
		this.cHorario = cHorario;
		this.aHpeli = aHpeli;
		this.pelicula = pelicula;
	}

	public Integer getcHorario() {
		return cHorario;
	}

	public void setcHorario(Integer cHorario) {
		this.cHorario = cHorario;
	}

	public String getaHpeli() {
		return aHpeli;
	}

	public void setaHpeli(String aHpeli) {
		this.aHpeli = aHpeli;
	}

	public Movie getpelicula() {
		return pelicula;
	}

	public void setpelicula(Movie pelicula) {
		this.pelicula = pelicula;
	}
	
}
