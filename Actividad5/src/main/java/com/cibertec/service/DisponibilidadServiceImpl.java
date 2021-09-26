package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Disponibilidad;
import com.cibertec.repository.DisponibilidadRepository;

@Service
public class DisponibilidadServiceImpl implements DisponibilidadService{

	@Autowired
	private DisponibilidadRepository repositorio;
	
	@Override
	public List<Disponibilidad> listaDisponibilidad() {
		return repositorio.findAll();
	}

	@Override
	public Disponibilidad insertaDisponibilidad(Disponibilidad obj) {
		return repositorio.save(obj);
	}

}
