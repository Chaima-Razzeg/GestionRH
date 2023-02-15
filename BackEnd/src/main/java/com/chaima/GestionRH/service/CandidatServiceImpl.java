package com.chaima.GestionRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaima.GestionRH.entities.Candidat;
import com.chaima.GestionRH.repos.CandidatRepository;

@Service
public class CandidatServiceImpl implements CandidatService {

	@Autowired
	CandidatRepository candidatRepository;
	@Override
	public Candidat saveCandidat(Candidat can) {
		return candidatRepository.save(can);
	}

	@Override
	public void deleteCandidat(Candidat can) {
		candidatRepository.delete(can);
		
	}

	@Override
	public void deleteCandidatById(Long idCan) {
		candidatRepository.deleteById(idCan);
		
	}

	@Override
	public Candidat getCandidat(Long idCan) {
		return candidatRepository.findById(idCan).get();
	}

	@Override
	public List<Candidat> getAllCandidats() {
		return candidatRepository.findAll();
	}

	@Override
	public Candidat updateCandidat(Candidat can) {
		return candidatRepository.save(can);
	}

}
