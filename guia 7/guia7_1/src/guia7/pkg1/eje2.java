/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.pkg1;

import guia7.pkg1.ejercicios.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        Circunferencia c1 = new Circunferencia();
        
        System.out.println("ingrese el radio");
        c1.crearCircunfer(leer.nextDouble());
        
        System.out.println("area");
        System.out.println(c1.area(c1.getRadio()));
        System.out.println("perimetro");
        System.out.println(c1.perimetro(c1.getRadio()));
        System.out.println("radio");
        System.out.println(c1.getRadio());
        
    }
    
}
