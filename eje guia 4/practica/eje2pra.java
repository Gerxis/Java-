/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas 
ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle
al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No�?.
 */
package guia4;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje2pra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        mostrar();
        
    }
    
    public static void mostrar () {
    Scanner leer = new Scanner (System.in);
    
    boolean vali = false ;
    int edad ;
    String nombre;  
    String op , nombre2  ;
    
    
    while (!vali) {
        System.out.println("ingrese el nombre");
        nombre = leer.next();
        
        
        System.out.println("Ingrese la edad");
        edad = leer.nextInt();
        
        
        if (edad >=18) {System.out.println(nombre + " es mayor de edad");} 
        else {System.out.println(nombre + " no es mayor de edad");}
        
        System.out.println(" ");
        System.out.println("�desea continuar s/n?");
        op = leer.next();
        op = op.toLowerCase();
   
                   switch (op){case "s": System.out.println("ok");
                 
                    break;
                    case "n": vali = true; 
                    System.out.println("*************");
                    System.out.println(" Hasta luego "); 
                    System.out.println("*************");
                    break; }
    }               
    
    }
    
}
