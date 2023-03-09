/*
Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("Ingrese dos numeros");
        
        Scanner num = new Scanner (System.in);
        
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        
        
        if (num1 >= 25 && num2 >= 25 ) {
            System.out.println( "Ambos numero son mayor o iguales  a 25");
        }
            else if (num2 >=25 ) {
            System.out.println("El segundo numero es mayor a 25");
                    }
            else if (num1 >= 25) {
                System.out.println("EL primer numero es mayot a 25");
            }
            else {
            System.out.println("Los numeros no son mayores o iguales que 25");}
        }
    }
    

