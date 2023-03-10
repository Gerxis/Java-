/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si 
se trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje3ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner voc = new Scanner (System.in) ;
      
      boolean vali = false ;
     
      while (!vali) 
     
      { System.out.println("Ingrese una letra");
          System.out.println("Si decea salir escriba Fin");
       String letra = voc.next();
       letra = letra.toLowerCase();
       if (letra.equals("a") || letra.equals("e")|| letra.equals("i")|| letra.equals("o")|| letra.equals("u")) {
           System.out.println("La letra es una vocal"); } else {System.out.println("la letra no es una vocal");}
          System.out.println(" ");
       
          if ( letra.equals("fin") ){
            vali = true;   }      
          System.out.println("*******************************************");
      }
      
      
    }
    
}
