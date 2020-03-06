package com.servicioproyecto.app.models.entity;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Proyecto {
	
	private Long id;
	private Date fecha_inicio;
	private Date fecha_estimada_fin;
	private Double presupuesto_asociado;
	private String recursos_a_usar;
	private Empleado empleados_asociados;

}
