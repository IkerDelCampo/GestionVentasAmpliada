/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.domain;

/**
 *
 * @author Alumno Mañana
 */
public class Orden {
    private int idOrden;
    private Computador[] computadoras;
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private final int maxComputadoras=5;
    //CONSTRUCTOR

    public Orden() {
        contadorComputadoras=0;
        this.idOrden=++contadorOrdenes;
        computadoras= new Computador[maxComputadoras];//es necesario declarar el tamaño de nuestro array computadoras
    }
    //METODOS
    public void agregarComputadora(Computador computadora){
        if(contadorComputadoras < maxComputadoras){
            System.out.println("Añadido PC "+(contadorComputadoras+1));
            computadoras[contadorComputadoras++] = computadora;//no creo entender esto del todo bien 
        }else{System.out.println("Alcanzado el número maximo de computadoras: [MAX_5] PC ["+(contadorComputadoras+1)+"] y posteriores NO AÑADIDOS");}
    }
    //MOSTAR
    public void mostarOrden(){
        for(int i=0; i <contadorComputadoras; i++){
            System.out.println("El ID del PC ["+(i+1)+"] es ->"+computadoras[i].getIdComputador());
            System.out.println("El Nombre del PC ["+(i+1)+"] es ->"+computadoras[i].getNombre());
            System.out.println("El Monitor es ["+(i+1)+"] es ->"+computadoras[i].getMonitor());
            System.out.println("El Raton es ["+(i+1)+"] es ->"+computadoras[i].getRaton());
            System.out.println("El Teclado es ["+(i+1)+"] es ->"+computadoras[i].getTeclado());
            System.out.println("");
        }
        System.out.println("\tGracias por usar la aplicación");
    }
    
}
