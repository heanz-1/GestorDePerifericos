package com.springboot.modelo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.modelo.entity.Categoria;
import com.springboot.modelo.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	List<Producto> findByCategoria(Categoria categoria);
}
