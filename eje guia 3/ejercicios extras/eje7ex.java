/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). El valor de n se
solicitará al principio del programa y los números serán 
introducidos por el usuario. Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje7ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner num = new Scanner (System.in);
        int n , max = 0 , min = 10000000;
        int cont = 0 , in , l ,suma = 0;
        
        
        do {System.out.println("cuantos numero desea ingresar");
          n = num.nextInt();
        } while ( n < 0 );
        
       //Vercion do while
        
        /* do { System.out.println("Ingrese los numeros");
            in = num.nextInt();
            cont = cont + 1;
            if (max < in ) { max = in; } 
            if (min > in) {min = in;}
            suma = suma + in ;
            
         } while (cont < n);
        
        System.out.println("El numero maximo ingresado fue el : " + max );
        System.out.println("El numero minimo ingresado fue el : " + min );
        System.out.println("El promedio de los numeros es : " + suma / n);*/
       
       
      // Vercion while 
    
      boolean vali = false ;
      
     
      while (!vali) { System.out.println("Ingrese los numeros ");
        in = num.nextInt();
        cont = cont + 1;
            if (max < in ) { max = in; } 
            if (min > in) {min = in;}
            suma = suma + in ;
            if (cont == n) { vali = true ;}
      
      }
      
         System.out.println("El numero maximo ingresado fue el : " + max );
        System.out.println("El numero minimo ingresado fue el : " + min );
        System.out.println("El promedio de los numeros es : " + suma / n);
    
    
    
    
    
    
    
    
    
    }
    
}
