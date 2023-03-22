/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando,
construya una “sopa de letras para niños�? de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal
en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios 
no utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class eje6exv1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
     String[][] matris = new String [20][20];
     String palabra ,letra;
    int cor ,cor2 ,c = 0; 
          
         //solicitar palabras y colocarlas
         System.out.println("ingrese palabras para la sopa"); 
         for (int i = 0; i < 5; i++) {
            do {
               palabra = leer.next(); if (palabra.length() <  3 || palabra.length() > 5) {System.out.println("Palabras entre 3 y 5 caracteres");} 
            }while (palabra.length() <  3 || palabra.length() > 5);
            
            cor = (int)(Math.random() * 20 + 0);
            cor2 = (int)(Math.random() * 15 + 0);
     
            for (int j = cor2; j < 20; j++) {
                letra = palabra.substring(c,c+1);
               
                matris[cor][j] = letra;
                c = c + 1;   
                if (c == palabra.length()) {c = 0; break;} 
            }}
            
        
    
       //rellenar lo faltante
       int num ;
           for (int i = 0; i < 20; i++) {
               for (int j = 0; j < 20; j++) {
                   num = (int)(Math.random() * 9 + 0);
                 if  (matris[i][j] == null ){matris[i][j] = String.valueOf(num);}
               }}
        
           
           //mostrar matris
           for (int i = 0; i < 20; i++) {
               for (int j = 0; j < 20; j++) {
                   System.out.print( "[" + matris[i][j] +"] ");
             }
               System.out.println(" ");
               }
           
           
    }
    
}
