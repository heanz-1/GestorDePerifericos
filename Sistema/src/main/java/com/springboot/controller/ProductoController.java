package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.modelo.entity.Categoria; // Asegúrate de importar la entidad Categoria
import com.springboot.modelo.entity.Producto;
import com.springboot.modelo.service.CategoriaSerivce; // Corrige el nombre de la clase de servicio
import com.springboot.modelo.service.ProductoService;

@Controller
public class ProductoController {
    @Autowired
    private ProductoService service;

    @Autowired
    private CategoriaSerivce categoriaService;

    @GetMapping("/listadoPro")
    public String listado(Model modelo) {
        List<Producto> lista = service.lista();
        lista.removeIf(pro -> pro.getCategoria() == null);

        modelo.addAttribute("listaProducto", lista);
        modelo.addAttribute("categoria", categoriaService.lista());
        modelo.addAttribute("producto", new Producto());
        return "Producto";
    }

    @PostMapping("/guardarPro")
    public String guardar(Producto pro) {
        service.guardar(pro);
        return "redirect:/listadoPro";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") int id, Model modelo) {
        Optional<Producto> productoOptional = service.buscarID(id);
        if (productoOptional.isPresent()) {
            modelo.addAttribute("producto", productoOptional.get());
        } else {
            modelo.addAttribute("error", "Producto no encontrado");
        }
        List<Producto> lista = service.lista();
        lista.removeIf(pro -> pro.getCategoria() == null);

        modelo.addAttribute("listaProducto", lista);
        modelo.addAttribute("categoria", categoriaService.lista());
        return "Producto";
    }

    @GetMapping("/borrar/{id}")
    public String borrar(@PathVariable("id") int id) {
        Optional<Producto> productoOptional = service.buscarID(id);
        if (productoOptional.isPresent()) {
            service.borrar(id);
        }
        return "redirect:/listadoPro";
    }

    @GetMapping("/buscar")
    public String buscarPorCategoria(@RequestParam("categoriaId") int categoriaId, Model model) {
        Categoria categoria = categoriaService.findById(categoriaId);
        if (categoria != null) {
            List<Producto> productos = service.buscarPorCategoria(categoria);
            model.addAttribute("listaProducto", productos);
            model.addAttribute("producto", new Producto());
        } else {
            model.addAttribute("error", "Categoría no encontrada.");
        }
        model.addAttribute("categoria", categoriaService.lista());
        return "Producto"; 
    }

}
