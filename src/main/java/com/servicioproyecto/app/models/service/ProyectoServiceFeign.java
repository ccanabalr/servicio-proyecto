package com.servicioproyecto.app.models.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.servicioproyecto.app.clietns.EmpleadoClientRest;
import com.servicioproyecto.app.models.entity.Proyecto;

@Service("ServiceFeign")
@Primary
public class ProyectoServiceFeign implements ProyectoService {
	
	@Autowired
	private EmpleadoClientRest empleadoClientRest;

	@Override
	public List<Proyecto> findAll() {
		// TODO Auto-generated method stub
		return empleadoClientRest.findAll().stream().map(e -> new Proyecto((long) 1, new Date(), new Date(), 28000000.0, "Todos", e)).collect(Collectors.toList());
	}

	@Override
	public Proyecto findById(Long id) {
		// TODO Auto-generated method stub
		return new Proyecto(id, new Date(), new Date(), 28000000.0, "todos", empleadoClientRest.findAllById(id)); 
	}

	@Override
	public Proyecto save(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proyecto update(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
