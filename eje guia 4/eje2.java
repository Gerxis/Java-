/*
 Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer número múltiplo del
segundo e imprima si el primer número es múltiplo del segundo, sino informe que no lo son.
 */
package guia4;

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
  
        Scanner leer = new Scanner (System.in);
        
        System.out.println("ingrese los numero");
        int num = leer.nextInt();
        int num2 = leer.nextInt();
        
        multiplo(num, num2);
        
        
    }
    
    public static void multiplo(int num ,int num2) {
    
    if (num % num2 == 0) {System.out.println("El plimer numero es multiplo del segundo");}
    else {System.out.println("el primer numero no es multiplo del segundo");}
    
    }
    
}
