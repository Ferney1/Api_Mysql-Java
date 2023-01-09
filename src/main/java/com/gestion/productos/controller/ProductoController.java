package com.gestion.productos.controller;

import com.gestion.productos.modelo.Producto;
import com.gestion.productos.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ProductoServicio servicio;

    @GetMapping("/products")
    public List<Producto> listarProductos() {
        return servicio.listarProductos();
    }
}
