/*
 Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. Por ejemplo, 
si introducimos el número 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
Nota: recordar que las variables de tipo entero truncan los números o resultados.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje11ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
          int n , div ;
          int cont = 0;
       
          //comprobante
          do {
        System.out.println("ingrese un numero para saver los digitos");
        n = num.nextInt();
        }while (n < 0);
     
          //divicion y conteo de digitos
        do {
          div = n / 10 ;
          n = div;
          cont = cont + 1 ;
        }while (div > 0);
    
        System.out.println("El numero posee " + cont + " digitos" );
    
    }
    
}
