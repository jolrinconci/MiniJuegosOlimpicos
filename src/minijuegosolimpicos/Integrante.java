/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minijuegosolimpicos;

/**
 * Esta clase nos permite administrar la información de los deportistas.
 * 
 * @author José Luis Rincón y Diana Marcela Molina
 * @version 1.0
 * since 03/09/2016
 */
public class Integrante {
    private String nombre;
    private String apellido;

    public Integrante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
