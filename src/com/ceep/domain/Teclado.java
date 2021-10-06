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
public class Teclado extends DispositivosEntrada{
    //ATRIBUTOS
    private int idTeclado;
    private static int contadorTeclados;
    //CONSTRUCTOR
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado=++contadorTeclados;
    }
    //MOSTRAR

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + " " + super.toString()+'}';
    }

    
}
