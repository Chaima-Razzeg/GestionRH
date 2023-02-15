package com.chaima.GestionRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaima.GestionRH.entities.Poste;
import com.chaima.GestionRH.repos.PosteRepository;

@Service
public class PosteServiceImpl implements PosteService{

	@Autowired
	PosteRepository posteRepository;
	@Override
	public Poste savePoste(Poste p) {
		return posteRepository.save(p);
	}

	@Override
	public Poste updatePoste(Poste p) {
		return posteRepository.save(p);
	}

	@Override
	public void deletePoste(Poste p) {
		posteRepository.delete(p);
		
	}

	@Override
	public void deletePosteByIdPos(Long idPos) {
		posteRepository.deleteById(idPos);		
	}

	@Override
	public Poste getPoste(Long idPos) {
		return posteRepository.findById(idPos).get();
	}

	@Override
	public List<Poste> getAllPostes() {
		return posteRepository.findAll();
	}

	@Override
	public List<Poste> findByNomPos(String nomPos) {
		return posteRepository.findByNomPos(nomPos);
	}

	@Override
	public int countAllBy() {
		return posteRepository.countAllBy();
	}



}
