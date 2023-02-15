package com.chaima.GestionRH.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaima.GestionRH.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
