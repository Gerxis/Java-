/*
 Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. Escriba un programa que 
pida la cantidad de familias y para cada familia 
la cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje14ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ed = new Scanner (System.in);
        int fam;
        int hi , edad, sum = 0 ,  sum2 = 0;
        int cont = 0;
       do {System.out.println("ingrese la cantidad de familias");
       fam = ed.nextInt();
       if (fam < 0) {System.out.println("ingrese un numero mayor a 0");}
       } while ( fam < 1 );
       
 
        
        for (int i = 1; i <= fam; i++) {
            System.out.println("ingrese la cantidad de hijos de :");
            System.out.println("familia " + i);
            hi = ed.nextInt();
            for (int j = 1; j <= hi; j++) {
                System.out.println("edad hijo " + j); 
                edad = ed.nextInt();
                sum = sum + edad ;
                sum2 = sum2 + edad ;
                cont = cont + 1;
                if (j == hi) {System.out.println("promedio edad hijos :" + sum / hi);}
                
            }
            sum = 0;
        }
       
        System.out.println("El promedio de edad entre todoas los hijos de las familias es: " + sum2 / cont );
       
       
       
       
    }
    
}
