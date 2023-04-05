
package guia.pkg8;

import entidades.Cafetera;
import java.util.Scanner;
import servicios.CafeteraServicios;

/**
 *
 * @author ALEXIS
 */
public class eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a Nespresso");
        
        CafeteraServicios cs = new CafeteraServicios ();
        Cafetera c = new Cafetera ();
        Scanner leer = new Scanner (System.in);
        
        boolean vali = false ;
  
        cs.CarCafetera(c);
        while (!vali) {
            System.out.println("                   Menu                   ");
            System.out.println(" _________________________________________ ");
            System.out.println("|1. Llenar Cafetera                       |");
            System.out.println("|2 .Servir tasa                           |");
            System.out.println("|3 .Vaciar Cafetera                       |");
            System.out.println("|4 .Agregar Cafe                          |");
            System.out.println("|5 .Cambiar Caracteristicas de la cafetera|");
            System.out.println("|6 .Salir                                 |");
            System.out.println("|_________________________________________|");
            
            int op = leer.nextInt();
            
            switch (op) {
                case 1: cs.llenarCafetera(c);
                break;
                case 2: cs.servvirTaza(c);
                break;
                case 3: cs.vaciarCafetera(c);
                break;
                case 4 : cs.agregarCafe(c);
                break;
                case 5 : cs.CarCafetera(c);
                break;
                case 6 : vali = true;
                break;
                default:System.out.println("opcion invalida op (1-6)");
            
            }
        }
    }
    
}
