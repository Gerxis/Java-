/*
Realizar un algoritmo que calcule la suma de todos los elementos
de un vector de tamaño N, con los valores ingresados por el usuario.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class eje1ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     
        System.out.println("Numeros a ingresar");
        int can = leer.nextInt();
        
        int num [] = new int [can];
        int sum = 0; 
        System.out.println("ingrese los numeros para sumar");
        for (int i = 0; i < num.length; i++) {
            num [i] = leer.nextInt();
           sum += + num[i];
        }
         
        System.out.println("El resultado de la suma es : " + sum );
       
    }
    
}
