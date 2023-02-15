package com.chaima.GestionRH.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Employe extends Personne {
	private Double salaire;
	private String contrat;
	private LocalDate dateRecrutement;
	private String grade;
	@JsonIgnore
	@OneToMany(mappedBy= "employe")
	private List<Conge> conges;
	@ManyToOne
	private Poste poste;
	private String mdp;
	private String username;
	
	
	public Employe() {
		super();
	}


	


	public Employe(Double salaire, String contrat, LocalDate dateRecrutement, String grade, List<Conge> conges,
			Poste poste, String mdp, String username) {
		super();
		this.salaire = salaire;
		this.contrat = contrat;
		this.dateRecrutement = dateRecrutement;
		this.grade = grade;
		this.conges = conges;
		this.poste = poste;
		this.mdp = mdp;
		this.username = username;
	}





	public Double getSalaire() {
		return salaire;
	}


	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}


	public String getContrat() {
		return contrat;
	}


	public void setContrat(String contrat) {
		this.contrat = contrat;
	}


	public LocalDate getDateRecrutement() {
		return dateRecrutement;
	}


	public void setDateRecrutement(LocalDate dateRecrutement) {
		this.dateRecrutement = dateRecrutement;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public List<Conge> getConges() {
		return conges;
	}


	public void setConges(List<Conge> conges) {
		this.conges = conges;
	}


	public String getMdp() {
		return mdp;
	}


	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}





	public Poste getPoste() {
		return poste;
	}





	public void setPoste(Poste poste) {
		this.poste = poste;
	}
	
	
	
	

	

}
