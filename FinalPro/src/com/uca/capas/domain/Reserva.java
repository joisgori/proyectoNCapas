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
@Table(schema="public" , name="reserva")


public class Reserva {
	
	@Id
	@GeneratedValue(generator="reserva_id_reserva_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="reserva_id_reserva_seq",sequenceName="public.reserva_id_reserva_seq",allocationSize = 1)
	
	@Column(name="id_reserva")
	private Integer cReserva;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pelicula")
	private Movie pelicula;
	
	

}
