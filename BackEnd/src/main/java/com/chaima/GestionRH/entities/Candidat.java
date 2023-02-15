package com.chaima.GestionRH.entities;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Candidat extends Personne {
    private String pdfFile;
    private String competances;
    private String etat="en attente";
    @ManyToOne(cascade = CascadeType.ALL)
    private Poste poste;
    
  
	public Candidat() {
		super();
	}
	

	public Candidat(String pdfFile, String competances, String etat, Poste poste) {
		super();
		this.pdfFile = pdfFile;
		this.competances = competances;
		this.etat = etat;
		this.poste = poste;
	}


	public String getPdfFile() {
		return pdfFile;
	}

	public void setPdfFile(String pdfFile) {
		this.pdfFile = pdfFile;
	}


	public Poste getPoste() {
		return poste;
	}

	public void setPoste(Poste poste) {
		this.poste = poste;
	}

	public String getCompetances() {
		return competances;
	}
	public void setCompetances(String competances) {
		this.competances = competances;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
    
    

	
	

}
