/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad 
de números leídos, la cantidad de números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje8ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner num = new Scanner (System.in);
        boolean vali = false ;
        int cont =  0 , n ;
        int par = 0 , imp = 0;
        
        
        System.out.println("Ingrese numeros");
        
        while (!vali) { 
            n = num.nextInt();
            cont = cont + 1;
            if (n % 2 == 0 )  { par = par + 1;}
            else {imp = imp + 1;}
            if ( n % 5 == 0) { break ;} 
       }
        
        System.out.println("numero impares : " + imp);
        System.out.println("numeros pares : " + par);
        System.out.println("Total de numeros : " + cont );
        
    }
    
}
