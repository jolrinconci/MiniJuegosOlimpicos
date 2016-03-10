/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minijuegosolimpicos;

/**
 * Esta clase administra un mini juego olímpico, donde hay diferentes delegaciones 
 * y dentro de estas están discriminados los deportistas por grupos de deportes.
 * Nos permite saber si qué delegaciones juegan un determinado deporte.
 * 
 * @author José Luis Rincón y Diana Marcela Molina
 * @version 1.0
 * since 03/09/2016
 */
public class MiniJuegosOlimpicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        Delegacion[] delegaciones = new Delegacion[10];
        //Grupo[] grupos = new Grupo[5];
        //Integrante[] integrantes = new Integrante[10];
        
        boolean salida = false;
        int numDelegaciones=0;
        while(!salida){
            System.out.println("Ingrese la cantidad de delegaciones a registrar, máximo 10:");
            numDelegaciones=lectura.nextInt();
            if(numDelegaciones>0 && numDelegaciones<11){
                salida=true;
            }else{
                System.out.println("No ha seleccionado una opción válida");
            }
        }
        for(int i=0; i<numDelegaciones; i++){
            Grupo[] grupos = new Grupo[5];
            System.out.print("País de la nueva delegación: ");
            String pais = lectura.next();
            /*System.out.print("Número de deportistas: ");
            int numDeportistas = lectura.nextInt();*/
            for(int j=0; j<5; j++){
                Integrante[] integrantes = new Integrante[10];
                System.out.println("Deporte del grupo número "+(j+1)+":");
                String deporte = lectura.next();
                int numIntegrantes=0;
                salida=false;
                while(!salida){
                    System.out.println("Ingrese la cantidad de integrantes, entre 2 y 10:");
                    numIntegrantes=lectura.nextInt();
                    if(numIntegrantes>1 && numIntegrantes<11){
                        salida=true;
                    }else{
                        System.out.println("No ha seleccionado una opción válida");
                    }
                }
                for(int k=0; k<numIntegrantes; k++){
                    System.out.print("Nombre: ");
                    String nombre = lectura.next();
                    System.out.print("Apellido: ");
                    String apellido = lectura.next();
                    integrantes[k] = new Integrante(nombre,apellido);
                }
                grupos[j] = new Grupo(deporte,numIntegrantes,integrantes);
            }
            delegaciones[i] = new Delegacion(pais,0,0,0,grupos);
        }
        System.out.println("Ingrese el deporte a buscar:");
        String deportes = lectura.next();
        for(int l=0; l<numDelegaciones; l++){
            for(int m=0; m<5; m++){
                if(deportes.equalsIgnoreCase(delegaciones[l].getGrupos()[m].getNombreDeporte())){
                    System.out.println("-------------------------------------");
                    System.out.println("Delegación: "+delegaciones[l].getPais());
                    System.out.println("Número de deportistas: "+delegaciones[l].numeroDeportistas());
                    System.out.println("Medallas de oro: "+delegaciones[l].getNumMedallasOro());
                    System.out.println("Medallas de plata: "+delegaciones[l].getNumMedallasPlata());
                    System.out.println("Medallas de Bronce: "+delegaciones[l].getNumMedallasBronce());
                    System.out.println("Total medallas: "+delegaciones[l].totalMedallas());
                    System.out.println("Deporte del grupo: "+delegaciones[l].getGrupos()[m].getNombreDeporte());
                    System.out.println("Número de integrantes del grupo: "+delegaciones[l].getGrupos()[m].getNumIntegrantes());
                    for(int n=0; n<delegaciones[l].getGrupos()[m].getNumIntegrantes(); n++){
                        System.out.println("Integrante: " + delegaciones[l].getGrupos()[m].getIntegrantes()[n].getNombre()+" "+
                                delegaciones[l].getGrupos()[m].getIntegrantes()[n].getApellido());
                    }
                    System.out.println("-------------------------------------");
                }
            }
        }
    }
    
}
