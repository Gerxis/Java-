/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package eje.pkg1.dia.pkg1;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje3guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nom = new Scanner (System.in);
        
        System.out.println("Hola ,ingresa tu nombre ");
        
        String nombre;
        nombre = nom.next();
        System.out.println("Nombre en minusculas es :" + nombre.toLowerCase() );
        System.out.println("Nombre en mayusculas es :" + nombre.toUpperCase());
        
    }
    
}
