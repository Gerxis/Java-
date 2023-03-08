/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package eje.pkg1.dia.pkg1;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje5guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num =new Scanner (System.in);
        
        System.out.println("Ingrese un numero");
        
        int n = num.nextInt();
        
        System.out.println("El doble del numero es :" + n * 2);
        System.out.println("El triple del numero es :" + n * 3);
        System.out.println("la raiz cuadrada del numero es : " + Math.sqrt(n) );
    }
    
}
