package com.chaima.GestionRH.service;

import java.util.List;

import com.chaima.GestionRH.entities.Employe;

public interface EmployeService {
	Employe saveEmploye(Employe emp);
	Employe updateEmploye(Employe emp);
	void deleteEmploye(Employe emp);
	void deleteEmployeById(Long idEmp);
	Employe getEmploye(Long idEmp);
	List<Employe> getAllEmployes();
	List<Employe> findByPrenom(String Prenom);
	List<Employe> findByCin(Long cin);
	int countAllBy();
	
	

}
