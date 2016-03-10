/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minijuegosolimpicos;

/**
 * Esta clase guardar y modificar información de una delegación, como lo es el número total
 * de deportistas y la cantidad de medallas.
 * 
 * @author José Luis Rincón y Diana Marcela Molina
 * @version 1.0
 * since 03/09/2016
 */
public class Delegacion {
    private String pais;
    //private int numDeportistas;
    private int numMedallasOro;
    private int numMedallasPlata;
    private int numMedallasBronce;
    private Grupo grupos[];

    public Delegacion(String pais, int numMedallasOro, int numMedallasPlata, int numMedallasBronce, Grupo[] grupos) {
        this.pais = pais;
        //this.numDeportistas = numDeportistas;
        this.numMedallasOro = numMedallasOro;
        this.numMedallasPlata = numMedallasPlata;
        this.numMedallasBronce = numMedallasBronce;
        this.grupos = grupos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    /*public int getNumDeportistas() {
        return numDeportistas;
    }

    public void setNumDeportistas(int numDeportistas) {
        this.numDeportistas = numDeportistas;
    }*/

    public int getNumMedallasOro() {
        return numMedallasOro;
    }

    public void setNumMedallasOro(int numMedallasOro) {
        this.numMedallasOro = numMedallasOro;
    }

    public int getNumMedallasPlata() {
        return numMedallasPlata;
    }

    public void setNumMedallasPlata(int numMedallasPlata) {
        this.numMedallasPlata = numMedallasPlata;
    }

    public int getNumMedallasBronce() {
        return numMedallasBronce;
    }

    public void setNumMedallasBronce(int numMedallasBronce) {
        this.numMedallasBronce = numMedallasBronce;
    }

    public Grupo[] getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupo[] grupos) {
        this.grupos = grupos;
    }
    
    public int totalMedallas(){
        int a = this.numMedallasOro;
        int b = this.numMedallasPlata;
        int c = this.numMedallasBronce;
        return a+b+c;
    }
    public int numeroDeportistas(){
        int contador = 0;
        for(int i=0; i<5; i++){
            contador=contador + grupos[i].getNumIntegrantes();
        }
        return contador;
    }
}
