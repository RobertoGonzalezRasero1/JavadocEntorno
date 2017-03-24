/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;

import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class Dinero {
    /**
     * Se introduce el dinero del producto
     */
    public void IntroducirDinero(){
        int dinero;
        dinero = Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de dinero"));
    }
}
