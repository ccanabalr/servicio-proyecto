package com.servicioproyecto.app.models.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.servicioproyecto.app.models.entity.Empleado;
import com.servicioproyecto.app.models.entity.Proyecto;

@Service
public class ProyectoServiceImpl implements ProyectoService {
	
	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<Proyecto> findAll() {
		List<Empleado> empleados = Arrays.asList(clienteRest.getForObject("http://localhost:8080/api/empleados", Empleado[].class));
		return empleados.stream().map(e -> new Proyecto((long) 1, new Date(), new Date(), 28000000.0, "Todos", e)).collect(Collectors.toList());
	}

	@Override
	public Proyecto findById(Long id) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
		Empleado empleado = clienteRest.getForObject("http://localhost:8080/api/empleado/{id}", Empleado.class, pathVariables);
		return new Proyecto(id, new Date(), new Date(), 28000000.0, "todos", empleado);
	}

	@Override
	public Proyecto save(Proyecto proyecto) {
		return null;
	}

	@Override
	public Proyecto update(Proyecto proyecto) {
		return null;
	}

	@Override
	public void deleteById(Long id) {
		
	}

}
