package com.chaima.GestionRH.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chaima.GestionRH.entities.Poste;
import com.chaima.GestionRH.service.PosteService;
@RestController
@RequestMapping("/api/poste")
@CrossOrigin("*")
public class PosteRESTController {
	@Autowired
	PosteService posteService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Poste> getAllPostes() {
	return posteService.getAllPostes();
	}
	@RequestMapping(value="/{idPos}",method = RequestMethod.GET)
	public Poste getPostetByIdPos(@PathVariable("idPos") Long idPos) {
	    return posteService.getPoste(idPos);
	 }
	@RequestMapping(method = RequestMethod.POST)
	public Poste createPoste(@RequestBody Poste poste) {
	    return posteService.savePoste(poste);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Poste updatePoste(@RequestBody Poste poste) {
	  return posteService.updatePoste(poste);
	}
	@RequestMapping(value="/{idPos}",method = RequestMethod.DELETE)
	public void deletePoste(@PathVariable("idPos") Long idPos)
	{
	   posteService.deletePosteByIdPos(idPos);
	}

	@RequestMapping(value="/nomPos/{nomPos}",method = RequestMethod.GET)
	public List<Poste> findByNomPos(@PathVariable("nomPos") String nomPos) {
	return posteService.findByNomPos(nomPos);
	}

    @RequestMapping(value="/count",method = RequestMethod.GET)
    public int countAllBy() {
        return posteService.countAllBy();
    }


	


	





}
