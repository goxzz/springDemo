package com.example.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.demo.services.MuñecaSystem;
import com.example.spring.demo.services.PelucaService;

@RestController
@RequestMapping("/demo")
public class Controller {

	private PelucaService pelucaService;
	private MuñecaSystem muñecaSystem;
	
	
	@Autowired
	public void setPelucaService(PelucaService pelucaService) {
		this.pelucaService = pelucaService;
	}

	@Autowired
	public void setMuñecaSystem(MuñecaSystem muñecaSystem) {
		this.muñecaSystem = muñecaSystem;
	}

	@RequestMapping(value = "/leer", method = RequestMethod.GET)
	public String index() {
		return "Puto el que lo lea";
	}
	
	@GetMapping("/peluca")
	public String peluca(){
		return this.pelucaService.elPeluca();
	}
	
	@GetMapping("/apurateHarry")
	public String apurateHarry(){
		return this.pelucaService.apurar();
	}
	
	@GetMapping("/muñecaSystem")
	public String muñecaSystem(){
		return this.muñecaSystem.beneficios();
	}

}
