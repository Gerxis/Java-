/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class eje4pra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
 
     int num ;   
    
     do {
     System.out.println("ingrese un numero");
     num = leer.nextInt();
     if (num < 1){System.out.println("ingrese un numero mayor a 0");}
    } while (num < 1 );   
     
        System.out.println("¿El numero es primo?");
        System.out.println( primo(num));
    }
    
    
    //funcion 
    public static boolean primo(int num){
    boolean vali = false;
    int cont = 0 ;
  
    
        for (int i = 2; i <= num -1; i++) {
            if (num % i == 0 ){ cont = cont + 1 ;vali = false;}
            
            if (cont == 0) {vali = true;}
            
        }
        //condicion para 2 
        if (num == 2) {vali = true;}
    
    
    return vali;
    }
    
}
