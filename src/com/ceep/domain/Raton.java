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
public class Raton extends DispositivosEntrada{
    //ATRIBUTOS
    private int idRaton;
    private static int contadorRatones;
    //CONSTRUCTOR
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton=++Raton.contadorRatones;
    }
    //MOSTAR
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + " " + super.toString()+'}';//Para mostrar tambien el toString de la clase padre
    }

}
