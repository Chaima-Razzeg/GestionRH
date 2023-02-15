package com.chaima.GestionRH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaima.GestionRH.entities.Employe;
import com.chaima.GestionRH.repos.EmployeRepository;

@Service
public class EmployeServiceImpl implements EmployeService{

	@Autowired
	EmployeRepository employeRepository;
	
	@Override
	public Employe saveEmploye(Employe emp) {
		return employeRepository.save(emp);
	}

	@Override
	public Employe updateEmploye(Employe emp) {
		return employeRepository.save(emp);
	}

	@Override
	public void deleteEmploye(Employe emp) {
		employeRepository.delete(emp);
		
	}

	@Override
	public void deleteEmployeById(Long idEmp) {
		employeRepository.deleteById(idEmp);
	}

	@Override
	public Employe getEmploye(Long idEmp) {
		return employeRepository.findById(idEmp).get();
	}

	@Override
	public List<Employe> getAllEmployes() {
		return employeRepository.findAll();
	}

	@Override
	public List<Employe> findByPrenom(String prenom) {
		return employeRepository.findByPrenom(prenom);
	}

	@Override
	public List<Employe> findByCin(Long cin) {
		return employeRepository.findByCin(cin);
	}

	@Override
	public int countAllBy() {
		return employeRepository.countAllBy();	}



}
