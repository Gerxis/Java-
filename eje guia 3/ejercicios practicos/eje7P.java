/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo
lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un 
máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el
final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje7P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner cad = new Scanner (System.in);
        
        boolean vali = false ;
        
        int cont = 0 , cont2 = 0;
                
        
        System.out.println("Ingrese cadenas donde el primer caracter sea x y el ultimo O , ademas no debe superar los 5 caracteres de longitud"
                + " Para salir ingrese &&&&&");
        
        while (!vali) {
            
            String fra = cad.next();
            fra = fra.toLowerCase();
            
            if(fra.length() == 5 && fra.substring(0, 1).equals("x") && fra.substring(4, 5).equals("o")) 
            {  cont = cont + 1 ;
                      
            } else { cont2 = cont2 + 1;  }
            
            if (fra.equals("&&&&&") ) {
            vali = true;
            }
        }
        
        System.out.println("A avido un total de " + cont + " calidaciones Correctas");
           System.out.println("A avido un total de " + cont2 + " calidaciones Incorrectas");
        
        
    }
    
}
