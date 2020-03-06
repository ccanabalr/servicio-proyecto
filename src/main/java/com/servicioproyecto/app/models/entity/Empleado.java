package com.servicioproyecto.app.models.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
	
	private Long id;
	private String nombre;
	private String apellido;
	private Double salario;
	private Date fecha_ingreso;

}
