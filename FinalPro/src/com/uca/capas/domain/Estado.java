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
@Table(schema="public" , name="estado")

public class Estado {
	
	@Id
	@GeneratedValue(generator="estado_id_estado_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="estado_id_estado_seq",sequenceName="public.estado_id_estado_seq",allocationSize = 1)
	@Column(name="id_estado")
	private Integer cEstado;
	
	@Column(name="nombre_estado")
	private String eNombre;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pais")
	private Pais pais;
	
	@OneToMany(mappedBy = "estado", fetch = FetchType.EAGER)
	private List<Provincia> provincia;

	public Estado(Integer cEstado, String eNombre, Pais pais) {
		super();
		this.cEstado = cEstado;
		this.eNombre = eNombre;
		this.pais = pais;
	}

	public Integer getcEstado() {
		return cEstado;
	}

	public void setcEstado(Integer cEstado) {
		this.cEstado = cEstado;
	}

	public String geteNombre() {
		return eNombre;
	}

	public void seteNombre(String eNombre) {
		this.eNombre = eNombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Provincia> getProvincia() {
		return provincia;
	}

	public void setProvincia(List<Provincia> provincia) {
		this.provincia = provincia;
	}
	
	

}
