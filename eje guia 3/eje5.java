/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de 
tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package guia3;
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
      
        
        
        Scanner num = new Scanner (System.in);
        int n = 0;
        int cont = 0 ;
        do {
            System.out.println("ingrese un numero comprendido enre 1 y 20");
            n= num.nextInt();
            cont = cont + 1 ; 
              
            System.out.print(n + " : ");
           
            for (int i = 0; i <= n; i++) {
            System.out.print("*");
            }
            System.out.println(" ");
         } while ( cont < 4 ); 
        
        
        
        
    }
    
}

