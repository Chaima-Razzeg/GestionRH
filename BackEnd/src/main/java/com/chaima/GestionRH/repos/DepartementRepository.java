package com.chaima.GestionRH.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaima.GestionRH.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement , Long> {

	List<Departement> findByNomDep(String nomDep);
	int countAllBy();
}
