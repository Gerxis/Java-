/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento
(previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje5ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner tec = new Scanner (System.in);
        double cost;
      
      do {System.out.println("Ingrese el costo del tratamiento");
         cost = tec.nextDouble(); 
        if (cost < 0 ) {System.out.println("ingrese un valor positivo");}
      } while ( cost < 0 ) ;
        
      
       
        boolean vali = false;
        
        while (!vali) {
             System.out.println("Ingrese que tipo de socio es A | B | C ");
        System.out.println("Para salir escriba | Z |");
        String socio = tec.next();
        socio = socio.toLowerCase();
        
        switch (socio) { 
                case "a": System.out.println("El monto a pagar sin descuento es :" + cost );
                         System.out.println(" ");
                         System.out.println("El monto a pagar con descueto de socio es : " + cost * 0.50);
                         System.out.println(" ");
                         
                break ;
                    case "b":System.out.println("El monto a pagar sin descuento es :" + cost );
                             double sb = cost - cost * 0.35;
                             System.out.println(" ");
                             System.out.println("El monto a pagar con descueto de socio es : " + sb );
                             System.out.println(" ");
                break ;
                    case "c":System.out.println("El monto a pagar sin descuento es :" + cost );
                             System.out.println(" ");
                             System.out.println("El monto a pagar con descueto de socio es : " + cost );
                             System.out.println(" ");
                break ;
                    case "z" : vali = true;
                break;    
                    default : System.out.println("la opcion  ingresada no es valida  ");
                    break;
               
       }
        
        
    }
    
}
}