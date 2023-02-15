package com.chaima.GestionRH.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Conge {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCon;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private String typeCon;
	private String statusCon="en attente";
	@ManyToOne(cascade = CascadeType.ALL)
	private Employe employe ;

	
	

}
