/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’,
se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje4P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner le = new Scanner (System.in);
        
        System.out.println("Ingrese una frace");
        
        String frace = le.nextLine();
        
      //  char letra = frace.charAt(0);
       // String letra = frace.substring(0 , 1);
        
       // if ( letra == 'a' ) 
       if (frace.substring(0 , 1).equals("a")  )
       {
           
            System.out.println("Correcto");
        
        } else {System.out.println("Incorrecto");}
         
    }
    
}
