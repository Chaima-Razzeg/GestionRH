package com.chaima.GestionRH.service;

import java.util.List;

import com.chaima.GestionRH.entities.Conge;

public interface CongeService {
	Conge saveConge(Conge con);
	Conge updateConge(Conge con);
	void deleteConge(Conge con);
	void deleteCongeByIdCon(Long idCon);
	Conge getConge(Long idCon);
	List<Conge> getAllConges();
	int nbConge(Conge con);

}
