/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado 
de la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner num = new Scanner (System.in);
        int ne;
        int cont = 0;
        int suma = 0;
        
        do { 
            System.out.println("Ingrese un numero");
        ne = num.nextInt(); 
        cont = cont + 1;
        
        if (ne > 0) {
            suma = suma + ne ;
        } 
        
        } while (ne != 0 || cont > 20); 
    
       if  (suma > 0 ) {
           System.out.println("La suma de los numero es : " + suma );
       
       }
    
    
    }
        
     
       
  
        }
    

