/*
Crear un programa que dado un número determine si es par o impar.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.println("ingrese un numero entero");
        
        Scanner n = new Scanner (System.in);
        
        int num = n.nextInt();
        
        if ( num % 2 == 0 ) {
           
            System.out.println("El numero es par");
         }
        else {
            System.out.println("El numero es impar");}
    }
    
}
