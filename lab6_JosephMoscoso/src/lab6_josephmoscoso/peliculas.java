/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_josephmoscoso;

import java.util.ArrayList;

/**
 *
 * @author joseph
 */
public class peliculas {
    private String id;
    private String nombre;
    private String categoria;
    ArrayList idiomas=new ArrayList();
    ArrayList subtitulos=new ArrayList();
    private String duracion;
    private int rating;
    ArrayList Comentarios=new ArrayList();
    private String productora;
    private String director;
    ArrayList actores=new ArrayList();

    public peliculas() {
    }

    public peliculas(String id, String nombre, String categoria, String duracion, int rating, String productora, String director) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.duracion = duracion;
        this.rating = rating;
        this.productora = productora;
        this.director = director;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(ArrayList subtitulos) {
        this.subtitulos = subtitulos;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList getComentarios() {
        return Comentarios;
    }

    public void setComentarios(ArrayList Comentarios) {
        this.Comentarios = Comentarios;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList getActores() {
        return actores;
    }

    public void setActores(ArrayList actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
