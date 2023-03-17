/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package guia5;

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
       
      
        int vec[] = new int [10]; 
        String cad = "";
      //numeros aleatorios
        for (int i = 0; i < 10; i++) {
            vec[i] = (int) (Math.random()*10+1);
           
            System.out.print(" " + vec[i]);
            
        }
        //numero
        System.out.println(" ");
        System.out.println("ingrese un numero");
        Scanner leer = new Scanner (System.in);
        int num = leer.nextInt();
        
        //buscar y guaradar cordenadas en cadena     
        for (int i = 0; i < vec.length; i++) {
            if (num == vec[i]) {cad += i + " ";}
        }
      
        System.out.println("el numero se encuentra en las pociciones :" + cad );
    }
    
}
