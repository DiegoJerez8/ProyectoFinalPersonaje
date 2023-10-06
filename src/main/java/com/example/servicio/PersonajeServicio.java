package com.example.servicio;

import java.util.List;

import com.example.modelo.Personaje;

public interface PersonajeServicio {

	/**
	 * acciones que quiero que realice , la implementacion se realizará en
	 * PersonajeServicioImpl.java
	 * 
	 * 
	 */
	List<Personaje> listaPersonajes();
	void nuevoPersonaje(Personaje personaje);
	List<Personaje> listaPersonajesPorJuego();
	List<Personaje> listaPersonajesPorGenero();
	List<Personaje> eliminarPersonaje(int idpersonaje);
}
