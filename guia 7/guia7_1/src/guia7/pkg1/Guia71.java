/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.pkg1;

import guia7.pkg1.ejercicios.Libro;
import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class Guia71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("ingrese datos del libro");
        Scanner leer = new Scanner(System.in);
      
        Libro l1 = new Libro();
        System.out.println("Autor");
        l1.autor = leer.next();
        System.out.println("titulo");
        l1.titulo = leer.next();
        System.out.println("isnb");
        l1.isbn = leer.next();
        System.out.println("Numero de pagina");
        l1.numDePag = leer.nextInt();
        
        System.out.println(l1);
    }
    
}
