/*
 Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, 
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/

package guia4;

import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class eje3pra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in) ;
        double eu ;
        
        
        do{
        System.out.println("Ingrese la cantidad de euros");
        eu = leer.nextDouble();
        if (eu < 1 ){System.out.println("ingrese una cantidad mayor a 0");}
        } while (eu < 1);
        
        boolean vali = false ;
        
        while (!vali) {
            System.out.println("|--------------|");
            System.out.println("|  Cambiar A : |");
            System.out.println("|  1. Dolar    |");
            System.out.println("|  2. libra    |");
            System.out.println("|  3. Yenes    |");
            System.out.println("|  4. Ing monto|");
            System.out.println("|  5. Salir    |");
            System.out.println("|--------------|");
            
            int op = leer.nextInt();
            switch (op) {
                case 1: System.out.println("Cambio euro dolar = " + cambio(eu , op));
                break;
                case 2: System.out.println("Cambio euro libra = " + cambio(eu , op));
                break;
                case 3 :System.out.println("Cambio euro yenes = " + cambio(eu , op));
                break;
                case 4 :  eu = leer.nextDouble();
                break ;
                case 5 : vali = true ;
                break;
                default:System.out.println("las opciones son entre 1 y 5");
            }
        }
    }
    
    public static double cambio(double eu , int op) {
        double cam = 0;
         
        switch (op) {
                case 1: cam = eu * 1.28611;
                break;
                case 2: cam =  eu * 0.86 ;
                break;
                case 3: cam = eu * 129.852 ;
                break; }
    
        return cam;
    
    }
    
    

    
    
    
}  
            
    
