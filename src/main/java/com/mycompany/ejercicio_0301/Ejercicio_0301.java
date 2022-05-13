/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_0301;

/**
 *
 * @author PCG
 */
public class Ejercicio_0301 {

    public static void main(String[] args) {
        var ventana1= new Ventana1("Panel_BorderLayout");
        ventana1.setVisible(true);
        var ventana2= new Ventana2("Panel_GridLayout");
        ventana2.setVisible(true);
        var ventana3= new Ventana3("Panel_FlowLayout");
        ventana3.setVisible(true);
        var ventana4=new Ventana4("Panel_Bandera");
        ventana4.setVisible(true);
    }
}
