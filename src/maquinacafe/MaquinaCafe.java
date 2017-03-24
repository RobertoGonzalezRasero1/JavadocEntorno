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
public class MaquinaCafe {

    /**
     * @param args the command line arguments
     * Instanciamos objetos de las clases que se requieren y se usa un menu para ejecutar la accion requerida
     */
    public static void main(String[] args) {
        Dinero D = new Dinero();
        Azucar A = new Azucar();
        Cafe C = new Cafe();
        Te T = new Te();
        Display Dis = new Display();
        int elegir;
        do{
            elegir = Integer.parseInt(JOptionPane.showInputDialog(" 1.Introduce moneda \n 2.Cafe\n"+"3 Te\n"+" 4 seleccione cantidad de azúcar "+"\n 5.elaborar producto "+"\n 6.Terminar "));
            
        switch(elegir){
            case 1: D.IntroducirDinero();
            break;
            case 2: C.eleccionCafe();
            break;
            case 3: T.eleccionTe();
            break;
            case 4: A.ajusteAzucar();
            break;
            case 5: Dis.EstadoProducto();
                break;
            case 6:
                System.exit(0);
            break;
        }   
           
       }while(elegir!=6);
    }
    
}
