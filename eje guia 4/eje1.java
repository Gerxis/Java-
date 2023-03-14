/*


 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    Scanner leer = new Scanner (System.in);
    
        System.out.println("ingrese una frace para codificar");
        
        String frace = leer.nextLine() , frace2;
        
        
        frace2 = codificar(frace);
        
        System.out.println("frase = " + frace);
        System.out.println("frase codificada = " + frace2);
    
    }

    
    public static String codificar(String fra) {
        
       int cont = 1;
       String fra2 ,fra3 = " ";
        
        for (int i = 0; i < fra.length(); i++) {
             
            fra2=fra.substring(i, cont) ;
            
            switch (fra2){
                case "a": fra3 = fra3.concat("@");
                break;
                    case "e": fra3 = fra3.concat("#");
                break;
                    case "i": fra3 = fra3.concat("$");
                break;
                    case "o": fra3 = fra3.concat("%");
                break;
                    case "u": fra3 = fra3.concat("*");
                break;
                    default : fra3 = fra3.concat(fra2);
            
            }
            cont = cont + 1;
                 
             }
        
        
        
        
        
        
      return fra3;
    
    
    }
    
}
