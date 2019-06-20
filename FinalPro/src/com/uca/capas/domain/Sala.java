package com.uca.capas.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

public class Sala {
	
	@Id
	@GeneratedValue(generator="sala_id_sala_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="sala_id_sala_seq",sequenceName="public.sala_id_sala_seq",allocationSize = 1)
	@Column(name="id_sala")
	private Integer cSala;
	
	@OneToMany(mappedBy = "sala", fetch = FetchType.EAGER)
	private List<SxP> salaxpelicula;

	public Sala(Integer cSala) {
		super();
		this.cSala = cSala;
	}

	public Integer getcSala() {
		return cSala;
	}

	public void setcSala(Integer cSala) {
		this.cSala = cSala;
	}
	
	

}
