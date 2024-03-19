package com.Biblioteca.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Biblioteca.model.AutorEntity;
import com.Biblioteca.service.autorService;

@RestController
@RequestMapping("/Libreria")
public class Controlador {

	@Autowired
	private autorService servicioAutor;

	@GetMapping("/autores")
	public List<AutorEntity> obtenerTodosLosAutores() {
	    System.out.println("Ingresó al método obtenerTodosLosAutores");
	    
	    List<AutorEntity> autores = servicioAutor.obtenerTodosLosAutores();
	    System.out.println(autores);
	    
	    return autores;
	}
	
	@GetMapping("/buscarPorNombre")
	public List<Object[]> obtenerDatosPorNombre(@RequestParam("nombre") String nombre){
		List<Object[]> datos = servicioAutor.buscarPorNombre(nombre);
		return datos;
	}


}
