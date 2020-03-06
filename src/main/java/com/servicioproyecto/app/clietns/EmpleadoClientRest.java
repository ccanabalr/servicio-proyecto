package com.servicioproyecto.app.clietns;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.servicioproyecto.app.models.entity.Empleado;


@FeignClient(name = "servicio-empleado", url = "localhost:8016/api")
public interface EmpleadoClientRest {
	
	@GetMapping("/empleados")
	public List<Empleado> findAll();

	@GetMapping("/empleado/{id}")
	public Empleado findAllById(@PathVariable Long id); 
}
