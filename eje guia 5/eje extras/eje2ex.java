/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class eje2ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    
     int vec [] = new int [4];
     int vec2 [] = new int [4];
     int cont = 0 ;
      
     System.out.println("ingresa los valores de el primer vector");
     for (int i = 0; i < vec.length; i++) {
            vec[i] = leer.nextInt();
        }
     
     System.out.println("ingresa los valores de el segundo  vector");
     for (int i = 0; i < vec2.length; i++) {
            vec2[i] = leer.nextInt();
        }
   
     for (int i = 0; i < vec.length; i++) {
           
         if (vec[i] == vec2[i]) {cont += + 1;} else { System.out.println("los vectores no son iguales"); break;}
        }
       
         if (cont == 4) {System.out.println("Los vectores son iguales");}
    }
    
}
