package com.chaima.GestionRH.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chaima.GestionRH.entities.Departement;
import com.chaima.GestionRH.service.DepartementService;

@RestController
@RequestMapping("/api/departement")
@CrossOrigin
public class DepartementRESTController {
	@Autowired
	DepartementService departementService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Departement> getAllDepartements() {
	   return departementService.getAllDepartements();
	}
	@RequestMapping(value="/{idDep}",method = RequestMethod.GET)
	public Departement getDepartementtByIdDep(@PathVariable("idDep") Long idDep) {
	    return departementService.getDepartement(idDep);
	 }
	@RequestMapping(method = RequestMethod.POST)
	public Departement createDepartement(@RequestBody Departement departement) {
	    return departementService.saveDepartement(departement);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Departement updateDepartement(@RequestBody Departement departement) {
	  return departementService.updateDepartement(departement);
	}
	@RequestMapping(value="/{idDep}",method = RequestMethod.DELETE)
	public void deleteDepartement(@PathVariable("idDep") Long idDep)
	{
	   departementService.deleteDepartementByIdDep(idDep);
	}
	@RequestMapping(value="/nomDep/{nomDep}",method = RequestMethod.GET)
	public List<Departement> findByNomDep(@PathVariable("nomDep") String nomDep) {
	return departementService.findByNomDep(nomDep);
	}

    @RequestMapping(value="/count",method = RequestMethod.GET)
    public int countAllBy() {
        return departementService.countAllBy();
    }


}
