package com.springboot.modelo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.modelo.entity.Categoria;
import com.springboot.modelo.entity.Producto;
import com.springboot.modelo.repository.ProductoRepository;
import com.springboot.modelo.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoRepository repository;
	
	@Override
	public List<Producto> lista() {
		return repository.findAll();
	}

	@Override
	public void guardar(Producto pro) {
		repository.save(pro);
	}

	@Override
	public Optional<Producto> buscarID(int id) {
		return repository.findById(id);
	}

	@Override
	public void borrar(int id) {
		repository.deleteById(id);
	}

	@Override
	public List<Producto> buscarPorCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		return repository.findByCategoria(categoria);
	}
}
