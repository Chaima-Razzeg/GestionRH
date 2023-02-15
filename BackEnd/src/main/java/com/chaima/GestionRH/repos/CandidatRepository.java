package com.chaima.GestionRH.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaima.GestionRH.entities.Candidat;

public interface CandidatRepository extends JpaRepository<Candidat, Long> {

}
