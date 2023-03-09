/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
Incorrecto. Nota: investigar la función equals() en Java.Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto
, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class EjeP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner frace = new Scanner (System.in);
        System.out.println("Ingrese una frace");
       String fra = frace.nextLine();
        
       if ( fra.equalsIgnoreCase("eureka") ) {
         
           System.out.println("Correcto");
       
       }
       else {
           System.out.println("Incorrecto");}
    
    
    
    }
    
}
