package com.chaima.GestionRH.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.chaima.GestionRH.entities.Departement;
import com.chaima.GestionRH.entities.Poste;



public interface PosteRepository extends JpaRepository<Poste, Long> {
	List<Poste> findByNomPos(String nomPos);
	@Query("select p from Poste p where p.departement = ?1")
	List<Poste> findByDepartement (Departement departement);
	List<Poste> findByDepartementIdDep(Long idDep);
	int countAllBy();



}
