/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package eje.pkg1.dia.pkg1;
import java.util.Scanner;


/**
 *
 * @author ALEXIS
 */
public class eje2gia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese su nombre");
        Scanner nombre = new Scanner (System.in) ;
        
        String nom ;
        nom = nombre.next();
        
        System.out.println("Su nombre es " + nom);
        
    }
    
}
