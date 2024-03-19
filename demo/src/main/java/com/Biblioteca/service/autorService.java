package com.Biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Biblioteca.model.AutorEntity;
import com.Biblioteca.repository.AutorRepositorio;

@Service
public class autorService {
    private final AutorRepositorio autorRepositorio;

    @Autowired
    public autorService(AutorRepositorio autorRepositorio) {
        this.autorRepositorio = autorRepositorio;
    }

    public List<AutorEntity> obtenerTodosLosAutores() {
        return autorRepositorio.findAll();
    }
    
    public List<Object[]> buscarPorNombre(String nombre){
    	return autorRepositorio.buscarPorNombre(nombre);
    }
    
    public List<Object[]> conseguirNombres(){
    	return autorRepositorio.nombresAutor();
    }
    
    public List<Object[]> sacarNomrbes() {
    	return autorRepositorio.ListaNombres();
    }
    public List<Object[]> buscarPorNacionalidad(String nacionalidad){
    	return autorRepositorio.buscarPorNacionalidad(nacionalidad);
    }
    public List<Object[]> ObtenerNacionalidades(){
    	return autorRepositorio.ObtenerNacionalidades();
    }
    public AutorEntity guardarAutor(AutorEntity autor) {
    	return autorRepositorio.save(autor);
    }

}
