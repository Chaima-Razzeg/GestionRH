package com.chaima.GestionRH.service;

import java.util.List;

import com.chaima.GestionRH.entities.Departement;

public interface DepartementService {
	Departement saveDepartement(Departement d);
	Departement updateDepartement(Departement d);
	void deleteDepartement(Departement d);
	void deleteDepartementByIdDep(Long idDep);
	Departement getDepartement(Long idDep);
	List<Departement> getAllDepartements();
	List<Departement> findByNomDep(String nomDep);
	int countAllBy();
	
	

}
