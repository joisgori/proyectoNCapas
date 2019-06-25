package com.uca.capas.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(schema="public" , name="pais")
public class Pais {
	
	@Id
	@GeneratedValue(generator="pais_id_pais_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="pais_id_pais_seq",sequenceName="public.pais_id_pais_seq",allocationSize = 1)
	@Column(name="id_pais")
	private Integer cPais;
	
	@Column(name="nombre_pais")
	private String pNombre;
	
	@OneToMany(mappedBy = "pais", fetch = FetchType.EAGER)
	private List<Estado> estado;

	public Pais(Integer cPais, String pNombre) {
		super();
		this.cPais = cPais;
		this.pNombre = pNombre;
	}

	public Integer getcPais() {
		return cPais;
	}

	public void setcPais(Integer cPais) {
		this.cPais = cPais;
	}

	public String getpNombre() {
		return pNombre;
	}

	public void setpNombre(String pNombre) {
		this.pNombre = pNombre;
	}

	public List<Estado> getEstado() {
		return estado;
	}

	public void setEstado(List<Estado> estado) {
		this.estado = estado;
	}
	
	
}
