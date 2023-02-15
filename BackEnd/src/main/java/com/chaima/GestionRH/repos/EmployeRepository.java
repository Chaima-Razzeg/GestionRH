package com.chaima.GestionRH.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.chaima.GestionRH.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Long> {

	@Query("select e from Employe e where e.prenom = ?1")
	List<Employe> findByPrenom(String prenom);
	@Query("select e from Employe e where e.cin = ?1")
	List<Employe> findByCin(Long Cin);
	int countAllBy();

}
