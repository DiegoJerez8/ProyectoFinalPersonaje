package com.example.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.modelo.Personaje;
import com.example.servicio.PersonajeServicio;

@RestController
public class PersonajeControlador {
    @Autowired
    PersonajeServicio servicio;

    
    /**
	 * 
	 * 
	 * @return Lista de todos los personajes
	 */
    @GetMapping(value = "personaje", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Personaje> listarPersonajesActual() {
        return servicio.listaPersonajes();
    }

    /**
	 * 
	 * 
	 * @return Lista de personajes Masculinos
	 */
    @GetMapping(value = "personaje/genero", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Personaje> listarPersonajesGenero() {
        return servicio.listaPersonajesPorGenero();
    }

     /**
	 * 
	 * @param
	 * @return Lista de personajes por juego
	 */
    @GetMapping(value = "personaje/juego", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Personaje> listarPersonajesJuego() {
        return servicio.listaPersonajesPorJuego();
    }

     /**
	 * 
	 * @param personaje
	 * @return void
	 */
    @PostMapping(value = "personaje", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void nuevoPersonaje(@RequestBody Personaje personaje) {
        servicio.nuevoPersonaje(personaje);
    }

      /**
	 * 
	 * @param idpersonaje
	 * @return List<Personaje>
	 */
	@DeleteMapping(value = "personaje/{idpersonaje}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Personaje> borrarPersonaje(@PathVariable("idpersonaje") int idpersonaje) {
		return servicio.eliminarPersonaje(idpersonaje);
	}

}
