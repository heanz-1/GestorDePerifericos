package com.springboot.modelo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.modelo.entity.Categoria;

@Service
public interface CategoriaSerivce {
	List<Categoria> lista();
	Categoria findById(int id);
}
