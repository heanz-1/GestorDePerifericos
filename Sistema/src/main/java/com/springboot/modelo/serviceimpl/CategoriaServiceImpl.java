package com.springboot.modelo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.modelo.entity.Categoria;
import com.springboot.modelo.repository.CategoriaRepository;
import com.springboot.modelo.service.CategoriaSerivce;

@Service
public class CategoriaServiceImpl implements CategoriaSerivce{

	@Autowired
	private CategoriaRepository repository;
	
	@Override
	public List<Categoria> lista() {
		return repository.findAll();
	}

	@Override
	public Categoria findById(int id) {
		return repository.findById(id).orElse(null);
	}

}
