package com.chaima.GestionRH.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.chaima.GestionRH.entities.Departement;
import com.chaima.GestionRH.repos.DepartementRepository;

@Service
public class DepartementServiceImpl implements DepartementService{

	@Autowired
	DepartementRepository departementRepository;
	@Override
	public Departement saveDepartement(Departement d) {
		return departementRepository.save(d);
	}

	@Override
	public Departement updateDepartement(Departement d) {
		return departementRepository.save(d);
	}

	@Override
	public void deleteDepartement(Departement d) {
		departementRepository.delete(d);
		
	}

	@Override
	public void deleteDepartementByIdDep(Long idDep) {
		departementRepository.deleteById(idDep);	
	}

	@Override
	public Departement getDepartement(Long idDep) {
		return departementRepository.findById(idDep).get();
	}

	@Override
	public List<Departement> getAllDepartements() {
		return departementRepository.findAll();
	}

	@Override
	public List<Departement> findByNomDep(String nomDep) {
		return departementRepository.findByNomDep(nomDep);
	}

	@Override
	public int countAllBy() {
		return departementRepository.countAllBy();
	}

	

}
