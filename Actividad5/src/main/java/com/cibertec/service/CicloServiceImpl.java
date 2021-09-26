package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Ciclo;
import com.cibertec.repository.CicloRepository;

@Service
public class CicloServiceImpl implements CicloService{

	@Autowired
	private CicloRepository repo;
	
	@Override
	public List<Ciclo> listaCiclo() {
		return repo.findAll();
	}

}
