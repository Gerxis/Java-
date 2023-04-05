/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg8;

import entidades.Ecuacion;
import java.util.Scanner;
import servicios.EcuacionService;

/**
 *
 * @author ALEXIS
 */
public class eje1ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Ecuacion e = new Ecuacion();
        EcuacionService es = new EcuacionService();
        boolean vali = false;

        System.out.println("ingrese los datos de la ecuacion");
        System.out.println("A");
        e.setA(leer.nextDouble());
        System.out.println("B");
        e.setB(leer.nextDouble());
        System.out.println("C");
        e.setC(leer.nextDouble());

        while (!vali) {
            System.out.println("        Menu       ");
            System.out.println(" _________________ ");
            System.out.println("|1. Discriminante |");
            System.out.println("|2. Tiene Raices  |");
            System.out.println("|3. Tiene Raiz    |");
            System.out.println("|4. Obtener Raices|");
            System.out.println("|5. Obtener Raiz  |");
            System.out.println("|6. Calcular      |");
            System.out.println("|7. Salir         |");
            System.out.println("|_________________|");

            int op = leer.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Discriminante =" + es.getDiscriminante(e));
                    break;
                case 2:
                    System.out.println(es.tieneRaices(e));
                    break;
                case 3:
                    System.out.println(es.tieneRaiz(e));
                    break;
                case 4:
                    es.obtenerRaices(es.tieneRaices(e), e);
                    break;
                case 5:
                    es.ObtenerRaiz(es.tieneRaiz(e), e);
                    break;
                case 6:
                    es.calcular(e);
                    break;
                case 7:
                    vali = true;
                    System.out.println("END");
                    break;
                default:
                    System.out.println("opcion incorrecta op (1 - 7)");

            }

        }

    }

}
