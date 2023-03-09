/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Ingrese la nota");
        
        Scanner nota = new Scanner (System.in);
           
        int not = 100;
         
        
        while (not < 0 || not > 10) {
            not = nota.nextInt();
            if (not < 0 || not > 10) {
                System.out.println("La nota no es correcta ");
                System.out.println("Ingrese la nota nuevamente");
                not = nota.nextInt();
            }
            else { System.out.println("La nota es :" + not);
                        }
            }
        
        }
        
        
        
    }
    

