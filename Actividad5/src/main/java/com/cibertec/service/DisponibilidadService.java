package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Disponibilidad;

public interface DisponibilidadService {
	
	public List<Disponibilidad> listaDisponibilidad();
	public Disponibilidad insertaDisponibilidad(Disponibilidad obj);

}
