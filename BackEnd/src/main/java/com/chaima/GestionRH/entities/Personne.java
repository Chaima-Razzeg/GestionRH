package com.chaima.GestionRH.entities;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected Long cin;
	protected String nom;
	protected String prenom;
	protected LocalDate dateNai;
	protected int tel;
	protected String adresse;
	@Email(message = "Adresse e-mail non valide ")
    protected String email;

}
