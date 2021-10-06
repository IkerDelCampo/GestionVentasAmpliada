/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.mipc;

import com.ceep.domain.*;

/**
 *
 * @author Alumno Mañana
 */
public class Test {
    public static void main(String[] args) {
        Teclado T1 = new Teclado("USB", "Logitec");
        Raton R1 = new Raton("USB", "Logitec");
        Monitor M1 = new Monitor("Hp", 1080);
        Computador C1 = new Computador("PC1", M1, T1, R1); 
        Computador C2 = new Computador("PC2", M1, T1, R1); 
        Computador C3 = new Computador("PC3", M1, T1, R1); 
        Computador C4 = new Computador("PC4", M1, T1, R1);
        Computador C5 = new Computador("PC5", M1, T1, R1); 
        Computador C6 = new Computador("PC6", M1, T1, R1);
        Computador C7 = new Computador("PC7", M1, T1, R1);
        Orden O1 = new Orden();
        //Agregando los pcs
        System.out.println("Agregamos PCs");
        O1.agregarComputadora(C1);
        O1.agregarComputadora(C2);
        O1.agregarComputadora(C3);
        O1.agregarComputadora(C4);
        O1.agregarComputadora(C5);
        O1.agregarComputadora(C6);
        O1.agregarComputadora(C7);
        //Lo mostramos
        System.out.println("\nMostramos el contenido de la Orden");
        O1.mostarOrden();
    }
}
