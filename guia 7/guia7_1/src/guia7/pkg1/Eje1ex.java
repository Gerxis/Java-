/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá́ definir además 
dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba como parámetros el título 
y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.
 */
package guia7.pkg1;

import guia7.pkg1.ejercicios.Cancion;
import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class Eje1ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        
        System.out.println("ingrese el nombre de la cancion");
        Cancion c1 = new Cancion();
        
        c1.setTitulo(leer.nextLine());
        
        System.out.println("Ingrese el nombre del autor");
        
        c1.setAutor(leer.nextLine());
        
        System.out.println( c1 );
        
        
    }
    
}
