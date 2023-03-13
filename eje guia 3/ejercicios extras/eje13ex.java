/*
Crear un programa que dibuje una escalera de números, donde cada línea de números comience en 
uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123

 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje13ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner num = new Scanner (System.in);
        int tam;
        
        do {
        System.out.println("Ingrese la altura de la escalera");
        tam = num.nextInt(); } while (tam < 1 );
        
        for (int i = 1; i <= tam; i++) { 
            for (int j = 1; j <= i; j++) {
                System.out.print(j);    
            }
            System.out.println(" ");
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
