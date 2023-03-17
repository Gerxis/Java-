/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado 
y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class eje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     
     int matris [][] = new int [3][3];
     int  suma = 0 , dg = 0, dg2 = 0;
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                matris [i][j] = leer.nextInt();
                suma += matris[i][j];
            }
               dg2 = matris [0][2] + matris [1][1] + matris [0][3] ; 
             
               dg += matris[i][i];
              
        }
        
        
        //System.out.println(suma % 3 + " " + dg +" " + dg2 );
        if (dg == dg2 && suma % 3 == 0){System.out.println("El cubo es magico");}
        else {System.out.println("El cubo no es magico");}
        
        
    }
    
}
