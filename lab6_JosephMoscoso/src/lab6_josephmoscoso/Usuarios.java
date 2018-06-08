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
public class Usuarios {
    private String correo;
    private String contraseña;
    private String fecha;
    ArrayList<peliculas> pelis=new ArrayList();
    ArrayList<series> serie=new ArrayList();
    private String tarjeta;

    public Usuarios() {
    }

    public Usuarios(String correo, String contraseña, String fecha, String tarjeta) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.fecha = fecha;
        this.tarjeta = tarjeta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<peliculas> getPelis() {
        return pelis;
    }

    public void setPelis(ArrayList<peliculas> pelis) {
        this.pelis = pelis;
    }

    public ArrayList<series> getSerie() {
        return serie;
    }

    public void setSerie(ArrayList<series> serie) {
        this.serie = serie;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "correo=" + correo + ", contrase\u00f1a=" + contraseña + ", fecha=" + fecha + ", pelis=" + pelis + ", serie=" + serie + ", tarjeta=" + tarjeta + '}';
    }
    
}
