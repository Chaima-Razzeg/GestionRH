package com.chaima.GestionRH.restcontrollers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chaima.GestionRH.entities.Conge;
import com.chaima.GestionRH.service.CongeService;

@RestController
@RequestMapping("/api/conge")
@CrossOrigin
public class CongeRESTController {
	@Autowired
	CongeService congeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Conge> getAllConges() {
	   return congeService.getAllConges();
	}
	
	@RequestMapping(value="/{idCon}",method = RequestMethod.GET)
	public Conge getCongeByIdCon(@PathVariable("idCon") Long idCon) {
	    return congeService.getConge(idCon);
	 }
	
	@RequestMapping(value="/nb/{idCon}",method = RequestMethod.GET)
	public int nbConge(@PathVariable("idCon")Conge con) {
	   return  congeService.nbConge(con);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Conge createConge(@RequestBody Conge conge) {
	    return congeService.saveConge(conge);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Conge updateConge(@RequestBody Conge conge) {
	  return congeService.updateConge(conge);
	}
	@RequestMapping(value="/{idCon}",method = RequestMethod.DELETE)
	public void deleteConge(@PathVariable("idCon") Long idCon)
	{
	   congeService.deleteCongeByIdCon(idCon);
	}
	
	

}
