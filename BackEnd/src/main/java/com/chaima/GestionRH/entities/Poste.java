package com.chaima.GestionRH.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Poste {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPos;
	private String nomPos;
	private String descriptionPos;
	private String competancesRequises;
	@ManyToOne
	private Departement departement;
	@JsonIgnore
	@OneToMany(mappedBy= "poste")
	private List<Employe> employes;
	@JsonIgnore
	@OneToMany(mappedBy= "poste")
	private List<Candidat> candidats;
	
	
	
	
	
	
	

}
