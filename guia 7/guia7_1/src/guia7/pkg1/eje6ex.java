/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.pkg1;

import guia7.pkg1.ejercicios.Empleado;
import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class eje6ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        Empleado e1 = new Empleado ();
        System.out.println("ingrese el nombre del empleado");
        e1.setNombre(leer.nextLine());
        System.out.println("ingrese la edad del empleado");
        e1.setEdad(leer.nextInt());
        System.out.println("ingrese el salario");
        e1.setSalario(leer.nextDouble());
        
        System.out.println("el sueldo mas  aumento para el empleado + " + e1.getNombre() + " es de " + e1.aumentoSalario() );
    }
    
}
