/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minijuegosolimpicos;

/**
 * Esta clase nos permite guardar información de un grupo de deportistas que 
 * practican un mismo deporte en una delegación.
 * 
 * @author José Luis Rincón y Diana Marcela Molina
 * @version 1.0
 * since 03/09/2016
 */
public class Grupo {
    private String nombreDeporte;
    private int numIntegrantes;
    private Integrante integrantes[];

    public Grupo(String nombreDeporte, int numIntegrantes, Integrante[] integrantes) {
        this.nombreDeporte = nombreDeporte;
        this.numIntegrantes = numIntegrantes;
        this.integrantes = integrantes;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public int getNumIntegrantes() {
        return numIntegrantes;
    }

    public void setNumIntegrantes(int numIntegrantes) {
        this.numIntegrantes = numIntegrantes;
    }

    public Integrante[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrante[] integrantes) {
        this.integrantes = integrantes;
    }
    

}
