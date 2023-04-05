/*
 Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos para agregar 
nuevas recetas a la lista, para buscar una receta 
por nombre y para obtener la lista de recetas que se pueden preparar con los ingredientes disponibles en la cocina.
 */
package guia7.pkg1;

import guia7.pkg1.ejercicios.Cocina;
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
        Scanner leer = new Scanner(System.in);

        Cocina c1 = new Cocina();
        boolean vali = false;
        int op;

        while (!vali) {

            System.out.println("ingrese una opcion");
            System.out.println(" _____________________________________________");
            System.out.println("|1 .add Receta                                |");
            System.out.println("|2 .add Ingredientes disponibles              |");
            System.out.println("|3 .Buscar receta por nombre                  |");
            System.out.println("|4 .Buscar receta por ingredientes disponibles|");
            System.out.println("|5 .Salir                                     |");
            System.out.println("|_____________________________________________|");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    c1.AddReceta();
                    break;
                case 2:
                    c1.addIngreC();
                    break;
                case 3:
                    c1.busRecNom();
                    break;
                case 4:
                    if (c1.getIngre() == null) {
                        System.out.println("no ingreso ingredientes disponibles.");
                        break;
                    }
                    else {c1.busRecAut();}
                    break;
                case 5:
                    vali = true;
                    break;
                default:
                    System.out.println("la opcion ingresada no es valida op 1 - 5");

            }

        }

    }

}
