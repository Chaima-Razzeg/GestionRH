package com.chaima.GestionRH.service;

import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaima.GestionRH.entities.Conge;
import com.chaima.GestionRH.repos.CongeRepository;

@Service
public class CongeServiceImpl implements CongeService {

	@Autowired
	CongeRepository congeRepository;
	@Override
	public Conge saveConge(Conge con) {
		return congeRepository.save(con);
	}

	@Override
	public Conge updateConge(Conge con) {
		return congeRepository.save(con);
	}

	@Override
	public void deleteConge(Conge con) {
		congeRepository.delete(con);
		
	}

	@Override
	public void deleteCongeByIdCon(Long idCon) {
		congeRepository.deleteById(idCon);
	}

	@Override
	public Conge getConge(Long idCon) {
		return congeRepository.findById(idCon).get();
	}

	@Override
	public List<Conge> getAllConges() {
		return congeRepository.findAll();
	}

	@Override
	public int nbConge(Conge con) {
		Period difference = Period.between(con.getDateDebut(),con.getDateFin());
		return difference.getDays();
	}

}
