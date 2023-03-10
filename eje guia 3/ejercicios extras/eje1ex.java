/*
Dado un tiempo en minutos, calcular su equivalente en días y horas.
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje1ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner min = new Scanner (System.in);
      int m ;
      do {
        System.out.println("ingrese una cantidad X de minutos para calcular");
        m = min.nextInt();
        if ( m < 0) {System.out.println("ingrese un numero positivo");}
      }while (m < 0);
      
     
      
      
        System.out.println("el equibalente en horas es = " + m / 60 + " Horas");
        System.out.println("el equibalente en Dias es = " + m / 1440 + " dias");
    }
    
}
