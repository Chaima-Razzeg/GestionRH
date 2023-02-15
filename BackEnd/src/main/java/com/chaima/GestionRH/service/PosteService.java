package com.chaima.GestionRH.service;

import java.util.List;


import com.chaima.GestionRH.entities.Poste;

public interface PosteService {
	Poste savePoste(Poste p);
	Poste updatePoste(Poste p);
	void deletePoste(Poste p);
	void deletePosteByIdPos(Long idPos);
	Poste getPoste(Long idPos);
	List<Poste> getAllPostes();
	List<Poste> findByNomPos(String nomPos);
	int countAllBy();

	
	

}
