package com.chaima.GestionRH.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chaima.GestionRH.entities.Candidat;
import com.chaima.GestionRH.service.CandidatService;

@RestController
@RequestMapping("/api/candidat")
@CrossOrigin
public class CandidatRESTController {
	@Autowired
	CandidatService candidatService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Candidat> getAllCandidats() {
	   return candidatService.getAllCandidats();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Candidat getCandidatById(@PathVariable("id") Long id) {
	    return candidatService.getCandidat(id);
	 }
	
	
	@RequestMapping(method = RequestMethod.POST)
	public Candidat createCandidat(@RequestBody Candidat candidat) {
	    return candidatService.saveCandidat(candidat);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteCandidat(@PathVariable("id") Long id)
	{
	   candidatService.deleteCandidatById(id);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Candidat updateCandidat(@RequestBody Candidat candidat) {
	  return candidatService.updateCandidat(candidat);
	}
	

}
