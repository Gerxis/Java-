/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al 
usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje5P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Scanner num = new Scanner (System.in);  
        int suma = 0 ;
        int limit ; 
        int sum ;
        
        do {System.out.println("ingrese un numero limite para la suma");
        limit = num.nextInt();
        } while (limit <= 0) ;
        
        do { System.out.println("Ingrese numero para sumar");
         sum = num.nextInt();
         suma = suma + sum ;
        
        } while (suma < limit);
        
        System.out.println("Limite :" + limit);
        System.out.println("Suma :" + suma);
        }
    
}
