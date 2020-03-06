package com.servicioproyecto.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicioproyecto.app.models.entity.Proyecto;
import com.servicioproyecto.app.models.service.ProyectoService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ProtectoController {
	
	@Autowired
	@Qualifier("ServiceFeign")
	private ProyectoService proyectoService;
	
	@GetMapping("/proyectos")
	public List<Proyecto> findAll(){
		return proyectoService.findAll();
	}
	
	@GetMapping("/proyecto/{id}")
	public Proyecto findById(@PathVariable Long id) {
		return proyectoService.findById(id);
	}

}
