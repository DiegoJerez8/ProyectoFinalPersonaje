package com.example.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "personaje")
public class Personaje {

    /*
     * variables
     */
    @Id
    private int idpersonaje;
    private String nombrepersonaje;
    private String genero;
    private int edad;
    private int idvideojuego;

    /*
     * Constructor vacio y con todos los parametros
     */

    public Personaje() {
    }

    public Personaje(int idpersonaje, String nombrepersonaje, String genero, int edad, int idvideojuego) {
        this.idpersonaje = idpersonaje;
        this.nombrepersonaje = nombrepersonaje;
        this.genero = genero;
        this.edad = edad;
        this.idvideojuego = idvideojuego;
    }

    /*
     * Encapsulamiento
     */
    public int getIdpersonaje() {
        return idpersonaje;
    }

    public void setIdpersonaje(int idpersonaje) {
        this.idpersonaje = idpersonaje;
    }

    public String getNombrepersonaje() {
        return nombrepersonaje;
    }

    public void setNombrepersonaje(String nombrepersonaje) {
        this.nombrepersonaje = nombrepersonaje;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdvideojuego() {
        return idvideojuego;
    }

    public void setIdvideojuego(int idvideojuego) {
        this.idvideojuego = idvideojuego;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idpersonaje;
        result = prime * result + ((nombrepersonaje == null) ? 0 : nombrepersonaje.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + edad;
        result = prime * result + idvideojuego;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personaje other = (Personaje) obj;
        if (idpersonaje != other.idpersonaje)
            return false;
        if (nombrepersonaje == null) {
            if (other.nombrepersonaje != null)
                return false;
        } else if (!nombrepersonaje.equals(other.nombrepersonaje))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (edad != other.edad)
            return false;
        if (idvideojuego != other.idvideojuego)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Personaje [idpersonaje=" + idpersonaje + ", nombrepersonaje=" + nombrepersonaje + ", genero=" + genero
                + ", edad=" + edad + ", idvideojuego=" + idvideojuego + "]";
    }

}
