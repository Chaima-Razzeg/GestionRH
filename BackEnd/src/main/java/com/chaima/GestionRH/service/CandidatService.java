package com.chaima.GestionRH.service;

import java.util.List;

import com.chaima.GestionRH.entities.Candidat;

public interface CandidatService {
	Candidat saveCandidat(Candidat can);
	Candidat updateCandidat(Candidat can);
	void deleteCandidat(Candidat can);
	void deleteCandidatById(Long idCan);
	Candidat getCandidat(Long idCan);
	List<Candidat> getAllCandidats();

}
