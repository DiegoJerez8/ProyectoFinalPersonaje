package com.example.servicio;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.modelo.Personaje;
import com.example.dao.PersonajeDao;
import com.example.dto.VideoJuegoDto;

@Service
public class PersonajeServicioImpl implements PersonajeServicio {
    @Autowired
    PersonajeDao dao;

    @Autowired
    RestTemplate template;

    String url = "http://localhost:3333/videojuego";

     /**
	 * 
	 * 
	 * @return Lista de todos los personajes
	 */
    @Override
    public List<Personaje> listaPersonajes() {
        return dao.findAll();
    }


     /**
	 * 
	 * @param personaje
	 * @return Lista de todos los personajes
	 */
    @Override
    public void nuevoPersonaje(Personaje personaje) {
       
        List<VideoJuegoDto> videoJuegoDtos = Arrays.asList(template.getForObject(url, VideoJuegoDto[].class));

        for (VideoJuegoDto videoJuego : videoJuegoDtos) {
            if (personaje.getIdvideojuego() == videoJuego.getIdvideojuego()) {
                dao.save(personaje);
            }

        }
    }

     /**
	 * 
	 * 
	 * @return Lista de todos los personajes ordenados por id de videojuego
	 */
    @Override
    public List<Personaje> listaPersonajesPorJuego() {

        return dao.listaPersonajesPorJuego();
    }

    
     /**
	 * 
	 * 
	 * @return Lista de personajes masculinos
	 */
    @Override
    public List<Personaje> listaPersonajesPorGenero() {

        return dao.listaPersonajesPorGenero();
    }

    /**
     * 
     * @param idpersonaje
     * @return List<Personaje>
     */

    @Override
    public List<Personaje> eliminarPersonaje(int idpersonaje) {

        List<Personaje> todosPersonajes = listaPersonajes();
        dao.deleteById(idpersonaje);
       
        return dao.findAll();
    }

}
