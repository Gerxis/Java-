/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.pkg1;

import guia7.pkg1.ejercicios.Operaciones;
import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        Scanner leer = new Scanner(System.in);

        Operaciones op1 = new Operaciones();

        int ops;
        do {
            System.out.println("ingrese la opcion deseada");
            System.out.println(" ______________");
            System.out.println("|1. Ingresar N |");
            System.out.println("|2. Sumar      |");
            System.out.println("|3. Restar     |");
            System.out.println("|4. Multiplicar|");
            System.out.println("|5. Dividir    |");
            System.out.println("|6. Salir      |");
            System.out.println("|______________|");
            ops = leer.nextInt();

            switch (ops) {
                case 1:
                    op1.crearOpera();
                    break;
                case 2:
                    System.out.println("La suma es = " + op1.sumar());
                    break;
                case 3:
                    System.out.println("La resta es = " + op1.restar());
                    break;
                case 4:
                    System.out.println("La multiplicacion es = " + op1.multiplicar());
                    break;
                case 5:
                    System.out.println("La divicion es = " + op1.dividir());
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Las opciones son entre 1 y 6");
            }
        } while (ops != 6);
    }

}
