package com.uca.capas.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public" , name="provincia")

public class Provincia {
	
	@Id
	@GeneratedValue(generator="provincia_id_provincia_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="provincia_id_provincia_seq",sequenceName="public.provincia_id_provincia_seq",allocationSize = 1)
	@Column(name="id_provincia")
	private Integer cProvincia;
	
	@Column(name="nombre_provincia")
	private String proNombre;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_estado")
	private Estado estado;
	
	@OneToMany(mappedBy = "estado", fetch = FetchType.EAGER)
	private List<Usuario> usuario;

	public Provincia(Integer cProvincia, String proNombre, Estado estado) {
		super();
		this.cProvincia = cProvincia;
		this.proNombre = proNombre;
		this.estado = estado;
	}

	public Integer getcProvincia() {
		return cProvincia;
	}

	public void setcProvincia(Integer cProvincia) {
		this.cProvincia = cProvincia;
	}

	public String getProNombre() {
		return proNombre;
	}

	public void setProNombre(String proNombre) {
		this.proNombre = proNombre;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
	
	

}
