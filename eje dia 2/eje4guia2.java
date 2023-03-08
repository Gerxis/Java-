/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package eje.pkg1.dia.pkg1;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje4guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner grados = new Scanner (System.in);
        
        System.out.println("ingrese un cantidad de grados ");
        
        double gra = grados.nextInt();
        double fah = 32 + (9 * gra / 5);
        
        System.out.println("La cantidad de grados Fahreint es :" + fah);
        
    }
    
}
