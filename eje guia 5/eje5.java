/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz 
A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, 
A es antisimétrica si A = -AT. La matriz traspuesta 
de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      
      int matris [][] = new int [3][3];
        int matris2 [][] = new int [3][3];
        int op;
        int cont = 0 ;
     
        do {
      System.out.println("Que desea realizar");
        System.out.println("|---------------------------|");
        System.out.println("|1. rellenar matris         |");
        System.out.println("|2. rellenar automaticamente|");
        System.out.println("|---------------------------|");
        op = leer.nextInt(); } while (op <1 || op >2) ;
        
      switch (op){ case 1: 

          for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matris[i][j] = leer.nextInt();
            }
        }
           break;
      case 2:    
          for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matris[i][j] = (int) (Math.random()* 10 + -5);
            }
        }
      break;
      
      } //fin Swich
    
      String aux;
        for (int[] fila : matris) {
            aux = "";
                    
            for (int elemento : fila){
            aux += "[" +elemento+"]" ;
            }
                    
            System.out.println(aux);
        }
         // forma 1 de mostra matris trnspuesta
        /* System.out.println(" ");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print("["+matris[j][i]+"]");
            }
            System.out.println(" ");
        }*/
        
        //forma 2 de mostrar matris trampuesta
          for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
              matris2[i][j] = matris[j][i];
              if (matris2[i][j] == matris[j][i]) {cont += 1;};
            }
           
        }
          //MTP
          System.out.println(" ");
            for (int[] fila : matris2) {
            aux = "";
                    
            for (int elemento : fila){
            aux += "[" +elemento+"]" ;
            }
                    
            System.out.println(aux);
        }
            
         
            if (cont == 9 ){System.out.println("la matris es antisimétrica");}
            else {System.out.println("la matris no es antisimétrica");}
            
        }
    
    }
    

