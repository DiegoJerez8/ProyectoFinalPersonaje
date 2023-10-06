package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.modelo.Personaje;


public interface PersonajeDao extends JpaRepository<Personaje, Integer> {
  
    /*
     * Selecciona todos los datos de personaje por Orden de ID de su videojuego
     */
    @Query("SELECT p FROM Personaje p WHERE p.idvideojuego IS NOT NULL ORDER BY p.idvideojuego")
    List<Personaje> listaPersonajesPorJuego();

      /*
     * Selecciona todos los datos de los personajes masculinos
     */
    @Query("SELECT p FROM Personaje p WHERE p.genero = 'Masculino'")
    List<Personaje> listaPersonajesPorGenero();

}

