/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje8P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner num = new Scanner (System.in);
       int tam ;
       
       do { System.out.println("Ingrese el tamaño");
          tam = num.nextInt();
            } while (tam <= 0 );
     
        for (int j = 1; j <= tam; j++) {
       
        for (int i = 1; i <= tam; i++) {
           
            if (i == tam || i == 1 || j == 1 || j == tam) {
                System.out.print("*");}
              else {System.out.print(" ");}
            
           
        
        
        } 
            System.out.println(" ");  
    }
    }
    
}
