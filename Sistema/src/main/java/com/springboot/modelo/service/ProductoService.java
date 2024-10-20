package com.springboot.modelo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.modelo.entity.Categoria;
import com.springboot.modelo.entity.Producto;


@Service
public interface ProductoService {
	List<Producto> lista();
	public void guardar(Producto pro);
	public Optional<Producto>buscarID(int id);
	public void borrar(int id);
	List<Producto> buscarPorCategoria(Categoria categoria);
}
