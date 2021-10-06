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
public class DispositivosEntrada {
    //ATRIBUTOS
    private String tipoEntrada;
    private String marca;
    //CONSTRUCTOR
    public DispositivosEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }
    //GETTER Y SETTER
    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    //MOSTRAR
    @Override
    public String toString() {
        return  "tipoEntrada=" + tipoEntrada + ", marca=" + marca;
    }
    
    
    
}
