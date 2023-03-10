/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje4ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner num = new Scanner (System.in);
       int nu;
       do {
           System.out.println("ingrese un numero entre 1 y 10");
          
       nu = num.nextInt(); } while (nu < 1 );
       
       if (nu < 4 && nu > 0) {
           for (int i = 1; i <= nu; i++) {
               System.out.print("I");
           }System.out.println(" ");}
       else if (nu == 4) {System.out.println("IV");}
       else if (nu == 5) {System.out.println("V");}
       else if (nu > 5 && nu < 9){
             System.out.print("V");
           for (int i = 1; i <= nu - 5; i++) {
               System.out.print("I");
           }System.out.println(" ");}
       else if (nu == 9 ) {System.out.println("IX");}
       else if (nu == 10) {System.out.println("X");}
    }
    
}
